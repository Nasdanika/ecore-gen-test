/**
 */
package org.nasdanika.models.ecore.test;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Living Being</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.ecore.test.LivingBeing#getColor <em>Color</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.ecore.test.TestPackage#getLivingBeing()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface LivingBeing extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.ecore.test.Color}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ecore.test.Color
	 * @see #setColor(Color)
	 * @see org.nasdanika.models.ecore.test.TestPackage#getLivingBeing_Color()
	 * @model
	 * @generated
	 */
	Color getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.ecore.test.LivingBeing#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see org.nasdanika.models.ecore.test.Color
	 * @see #getColor()
	 * @generated
	 */
	void setColor(Color value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void communicate();

} // LivingBeing
