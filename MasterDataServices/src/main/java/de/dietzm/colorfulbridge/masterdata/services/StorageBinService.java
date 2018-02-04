package de.dietzm.colorfulbridge.masterdata.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import de.dietzm.colorfulbridge.masterdata.datamodel.StorageBin;
import de.dietzm.colorfulbridge.masterdata.objectify.OfyManager;

@Api(name="storagebins", version = "v1")
public class StorageBinService {

	  @ApiMethod(name = "storagebins.query")
	  public List<StorageBin> getStorageBinsOfWarehouse(@Named("warehouseId") String warehouseId) {
	    return OfyManager.ofy().load().type(StorageBin.class).filter("warehouseId ==", warehouseId).list();
	  }

	  @ApiMethod(name = "storagebins.create", httpMethod="POST")
	  public StorageBin createStorageBin(StorageBin storageBin) {
		  OfyManager.ofy().save().entity(storageBin).now();
			return storageBin;
	  }
	
}
