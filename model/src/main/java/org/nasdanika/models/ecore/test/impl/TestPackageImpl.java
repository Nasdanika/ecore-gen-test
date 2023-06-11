/**
 */
package org.nasdanika.models.ecore.test.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.nasdanika.models.ecore.test.Animal;
import org.nasdanika.models.ecore.test.Biome;
import org.nasdanika.models.ecore.test.Color;
import org.nasdanika.models.ecore.test.Food;
import org.nasdanika.models.ecore.test.Forest;
import org.nasdanika.models.ecore.test.Fox;
import org.nasdanika.models.ecore.test.Grass;
import org.nasdanika.models.ecore.test.Hare;
import org.nasdanika.models.ecore.test.LivingBeing;
import org.nasdanika.models.ecore.test.Plant;
import org.nasdanika.models.ecore.test.TestFactory;
import org.nasdanika.models.ecore.test.TestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestPackageImpl extends EPackageImpl implements TestPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass livingBeingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass biomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass animalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.ecore.test.TestPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TestPackageImpl() {
		super(eNS_URI, TestFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TestPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TestPackage init() {
		if (isInited) return (TestPackage)EPackage.Registry.INSTANCE.getEPackage(TestPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTestPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TestPackageImpl theTestPackage = registeredTestPackage instanceof TestPackageImpl ? (TestPackageImpl)registeredTestPackage : new TestPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTestPackage.createPackageContents();

		// Initialize created meta-data
		theTestPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTestPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TestPackage.eNS_URI, theTestPackage);
		return theTestPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLivingBeing() {
		return livingBeingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLivingBeing_Color() {
		return (EAttribute)livingBeingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLivingBeing__Communicate() {
		return livingBeingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiome() {
		return biomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBiome_LivingBeings() {
		return (EReference)biomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForest() {
		return forestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFood() {
		return foodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnimal() {
		return animalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimal_GenericAttribute() {
		return (EAttribute)animalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnimal_Name() {
		return (EAttribute)animalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnimal__Eats__Food() {
		return animalEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlant() {
		return plantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrass() {
		return grassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHare() {
		return hareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFox() {
		return foxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFox__Communicate() {
		return foxEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getColor() {
		return colorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestFactory getTestFactory() {
		return (TestFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		livingBeingEClass = createEClass(LIVING_BEING);
		createEAttribute(livingBeingEClass, LIVING_BEING__COLOR);
		createEOperation(livingBeingEClass, LIVING_BEING___COMMUNICATE);

		biomeEClass = createEClass(BIOME);
		createEReference(biomeEClass, BIOME__LIVING_BEINGS);

		forestEClass = createEClass(FOREST);

		foodEClass = createEClass(FOOD);

		animalEClass = createEClass(ANIMAL);
		createEAttribute(animalEClass, ANIMAL__GENERIC_ATTRIBUTE);
		createEAttribute(animalEClass, ANIMAL__NAME);
		createEOperation(animalEClass, ANIMAL___EATS__FOOD);

		plantEClass = createEClass(PLANT);

		grassEClass = createEClass(GRASS);

		hareEClass = createEClass(HARE);

		foxEClass = createEClass(FOX);
		createEOperation(foxEClass, FOX___COMMUNICATE);

		// Create enums
		colorEEnum = createEEnum(COLOR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter animalEClass_F = addETypeParameter(animalEClass, "F");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getFood());
		animalEClass_F.getEBounds().add(g1);

		// Add supertypes to classes
		forestEClass.getESuperTypes().add(this.getBiome());
		animalEClass.getESuperTypes().add(this.getLivingBeing());
		plantEClass.getESuperTypes().add(this.getLivingBeing());
		grassEClass.getESuperTypes().add(this.getPlant());
		grassEClass.getESuperTypes().add(this.getFood());
		g1 = createEGenericType(this.getAnimal());
		EGenericType g2 = createEGenericType(this.getGrass());
		g1.getETypeArguments().add(g2);
		hareEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFood());
		hareEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getAnimal());
		g2 = createEGenericType(this.getHare());
		g1.getETypeArguments().add(g2);
		foxEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(livingBeingEClass, LivingBeing.class, "LivingBeing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLivingBeing_Color(), this.getColor(), "color", null, 0, 1, LivingBeing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLivingBeing__Communicate(), null, "communicate", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(biomeEClass, Biome.class, "Biome", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBiome_LivingBeings(), this.getLivingBeing(), null, "livingBeings", null, 0, -1, Biome.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forestEClass, Forest.class, "Forest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(foodEClass, Food.class, "Food", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(animalEClass, Animal.class, "Animal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(animalEClass_F);
		initEAttribute(getAnimal_GenericAttribute(), g1, "genericAttribute", null, 0, 1, Animal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnimal_Name(), ecorePackage.getEString(), "name", null, 0, 1, Animal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getAnimal__Eats__Food(), null, "eats", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(animalEClass_F);
		addEParameter(op, g1, "food", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(plantEClass, Plant.class, "Plant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(grassEClass, Grass.class, "Grass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hareEClass, Hare.class, "Hare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(foxEClass, Fox.class, "Fox", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getFox__Communicate(), null, "communicate", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorEEnum, Color.class, "Color");
		addEEnumLiteral(colorEEnum, Color.WHITE);
		addEEnumLiteral(colorEEnum, Color.BROWN);

		// Create resource
		createResource(eNS_URI);
	}

} //TestPackageImpl
