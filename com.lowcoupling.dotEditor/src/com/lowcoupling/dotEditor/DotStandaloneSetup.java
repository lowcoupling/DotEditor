/*
* generated by Xtext
*/
package com.lowcoupling.dotEditor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DotStandaloneSetup extends DotStandaloneSetupGenerated{

	public static void doSetup() {
		new DotStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
