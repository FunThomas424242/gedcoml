/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.Author;
import com.github.funthomas424242.gedcoml.gedcoml.FamilyImport;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;
import com.github.funthomas424242.gedcoml.gedcoml.Projectdescription;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Projectdescription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl#getArtifactId <em>Artifact Id</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.ProjectdescriptionImpl#getPublishingDate <em>Publishing Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectdescriptionImpl extends EObjectImpl implements Projectdescription
{
  /**
   * The default value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected static final String GROUP_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupId()
   * @generated
   * @ordered
   */
  protected String groupId = GROUP_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected static final String ARTIFACT_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getArtifactId() <em>Artifact Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifactId()
   * @generated
   * @ordered
   */
  protected String artifactId = ARTIFACT_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected static final String VERSION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected String version = VERSION_EDEFAULT;

  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<FamilyImport> imports;

  /**
   * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuthor()
   * @generated
   * @ordered
   */
  protected Author author;

  /**
   * The default value of the '{@link #getPublishingDate() <em>Publishing Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublishingDate()
   * @generated
   * @ordered
   */
  protected static final String PUBLISHING_DATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPublishingDate() <em>Publishing Date</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPublishingDate()
   * @generated
   * @ordered
   */
  protected String publishingDate = PUBLISHING_DATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProjectdescriptionImpl()
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
    return GedcomlPackage.Literals.PROJECTDESCRIPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGroupId()
  {
    return groupId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupId(String newGroupId)
  {
    String oldGroupId = groupId;
    groupId = newGroupId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PROJECTDESCRIPTION__GROUP_ID, oldGroupId, groupId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getArtifactId()
  {
    return artifactId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArtifactId(String newArtifactId)
  {
    String oldArtifactId = artifactId;
    artifactId = newArtifactId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PROJECTDESCRIPTION__ARTIFACT_ID, oldArtifactId, artifactId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getVersion()
  {
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVersion(String newVersion)
  {
    String oldVersion = version;
    version = newVersion;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PROJECTDESCRIPTION__VERSION, oldVersion, version));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FamilyImport> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<FamilyImport>(FamilyImport.class, this, GedcomlPackage.PROJECTDESCRIPTION__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Author getAuthor()
  {
    return author;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAuthor(Author newAuthor, NotificationChain msgs)
  {
    Author oldAuthor = author;
    author = newAuthor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GedcomlPackage.PROJECTDESCRIPTION__AUTHOR, oldAuthor, newAuthor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuthor(Author newAuthor)
  {
    if (newAuthor != author)
    {
      NotificationChain msgs = null;
      if (author != null)
        msgs = ((InternalEObject)author).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GedcomlPackage.PROJECTDESCRIPTION__AUTHOR, null, msgs);
      if (newAuthor != null)
        msgs = ((InternalEObject)newAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GedcomlPackage.PROJECTDESCRIPTION__AUTHOR, null, msgs);
      msgs = basicSetAuthor(newAuthor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PROJECTDESCRIPTION__AUTHOR, newAuthor, newAuthor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPublishingDate()
  {
    return publishingDate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPublishingDate(String newPublishingDate)
  {
    String oldPublishingDate = publishingDate;
    publishingDate = newPublishingDate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.PROJECTDESCRIPTION__PUBLISHING_DATE, oldPublishingDate, publishingDate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GedcomlPackage.PROJECTDESCRIPTION__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case GedcomlPackage.PROJECTDESCRIPTION__AUTHOR:
        return basicSetAuthor(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GedcomlPackage.PROJECTDESCRIPTION__GROUP_ID:
        return getGroupId();
      case GedcomlPackage.PROJECTDESCRIPTION__ARTIFACT_ID:
        return getArtifactId();
      case GedcomlPackage.PROJECTDESCRIPTION__VERSION:
        return getVersion();
      case GedcomlPackage.PROJECTDESCRIPTION__IMPORTS:
        return getImports();
      case GedcomlPackage.PROJECTDESCRIPTION__AUTHOR:
        return getAuthor();
      case GedcomlPackage.PROJECTDESCRIPTION__PUBLISHING_DATE:
        return getPublishingDate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GedcomlPackage.PROJECTDESCRIPTION__GROUP_ID:
        setGroupId((String)newValue);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__ARTIFACT_ID:
        setArtifactId((String)newValue);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__VERSION:
        setVersion((String)newValue);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends FamilyImport>)newValue);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__AUTHOR:
        setAuthor((Author)newValue);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__PUBLISHING_DATE:
        setPublishingDate((String)newValue);
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
      case GedcomlPackage.PROJECTDESCRIPTION__GROUP_ID:
        setGroupId(GROUP_ID_EDEFAULT);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__ARTIFACT_ID:
        setArtifactId(ARTIFACT_ID_EDEFAULT);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__VERSION:
        setVersion(VERSION_EDEFAULT);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__IMPORTS:
        getImports().clear();
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__AUTHOR:
        setAuthor((Author)null);
        return;
      case GedcomlPackage.PROJECTDESCRIPTION__PUBLISHING_DATE:
        setPublishingDate(PUBLISHING_DATE_EDEFAULT);
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
      case GedcomlPackage.PROJECTDESCRIPTION__GROUP_ID:
        return GROUP_ID_EDEFAULT == null ? groupId != null : !GROUP_ID_EDEFAULT.equals(groupId);
      case GedcomlPackage.PROJECTDESCRIPTION__ARTIFACT_ID:
        return ARTIFACT_ID_EDEFAULT == null ? artifactId != null : !ARTIFACT_ID_EDEFAULT.equals(artifactId);
      case GedcomlPackage.PROJECTDESCRIPTION__VERSION:
        return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
      case GedcomlPackage.PROJECTDESCRIPTION__IMPORTS:
        return imports != null && !imports.isEmpty();
      case GedcomlPackage.PROJECTDESCRIPTION__AUTHOR:
        return author != null;
      case GedcomlPackage.PROJECTDESCRIPTION__PUBLISHING_DATE:
        return PUBLISHING_DATE_EDEFAULT == null ? publishingDate != null : !PUBLISHING_DATE_EDEFAULT.equals(publishingDate);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (groupId: ");
    result.append(groupId);
    result.append(", artifactId: ");
    result.append(artifactId);
    result.append(", version: ");
    result.append(version);
    result.append(", publishingDate: ");
    result.append(publishingDate);
    result.append(')');
    return result.toString();
  }

} //ProjectdescriptionImpl
