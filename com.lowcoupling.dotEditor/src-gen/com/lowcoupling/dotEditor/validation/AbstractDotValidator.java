/*
 * generated by Xtext
 */
package com.lowcoupling.dotEditor.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractDotValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.lowcoupling.dotEditor.dot.DotPackage.eINSTANCE);
		return result;
	}
}
