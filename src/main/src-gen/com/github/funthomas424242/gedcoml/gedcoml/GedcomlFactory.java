/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage
 * @generated
 */
public interface GedcomlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GedcomlFactory eINSTANCE = com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Projectdescription</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Projectdescription</em>'.
   * @generated
   */
  Projectdescription createProjectdescription();

  /**
   * Returns a new object of class '<em>Family</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Family</em>'.
   * @generated
   */
  Family createFamily();

  /**
   * Returns a new object of class '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Person</em>'.
   * @generated
   */
  Person createPerson();

  /**
   * Returns a new object of class '<em>Family Book</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Family Book</em>'.
   * @generated
   */
  FamilyBook createFamilyBook();

  /**
   * Returns a new object of class '<em>Family Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Family Import</em>'.
   * @generated
   */
  FamilyImport createFamilyImport();

  /**
   * Returns a new object of class '<em>Post Address</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Post Address</em>'.
   * @generated
   */
  PostAddress createPostAddress();

  /**
   * Returns a new object of class '<em>Married</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Married</em>'.
   * @generated
   */
  Married createMarried();

  /**
   * Returns a new object of class '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Note</em>'.
   * @generated
   */
  Note createNote();

  /**
   * Returns a new object of class '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Author</em>'.
   * @generated
   */
  Author createAuthor();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GedcomlPackage getGedcomlPackage();

} //GedcomlFactory
