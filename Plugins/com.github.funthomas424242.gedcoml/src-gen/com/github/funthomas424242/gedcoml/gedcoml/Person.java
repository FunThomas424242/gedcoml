/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getId <em>Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getSex <em>Sex</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson()
 * @model abstract="true"
 * @generated
 */
public interface Person extends EObject
{
  /**
   * Returns the value of the '<em><b>Addresses</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.Address}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Addresses</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addresses</em>' containment reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_Addresses()
   * @model containment="true"
   * @generated
   */
  EList<Address> getAddresses();

  /**
   * Returns the value of the '<em><b>Sex</b></em>' attribute.
   * The literals are from the enumeration {@link com.github.funthomas424242.gedcoml.gedcoml.Sexus}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sex</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sex</em>' attribute.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Sexus
   * @see #setSex(Sexus)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_Sex()
   * @model required="true"
   * @generated
   */
  Sexus getSex();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getSex <em>Sex</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sex</em>' attribute.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Sexus
   * @see #getSex()
   * @generated
   */
  void setSex(Sexus value);

  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * The default value is <code>""</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_Id()
   * @model default="" id="true" required="true"
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // Person
