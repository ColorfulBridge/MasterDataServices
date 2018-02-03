package de.dietzm.colorfulbridge.masterdata.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import de.dietzm.colorfulbridge.masterdata.datamodel.Route;

@Api(name="routes", version = "v1")
public class RouteService {

	  @ApiMethod(name = "routes.query")
	  public List<Route> getRoutes() {
	    return ofy().load().type(Route.class).filter("id !=", null).list();
	  }

	
}
