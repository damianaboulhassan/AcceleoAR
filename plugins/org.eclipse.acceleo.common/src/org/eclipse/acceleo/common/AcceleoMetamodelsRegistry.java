package org.eclipse.acceleo.common;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.acceleo.common.metamodel.IMetamodelHandler;

public class AcceleoMetamodelsRegistry {
	/** Singleton instance of the registry. */
	public static final AcceleoMetamodelsRegistry INSTANCE = new AcceleoMetamodelsRegistry();

	/** This will contain the metamodel handlers registered for Acceleo evaluations. */
	private final Set<IMetamodelHandler> registeredHandlers = new HashSet<IMetamodelHandler>();

	private AcceleoMetamodelsRegistry() {
		// Hides default constructor
	}

	/**
	 * Adds a metamodel handler to the registry.
	 * 
	 * @param metamodel
	 *            handler Metamodel handler that is to be registered for Acceleo evaluations.
	 * @return <code>true</code> if the set didn't already contain <code>metamodel handler</code>.
	 */
	public boolean addMetamodelHandler(IMetamodelHandler handler) {
		return registeredHandlers.add(handler);
	}

	/**
	 * Returns all registered metamodel handlers.
	 * 
	 * @return All registered metamodel handler.
	 */
	public Set<IMetamodelHandler> getAllRegisteredMetamodelHandlers() {
		final Set<IMetamodelHandler> compound = new HashSet<IMetamodelHandler>();
		compound.addAll(registeredHandlers);
		return compound;
	}

	/**
	 * Removes a metamodel handler from the registry.
	 * 
	 * @param service
	 *            Metamodel handler that is to be removed from Acceleo evaluations contexts.
	 * @return <code>true</code> if the set contained <code>service</code>.
	 */
	public boolean removeMetamodelHandler(IMetamodelHandler service) {
		return registeredHandlers.remove(service);
	}

	/**
	 * Clears all registered handlers out of the registry.
	 */
	public void clearRegistry() {
		registeredHandlers.clear();
	}
}
