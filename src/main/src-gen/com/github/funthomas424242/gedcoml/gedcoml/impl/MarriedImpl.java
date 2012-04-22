/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;
import com.github.funthomas424242.gedcoml.gedcoml.Married;
import com.github.funthomas424242.gedcoml.gedcoml.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Married</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl#getWeddingDay <em>Wedding Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl#getSeparationDay <em>Separation Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl#getPartner <em>Partner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarriedImpl extends EObjectImpl implements Married
{
  /**
   * The default value of the '{@link #getWeddingDay() <em>Wedding Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeddingDay()
   * @generated
   * @ordered
   */
  protected static final String WEDDING_DAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWeddingDay() <em>Wedding Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWeddingDay()
   * @generated
   * @ordered
   */
  protected String weddingDay = WEDDING_DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getSeparationDay() <em>Separation Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparationDay()
   * @generated
   * @ordered
   */
  protected static final String SEPARATION_DAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSeparationDay() <em>Separation Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSeparationDay()
   * @generated
   * @ordered
   */
  protected String separationDay = SEPARATION_DAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getPartner() <em>Partner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPartner()
   * @generated
   * @ordered
   */
  protected Person partner;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MarriedImpl()
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
    return GedcomlPackage.Literals.MARRIED;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWeddingDay()
  {
    return weddingDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWeddingDay(String newWeddingDay)
  {
    String oldWeddingDay = weddingDay;
    weddingDay = newWeddingDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.MARRIED__WEDDING_DAY, oldWeddingDay, weddingDay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSeparationDay()
  {
    return separationDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSeparationDay(String newSeparationDay)
  {
    String oldSeparationDay = separationDay;
    separationDay = newSeparationDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.MARRIED__SEPARATION_DAY, oldSeparationDay, separationDay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getPartner()
  {
    if (partner != null && partner.eIsProxy())
    {
      InternalEObject oldPartner = (InternalEObject)partner;
      partner = (Person)eResolveProxy(oldPartner);
      if (partner != oldPartner)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedcomlPackage.MARRIED__PARTNER, oldPartner, partner));
      }
    }
    return partner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetPartner()
  {
    return partner;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPartner(Person newPartner)
  {
    Person oldPartner = partner;
    partner = newPartner;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.MARRIED__PARTNER, oldPartner, partner));
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
      case GedcomlPackage.MARRIED__WEDDING_DAY:
        return getWeddingDay();
      case GedcomlPackage.MARRIED__SEPARATION_DAY:
        return getSeparationDay();
      case GedcomlPackage.MARRIED__PARTNER:
        if (resolve) return getPartner();
        return basicGetPartner();
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
      case GedcomlPackage.MARRIED__WEDDING_DAY:
        setWeddingDay((String)newValue);
        return;
      case GedcomlPackage.MARRIED__SEPARATION_DAY:
        setSeparationDay((String)newValue);
        return;
      case GedcomlPackage.MARRIED__PARTNER:
        setPartner((Person)newValue);
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
      case GedcomlPackage.MARRIED__WEDDING_DAY:
        setWeddingDay(WEDDING_DAY_EDEFAULT);
        return;
      case GedcomlPackage.MARRIED__SEPARATION_DAY:
        setSeparationDay(SEPARATION_DAY_EDEFAULT);
        return;
      case GedcomlPackage.MARRIED__PARTNER:
        setPartner((Person)null);
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
      case GedcomlPackage.MARRIED__WEDDING_DAY:
        return WEDDING_DAY_EDEFAULT == null ? weddingDay != null : !WEDDING_DAY_EDEFAULT.equals(weddingDay);
      case GedcomlPackage.MARRIED__SEPARATION_DAY:
        return SEPARATION_DAY_EDEFAULT == null ? separationDay != null : !SEPARATION_DAY_EDEFAULT.equals(separationDay);
      case GedcomlPackage.MARRIED__PARTNER:
        return partner != null;
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
    result.append(" (weddingDay: ");
    result.append(weddingDay);
    result.append(", separationDay: ");
    result.append(separationDay);
    result.append(')');
    return result.toString();
  }

} //MarriedImpl
