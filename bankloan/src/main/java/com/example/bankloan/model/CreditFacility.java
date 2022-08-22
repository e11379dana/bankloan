package com.example.bankloan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditFacility {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long applicantId;
	long facilityId;
	
	public CreditFacility() {
		
	}
	
	public CreditFacility(long applicantId, long facilityId) {
		super();
		this.applicantId = applicantId;
		this.facilityId = facilityId;
	}

	public long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(long applicantId) {
		this.applicantId = applicantId;
	}

	public long getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(long facilityId) {
		this.facilityId = facilityId;
	}
	
	
}
