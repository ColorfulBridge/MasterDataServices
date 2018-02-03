package de.dietzm.colorfulbridge.masterdata.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import de.dietzm.colorfulbridge.masterdata.datamodel.Rack;

@Api(name="racks", version = "v1")
public class RackService {

	  @ApiMethod(name = "racks.query")
	  public List<Rack> getRacks() {
	    return ofy().load().type(Rack.class).filter("id !=", null).list();
	  }

	
}
