package de.dietzm.colorfulbridge.masterdata.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;

import de.dietzm.colorfulbridge.masterdata.datamodel.Warehouse;
import de.dietzm.colorfulbridge.masterdata.objectify.OfyManager;

@Api(name = "warehouses", version = "v1")
public class WarehouseService {

	@ApiMethod(name = "warehouses.query")
	public List<Warehouse> getStorageLocations() {
		return OfyManager.ofy().load().type(Warehouse.class).list();
	}

	@ApiMethod(name="warehouses.create", httpMethod = "post")
	public Warehouse createWarehouse(Warehouse newWarehouse) {
		//Warehouse instance = gson.fromJson(data, Warehouse.class);
		OfyManager.ofy().save().entity(newWarehouse).now();
		return newWarehouse;
	}

}
