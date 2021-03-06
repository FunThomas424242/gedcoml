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
 * A representation of the model object '<em><b>Family Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyImport#getImportedResource <em>Imported Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getFamilyImport()
 * @model
 * @generated
 */
public interface FamilyImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Resource</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Resource</em>' reference.
   * @see #setImportedResource(Family)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getFamilyImport_ImportedResource()
   * @model required="true"
   * @generated
   */
  Family getImportedResource();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyImport#getImportedResource <em>Imported Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Resource</em>' reference.
   * @see #getImportedResource()
   * @generated
   */
  void setImportedResource(Family value);

} // FamilyImport
