package org.nasdanika.html.ecore.gen.test.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;
import org.nasdanika.common.Context;
import org.nasdanika.emf.persistence.ObjectLoaderExecutionParticipant;
import org.nasdanika.html.ecore.gen.test.TestPackage;

/**
 * Registers {@link AppPackage}
 * @author Pavel
 *
 */
public abstract class TestObjectLoaderExecutionParticipant extends ObjectLoaderExecutionParticipant {

	public TestObjectLoaderExecutionParticipant(Context context) {
		super(context);
	}

	@Override
	protected Collection<EPackage> getEPackages() {
		Collection<EPackage> ret = new ArrayList<>(); 
		ret.add(TestPackage.eINSTANCE);
		return ret;
	}
	
}
