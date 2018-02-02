package de.dietzm.colorfulbridge.foundation.datamodel;

import java.util.List;

import com.google.appengine.api.datastore.GeoPt;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class RouteTravels{

	@Id
	String routeId;
	
	@Index
	StorageLocation fromLocation;
	@Index
	StorageLocation toLocation;
	
	List<GeoPt>  routePoints;
	String routeAsGeoJson;
	
	double lengthInMeter;
	double timeInMinutes;
	public String getRouteId() {
		return routeId;
	}
	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}
	public StorageLocation getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(StorageLocation fromLocation) {
		this.fromLocation = fromLocation;
	}
	public StorageLocation getToLocation() {
		return toLocation;
	}
	public void setToLocation(StorageLocation toLocation) {
		this.toLocation = toLocation;
	}
	public List<GeoPt> getRoutePoints() {
		return routePoints;
	}
	public void setRoutePoints(List<GeoPt> routePoints) {
		this.routePoints = routePoints;
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