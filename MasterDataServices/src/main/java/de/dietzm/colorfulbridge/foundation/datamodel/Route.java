package de.dietzm.colorfulbridge.foundation.datamodel;

import java.util.List;

import com.google.appengine.api.datastore.GeoPt;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Route{

	@Id
	String routeId;
	
	StorageLocation fromLocation;
	StorageLocation toLocation;
	
	List<GeoPt>  directRoutePoints;
	String routeAsGeoJson;
	
	double lengthInMeter;

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

	public List<GeoPt> getDirectRoutePoints() {
		return directRoutePoints;
	}

	public void setDirectRoutePoints(List<GeoPt> directRoutePoints) {
		this.directRoutePoints = directRoutePoints;
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
	
	
	
}
