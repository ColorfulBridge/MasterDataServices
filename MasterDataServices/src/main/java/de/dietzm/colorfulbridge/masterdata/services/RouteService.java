package de.dietzm.colorfulbridge.masterdata.services;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import de.dietzm.colorfulbridge.masterdata.datamodel.Route;
import de.dietzm.colorfulbridge.masterdata.objectify.OfyManager;

@Api(name="routes", version = "v1")
public class RouteService {

	  @ApiMethod(name = "routes.query")
	  public List<Route> getRoutes(@Named("warehouseId") String warehouseId) {
	    return OfyManager.ofy().load().type(Route.class).filter("warehouseId ==", warehouseId).list();
	  }

	
}
