/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Married</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getWeddingDay <em>Wedding Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getSeparationDay <em>Separation Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getPartner <em>Partner</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getMarried()
 * @model
 * @generated
 */
public interface Married extends EObject
{
  /**
   * Returns the value of the '<em><b>Wedding Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wedding Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Wedding Day</em>' attribute.
   * @see #setWeddingDay(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getMarried_WeddingDay()
   * @model required="true"
   * @generated
   */
  String getWeddingDay();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getWeddingDay <em>Wedding Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Wedding Day</em>' attribute.
   * @see #getWeddingDay()
   * @generated
   */
  void setWeddingDay(String value);

  /**
   * Returns the value of the '<em><b>Separation Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Separation Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Separation Day</em>' attribute.
   * @see #setSeparationDay(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getMarried_SeparationDay()
   * @model
   * @generated
   */
  String getSeparationDay();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getSeparationDay <em>Separation Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Separation Day</em>' attribute.
   * @see #getSeparationDay()
   * @generated
   */
  void setSeparationDay(String value);

  /**
   * Returns the value of the '<em><b>Partner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Partner</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Partner</em>' reference.
   * @see #setPartner(Person)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getMarried_Partner()
   * @model required="true"
   * @generated
   */
  Person getPartner();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getPartner <em>Partner</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Partner</em>' reference.
   * @see #getPartner()
   * @generated
   */
  void setPartner(Person value);

} // Married
