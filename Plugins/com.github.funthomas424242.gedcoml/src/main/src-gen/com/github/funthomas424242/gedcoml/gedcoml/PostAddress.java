/**
 */
package com.github.funthomas424242.gedcoml.gedcoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getStreet <em>Street</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getPostcode <em>Postcode</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getCity <em>City</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPostAddress()
 * @model
 * @generated
 */
public interface PostAddress extends Address
{
  /**
   * Returns the value of the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Street</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Street</em>' attribute.
   * @see #setStreet(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPostAddress_Street()
   * @model required="true"
   * @generated
   */
  String getStreet();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getStreet <em>Street</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Street</em>' attribute.
   * @see #getStreet()
   * @generated
   */
  void setStreet(String value);

  /**
   * Returns the value of the '<em><b>Postcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postcode</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postcode</em>' attribute.
   * @see #setPostcode(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPostAddress_Postcode()
   * @model required="true"
   * @generated
   */
  String getPostcode();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getPostcode <em>Postcode</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postcode</em>' attribute.
   * @see #getPostcode()
   * @generated
   */
  void setPostcode(String value);

  /**
   * Returns the value of the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>City</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>City</em>' attribute.
   * @see #setCity(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPostAddress_City()
   * @model required="true"
   * @generated
   */
  String getCity();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getCity <em>City</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>City</em>' attribute.
   * @see #getCity()
   * @generated
   */
  void setCity(String value);

} // PostAddress
