/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GedcomlFactoryImpl extends EFactoryImpl implements GedcomlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GedcomlFactory init()
  {
    try
    {
      GedcomlFactory theGedcomlFactory = (GedcomlFactory)EPackage.Registry.INSTANCE.getEFactory("http://com.github.funthomas424242/language/gedcoml"); 
      if (theGedcomlFactory != null)
      {
        return theGedcomlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GedcomlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GedcomlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GedcomlPackage.PROJECTDESCRIPTION: return createProjectdescription();
      case GedcomlPackage.FAMILY: return createFamily();
      case GedcomlPackage.PERSON: return createPerson();
      case GedcomlPackage.FAMILY_BOOK: return createFamilyBook();
      case GedcomlPackage.FAMILY_IMPORT: return createFamilyImport();
      case GedcomlPackage.POST_ADDRESS: return createPostAddress();
      case GedcomlPackage.MARRIED: return createMarried();
      case GedcomlPackage.NOTE: return createNote();
      case GedcomlPackage.AUTHOR: return createAuthor();
      case GedcomlPackage.OTHERS: return createOthers();
      case GedcomlPackage.PERSON_REF: return createPersonRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GedcomlPackage.SEXUS:
        return createSexusFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GedcomlPackage.SEXUS:
        return convertSexusToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Projectdescription createProjectdescription()
  {
    ProjectdescriptionImpl projectdescription = new ProjectdescriptionImpl();
    return projectdescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Family createFamily()
  {
    FamilyImpl family = new FamilyImpl();
    return family;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person createPerson()
  {
    PersonImpl person = new PersonImpl();
    return person;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FamilyBook createFamilyBook()
  {
    FamilyBookImpl familyBook = new FamilyBookImpl();
    return familyBook;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FamilyImport createFamilyImport()
  {
    FamilyImportImpl familyImport = new FamilyImportImpl();
    return familyImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PostAddress createPostAddress()
  {
    PostAddressImpl postAddress = new PostAddressImpl();
    return postAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Married createMarried()
  {
    MarriedImpl married = new MarriedImpl();
    return married;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Note createNote()
  {
    NoteImpl note = new NoteImpl();
    return note;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author createAuthor()
  {
    AuthorImpl author = new AuthorImpl();
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Others createOthers()
  {
    OthersImpl others = new OthersImpl();
    return others;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonRef createPersonRef()
  {
    PersonRefImpl personRef = new PersonRefImpl();
    return personRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Sexus createSexusFromString(EDataType eDataType, String initialValue)
  {
    Sexus result = Sexus.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertSexusToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GedcomlPackage getGedcomlPackage()
  {
    return (GedcomlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GedcomlPackage getPackage()
  {
    return GedcomlPackage.eINSTANCE;
  }

} //GedcomlFactoryImpl
