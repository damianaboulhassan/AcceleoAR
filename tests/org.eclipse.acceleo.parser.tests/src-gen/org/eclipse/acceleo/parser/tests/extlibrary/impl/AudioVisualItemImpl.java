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

import org.eclipse.acceleo.parser.tests.extlibrary.AudioVisualItem;
import org.eclipse.acceleo.parser.tests.extlibrary.ExtlibraryPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Audio Visual Item</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.eclipse.acceleo.parser.tests.extlibrary.impl.AudioVisualItemImpl#getTitle <em>Title</em>}</li>
 * <li>{@link org.eclipse.acceleo.parser.tests.extlibrary.impl.AudioVisualItemImpl#getMinutesLength <em>
 * Minutes Length</em>}</li>
 * <li>{@link org.eclipse.acceleo.parser.tests.extlibrary.impl.AudioVisualItemImpl#isDamaged <em>Damaged</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @generated
 */
@SuppressWarnings("nls")
public abstract class AudioVisualItemImpl extends CirculatingItemImpl implements AudioVisualItem {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutesLength() <em>Minutes Length</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinutesLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinutesLength() <em>Minutes Length</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMinutesLength()
	 * @generated
	 * @ordered
	 */
	protected int minutesLength = MINUTES_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #isDamaged() <em>Damaged</em>}' attribute. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #isDamaged()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DAMAGED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDamaged() <em>Damaged</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #isDamaged()
	 * @generated
	 * @ordered
	 */
	protected boolean damaged = DAMAGED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AudioVisualItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExtlibraryPackage.Literals.AUDIO_VISUAL_ITEM;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ExtlibraryPackage.AUDIO_VISUAL_ITEM__TITLE,
					oldTitle, title));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getMinutesLength() {
		return minutesLength;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMinutesLength(int newMinutesLength) {
		int oldMinutesLength = minutesLength;
		minutesLength = newMinutesLength;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtlibraryPackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH, oldMinutesLength, minutesLength));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isDamaged() {
		return damaged;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDamaged(boolean newDamaged) {
		boolean oldDamaged = damaged;
		damaged = newDamaged;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET,
					ExtlibraryPackage.AUDIO_VISUAL_ITEM__DAMAGED, oldDamaged, damaged));
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
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__TITLE:
				return getTitle();
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
				return new Integer(getMinutesLength());
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__DAMAGED:
				return isDamaged() ? Boolean.TRUE : Boolean.FALSE;
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
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__TITLE:
				setTitle((String)newValue);
				return;
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
				setMinutesLength(((Integer)newValue).intValue());
				return;
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__DAMAGED:
				setDamaged(((Boolean)newValue).booleanValue());
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
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
				setMinutesLength(MINUTES_LENGTH_EDEFAULT);
				return;
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__DAMAGED:
				setDamaged(DAMAGED_EDEFAULT);
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
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__MINUTES_LENGTH:
				return minutesLength != MINUTES_LENGTH_EDEFAULT;
			case ExtlibraryPackage.AUDIO_VISUAL_ITEM__DAMAGED:
				return damaged != DAMAGED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (title: ");
		result.append(title);
		result.append(", minutesLength: ");
		result.append(minutesLength);
		result.append(", damaged: ");
		result.append(damaged);
		result.append(')');
		return result.toString();
	}

} // AudioVisualItemImpl
