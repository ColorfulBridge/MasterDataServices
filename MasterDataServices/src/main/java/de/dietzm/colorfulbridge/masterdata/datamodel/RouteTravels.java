package de.dietzm.colorfulbridge.masterdata.datamodel;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class RouteTravels{

	@Id
	String routeId;
	 
	@Index
	StorageBin fromLocation;
	@Index
	StorageBin toLocation;
	
	String routeAsGeoJson;
	
	double lengthInMeter;
	double timeInMinutes;
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public StorageBin getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(StorageBin fromLocation) {
		this.fromLocation = fromLocation;
	}
	public StorageBin getToLocation() {
		return toLocation;
	}
	public void setToLocation(StorageBin toLocation) {
		this.toLocation = toLocation;
	}
	public String getRouteAsGeoJson() {
		return routeAsGeoJson;
	}
	public void setRouteAsGeoJson(String routeAsGeoJson) {
		this.routeAsGeoJson = routeAsGeoJson;
	}
	public double getLengthInMeter() {
		return lengthInMeter;
	}
	public void setLengthInMeter(double lengthInMeter) {
		this.lengthInMeter = lengthInMeter;
	}
	public double getTimeInMinutes() {
		return timeInMinutes;
	}
	public void setTimeInMinutes(double timeInMinutes) {
		this.timeInMinutes = timeInMinutes;
	}
	
	
	
}
