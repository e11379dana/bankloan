package com.example.bankloan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankloan.model.Applicant;
import com.example.bankloan.model.Facility;
import com.example.bankloan.model.Loan;
import com.example.bankloan.model.Product;
import com.example.bankloan.repo.ApplicantRepository;
import com.example.bankloan.repo.FacilityRepository;
import com.example.bankloan.repo.LoanRepository;

@Service
public class BankLoanService {
	
	private static ApplicantRepository applicantRepository;
	private static FacilityRepository facilityRepository;
	private static LoanRepository loanRepository;
	
	public BankLoanService(ApplicantRepository applicantRepository, FacilityRepository facilityRepository, LoanRepository loanRepository) {
		this.applicantRepository = applicantRepository;
		this.facilityRepository = facilityRepository;
		this.loanRepository = loanRepository;
	}
	
	public List<Product> getAllLoans() {
		List<Loan> loans = (List<Loan>) loanRepository.findAll();
		List<Product> productList = new ArrayList<>();
		Facility facility;
		Applicant applicant;
		for(Loan loan : loans) {
			Product product = new Product();
			product.setId(loan.getId());
			facility = facilityRepository.findById(loan.getFacId()).get();
			applicant = applicantRepository.findById(loan.getApplicantId()).get();
			if(applicant == null || facility == null) {
				continue;
			}
			product.setFacility(facility);
			product.setApplicant(applicant);
			product.setLoanType(loan.getLoanType());
			product.setAmount(loan.getAmount());
			product.setTerm(loan.getTerm());
			product.setRate(loan.getRate());
			product.setOutstandingBal(loan.getOutstandingBal());
			productList.add(product);
		}
		return productList;
	}
	
	public void save(Product product) {
		Loan loan = new Loan();
		loan.setApplicantId(product.getApplicant().getId());
		loan.setFacId(product.getFacility().getFacId());
		loan.setAmount(product.getAmount());
		loan.setLoanType(product.getLoanType());
		loan.setRate(product.getRate());
		loan.setTerm(product.getTerm());
		loanRepository.save(loan);
	}
	
	public List<Product> searchApplicantName(String applicantName) {
		List<Loan> loans = (List<Loan>) loanRepository.findAll();
		List<Product> productList = new ArrayList<>();
		Applicant applicant;
		for(Loan loan : loans) {
			applicant = applicantRepository.findById(loan.getApplicantId()).get();
			if(applicant!= null && applicant.getName().toLowerCase().contains(applicantName.toLowerCase())) {
				Product product = new Product();
				product.setId(loan.getId());
				product.setFacility(facilityRepository.findById(loan.getFacId()).get());
				product.setApplicant(applicant);
				product.setLoanType(loan.getLoanType());
				product.setAmount(loan.getAmount());
				product.setTerm(loan.getTerm());
				product.setRate(loan.getRate());
				product.setOutstandingBal(loan.getOutstandingBal());
				productList.add(product);
			}
		}
		return productList;
	}
}
