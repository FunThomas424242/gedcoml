/**
 */
package com.github.funthomas424242.gedcoml.gedcoml.util;

import com.github.funthomas424242.gedcoml.gedcoml.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage
 * @generated
 */
public class GedcomlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GedcomlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GedcomlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = GedcomlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case GedcomlPackage.PROJECTDESCRIPTION:
      {
        Projectdescription projectdescription = (Projectdescription)theEObject;
        T result = caseProjectdescription(projectdescription);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.FAMILY:
      {
        Family family = (Family)theEObject;
        T result = caseFamily(family);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.BEKANNTE_PERSON:
      {
        BekanntePerson bekanntePerson = (BekanntePerson)theEObject;
        T result = caseBekanntePerson(bekanntePerson);
        if (result == null) result = casePerson(bekanntePerson);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.FAMILY_BOOK:
      {
        FamilyBook familyBook = (FamilyBook)theEObject;
        T result = caseFamilyBook(familyBook);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.FAMILY_IMPORT:
      {
        FamilyImport familyImport = (FamilyImport)theEObject;
        T result = caseFamilyImport(familyImport);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.POST_ADDRESS:
      {
        PostAddress postAddress = (PostAddress)theEObject;
        T result = casePostAddress(postAddress);
        if (result == null) result = caseAddress(postAddress);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.ADDRESS:
      {
        Address address = (Address)theEObject;
        T result = caseAddress(address);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.MARRIED:
      {
        Married married = (Married)theEObject;
        T result = caseMarried(married);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.NOTE:
      {
        Note note = (Note)theEObject;
        T result = caseNote(note);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.AUTHOR:
      {
        Author author = (Author)theEObject;
        T result = caseAuthor(author);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.SOURCE:
      {
        Source source = (Source)theEObject;
        T result = caseSource(source);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.OTHERS:
      {
        Others others = (Others)theEObject;
        T result = caseOthers(others);
        if (result == null) result = caseSource(others);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.PERSON_REF:
      {
        PersonRef personRef = (PersonRef)theEObject;
        T result = casePersonRef(personRef);
        if (result == null) result = caseSource(personRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.UNBEKANNTE_PERSON:
      {
        UnbekanntePerson unbekanntePerson = (UnbekanntePerson)theEObject;
        T result = caseUnbekanntePerson(unbekanntePerson);
        if (result == null) result = casePerson(unbekanntePerson);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case GedcomlPackage.PERSON:
      {
        Person person = (Person)theEObject;
        T result = casePerson(person);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Projectdescription</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Projectdescription</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProjectdescription(Projectdescription object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Family</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Family</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFamily(Family object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bekannte Person</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bekannte Person</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBekanntePerson(BekanntePerson object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Family Book</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Family Book</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFamilyBook(FamilyBook object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Family Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Family Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFamilyImport(FamilyImport object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Post Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Post Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePostAddress(PostAddress object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Address</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAddress(Address object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Married</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Married</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMarried(Married object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Note</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Note</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNote(Note object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Author</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Author</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAuthor(Author object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Source</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Source</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSource(Source object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Others</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Others</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOthers(Others object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Person Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Person Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePersonRef(PersonRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unbekannte Person</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unbekannte Person</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnbekanntePerson(UnbekanntePerson object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Person</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Person</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePerson(Person object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //GedcomlSwitch
