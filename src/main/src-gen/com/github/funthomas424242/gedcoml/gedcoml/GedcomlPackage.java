/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlFactory
 * @model kind="package"
 * @generated
 */
public interface GedcomlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "gedcoml";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://com.github.funthomas424242/language/gedcoml";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "gedcoml";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GedcomlPackage eINSTANCE = com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl.init();

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl <em>Projectdescription</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getProjectdescription()
   * @generated
   */
  int PROJECTDESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Group Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION__GROUP_ID = 0;

  /**
   * The feature id for the '<em><b>Artifact Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION__ARTIFACT_ID = 1;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION__VERSION = 2;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION__IMPORTS = 3;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION__AUTHOR = 4;

  /**
   * The feature id for the '<em><b>Publishing Date</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION__PUBLISHING_DATE = 5;

  /**
   * The number of structural features of the '<em>Projectdescription</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROJECTDESCRIPTION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImpl <em>Family</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getFamily()
   * @generated
   */
  int FAMILY = 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__MEMBERS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__NAME = 1;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__IMPORTS = 2;

  /**
   * The number of structural features of the '<em>Family</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl <em>Person</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getPerson()
   * @generated
   */
  int PERSON = 2;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__FIRST_NAME = 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__LAST_NAME = 1;

  /**
   * The feature id for the '<em><b>Middle Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__MIDDLE_NAME = 2;

  /**
   * The feature id for the '<em><b>Birth Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__BIRTH_DAY = 3;

  /**
   * The feature id for the '<em><b>Sex</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__SEX = 4;

  /**
   * The feature id for the '<em><b>Death Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__DEATH_DAY = 5;

  /**
   * The feature id for the '<em><b>Addresses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ADDRESSES = 6;

  /**
   * The feature id for the '<em><b>Biological Parent Of</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__BIOLOGICAL_PARENT_OF = 7;

  /**
   * The feature id for the '<em><b>Biological Father Is</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__BIOLOGICAL_FATHER_IS = 8;

  /**
   * The feature id for the '<em><b>Biological Mother Is</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__BIOLOGICAL_MOTHER_IS = 9;

  /**
   * The feature id for the '<em><b>Married With</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__MARRIED_WITH = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__ID = 11;

  /**
   * The feature id for the '<em><b>Notes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__NOTES = 12;

  /**
   * The feature id for the '<em><b>Birth Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__BIRTH_NAME = 13;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON__SOURCES = 14;

  /**
   * The number of structural features of the '<em>Person</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_FEATURE_COUNT = 15;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyBookImpl <em>Family Book</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyBookImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getFamilyBook()
   * @generated
   */
  int FAMILY_BOOK = 3;

  /**
   * The feature id for the '<em><b>Project</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_BOOK__PROJECT = 0;

  /**
   * The number of structural features of the '<em>Family Book</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_BOOK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImportImpl <em>Family Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImportImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getFamilyImport()
   * @generated
   */
  int FAMILY_IMPORT = 4;

  /**
   * The feature id for the '<em><b>Imported Resource</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_IMPORT__IMPORTED_RESOURCE = 0;

  /**
   * The number of structural features of the '<em>Family Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_IMPORT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AddressImpl <em>Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.AddressImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getAddress()
   * @generated
   */
  int ADDRESS = 6;

  /**
   * The feature id for the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__ENTRY = 0;

  /**
   * The feature id for the '<em><b>Exodus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS__EXODUS = 1;

  /**
   * The number of structural features of the '<em>Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PostAddressImpl <em>Post Address</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.PostAddressImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getPostAddress()
   * @generated
   */
  int POST_ADDRESS = 5;

  /**
   * The feature id for the '<em><b>Entry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_ADDRESS__ENTRY = ADDRESS__ENTRY;

  /**
   * The feature id for the '<em><b>Exodus</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_ADDRESS__EXODUS = ADDRESS__EXODUS;

  /**
   * The feature id for the '<em><b>Street</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_ADDRESS__STREET = ADDRESS_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Postcode</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_ADDRESS__POSTCODE = ADDRESS_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>City</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_ADDRESS__CITY = ADDRESS_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Post Address</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POST_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl <em>Married</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getMarried()
   * @generated
   */
  int MARRIED = 7;

  /**
   * The feature id for the '<em><b>Wedding Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARRIED__WEDDING_DAY = 0;

  /**
   * The feature id for the '<em><b>Separation Day</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARRIED__SEPARATION_DAY = 1;

  /**
   * The feature id for the '<em><b>Partner</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARRIED__PARTNER = 2;

  /**
   * The number of structural features of the '<em>Married</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MARRIED_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.NoteImpl <em>Note</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.NoteImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getNote()
   * @generated
   */
  int NOTE = 8;

  /**
   * The feature id for the '<em><b>Content</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE__CONTENT = 0;

  /**
   * The number of structural features of the '<em>Note</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl <em>Author</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getAuthor()
   * @generated
   */
  int AUTHOR = 9;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__FIRST_NAME = 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__LAST_NAME = 1;

  /**
   * The feature id for the '<em><b>Member Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR__MEMBER_ID = 2;

  /**
   * The number of structural features of the '<em>Author</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AUTHOR_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.SourceImpl <em>Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.SourceImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getSource()
   * @generated
   */
  int SOURCE = 10;

  /**
   * The number of structural features of the '<em>Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SOURCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.OthersImpl <em>Others</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.OthersImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getOthers()
   * @generated
   */
  int OTHERS = 11;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERS__DESCRIPTION = SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Others</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OTHERS_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonRefImpl <em>Person Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.PersonRefImpl
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getPersonRef()
   * @generated
   */
  int PERSON_REF = 12;

  /**
   * The feature id for the '<em><b>Person ID</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_REF__PERSON_ID = SOURCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Person Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PERSON_REF_FEATURE_COUNT = SOURCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.github.funthomas424242.gedcoml.gedcoml.Sexus <em>Sexus</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.github.funthomas424242.gedcoml.gedcoml.Sexus
   * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getSexus()
   * @generated
   */
  int SEXUS = 13;


  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription <em>Projectdescription</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Projectdescription</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription
   * @generated
   */
  EClass getProjectdescription();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getGroupId <em>Group Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Group Id</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getGroupId()
   * @see #getProjectdescription()
   * @generated
   */
  EAttribute getProjectdescription_GroupId();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getArtifactId <em>Artifact Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Artifact Id</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getArtifactId()
   * @see #getProjectdescription()
   * @generated
   */
  EAttribute getProjectdescription_ArtifactId();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Version</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getVersion()
   * @see #getProjectdescription()
   * @generated
   */
  EAttribute getProjectdescription_Version();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getImports()
   * @see #getProjectdescription()
   * @generated
   */
  EReference getProjectdescription_Imports();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getAuthor <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Author</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getAuthor()
   * @see #getProjectdescription()
   * @generated
   */
  EReference getProjectdescription_Author();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getPublishingDate <em>Publishing Date</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Publishing Date</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription#getPublishingDate()
   * @see #getProjectdescription()
   * @generated
   */
  EAttribute getProjectdescription_PublishingDate();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Family <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Family</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Family
   * @generated
   */
  EClass getFamily();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Family#getMembers <em>Members</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Members</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Family#getMembers()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Members();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Family#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Family#getName()
   * @see #getFamily()
   * @generated
   */
  EAttribute getFamily_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Family#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Family#getImports()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Imports();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person
   * @generated
   */
  EClass getPerson();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getFirstName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_FirstName();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getLastName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_LastName();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getMiddleName <em>Middle Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Middle Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getMiddleName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_MiddleName();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthDay <em>Birth Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Birth Day</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthDay()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_BirthDay();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getSex <em>Sex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sex</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getSex()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Sex();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getDeathDay <em>Death Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Death Day</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getDeathDay()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_DeathDay();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getAddresses <em>Addresses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Addresses</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getAddresses()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Addresses();

  /**
   * Returns the meta object for the reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalParentOf <em>Biological Parent Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Biological Parent Of</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalParentOf()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_BiologicalParentOf();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalFatherIs <em>Biological Father Is</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Biological Father Is</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalFatherIs()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_BiologicalFatherIs();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalMotherIs <em>Biological Mother Is</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Biological Mother Is</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getBiologicalMotherIs()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_BiologicalMotherIs();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getMarriedWith <em>Married With</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Married With</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getMarriedWith()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_MarriedWith();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getId()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_Id();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Notes</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getNotes()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Notes();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthName <em>Birth Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Birth Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getBirthName()
   * @see #getPerson()
   * @generated
   */
  EAttribute getPerson_BirthName();

  /**
   * Returns the meta object for the containment reference list '{@link com.github.funthomas424242.gedcoml.gedcoml.Person#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person#getSources()
   * @see #getPerson()
   * @generated
   */
  EReference getPerson_Sources();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyBook <em>Family Book</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Family Book</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.FamilyBook
   * @generated
   */
  EClass getFamilyBook();

  /**
   * Returns the meta object for the containment reference '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyBook#getProject <em>Project</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Project</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.FamilyBook#getProject()
   * @see #getFamilyBook()
   * @generated
   */
  EReference getFamilyBook_Project();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyImport <em>Family Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Family Import</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.FamilyImport
   * @generated
   */
  EClass getFamilyImport();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyImport#getImportedResource <em>Imported Resource</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Imported Resource</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.FamilyImport#getImportedResource()
   * @see #getFamilyImport()
   * @generated
   */
  EReference getFamilyImport_ImportedResource();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress <em>Post Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Post Address</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PostAddress
   * @generated
   */
  EClass getPostAddress();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getStreet <em>Street</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Street</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getStreet()
   * @see #getPostAddress()
   * @generated
   */
  EAttribute getPostAddress_Street();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getPostcode <em>Postcode</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Postcode</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getPostcode()
   * @see #getPostAddress()
   * @generated
   */
  EAttribute getPostAddress_Postcode();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getCity <em>City</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>City</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PostAddress#getCity()
   * @see #getPostAddress()
   * @generated
   */
  EAttribute getPostAddress_City();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Address</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Address
   * @generated
   */
  EClass getAddress();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Address#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Entry</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Address#getEntry()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_Entry();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Address#getExodus <em>Exodus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exodus</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Address#getExodus()
   * @see #getAddress()
   * @generated
   */
  EAttribute getAddress_Exodus();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Married <em>Married</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Married</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Married
   * @generated
   */
  EClass getMarried();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getWeddingDay <em>Wedding Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Wedding Day</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Married#getWeddingDay()
   * @see #getMarried()
   * @generated
   */
  EAttribute getMarried_WeddingDay();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getSeparationDay <em>Separation Day</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Separation Day</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Married#getSeparationDay()
   * @see #getMarried()
   * @generated
   */
  EAttribute getMarried_SeparationDay();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.gedcoml.gedcoml.Married#getPartner <em>Partner</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Partner</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Married#getPartner()
   * @see #getMarried()
   * @generated
   */
  EReference getMarried_Partner();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Note</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Note
   * @generated
   */
  EClass getNote();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Note#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Content</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Note#getContent()
   * @see #getNote()
   * @generated
   */
  EAttribute getNote_Content();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Author</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Author
   * @generated
   */
  EClass getAuthor();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Author#getFirstName()
   * @see #getAuthor()
   * @generated
   */
  EAttribute getAuthor_FirstName();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Author#getLastName()
   * @see #getAuthor()
   * @generated
   */
  EAttribute getAuthor_LastName();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.gedcoml.gedcoml.Author#getMemberId <em>Member Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Member Id</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Author#getMemberId()
   * @see #getAuthor()
   * @generated
   */
  EReference getAuthor_MemberId();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Source</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Source
   * @generated
   */
  EClass getSource();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.Others <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Others</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Others
   * @generated
   */
  EClass getOthers();

  /**
   * Returns the meta object for the attribute '{@link com.github.funthomas424242.gedcoml.gedcoml.Others#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Others#getDescription()
   * @see #getOthers()
   * @generated
   */
  EAttribute getOthers_Description();

  /**
   * Returns the meta object for class '{@link com.github.funthomas424242.gedcoml.gedcoml.PersonRef <em>Person Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Person Ref</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PersonRef
   * @generated
   */
  EClass getPersonRef();

  /**
   * Returns the meta object for the reference '{@link com.github.funthomas424242.gedcoml.gedcoml.PersonRef#getPersonID <em>Person ID</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Person ID</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PersonRef#getPersonID()
   * @see #getPersonRef()
   * @generated
   */
  EReference getPersonRef_PersonID();

  /**
   * Returns the meta object for enum '{@link com.github.funthomas424242.gedcoml.gedcoml.Sexus <em>Sexus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Sexus</em>'.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Sexus
   * @generated
   */
  EEnum getSexus();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  GedcomlFactory getGedcomlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl <em>Projectdescription</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getProjectdescription()
     * @generated
     */
    EClass PROJECTDESCRIPTION = eINSTANCE.getProjectdescription();

    /**
     * The meta object literal for the '<em><b>Group Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTDESCRIPTION__GROUP_ID = eINSTANCE.getProjectdescription_GroupId();

    /**
     * The meta object literal for the '<em><b>Artifact Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTDESCRIPTION__ARTIFACT_ID = eINSTANCE.getProjectdescription_ArtifactId();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTDESCRIPTION__VERSION = eINSTANCE.getProjectdescription_Version();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTDESCRIPTION__IMPORTS = eINSTANCE.getProjectdescription_Imports();

    /**
     * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROJECTDESCRIPTION__AUTHOR = eINSTANCE.getProjectdescription_Author();

    /**
     * The meta object literal for the '<em><b>Publishing Date</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROJECTDESCRIPTION__PUBLISHING_DATE = eINSTANCE.getProjectdescription_PublishingDate();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImpl <em>Family</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getFamily()
     * @generated
     */
    EClass FAMILY = eINSTANCE.getFamily();

    /**
     * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__MEMBERS = eINSTANCE.getFamily_Members();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FAMILY__NAME = eINSTANCE.getFamily_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__IMPORTS = eINSTANCE.getFamily_Imports();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl <em>Person</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.PersonImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getPerson()
     * @generated
     */
    EClass PERSON = eINSTANCE.getPerson();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__FIRST_NAME = eINSTANCE.getPerson_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__LAST_NAME = eINSTANCE.getPerson_LastName();

    /**
     * The meta object literal for the '<em><b>Middle Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__MIDDLE_NAME = eINSTANCE.getPerson_MiddleName();

    /**
     * The meta object literal for the '<em><b>Birth Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__BIRTH_DAY = eINSTANCE.getPerson_BirthDay();

    /**
     * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__SEX = eINSTANCE.getPerson_Sex();

    /**
     * The meta object literal for the '<em><b>Death Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__DEATH_DAY = eINSTANCE.getPerson_DeathDay();

    /**
     * The meta object literal for the '<em><b>Addresses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__ADDRESSES = eINSTANCE.getPerson_Addresses();

    /**
     * The meta object literal for the '<em><b>Biological Parent Of</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__BIOLOGICAL_PARENT_OF = eINSTANCE.getPerson_BiologicalParentOf();

    /**
     * The meta object literal for the '<em><b>Biological Father Is</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__BIOLOGICAL_FATHER_IS = eINSTANCE.getPerson_BiologicalFatherIs();

    /**
     * The meta object literal for the '<em><b>Biological Mother Is</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__BIOLOGICAL_MOTHER_IS = eINSTANCE.getPerson_BiologicalMotherIs();

    /**
     * The meta object literal for the '<em><b>Married With</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__MARRIED_WITH = eINSTANCE.getPerson_MarriedWith();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__ID = eINSTANCE.getPerson_Id();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__NOTES = eINSTANCE.getPerson_Notes();

    /**
     * The meta object literal for the '<em><b>Birth Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PERSON__BIRTH_NAME = eINSTANCE.getPerson_BirthName();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON__SOURCES = eINSTANCE.getPerson_Sources();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyBookImpl <em>Family Book</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyBookImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getFamilyBook()
     * @generated
     */
    EClass FAMILY_BOOK = eINSTANCE.getFamilyBook();

    /**
     * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY_BOOK__PROJECT = eINSTANCE.getFamilyBook_Project();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImportImpl <em>Family Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImportImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getFamilyImport()
     * @generated
     */
    EClass FAMILY_IMPORT = eINSTANCE.getFamilyImport();

    /**
     * The meta object literal for the '<em><b>Imported Resource</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY_IMPORT__IMPORTED_RESOURCE = eINSTANCE.getFamilyImport_ImportedResource();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PostAddressImpl <em>Post Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.PostAddressImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getPostAddress()
     * @generated
     */
    EClass POST_ADDRESS = eINSTANCE.getPostAddress();

    /**
     * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_ADDRESS__STREET = eINSTANCE.getPostAddress_Street();

    /**
     * The meta object literal for the '<em><b>Postcode</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_ADDRESS__POSTCODE = eINSTANCE.getPostAddress_Postcode();

    /**
     * The meta object literal for the '<em><b>City</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POST_ADDRESS__CITY = eINSTANCE.getPostAddress_City();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AddressImpl <em>Address</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.AddressImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getAddress()
     * @generated
     */
    EClass ADDRESS = eINSTANCE.getAddress();

    /**
     * The meta object literal for the '<em><b>Entry</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__ENTRY = eINSTANCE.getAddress_Entry();

    /**
     * The meta object literal for the '<em><b>Exodus</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ADDRESS__EXODUS = eINSTANCE.getAddress_Exodus();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl <em>Married</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.MarriedImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getMarried()
     * @generated
     */
    EClass MARRIED = eINSTANCE.getMarried();

    /**
     * The meta object literal for the '<em><b>Wedding Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARRIED__WEDDING_DAY = eINSTANCE.getMarried_WeddingDay();

    /**
     * The meta object literal for the '<em><b>Separation Day</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MARRIED__SEPARATION_DAY = eINSTANCE.getMarried_SeparationDay();

    /**
     * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MARRIED__PARTNER = eINSTANCE.getMarried_Partner();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.NoteImpl <em>Note</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.NoteImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getNote()
     * @generated
     */
    EClass NOTE = eINSTANCE.getNote();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTE__CONTENT = eINSTANCE.getNote_Content();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl <em>Author</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.AuthorImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getAuthor()
     * @generated
     */
    EClass AUTHOR = eINSTANCE.getAuthor();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHOR__FIRST_NAME = eINSTANCE.getAuthor_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AUTHOR__LAST_NAME = eINSTANCE.getAuthor_LastName();

    /**
     * The meta object literal for the '<em><b>Member Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AUTHOR__MEMBER_ID = eINSTANCE.getAuthor_MemberId();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.SourceImpl <em>Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.SourceImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getSource()
     * @generated
     */
    EClass SOURCE = eINSTANCE.getSource();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.OthersImpl <em>Others</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.OthersImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getOthers()
     * @generated
     */
    EClass OTHERS = eINSTANCE.getOthers();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OTHERS__DESCRIPTION = eINSTANCE.getOthers_Description();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.impl.PersonRefImpl <em>Person Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.PersonRefImpl
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getPersonRef()
     * @generated
     */
    EClass PERSON_REF = eINSTANCE.getPersonRef();

    /**
     * The meta object literal for the '<em><b>Person ID</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PERSON_REF__PERSON_ID = eINSTANCE.getPersonRef_PersonID();

    /**
     * The meta object literal for the '{@link com.github.funthomas424242.gedcoml.gedcoml.Sexus <em>Sexus</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.github.funthomas424242.gedcoml.gedcoml.Sexus
     * @see com.github.funthomas424242.gedcoml.gedcoml.impl.GedcomlPackageImpl#getSexus()
     * @generated
     */
    EEnum SEXUS = eINSTANCE.getSexus();

  }

} //GedcomlPackage
