package de.dietzm.colorfulbridge.foundation.services;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.Named;

import de.dietzm.colorfulbridge.foundation.datamodel.Warehouse;

@Api(name = "warehouses", version = "v1")
public class WarehouseService {

	@ApiMethod(name = "warehouses.query")
	public List<Warehouse> getStorageLocations() {
		return ofy().load().type(Warehouse.class).filter("id !=", null).list();
	}

	@ApiMethod(name="warehouses.create", httpMethod = "post")
	public Warehouse createWarehouse(@Named("warehouse.data")Warehouse newWarehouse) {
		//Warehouse instance = gson.fromJson(data, Warehouse.class);
		ofy().save().entity(newWarehouse).now();
		return newWarehouse;
	}

}
