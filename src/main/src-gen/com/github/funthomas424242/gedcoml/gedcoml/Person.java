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
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthDay <em>Birth Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getSex <em>Sex</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getDeathDay <em>Death Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getAddresses <em>Addresses</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalParentOf <em>Biological Parent Of</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalFatherIs <em>Biological Father Is</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalMotherIs <em>Biological Mother Is</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getMarriedWith <em>Married With</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getId <em>Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthName <em>Birth Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getSources <em>Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_FirstName()
   * @model required="true"
   * @generated
   */
  String getFirstName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getFirstName <em>First Name</em>}' attribute.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_LastName()
   * @model required="true"
   * @generated
   */
  String getLastName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getLastName <em>Last Name</em>}' attribute.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_MiddleName()
   * @model
   * @generated
   */
  String getMiddleName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getMiddleName <em>Middle Name</em>}' attribute.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_BirthDay()
   * @model required="true"
   * @generated
   */
  String getBirthDay();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthDay <em>Birth Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Birth Day</em>' attribute.
   * @see #getBirthDay()
   * @generated
   */
  void setBirthDay(String value);

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
   * Returns the value of the '<em><b>Death Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Death Day</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Death Day</em>' attribute.
   * @see #setDeathDay(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_DeathDay()
   * @model
   * @generated
   */
  String getDeathDay();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getDeathDay <em>Death Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Death Day</em>' attribute.
   * @see #getDeathDay()
   * @generated
   */
  void setDeathDay(String value);

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
   * Returns the value of the '<em><b>Biological Parent Of</b></em>' reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.Person}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Biological Parent Of</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Biological Parent Of</em>' reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_BiologicalParentOf()
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_BiologicalFatherIs()
   * @model required="true"
   * @generated
   */
  Person getBiologicalFatherIs();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalFatherIs <em>Biological Father Is</em>}' reference.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_BiologicalMotherIs()
   * @model required="true"
   * @generated
   */
  Person getBiologicalMotherIs();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalMotherIs <em>Biological Mother Is</em>}' reference.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_MarriedWith()
   * @model containment="true"
   * @generated
   */
  EList<Married> getMarriedWith();

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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_Notes()
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_BirthName()
   * @model required="true"
   * @generated
   */
  String getBirthName();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthName <em>Birth Name</em>}' attribute.
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
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getPerson_Sources()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Source> getSources();

} // Person
