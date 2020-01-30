package org.eclipse.acceleo.common.metamodel;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage;

public interface IMetamodelHandler {

	/**
	 * Get the metamodels of the file.
	 * 
	 * @param projectRoot
	 *            projectRoot
	 * @return
	 */
	Collection<EPackage> getMetamodels(File projectRoot);

	/**
	 * Gets the error logs.
	 * 
	 * @return
	 */
	Collection<String> getErrorLogs();

	/**
	 * Logs an error which might have happened during the execution of the class.
	 * 
	 * @param error
	 */
	void logError(String error);
}
