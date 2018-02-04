package de.dietzm.colorfulbridge.masterdata.datamodel;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

@Entity
public class Rack{

	@Id
	String rackId;
	 
	String outlineAsGeoJson; 
	
	public String getRackId() {
		return rackId;
	}
	public void setRackId(String rackId) {
		this.rackId = rackId;
	}
	public String getOutlineAsGeoJson() {
		return outlineAsGeoJson;
	}
	public void setOutlineAsGeoJson(String outlineAsGeoJson) {
		this.outlineAsGeoJson = outlineAsGeoJson;
	}
	
	
	
	
	
}
