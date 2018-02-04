package de.dietzm.colorfulbridge.masterdata.datamodel;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class StorageBin{
 
	@Id
	String locationId;
	
	@Index
	String name; 
	
	@Index
	String warehouseId;
	
	int aigle;
	int rack;
	int level;
	
	float latitude;
	float longitude;
	

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(String warehouseId) {
		this.warehouseId = warehouseId;
	}

	public int getAigle() {
		return aigle;
	}

	public void setAigle(int aigle) {
		this.aigle = aigle;
	}

	public int getRack() {
		return rack;
	}

	public void setRack(int rack) {
		this.rack = rack;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
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

	
	
}
