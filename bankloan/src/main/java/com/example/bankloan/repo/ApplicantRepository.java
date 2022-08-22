package com.example.bankloan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bankloan.model.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Long>{

}
