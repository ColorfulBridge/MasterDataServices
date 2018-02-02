package de.dietzm.colorfulbridge.foundation.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import de.dietzm.colorfulbridge.foundation.datamodel.StorageLocation;

@Api(name="storagelocations", version = "v1")
public class StorageLocationService {

	  @ApiMethod(name = "storagelocations.query")
	  public List<StorageLocation> getStorageLocations() {
	    return ofy().load().type(StorageLocation.class).filter("id !=", null).list();
	  }

	
}
