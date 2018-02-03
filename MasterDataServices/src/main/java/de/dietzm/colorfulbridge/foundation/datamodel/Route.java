package de.dietzm.colorfulbridge.foundation.datamodel;

import java.util.List;

import com.google.appengine.api.datastore.GeoPt;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Route{

	@Id
	String routeId;
	
	StorageBin fromLocation;
	StorageBin toLocation;
	
	List<GeoPt>  directRoutePoints;
	String routeAsGeoJson;
	
	double lengthInMeter;

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
