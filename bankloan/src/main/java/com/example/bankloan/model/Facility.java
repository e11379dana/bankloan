package com.example.bankloan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Facility {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long facId;
	String type;
	String desc;
	
	public Facility() {
		
	}
	
	public Facility(String type, String desc) {
		this.type = type;
		this.desc = desc;
	}
	
	public long getFacId() {
		return facId;
	}

	public void setFacId(long facId) {
		this.facId = facId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
