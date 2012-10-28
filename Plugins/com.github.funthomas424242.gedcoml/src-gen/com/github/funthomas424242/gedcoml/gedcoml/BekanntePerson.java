/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bekannte Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBirthDay <em>Birth Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getDeathDay <em>Death Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBiologicalParentOf <em>Biological Parent Of</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBiologicalFatherIs <em>Biological Father Is</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBiologicalMotherIs <em>Biological Mother Is</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getMarriedWith <em>Married With</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBirthName <em>Birth Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getSources <em>Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson()
 * @model
 * @generated
 */
public interface BekanntePerson extends Person
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_FirstName()
   * @model required="true"
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getFirstName <em>First Name</em>}' attribute.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_LastName()
   * @model required="true"
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getLastName <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Last Name</em>' attribute.
   * @see #getLastName()
   * @generated
   */
  void setLastName(String value);

  /**
   * Returns the value of the '<em><b>Middle Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Middle Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Middle Name</em>' attribute.
   * @see #setMiddleName(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_MiddleName()
   * @model
   * @generated
   */
  String getMiddleName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getMiddleName <em>Middle Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Middle Name</em>' attribute.
   * @see #getMiddleName()
   * @generated
   */
  void setMiddleName(String value);

  /**
   * Returns the value of the '<em><b>Birth Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Birth Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Birth Day</em>' attribute.
   * @see #setBirthDay(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_BirthDay()
   * @model required="true"
   * @generated
   */
  String getBirthDay();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBirthDay <em>Birth Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Birth Day</em>' attribute.
   * @see #getBirthDay()
   * @generated
   */
  void setBirthDay(String value);

  /**
   * Returns the value of the '<em><b>Death Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Death Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Death Day</em>' attribute.
   * @see #setDeathDay(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_DeathDay()
   * @model
   * @generated
   */
  String getDeathDay();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getDeathDay <em>Death Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Death Day</em>' attribute.
   * @see #getDeathDay()
   * @generated
   */
  void setDeathDay(String value);

  /**
   * Returns the value of the '<em><b>Biological Parent Of</b></em>' reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Biological Parent Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Biological Parent Of</em>' reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_BiologicalParentOf()
   * @model
   * @generated
   */
  EList<Person> getBiologicalParentOf();

  /**
   * Returns the value of the '<em><b>Biological Father Is</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Biological Father Is</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Biological Father Is</em>' reference.
   * @see #setBiologicalFatherIs(Person)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_BiologicalFatherIs()
   * @model required="true"
   * @generated
   */
  Person getBiologicalFatherIs();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBiologicalFatherIs <em>Biological Father Is</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Biological Father Is</em>' reference.
   * @see #getBiologicalFatherIs()
   * @generated
   */
  void setBiologicalFatherIs(Person value);

  /**
   * Returns the value of the '<em><b>Biological Mother Is</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Biological Mother Is</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Biological Mother Is</em>' reference.
   * @see #setBiologicalMotherIs(Person)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_BiologicalMotherIs()
   * @model required="true"
   * @generated
   */
  Person getBiologicalMotherIs();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBiologicalMotherIs <em>Biological Mother Is</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Biological Mother Is</em>' reference.
   * @see #getBiologicalMotherIs()
   * @generated
   */
  void setBiologicalMotherIs(Person value);

  /**
   * Returns the value of the '<em><b>Married With</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.Married}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Married With</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Married With</em>' containment reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_MarriedWith()
   * @model containment="true"
   * @generated
   */
  EList<Married> getMarriedWith();

  /**
   * Returns the value of the '<em><b>Notes</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.Note}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' containment reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_Notes()
   * @model containment="true"
   * @generated
   */
  EList<Note> getNotes();

  /**
   * Returns the value of the '<em><b>Birth Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Birth Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Birth Name</em>' attribute.
   * @see #setBirthName(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_BirthName()
   * @model required="true"
   * @generated
   */
  String getBirthName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson#getBirthName <em>Birth Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Birth Name</em>' attribute.
   * @see #getBirthName()
   * @generated
   */
  void setBirthName(String value);

  /**
   * Returns the value of the '<em><b>Sources</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.Source}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sources</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sources</em>' containment reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getBekanntePerson_Sources()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Source> getSources();

} // BekanntePerson
