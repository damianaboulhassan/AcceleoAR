/*******************************************************************************
 * Copyright (c) 2008, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.eclipse.acceleo.internal.ide.ui.debug.model;

import org.eclipse.acceleo.common.IAcceleoConstants;
import org.eclipse.acceleo.internal.ide.ui.editors.template.AcceleoEditor;
import org.eclipse.acceleo.internal.ide.ui.editors.template.AcceleoSourceContent;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.ui.actions.IToggleBreakpointsTarget;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ocl.utilities.ASTNode;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Adapter to create breakpoints in Acceleo files.
 * 
 * @author <a href="mailto:jonathan.musset@obeo.fr">Jonathan Musset</a>
 */
public class AcceleoLineBreakpointAdapter implements IToggleBreakpointsTarget {

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#toggleLineBreakpoints(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void toggleLineBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
		ITextEditor textEditor = getEditor(part);
		if (textEditor instanceof AcceleoEditor) {
			AcceleoEditor acceleoEditor = (AcceleoEditor)textEditor;
			IResource resource = (IResource)textEditor.getEditorInput().getAdapter(IResource.class);
			ITextSelection textSelection = (ITextSelection)selection;
			int lineNumber = textSelection.getStartLine();
			int offset = textSelection.getOffset();
			int length = textSelection.getLength();
			if (offset == -1) {
				return;
			}
			IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints(
					AcceleoModelPresentation.ID_ACCELEO_DEBUG_MODEL);
			for (int i = 0; i < breakpoints.length; i++) {
				IBreakpoint breakpoint = breakpoints[i];
				if (resource.equals(breakpoint.getMarker().getResource())) {
					int bLineNumber = ((ILineBreakpoint)breakpoint).getLineNumber();
					int bCharStart = ((ILineBreakpoint)breakpoint).getCharStart();
					int bCharEnd = ((ILineBreakpoint)breakpoint).getCharEnd();
					if (bLineNumber == lineNumber + 1 || bCharStart == offset
							|| (offset <= bCharStart && offset + length >= bCharEnd)) {
						// remove
						breakpoint.delete();
						return;
					}
				}
			}
			// create line breakpoint (line numbers start at 0)
			ASTNode astNode = getBreakpointASTNodeAt(acceleoEditor.getContent(), offset);
			if (astNode != null) {
				AcceleoLineBreakpoint lineBreakpoint = new AcceleoLineBreakpoint(astNode, resource,
						lineNumber + 1, offset, length);
				DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(lineBreakpoint);
			}
		}
	}

	/**
	 * Gets the nearest debuggable AST node at the given position.
	 * 
	 * @param content
	 *            is the Acceleo source content
	 * @param offset
	 *            is the offset of the breakpoint to create
	 * @return the nearest debuggable AST node
	 */
	protected static ASTNode getBreakpointASTNodeAt(AcceleoSourceContent content, int offset) {
		int i = offset;
		while (i > 0 && content.getText().charAt(i - 1) != '\n') {
			i--;
		}
		while (i < content.getText().length()) {
			char c = content.getText().charAt(i);
			if (c == '\n') {
				i = -1;
				break;
			} else if (c == '[') {
				i += 2;
				break;
			} else {
				i++;
			}
		}
		ASTNode astNode = content.getResolvedASTNode(i, i);
		if (astNode != null) {
			while (astNode.eContainer() instanceof ASTNode
					&& ((ASTNode)astNode.eContainer()).getStartPosition() == astNode.getStartPosition()) {
				astNode = (ASTNode)astNode.eContainer();
			}
		}
		return astNode;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#canToggleLineBreakpoints(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public boolean canToggleLineBreakpoints(IWorkbenchPart part, ISelection selection) {
		return getEditor(part) != null;
	}

	/**
	 * Returns the editor being used to edit a Acceleo file, associated with the given part, or
	 * <code>null</code> if none.
	 * 
	 * @param part
	 *            workbench part
	 * @return the editor being used to edit a Acceleo file, associated with the given part, or
	 *         <code>null</code> if none
	 */
	private ITextEditor getEditor(IWorkbenchPart part) {
		if (part instanceof ITextEditor) {
			ITextEditor editorPart = (ITextEditor)part;
			IResource resource = (IResource)editorPart.getEditorInput().getAdapter(IResource.class);
			if (resource != null) {
				String extension = resource.getFileExtension();
				if (IAcceleoConstants.MTL_FILE_EXTENSION.equals(extension)) {
					return editorPart;
				}
			}
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#toggleMethodBreakpoints(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void toggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#canToggleMethodBreakpoints(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public boolean canToggleMethodBreakpoints(IWorkbenchPart part, ISelection selection) {
		return false;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#toggleWatchpoints(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void toggleWatchpoints(IWorkbenchPart part, ISelection selection) throws CoreException {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.debug.ui.actions.IToggleBreakpointsTarget#canToggleWatchpoints(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public boolean canToggleWatchpoints(IWorkbenchPart part, ISelection selection) {
		return false;
	}

}
