/**
 */
package com.github.funthomas424242.gedcoml.gedcoml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.PersonRef#getPersonID <em>Person ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPersonRef()
 * @model
 * @generated
 */
public interface PersonRef extends Source
{
  /**
   * Returns the value of the '<em><b>Person ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Person ID</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Person ID</em>' reference.
   * @see #setPersonID(BekanntePerson)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPersonRef_PersonID()
   * @model required="true"
   * @generated
   */
  BekanntePerson getPersonID();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.PersonRef#getPersonID <em>Person ID</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Person ID</em>' reference.
   * @see #getPersonID()
   * @generated
   */
  void setPersonID(BekanntePerson value);

} // PersonRef
