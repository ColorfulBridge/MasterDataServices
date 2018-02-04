package de.dietzm.colorfulbridge.masterdata.services;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import de.dietzm.colorfulbridge.masterdata.datamodel.Rack;
import de.dietzm.colorfulbridge.masterdata.objectify.OfyManager;
 
@Api(name="racks", version = "v1")
public class RackService {

	  @ApiMethod(name = "racks.query")
	  public List<Rack> getRacks(@Named("warehouseId") String warehouseId) {
	    return OfyManager.ofy().load().type(Rack.class).filter("warehouseId ==", warehouseId).list();
	  }

	
}
 