/**
 */
package org.nasdanika.models.professionalknowledgegraph.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.professionalknowledgegraph.Education;
import org.nasdanika.models.professionalknowledgegraph.Location;
import org.nasdanika.models.professionalknowledgegraph.ProfessionalKnowledgeGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Education</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl#getDegree <em>Degree</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl#getFieldOfStudy <em>Field Of Study</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.nasdanika.models.professionalknowledgegraph.impl.EducationImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EducationImpl extends CredentialImpl implements Education {
	/**
	 * The default value of the '{@link #getInstitution() <em>Institution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTITUTION_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDegree() <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDegree()
	 * @generated
	 * @ordered
	 */
	protected static final String DEGREE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFieldOfStudy() <em>Field Of Study</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFieldOfStudy()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_OF_STUDY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EducationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProfessionalKnowledgeGraphPackage.Literals.EDUCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstitution() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.EDUCATION__INSTITUTION, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__INSTITUTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstitution(String newInstitution) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EDUCATION__INSTITUTION, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__INSTITUTION, newInstitution);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDegree() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.EDUCATION__DEGREE, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__DEGREE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDegree(String newDegree) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EDUCATION__DEGREE, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__DEGREE, newDegree);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFieldOfStudy() {
		return (String)eDynamicGet(ProfessionalKnowledgeGraphPackage.EDUCATION__FIELD_OF_STUDY, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__FIELD_OF_STUDY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFieldOfStudy(String newFieldOfStudy) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EDUCATION__FIELD_OF_STUDY, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__FIELD_OF_STUDY, newFieldOfStudy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStartDate() {
		return (Date)eDynamicGet(ProfessionalKnowledgeGraphPackage.EDUCATION__START_DATE, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__START_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartDate(Date newStartDate) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EDUCATION__START_DATE, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__START_DATE, newStartDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getLocation() {
		return (Location)eDynamicGet(ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return (Location)eDynamicGet(ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__LOCATION, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(Location newLocation) {
		eDynamicSet(ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION, ProfessionalKnowledgeGraphPackage.Literals.EDUCATION__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.EDUCATION__INSTITUTION:
				return getInstitution();
			case ProfessionalKnowledgeGraphPackage.EDUCATION__DEGREE:
				return getDegree();
			case ProfessionalKnowledgeGraphPackage.EDUCATION__FIELD_OF_STUDY:
				return getFieldOfStudy();
			case ProfessionalKnowledgeGraphPackage.EDUCATION__START_DATE:
				return getStartDate();
			case ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.EDUCATION__INSTITUTION:
				setInstitution((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__DEGREE:
				setDegree((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__FIELD_OF_STUDY:
				setFieldOfStudy((String)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION:
				setLocation((Location)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.EDUCATION__INSTITUTION:
				setInstitution(INSTITUTION_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__DEGREE:
				setDegree(DEGREE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__FIELD_OF_STUDY:
				setFieldOfStudy(FIELD_OF_STUDY_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION:
				setLocation((Location)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProfessionalKnowledgeGraphPackage.EDUCATION__INSTITUTION:
				return INSTITUTION_EDEFAULT == null ? getInstitution() != null : !INSTITUTION_EDEFAULT.equals(getInstitution());
			case ProfessionalKnowledgeGraphPackage.EDUCATION__DEGREE:
				return DEGREE_EDEFAULT == null ? getDegree() != null : !DEGREE_EDEFAULT.equals(getDegree());
			case ProfessionalKnowledgeGraphPackage.EDUCATION__FIELD_OF_STUDY:
				return FIELD_OF_STUDY_EDEFAULT == null ? getFieldOfStudy() != null : !FIELD_OF_STUDY_EDEFAULT.equals(getFieldOfStudy());
			case ProfessionalKnowledgeGraphPackage.EDUCATION__START_DATE:
				return START_DATE_EDEFAULT == null ? getStartDate() != null : !START_DATE_EDEFAULT.equals(getStartDate());
			case ProfessionalKnowledgeGraphPackage.EDUCATION__LOCATION:
				return basicGetLocation() != null;
		}
		return super.eIsSet(featureID);
	}

} //EducationImpl
