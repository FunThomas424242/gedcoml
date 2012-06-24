/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.github.funthomas424242.gedcoml.gedcoml.impl;

import com.github.funthomas424242.gedcoml.gedcoml.BekanntePerson;
import com.github.funthomas424242.gedcoml.gedcoml.GedcomlPackage;
import com.github.funthomas424242.gedcoml.gedcoml.Married;
import com.github.funthomas424242.gedcoml.gedcoml.Note;
import com.github.funthomas424242.gedcoml.gedcoml.Person;
import com.github.funthomas424242.gedcoml.gedcoml.Sexus;
import com.github.funthomas424242.gedcoml.gedcoml.Source;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bekannte Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getMiddleName <em>Middle Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getBirthDay <em>Birth Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getDeathDay <em>Death Day</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getBiologicalParentOf <em>Biological Parent Of</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getBiologicalFatherIs <em>Biological Father Is</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getBiologicalMotherIs <em>Biological Mother Is</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getMarriedWith <em>Married With</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getBirthName <em>Birth Name</em>}</li>
 *   <li>{@link com.github.funthomas424242.gedcoml.gedcoml.impl.BekanntePersonImpl#getSources <em>Sources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BekanntePersonImpl extends PersonImpl implements BekanntePerson
{
  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddleName()
   * @generated
   * @ordered
   */
  protected static final String MIDDLE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMiddleName() <em>Middle Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMiddleName()
   * @generated
   * @ordered
   */
  protected String middleName = MIDDLE_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getBirthDay() <em>Birth Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthDay()
   * @generated
   * @ordered
   */
  protected static final String BIRTH_DAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBirthDay() <em>Birth Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthDay()
   * @generated
   * @ordered
   */
  protected String birthDay = BIRTH_DAY_EDEFAULT;

  /**
   * The default value of the '{@link #getDeathDay() <em>Death Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathDay()
   * @generated
   * @ordered
   */
  protected static final String DEATH_DAY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDeathDay() <em>Death Day</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeathDay()
   * @generated
   * @ordered
   */
  protected String deathDay = DEATH_DAY_EDEFAULT;

  /**
   * The cached value of the '{@link #getBiologicalParentOf() <em>Biological Parent Of</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiologicalParentOf()
   * @generated
   * @ordered
   */
  protected EList<Person> biologicalParentOf;

  /**
   * The cached value of the '{@link #getBiologicalFatherIs() <em>Biological Father Is</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiologicalFatherIs()
   * @generated
   * @ordered
   */
  protected Person biologicalFatherIs;

  /**
   * The cached value of the '{@link #getBiologicalMotherIs() <em>Biological Mother Is</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBiologicalMotherIs()
   * @generated
   * @ordered
   */
  protected Person biologicalMotherIs;

  /**
   * The cached value of the '{@link #getMarriedWith() <em>Married With</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMarriedWith()
   * @generated
   * @ordered
   */
  protected EList<Married> marriedWith;

  /**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
  protected EList<Note> notes;

  /**
   * The default value of the '{@link #getBirthName() <em>Birth Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthName()
   * @generated
   * @ordered
   */
  protected static final String BIRTH_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBirthName() <em>Birth Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBirthName()
   * @generated
   * @ordered
   */
  protected String birthName = BIRTH_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSources() <em>Sources</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSources()
   * @generated
   * @ordered
   */
  protected EList<Source> sources;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BekanntePersonImpl()
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
    return GedcomlPackage.Literals.BEKANNTE_PERSON;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMiddleName()
  {
    return middleName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMiddleName(String newMiddleName)
  {
    String oldMiddleName = middleName;
    middleName = newMiddleName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__MIDDLE_NAME, oldMiddleName, middleName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBirthDay()
  {
    return birthDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBirthDay(String newBirthDay)
  {
    String oldBirthDay = birthDay;
    birthDay = newBirthDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__BIRTH_DAY, oldBirthDay, birthDay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDeathDay()
  {
    return deathDay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeathDay(String newDeathDay)
  {
    String oldDeathDay = deathDay;
    deathDay = newDeathDay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__DEATH_DAY, oldDeathDay, deathDay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Person> getBiologicalParentOf()
  {
    if (biologicalParentOf == null)
    {
      biologicalParentOf = new EObjectResolvingEList<Person>(Person.class, this, GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_PARENT_OF);
    }
    return biologicalParentOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getBiologicalFatherIs()
  {
    if (biologicalFatherIs != null && biologicalFatherIs.eIsProxy())
    {
      InternalEObject oldBiologicalFatherIs = (InternalEObject)biologicalFatherIs;
      biologicalFatherIs = (Person)eResolveProxy(oldBiologicalFatherIs);
      if (biologicalFatherIs != oldBiologicalFatherIs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_FATHER_IS, oldBiologicalFatherIs, biologicalFatherIs));
      }
    }
    return biologicalFatherIs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetBiologicalFatherIs()
  {
    return biologicalFatherIs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBiologicalFatherIs(Person newBiologicalFatherIs)
  {
    Person oldBiologicalFatherIs = biologicalFatherIs;
    biologicalFatherIs = newBiologicalFatherIs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_FATHER_IS, oldBiologicalFatherIs, biologicalFatherIs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person getBiologicalMotherIs()
  {
    if (biologicalMotherIs != null && biologicalMotherIs.eIsProxy())
    {
      InternalEObject oldBiologicalMotherIs = (InternalEObject)biologicalMotherIs;
      biologicalMotherIs = (Person)eResolveProxy(oldBiologicalMotherIs);
      if (biologicalMotherIs != oldBiologicalMotherIs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_MOTHER_IS, oldBiologicalMotherIs, biologicalMotherIs));
      }
    }
    return biologicalMotherIs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Person basicGetBiologicalMotherIs()
  {
    return biologicalMotherIs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBiologicalMotherIs(Person newBiologicalMotherIs)
  {
    Person oldBiologicalMotherIs = biologicalMotherIs;
    biologicalMotherIs = newBiologicalMotherIs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_MOTHER_IS, oldBiologicalMotherIs, biologicalMotherIs));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Married> getMarriedWith()
  {
    if (marriedWith == null)
    {
      marriedWith = new EObjectContainmentEList<Married>(Married.class, this, GedcomlPackage.BEKANNTE_PERSON__MARRIED_WITH);
    }
    return marriedWith;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Note> getNotes()
  {
    if (notes == null)
    {
      notes = new EObjectContainmentEList<Note>(Note.class, this, GedcomlPackage.BEKANNTE_PERSON__NOTES);
    }
    return notes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBirthName()
  {
    return birthName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBirthName(String newBirthName)
  {
    String oldBirthName = birthName;
    birthName = newBirthName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GedcomlPackage.BEKANNTE_PERSON__BIRTH_NAME, oldBirthName, birthName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Source> getSources()
  {
    if (sources == null)
    {
      sources = new EObjectContainmentEList<Source>(Source.class, this, GedcomlPackage.BEKANNTE_PERSON__SOURCES);
    }
    return sources;
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
      case GedcomlPackage.BEKANNTE_PERSON__MARRIED_WITH:
        return ((InternalEList<?>)getMarriedWith()).basicRemove(otherEnd, msgs);
      case GedcomlPackage.BEKANNTE_PERSON__NOTES:
        return ((InternalEList<?>)getNotes()).basicRemove(otherEnd, msgs);
      case GedcomlPackage.BEKANNTE_PERSON__SOURCES:
        return ((InternalEList<?>)getSources()).basicRemove(otherEnd, msgs);
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
      case GedcomlPackage.BEKANNTE_PERSON__FIRST_NAME:
        return getFirstName();
      case GedcomlPackage.BEKANNTE_PERSON__LAST_NAME:
        return getLastName();
      case GedcomlPackage.BEKANNTE_PERSON__MIDDLE_NAME:
        return getMiddleName();
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_DAY:
        return getBirthDay();
      case GedcomlPackage.BEKANNTE_PERSON__DEATH_DAY:
        return getDeathDay();
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_PARENT_OF:
        return getBiologicalParentOf();
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_FATHER_IS:
        if (resolve) return getBiologicalFatherIs();
        return basicGetBiologicalFatherIs();
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_MOTHER_IS:
        if (resolve) return getBiologicalMotherIs();
        return basicGetBiologicalMotherIs();
      case GedcomlPackage.BEKANNTE_PERSON__MARRIED_WITH:
        return getMarriedWith();
      case GedcomlPackage.BEKANNTE_PERSON__NOTES:
        return getNotes();
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_NAME:
        return getBirthName();
      case GedcomlPackage.BEKANNTE_PERSON__SOURCES:
        return getSources();
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
      case GedcomlPackage.BEKANNTE_PERSON__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__LAST_NAME:
        setLastName((String)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__MIDDLE_NAME:
        setMiddleName((String)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_DAY:
        setBirthDay((String)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__DEATH_DAY:
        setDeathDay((String)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_PARENT_OF:
        getBiologicalParentOf().clear();
        getBiologicalParentOf().addAll((Collection<? extends Person>)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_FATHER_IS:
        setBiologicalFatherIs((Person)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_MOTHER_IS:
        setBiologicalMotherIs((Person)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__MARRIED_WITH:
        getMarriedWith().clear();
        getMarriedWith().addAll((Collection<? extends Married>)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__NOTES:
        getNotes().clear();
        getNotes().addAll((Collection<? extends Note>)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_NAME:
        setBirthName((String)newValue);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__SOURCES:
        getSources().clear();
        getSources().addAll((Collection<? extends Source>)newValue);
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
      case GedcomlPackage.BEKANNTE_PERSON__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__MIDDLE_NAME:
        setMiddleName(MIDDLE_NAME_EDEFAULT);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_DAY:
        setBirthDay(BIRTH_DAY_EDEFAULT);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__DEATH_DAY:
        setDeathDay(DEATH_DAY_EDEFAULT);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_PARENT_OF:
        getBiologicalParentOf().clear();
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_FATHER_IS:
        setBiologicalFatherIs((Person)null);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_MOTHER_IS:
        setBiologicalMotherIs((Person)null);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__MARRIED_WITH:
        getMarriedWith().clear();
        return;
      case GedcomlPackage.BEKANNTE_PERSON__NOTES:
        getNotes().clear();
        return;
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_NAME:
        setBirthName(BIRTH_NAME_EDEFAULT);
        return;
      case GedcomlPackage.BEKANNTE_PERSON__SOURCES:
        getSources().clear();
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
      case GedcomlPackage.BEKANNTE_PERSON__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case GedcomlPackage.BEKANNTE_PERSON__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
      case GedcomlPackage.BEKANNTE_PERSON__MIDDLE_NAME:
        return MIDDLE_NAME_EDEFAULT == null ? middleName != null : !MIDDLE_NAME_EDEFAULT.equals(middleName);
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_DAY:
        return BIRTH_DAY_EDEFAULT == null ? birthDay != null : !BIRTH_DAY_EDEFAULT.equals(birthDay);
      case GedcomlPackage.BEKANNTE_PERSON__DEATH_DAY:
        return DEATH_DAY_EDEFAULT == null ? deathDay != null : !DEATH_DAY_EDEFAULT.equals(deathDay);
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_PARENT_OF:
        return biologicalParentOf != null && !biologicalParentOf.isEmpty();
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_FATHER_IS:
        return biologicalFatherIs != null;
      case GedcomlPackage.BEKANNTE_PERSON__BIOLOGICAL_MOTHER_IS:
        return biologicalMotherIs != null;
      case GedcomlPackage.BEKANNTE_PERSON__MARRIED_WITH:
        return marriedWith != null && !marriedWith.isEmpty();
      case GedcomlPackage.BEKANNTE_PERSON__NOTES:
        return notes != null && !notes.isEmpty();
      case GedcomlPackage.BEKANNTE_PERSON__BIRTH_NAME:
        return BIRTH_NAME_EDEFAULT == null ? birthName != null : !BIRTH_NAME_EDEFAULT.equals(birthName);
      case GedcomlPackage.BEKANNTE_PERSON__SOURCES:
        return sources != null && !sources.isEmpty();
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
    result.append(" (firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(", middleName: ");
    result.append(middleName);
    result.append(", birthDay: ");
    result.append(birthDay);
    result.append(", deathDay: ");
    result.append(deathDay);
    result.append(", birthName: ");
    result.append(birthName);
    result.append(')');
    return result.toString();
  }

} //BekanntePersonImpl
