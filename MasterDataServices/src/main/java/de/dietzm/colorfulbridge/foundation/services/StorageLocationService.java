package de.dietzm.colorfulbridge.foundation.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import de.dietzm.colorfulbridge.foundation.datamodel.StorageBin;

@Api(name="storagebins", version = "v1")
public class StorageLocationService {

	  @ApiMethod(name = "storagebins.query")
	  public List<StorageBin> getStorageBinsOfWarehouse(String warehouseId) {
	    return ofy().load().type(StorageBin.class).filter("warehouseId ==", warehouseId).list();
	  }

	  @ApiMethod(name = "storagebins.query")
	  public StorageBin createStorageBin(StorageBin storageBin) {
		  ofy().save().entity(storageBin).now();
			return storageBin;
	  }
	
}
