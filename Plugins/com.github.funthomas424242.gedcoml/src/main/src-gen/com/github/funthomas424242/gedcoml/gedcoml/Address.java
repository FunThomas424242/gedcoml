/**
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Address#getEntry <em>Entry</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Address#getExodus <em>Exodus</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAddress()
 * @model abstract="true"
 * @generated
 */
public interface Address extends EObject
{
  /**
   * Returns the value of the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Entry</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entry</em>' attribute.
   * @see #setEntry(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAddress_Entry()
   * @model required="true"
   * @generated
   */
  String getEntry();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Address#getEntry <em>Entry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Entry</em>' attribute.
   * @see #getEntry()
   * @generated
   */
  void setEntry(String value);

  /**
   * Returns the value of the '<em><b>Exodus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exodus</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exodus</em>' attribute.
   * @see #setExodus(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getAddress_Exodus()
   * @model
   * @generated
   */
  String getExodus();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Address#getExodus <em>Exodus</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exodus</em>' attribute.
   * @see #getExodus()
   * @generated
   */
  void setExodus(String value);

} // Address
