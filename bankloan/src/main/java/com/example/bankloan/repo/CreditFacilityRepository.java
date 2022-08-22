package com.example.bankloan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bankloan.model.CreditFacility;

@Repository
public interface CreditFacilityRepository extends CrudRepository<CreditFacility, Long> {

}
