/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.Address;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AddressImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AddressImpl#getExodus <em>Exodus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AddressImpl extends EObjectImpl implements Address
{
  /**
   * The default value of the '{@link #getEntry() <em>Entry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected static final String ENTRY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEntry() <em>Entry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected String entry = ENTRY_EDEFAULT;

  /**
   * The default value of the '{@link #getExodus() <em>Exodus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExodus()
   * @generated
   * @ordered
   */
  protected static final String EXODUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExodus() <em>Exodus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExodus()
   * @generated
   * @ordered
   */
  protected String exodus = EXODUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AddressImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GedcomlPackage.Literals.ADDRESS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEntry()
  {
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEntry(String newEntry)
  {
    String oldEntry = entry;
    entry = newEntry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.ADDRESS__ENTRY, oldEntry, entry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExodus()
  {
    return exodus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExodus(String newExodus)
  {
    String oldExodus = exodus;
    exodus = newExodus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.ADDRESS__EXODUS, oldExodus, exodus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GedcomlPackage.ADDRESS__ENTRY:
        return getEntry();
      case GedcomlPackage.ADDRESS__EXODUS:
        return getExodus();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GedcomlPackage.ADDRESS__ENTRY:
        setEntry((String)newValue);
        return;
      case GedcomlPackage.ADDRESS__EXODUS:
        setExodus((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GedcomlPackage.ADDRESS__ENTRY:
        setEntry(ENTRY_EDEFAULT);
        return;
      case GedcomlPackage.ADDRESS__EXODUS:
        setExodus(EXODUS_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GedcomlPackage.ADDRESS__ENTRY:
        return ENTRY_EDEFAULT == null ? entry != null : !ENTRY_EDEFAULT.equals(entry);
      case GedcomlPackage.ADDRESS__EXODUS:
        return EXODUS_EDEFAULT == null ? exodus != null : !EXODUS_EDEFAULT.equals(exodus);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (entry: ");
    result.append(entry);
    result.append(", exodus: ");
    result.append(exodus);
    result.append(')');
    return result.toString();
  }

} //AddressImpl
