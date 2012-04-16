/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.Family;
import com.github.funthomas424242.gedcoml.gedcoml.FamilyImport;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.FamilyImportImpl#getImportedResource <em>Imported Resource</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FamilyImportImpl extends EObjectImpl implements FamilyImport
{
  /**
   * The cached value of the '{@link #getImportedResource() <em>Imported Resource</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedResource()
   * @generated
   * @ordered
   */
  protected Family importedResource;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FamilyImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GedcomlPackage.Literals.FAMILY_IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Family getImportedResource()
  {
    if (importedResource != null && importedResource.eIsProxy())
    {
      InternalEObject oldImportedResource = (InternalEObject)importedResource;
      importedResource = (Family)eResolveProxy(oldImportedResource);
      if (importedResource != oldImportedResource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedcomlPackage.FAMILY_IMPORT__IMPORTED_RESOURCE, oldImportedResource, importedResource));
      }
    }
    return importedResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Family basicGetImportedResource()
  {
    return importedResource;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedResource(Family newImportedResource)
  {
    Family oldImportedResource = importedResource;
    importedResource = newImportedResource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.FAMILY_IMPORT__IMPORTED_RESOURCE, oldImportedResource, importedResource));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GedcomlPackage.FAMILY_IMPORT__IMPORTED_RESOURCE:
        if (resolve) return getImportedResource();
        return basicGetImportedResource();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GedcomlPackage.FAMILY_IMPORT__IMPORTED_RESOURCE:
        setImportedResource((Family)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GedcomlPackage.FAMILY_IMPORT__IMPORTED_RESOURCE:
        setImportedResource((Family)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GedcomlPackage.FAMILY_IMPORT__IMPORTED_RESOURCE:
        return importedResource != null;
    }
    return super.eIsSet(featureID);
  }

} //FamilyImportImpl
