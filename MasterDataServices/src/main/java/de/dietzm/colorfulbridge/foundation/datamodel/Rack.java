package de.dietzm.colorfulbridge.foundation.datamodel;

import java.util.List;

import com.google.appengine.api.datastore.GeoPt;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Rack{

	@Id
	String rackId;
	
	List<GeoPt>  outlinePolygon;
	String polygonAsGeoJson;
	public String getRackId() {
		return rackId;
	}
	public void setRackId(String rackId) {
		this.rackId = rackId;
	}
	public List<GeoPt> getOutlinePolygon() {
		return outlinePolygon;
	}
	public void setOutlinePolygon(List<GeoPt> outlinePolygon) {
		this.outlinePolygon = outlinePolygon;
	}
	public String getPolygonAsGeoJson() {
		return polygonAsGeoJson;
	}
	public void setPolygonAsGeoJson(String polygonAsGeoJson) {
		this.polygonAsGeoJson = polygonAsGeoJson;
	}
	
	
	
	
}
