/**
 */
package org.nasdanika.models.ecore.test;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.ecore.test.TestPackage
 * @generated
 */
public interface TestFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestFactory eINSTANCE = org.nasdanika.models.ecore.test.impl.TestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Forest</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Forest</em>'.
	 * @generated
	 */
	Forest createForest();

	/**
	 * Returns a new object of class '<em>Plant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Plant</em>'.
	 * @generated
	 */
	Plant createPlant();

	/**
	 * Returns a new object of class '<em>Grass</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grass</em>'.
	 * @generated
	 */
	Grass createGrass();

	/**
	 * Returns a new object of class '<em>Hare</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hare</em>'.
	 * @generated
	 */
	Hare createHare();

	/**
	 * Returns a new object of class '<em>Fox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fox</em>'.
	 * @generated
	 */
	Fox createFox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TestPackage getTestPackage();

} //TestFactory
