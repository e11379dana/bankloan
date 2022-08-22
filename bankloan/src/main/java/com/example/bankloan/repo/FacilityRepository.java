package com.example.bankloan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bankloan.model.Facility;

@Repository
public interface FacilityRepository extends CrudRepository<Facility, Long> {
	
}
