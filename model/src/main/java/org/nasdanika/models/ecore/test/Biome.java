/**
 */
package org.nasdanika.models.ecore.test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biome</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ecore.test.Biome#getLivingBeings <em>Living Beings</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ecore.test.TestPackage#getBiome()
 * @model abstract="true"
 * @generated
 */
public interface Biome extends EObject {
	/**
	 * Returns the value of the '<em><b>Living Beings</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.ecore.test.LivingBeing}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Living Beings</em>' containment reference list.
	 * @see org.nasdanika.models.ecore.test.TestPackage#getBiome_LivingBeings()
	 * @model containment="true"
	 * @generated
	 */
	EList<LivingBeing> getLivingBeings();

} // Biome
