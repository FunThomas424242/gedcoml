/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.Address;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;
import com.github.funthomas424242.gedcoml.gedcoml.Married;
import com.github.funthomas424242.gedcoml.gedcoml.Note;
import com.github.funthomas424242.gedcoml.gedcoml.Person;
import com.github.funthomas424242.gedcoml.gedcoml.Sexus;
import com.github.funthomas424242.gedcoml.gedcoml.Source;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl#getId <em>Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PersonImpl extends EObjectImpl implements Person
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = "";

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The cached value of the '{@link #getAddresses() <em>Addresses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddresses()
   * @generated
   * @ordered
   */
  protected EList<Address> addresses;

  /**
   * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSex()
   * @generated
   * @ordered
   */
  protected static final Sexus SEX_EDEFAULT = Sexus.MALE;

  /**
   * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSex()
   * @generated
   * @ordered
   */
  protected Sexus sex = SEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonImpl()
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
    return GedcomlPackage.Literals.PERSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Address> getAddresses()
  {
    if (addresses == null)
    {
      addresses = new EObjectContainmentEList<Address>(Address.class, this, GedcomlPackage.PERSON__ADDRESSES);
    }
    return addresses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sexus getSex()
  {
    return sex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSex(Sexus newSex)
  {
    Sexus oldSex = sex;
    sex = newSex == null ? SEX_EDEFAULT : newSex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PERSON__SEX, oldSex, sex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PERSON__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GedcomlPackage.PERSON__ADDRESSES:
        return ((InternalEList<?>)getAddresses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GedcomlPackage.PERSON__ID:
        return getId();
      case GedcomlPackage.PERSON__ADDRESSES:
        return getAddresses();
      case GedcomlPackage.PERSON__SEX:
        return getSex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GedcomlPackage.PERSON__ID:
        setId((String)newValue);
        return;
      case GedcomlPackage.PERSON__ADDRESSES:
        getAddresses().clear();
        getAddresses().addAll((Collection<? extends Address>)newValue);
        return;
      case GedcomlPackage.PERSON__SEX:
        setSex((Sexus)newValue);
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
      case GedcomlPackage.PERSON__ID:
        setId(ID_EDEFAULT);
        return;
      case GedcomlPackage.PERSON__ADDRESSES:
        getAddresses().clear();
        return;
      case GedcomlPackage.PERSON__SEX:
        setSex(SEX_EDEFAULT);
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
      case GedcomlPackage.PERSON__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case GedcomlPackage.PERSON__ADDRESSES:
        return addresses != null && !addresses.isEmpty();
      case GedcomlPackage.PERSON__SEX:
        return sex != SEX_EDEFAULT;
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
    result.append(" (id: ");
    result.append(id);
    result.append(", sex: ");
    result.append(sex);
    result.append(')');
    return result.toString();
  }

} //PersonImpl
