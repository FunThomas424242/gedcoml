/**
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projectdescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getPublishingDate <em>Publishing Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription()
 * @model
 * @generated
 */
public interface Projectdescription extends EObject
{
  /**
   * Returns the value of the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Id</em>' attribute.
   * @see #setGroupId(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription_GroupId()
   * @model required="true"
   * @generated
   */
  String getGroupId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getGroupId <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Id</em>' attribute.
   * @see #getGroupId()
   * @generated
   */
  void setGroupId(String value);

  /**
   * Returns the value of the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Artifact Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Artifact Id</em>' attribute.
   * @see #setArtifactId(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription_ArtifactId()
   * @model required="true"
   * @generated
   */
  String getArtifactId();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getArtifactId <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Artifact Id</em>' attribute.
   * @see #getArtifactId()
   * @generated
   */
  void setArtifactId(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription_Version()
   * @model required="true"
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link com.github.funthomas424242.gedcoml.gedcoml.FamilyImport}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription_Imports()
   * @model containment="true"
   * @generated
   */
  EList<FamilyImport> getImports();

  /**
   * Returns the value of the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Author</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Author</em>' containment reference.
   * @see #setAuthor(Author)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription_Author()
   * @model containment="true" required="true"
   * @generated
   */
  Author getAuthor();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getAuthor <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Author</em>' containment reference.
   * @see #getAuthor()
   * @generated
   */
  void setAuthor(Author value);

  /**
   * Returns the value of the '<em><b>Publishing Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Publishing Date</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Publishing Date</em>' attribute.
   * @see #setPublishingDate(String)
   * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage#getProjectdescription_PublishingDate()
   * @model required="true"
   * @generated
   */
  String getPublishingDate();

  /**
   * Sets the value of the '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getPublishingDate <em>Publishing Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Publishing Date</em>' attribute.
   * @see #getPublishingDate()
   * @generated
   */
  void setPublishingDate(String value);

} // Projectdescription
