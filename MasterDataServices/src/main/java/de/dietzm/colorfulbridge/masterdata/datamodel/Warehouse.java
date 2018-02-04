package de.dietzm.colorfulbridge.masterdata.datamodel;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class Warehouse{

	@Id 
	String warehouseId;
	
	@Index
	String name; 
	 
	 
	float latitude;
	float longitude;
	
	String outlineAsGeoJSON;

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getOutlineAsGeoJSON() {
		return outlineAsGeoJSON;
	}

	public void setOutlineAsGeoJSON(String outlineAsGeoJSON) {
		this.outlineAsGeoJSON = outlineAsGeoJSON;
	}


	
	
}
