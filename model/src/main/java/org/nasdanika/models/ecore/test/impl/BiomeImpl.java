/**
 */
package org.nasdanika.models.ecore.test.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.ecore.test.Biome;
import org.nasdanika.models.ecore.test.LivingBeing;
import org.nasdanika.models.ecore.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Biome</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ecore.test.impl.BiomeImpl#getLivingBeings <em>Living Beings</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BiomeImpl extends MinimalEObjectImpl.Container implements Biome {
	/**
	 * The cached value of the '{@link #getLivingBeings() <em>Living Beings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivingBeings()
	 * @generated
	 * @ordered
	 */
	protected EList<LivingBeing> livingBeings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BiomeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.BIOME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LivingBeing> getLivingBeings() {
		if (livingBeings == null) {
			livingBeings = new EObjectContainmentEList<LivingBeing>(LivingBeing.class, this, TestPackage.BIOME__LIVING_BEINGS);
		}
		return livingBeings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestPackage.BIOME__LIVING_BEINGS:
				return ((InternalEList<?>)getLivingBeings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestPackage.BIOME__LIVING_BEINGS:
				return getLivingBeings();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestPackage.BIOME__LIVING_BEINGS:
				getLivingBeings().clear();
				getLivingBeings().addAll((Collection<? extends LivingBeing>)newValue);
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
			case TestPackage.BIOME__LIVING_BEINGS:
				getLivingBeings().clear();
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
			case TestPackage.BIOME__LIVING_BEINGS:
				return livingBeings != null && !livingBeings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BiomeImpl
