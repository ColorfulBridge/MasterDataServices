package de.dietzm.colorfulbridge.masterdata.objectify;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;

import de.dietzm.colorfulbridge.masterdata.datamodel.Rack;
import de.dietzm.colorfulbridge.masterdata.datamodel.Route;
import de.dietzm.colorfulbridge.masterdata.datamodel.RouteTravels;
import de.dietzm.colorfulbridge.masterdata.datamodel.StorageBin;
import de.dietzm.colorfulbridge.masterdata.datamodel.Warehouse;

public class OfyManager {

	private static OfyManager instance;

	public static Objectify ofy() {
		if (instance == null) {
			instance = new OfyManager();
			instance.initialize();
		}
		
		return ObjectifyService.ofy();
	}

	private void initialize() {
		ObjectifyService.register(Warehouse.class);
		ObjectifyService.register(Route.class);
		ObjectifyService.register(StorageBin.class);
		ObjectifyService.register(Rack.class);
		ObjectifyService.register(RouteTravels.class);
	}

	private OfyManager() {

	}

	
}
