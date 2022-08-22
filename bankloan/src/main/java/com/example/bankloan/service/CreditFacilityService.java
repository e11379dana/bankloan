package com.example.bankloan.service;

import org.springframework.stereotype.Service;

import com.example.bankloan.model.CreditFacility;
import com.example.bankloan.repo.CreditFacilityRepository;

@Service
public class CreditFacilityService {
	
	private static CreditFacilityRepository creditFacilityRepository;
	
	public CreditFacilityService(CreditFacilityRepository creditFacilityRepository) {
		this.creditFacilityRepository = creditFacilityRepository;
	}
	
	public void save(CreditFacility crFacility) {
		this.creditFacilityRepository.save(crFacility);
	}
}
