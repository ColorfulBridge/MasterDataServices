package de.dietzm.colorfulbridge.masterdata.startup;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.googlecode.objectify.ObjectifyService;

import de.dietzm.colorfulbridge.masterdata.datamodel.Rack;
import de.dietzm.colorfulbridge.masterdata.datamodel.Route;
import de.dietzm.colorfulbridge.masterdata.datamodel.RouteTravels;
import de.dietzm.colorfulbridge.masterdata.datamodel.StorageBin;
import de.dietzm.colorfulbridge.masterdata.datamodel.Warehouse;

public class OfyStartup implements ServletContextListener {
    
	static {
        ObjectifyService.register(Warehouse.class);
        ObjectifyService.register(Route.class);
        ObjectifyService.register(StorageBin.class);
        ObjectifyService.register(Rack.class);
        ObjectifyService.register(RouteTravels.class);
    }

   	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//Intialization happens in static
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		//Nothing to do
	}
}
