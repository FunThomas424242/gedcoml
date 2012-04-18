/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.Author;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;
import com.github.funthomas424242.gedcoml.gedcoml.Person;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl#getMemberId <em>Member Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorImpl extends EObjectImpl implements Author
{
  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getMemberId() <em>Member Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemberId()
   * @generated
   * @ordered
   */
  protected Person memberId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AuthorImpl()
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
    return GedcomlPackage.Literals.AUTHOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.AUTHOR__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.AUTHOR__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getMemberId()
  {
    if (memberId != null && memberId.eIsProxy())
    {
      InternalEObject oldMemberId = (InternalEObject)memberId;
      memberId = (Person)eResolveProxy(oldMemberId);
      if (memberId != oldMemberId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedcomlPackage.AUTHOR__MEMBER_ID, oldMemberId, memberId));
      }
    }
    return memberId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetMemberId()
  {
    return memberId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemberId(Person newMemberId)
  {
    Person oldMemberId = memberId;
    memberId = newMemberId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.AUTHOR__MEMBER_ID, oldMemberId, memberId));
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
      case GedcomlPackage.AUTHOR__FIRST_NAME:
        return getFirstName();
      case GedcomlPackage.AUTHOR__LAST_NAME:
        return getLastName();
      case GedcomlPackage.AUTHOR__MEMBER_ID:
        if (resolve) return getMemberId();
        return basicGetMemberId();
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
      case GedcomlPackage.AUTHOR__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case GedcomlPackage.AUTHOR__LAST_NAME:
        setLastName((String)newValue);
        return;
      case GedcomlPackage.AUTHOR__MEMBER_ID:
        setMemberId((Person)newValue);
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
      case GedcomlPackage.AUTHOR__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case GedcomlPackage.AUTHOR__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case GedcomlPackage.AUTHOR__MEMBER_ID:
        setMemberId((Person)null);
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
      case GedcomlPackage.AUTHOR__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case GedcomlPackage.AUTHOR__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case GedcomlPackage.AUTHOR__MEMBER_ID:
        return memberId != null;
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
    result.append(" (firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(')');
    return result.toString();
  }

} //AuthorImpl
