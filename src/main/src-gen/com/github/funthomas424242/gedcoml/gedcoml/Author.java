/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Author</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getMemberId <em>Member Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAuthor()
 * @model
 * @generated
 */
public interface Author extends EObject
{
  /**
   * Returns the value of the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>First Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Name</em>' attribute.
   * @see #setFirstName(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAuthor_FirstName()
   * @model required="true"
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getFirstName <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Name</em>' attribute.
   * @see #getFirstName()
   * @generated
   */
  void setFirstName(String value);

  /**
   * Returns the value of the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Last Name</em>' attribute.
   * @see #setLastName(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAuthor_LastName()
   * @model required="true"
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Returns the value of the '<em><b>Member Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Member Id</em>' reference.
   * @see #setMemberId(BekanntePerson)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAuthor_MemberId()
   * @model
   * @generated
   */
  BekanntePerson getMemberId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getMemberId <em>Member Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Member Id</em>' reference.
   * @see #getMemberId()
   * @generated
   */
  void setMemberId(BekanntePerson value);

} // Author
