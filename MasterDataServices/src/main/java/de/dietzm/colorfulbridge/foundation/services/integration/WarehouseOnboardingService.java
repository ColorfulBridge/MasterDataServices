package de.dietzm.colorfulbridge.foundation.services.integration;

import static com.googlecode.objectify.ObjectifyService.ofy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import de.dietzm.colorfulbridge.foundation.datamodel.Warehouse;

@Api(name="onboarding", version = "v1")
public class WarehouseOnboardingService {
		
	  Logger logger = LoggerFactory.getLogger(WarehouseOnboardingService.class);
	
	  @ApiMethod(name = "onboarding.warehouse")
	  public Warehouse createWarehouse(@Named String id,@Named String name) {
	    Warehouse newWarehouse = new Warehouse();
	    newWarehouse.setWarehouseId(id);
	    newWarehouse.setName(id);
	    
	    ofy().save().entity(newWarehouse).now();
		return newWarehouse;
	  }
	  
	  @ApiMethod(name = "onboarding.storagebins")
	  public void createStorageBins(String csv) {
		  logger.info("received csv\n" + csv);
	  }

	
}
