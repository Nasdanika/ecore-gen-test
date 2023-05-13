/**
 */
package org.nasdanika.html.ecore.gen.test.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.html.ecore.gen.test.Grass;
import org.nasdanika.html.ecore.gen.test.Hare;
import org.nasdanika.html.ecore.gen.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hare</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HareImpl extends AnimalImpl<Grass> implements Hare {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestPackage.Literals.HARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setGenericAttribute(Grass newGenericAttribute) {
		super.setGenericAttribute(newGenericAttribute);
	}

} //HareImpl
