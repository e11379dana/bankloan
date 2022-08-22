package com.example.bankloan.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.bankloan.model.Loan;

@Repository
public interface LoanRepository extends CrudRepository<Loan, Long> {

}
