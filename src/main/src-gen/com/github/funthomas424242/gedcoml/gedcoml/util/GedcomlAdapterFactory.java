/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.util;

import com.github.funthomas424242.gedcoml.gedcoml.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage
 * @generated
 */
public class GedcomlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static GedcomlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GedcomlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = GedcomlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GedcomlSwitch<Adapter> modelSwitch =
    new GedcomlSwitch<Adapter>()
    {
      @Override
      public Adapter caseProjectdescription(Projectdescription object)
      {
        return createProjectdescriptionAdapter();
      }
      @Override
      public Adapter caseFamily(Family object)
      {
        return createFamilyAdapter();
      }
      @Override
      public Adapter caseBekanntePerson(BekanntePerson object)
      {
        return createBekanntePersonAdapter();
      }
      @Override
      public Adapter caseFamilyBook(FamilyBook object)
      {
        return createFamilyBookAdapter();
      }
      @Override
      public Adapter caseFamilyImport(FamilyImport object)
      {
        return createFamilyImportAdapter();
      }
      @Override
      public Adapter casePostAddress(PostAddress object)
      {
        return createPostAddressAdapter();
      }
      @Override
      public Adapter caseAddress(Address object)
      {
        return createAddressAdapter();
      }
      @Override
      public Adapter caseMarried(Married object)
      {
        return createMarriedAdapter();
      }
      @Override
      public Adapter caseNote(Note object)
      {
        return createNoteAdapter();
      }
      @Override
      public Adapter caseAuthor(Author object)
      {
        return createAuthorAdapter();
      }
      @Override
      public Adapter caseSource(Source object)
      {
        return createSourceAdapter();
      }
      @Override
      public Adapter caseOthers(Others object)
      {
        return createOthersAdapter();
      }
      @Override
      public Adapter casePersonRef(PersonRef object)
      {
        return createPersonRefAdapter();
      }
      @Override
      public Adapter caseUnbekanntePerson(UnbekanntePerson object)
      {
        return createUnbekanntePersonAdapter();
      }
      @Override
      public Adapter casePerson(Person object)
      {
        return createPersonAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Projectdescription <em>Projectdescription</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Projectdescription
   * @generated
   */
  public Adapter createProjectdescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Family <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Family
   * @generated
   */
  public Adapter createFamilyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson <em>Bekannte Person</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson
   * @generated
   */
  public Adapter createBekanntePersonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Person <em>Person</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Person
   * @generated
   */
  public Adapter createPersonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyBook <em>Family Book</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.FamilyBook
   * @generated
   */
  public Adapter createFamilyBookAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.FamilyImport <em>Family Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.FamilyImport
   * @generated
   */
  public Adapter createFamilyImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.PostAddress <em>Post Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PostAddress
   * @generated
   */
  public Adapter createPostAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Address <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Address
   * @generated
   */
  public Adapter createAddressAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Married <em>Married</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Married
   * @generated
   */
  public Adapter createMarriedAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Note <em>Note</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Note
   * @generated
   */
  public Adapter createNoteAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Author <em>Author</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Author
   * @generated
   */
  public Adapter createAuthorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Source <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Source
   * @generated
   */
  public Adapter createSourceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.Others <em>Others</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.Others
   * @generated
   */
  public Adapter createOthersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.PersonRef <em>Person Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.PersonRef
   * @generated
   */
  public Adapter createPersonRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.github.funthomas424242.gedcoml.gedcoml.UnbekanntePerson <em>Unbekannte Person</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.github.funthomas424242.gedcoml.gedcoml.UnbekanntePerson
   * @generated
   */
  public Adapter createUnbekanntePersonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //GedcomlAdapterFactory
