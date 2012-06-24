/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;
import com.github.funthomas424242.gedcoml.gedcoml.Person;
import com.github.funthomas424242.gedcoml.gedcoml.PersonRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonRefImpl#getPersonID <em>Person ID</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonRefImpl extends SourceImpl implements PersonRef
{
  /**
   * The cached value of the '{@link #getPersonID() <em>Person ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonID()
   * @generated
   * @ordered
   */
  protected BekanntePerson personID;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonRefImpl()
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
    return GedcomlPackage.Literals.PERSON_REF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BekanntePerson getPersonID()
  {
    if (personID != null && personID.eIsProxy())
    {
      InternalEObject oldPersonID = (InternalEObject)personID;
      personID = (BekanntePerson)eResolveProxy(oldPersonID);
      if (personID != oldPersonID)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedcomlPackage.PERSON_REF__PERSON_ID, oldPersonID, personID));
      }
    }
    return personID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BekanntePerson basicGetPersonID()
  {
    return personID;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonID(BekanntePerson newPersonID)
  {
    BekanntePerson oldPersonID = personID;
    personID = newPersonID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PERSON_REF__PERSON_ID, oldPersonID, personID));
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
      case GedcomlPackage.PERSON_REF__PERSON_ID:
        if (resolve) return getPersonID();
        return basicGetPersonID();
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
      case GedcomlPackage.PERSON_REF__PERSON_ID:
        setPersonID((BekanntePerson)newValue);
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
      case GedcomlPackage.PERSON_REF__PERSON_ID:
        setPersonID((BekanntePerson)null);
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
      case GedcomlPackage.PERSON_REF__PERSON_ID:
        return personID != null;
    }
    return super.eIsSet(featureID);
  }

} //PersonRefImpl
