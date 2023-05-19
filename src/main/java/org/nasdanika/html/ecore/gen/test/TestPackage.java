/**
 */
package org.nasdanika.html.ecore.gen.test;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.html.ecore.gen.test.TestFactory
 * @model kind="package"
 * @generated
 */
public interface TestPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "test";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://test.ecore-gen.html.nasdanika.org";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore-gen-test";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestPackage eINSTANCE = org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.LivingBeingImpl <em>Living Being</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.LivingBeingImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getLivingBeing()
	 * @generated
	 */
	int LIVING_BEING = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING__COLOR = 0;

	/**
	 * The number of structural features of the '<em>Living Being</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Living Being</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIVING_BEING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.BiomeImpl <em>Biome</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.BiomeImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getBiome()
	 * @generated
	 */
	int BIOME = 1;

	/**
	 * The feature id for the '<em><b>Living Beings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOME__LIVING_BEINGS = 0;

	/**
	 * The number of structural features of the '<em>Biome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Biome</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.ForestImpl <em>Forest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.ForestImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getForest()
	 * @generated
	 */
	int FOREST = 2;

	/**
	 * The feature id for the '<em><b>Living Beings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREST__LIVING_BEINGS = BIOME__LIVING_BEINGS;

	/**
	 * The number of structural features of the '<em>Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREST_FEATURE_COUNT = BIOME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREST_OPERATION_COUNT = BIOME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.Food <em>Food</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.Food
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getFood()
	 * @generated
	 */
	int FOOD = 3;

	/**
	 * The number of structural features of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Food</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.AnimalImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__COLOR = LIVING_BEING__COLOR;

	/**
	 * The feature id for the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__GENERIC_ATTRIBUTE = LIVING_BEING_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NAME = LIVING_BEING_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = LIVING_BEING_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Eats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL___EATS__FOOD = LIVING_BEING_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = LIVING_BEING_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.PlantImpl <em>Plant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.PlantImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getPlant()
	 * @generated
	 */
	int PLANT = 5;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT__COLOR = LIVING_BEING__COLOR;

	/**
	 * The number of structural features of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_FEATURE_COUNT = LIVING_BEING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLANT_OPERATION_COUNT = LIVING_BEING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.GrassImpl <em>Grass</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.GrassImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getGrass()
	 * @generated
	 */
	int GRASS = 6;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS__COLOR = PLANT__COLOR;

	/**
	 * The number of structural features of the '<em>Grass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS_FEATURE_COUNT = PLANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grass</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRASS_OPERATION_COUNT = PLANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.HareImpl <em>Hare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.HareImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getHare()
	 * @generated
	 */
	int HARE = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__COLOR = ANIMAL__COLOR;

	/**
	 * The feature id for the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__GENERIC_ATTRIBUTE = ANIMAL__GENERIC_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Hare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Eats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE___EATS__FOOD = ANIMAL___EATS__FOOD;

	/**
	 * The number of operations of the '<em>Hare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HARE_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.impl.FoxImpl <em>Fox</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.impl.FoxImpl
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getFox()
	 * @generated
	 */
	int FOX = 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__COLOR = ANIMAL__COLOR;

	/**
	 * The feature id for the '<em><b>Generic Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__GENERIC_ATTRIBUTE = ANIMAL__GENERIC_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX__NAME = ANIMAL__NAME;

	/**
	 * The number of structural features of the '<em>Fox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX_FEATURE_COUNT = ANIMAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Eats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX___EATS__FOOD = ANIMAL___EATS__FOOD;

	/**
	 * The number of operations of the '<em>Fox</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOX_OPERATION_COUNT = ANIMAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.html.ecore.gen.test.Color <em>Color</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.html.ecore.gen.test.Color
	 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getColor()
	 * @generated
	 */
	int COLOR = 9;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.LivingBeing <em>Living Being</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Living Being</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.LivingBeing
	 * @generated
	 */
	EClass getLivingBeing();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.html.ecore.gen.test.LivingBeing#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.LivingBeing#getColor()
	 * @see #getLivingBeing()
	 * @generated
	 */
	EAttribute getLivingBeing_Color();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Biome <em>Biome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biome</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Biome
	 * @generated
	 */
	EClass getBiome();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.html.ecore.gen.test.Biome#getLivingBeings <em>Living Beings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Living Beings</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Biome#getLivingBeings()
	 * @see #getBiome()
	 * @generated
	 */
	EReference getBiome_LivingBeings();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Forest <em>Forest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forest</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Forest
	 * @generated
	 */
	EClass getForest();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Food <em>Food</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Food</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Food
	 * @generated
	 */
	EClass getFood();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.html.ecore.gen.test.Animal#getGenericAttribute <em>Generic Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generic Attribute</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Animal#getGenericAttribute()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_GenericAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.html.ecore.gen.test.Animal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Animal#getName()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Name();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.html.ecore.gen.test.Animal#eats(org.nasdanika.html.ecore.gen.test.Food) <em>Eats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Eats</em>' operation.
	 * @see org.nasdanika.html.ecore.gen.test.Animal#eats(org.nasdanika.html.ecore.gen.test.Food)
	 * @generated
	 */
	EOperation getAnimal__Eats__Food();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Plant <em>Plant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plant</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Plant
	 * @generated
	 */
	EClass getPlant();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Grass <em>Grass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grass</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Grass
	 * @generated
	 */
	EClass getGrass();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Hare <em>Hare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hare</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Hare
	 * @generated
	 */
	EClass getHare();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.html.ecore.gen.test.Fox <em>Fox</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fox</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Fox
	 * @generated
	 */
	EClass getFox();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.html.ecore.gen.test.Color <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Color</em>'.
	 * @see org.nasdanika.html.ecore.gen.test.Color
	 * @generated
	 */
	EEnum getColor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestFactory getTestFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.LivingBeingImpl <em>Living Being</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.LivingBeingImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getLivingBeing()
		 * @generated
		 */
		EClass LIVING_BEING = eINSTANCE.getLivingBeing();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIVING_BEING__COLOR = eINSTANCE.getLivingBeing_Color();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.BiomeImpl <em>Biome</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.BiomeImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getBiome()
		 * @generated
		 */
		EClass BIOME = eINSTANCE.getBiome();

		/**
		 * The meta object literal for the '<em><b>Living Beings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BIOME__LIVING_BEINGS = eINSTANCE.getBiome_LivingBeings();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.ForestImpl <em>Forest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.ForestImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getForest()
		 * @generated
		 */
		EClass FOREST = eINSTANCE.getForest();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.Food <em>Food</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.Food
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getFood()
		 * @generated
		 */
		EClass FOOD = eINSTANCE.getFood();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.AnimalImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Generic Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__GENERIC_ATTRIBUTE = eINSTANCE.getAnimal_GenericAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__NAME = eINSTANCE.getAnimal_Name();

		/**
		 * The meta object literal for the '<em><b>Eats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANIMAL___EATS__FOOD = eINSTANCE.getAnimal__Eats__Food();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.PlantImpl <em>Plant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.PlantImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getPlant()
		 * @generated
		 */
		EClass PLANT = eINSTANCE.getPlant();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.GrassImpl <em>Grass</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.GrassImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getGrass()
		 * @generated
		 */
		EClass GRASS = eINSTANCE.getGrass();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.HareImpl <em>Hare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.HareImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getHare()
		 * @generated
		 */
		EClass HARE = eINSTANCE.getHare();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.impl.FoxImpl <em>Fox</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.impl.FoxImpl
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getFox()
		 * @generated
		 */
		EClass FOX = eINSTANCE.getFox();

		/**
		 * The meta object literal for the '{@link org.nasdanika.html.ecore.gen.test.Color <em>Color</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.html.ecore.gen.test.Color
		 * @see org.nasdanika.html.ecore.gen.test.impl.TestPackageImpl#getColor()
		 * @generated
		 */
		EEnum COLOR = eINSTANCE.getColor();

	}

} //TestPackage
