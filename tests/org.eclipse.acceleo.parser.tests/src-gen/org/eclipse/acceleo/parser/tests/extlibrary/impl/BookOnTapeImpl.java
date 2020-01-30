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
package org.eclipse.acceleo.parser.tests.extlibrary.impl;

import org.eclipse.acceleo.parser.tests.extlibrary.BookOnTape;
import org.eclipse.acceleo.parser.tests.extlibrary.ExtlibraryPackage;
import org.eclipse.acceleo.parser.tests.extlibrary.Person;
import org.eclipse.acceleo.parser.tests.extlibrary.Writer;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Book On Tape</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.acceleo.parser.tests.extlibrary.impl.BookOnTapeImpl#getReader <em>Reader</em>}</li>
 * <li>{@link org.eclipse.acceleo.parser.tests.extlibrary.impl.BookOnTapeImpl#getAuthor <em>Author</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class BookOnTapeImpl extends AudioVisualItemImpl implements BookOnTape {
	/**
	 * The cached value of the '{@link #getReader() <em>Reader</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReader()
	 * @generated
	 * @ordered
	 */
	protected Person reader;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected Writer author;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BookOnTapeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtlibraryPackage.Literals.BOOK_ON_TAPE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person getReader() {
		if (reader != null && reader.eIsProxy()) {
			InternalEObject oldReader = (InternalEObject)reader;
			reader = (Person)eResolveProxy(oldReader);
			if (reader != oldReader) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtlibraryPackage.BOOK_ON_TAPE__READER, oldReader, reader));
				}
			}
		}
		return reader;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Person basicGetReader() {
		return reader;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReader(Person newReader) {
		Person oldReader = reader;
		reader = newReader;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.BOOK_ON_TAPE__READER,
					oldReader, reader));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Writer getAuthor() {
		if (author != null && author.eIsProxy()) {
			InternalEObject oldAuthor = (InternalEObject)author;
			author = (Writer)eResolveProxy(oldAuthor);
			if (author != oldAuthor) {
				if (eNotificationRequired()) {
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ExtlibraryPackage.BOOK_ON_TAPE__AUTHOR, oldAuthor, author));
				}
			}
		}
		return author;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Writer basicGetAuthor() {
		return author;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAuthor(Writer newAuthor) {
		Writer oldAuthor = author;
		author = newAuthor;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.BOOK_ON_TAPE__AUTHOR,
					oldAuthor, author));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				if (resolve) {
					return getReader();
				}
				return basicGetReader();
			case ExtlibraryPackage.BOOK_ON_TAPE__AUTHOR:
				if (resolve) {
					return getAuthor();
				}
				return basicGetAuthor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				setReader((Person)newValue);
				return;
			case ExtlibraryPackage.BOOK_ON_TAPE__AUTHOR:
				setAuthor((Writer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				setReader((Person)null);
				return;
			case ExtlibraryPackage.BOOK_ON_TAPE__AUTHOR:
				setAuthor((Writer)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExtlibraryPackage.BOOK_ON_TAPE__READER:
				return reader != null;
			case ExtlibraryPackage.BOOK_ON_TAPE__AUTHOR:
				return author != null;
		}
		return super.eIsSet(featureID);
	}

} // BookOnTapeImpl
