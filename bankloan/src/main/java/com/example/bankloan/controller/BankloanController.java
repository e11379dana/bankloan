package com.example.bankloan.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankloan.model.Applicant;
import com.example.bankloan.model.CreditFacility;
import com.example.bankloan.model.Facility;
import com.example.bankloan.model.Loan;
import com.example.bankloan.model.Product;
import com.example.bankloan.repo.ApplicantRepository;
import com.example.bankloan.repo.FacilityRepository;
import com.example.bankloan.repo.LoanRepository;
import com.example.bankloan.service.BankLoanService;
import com.example.bankloan.service.CreditFacilityService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BankloanController {

	private static ApplicantRepository applicantRepository;
	private static FacilityRepository facilityRepository;
	private static LoanRepository loanRepository;
	
	private static BankLoanService bankLoanService;
	private static CreditFacilityService creditFacilityService;

	public BankloanController(ApplicantRepository applicantRepository, FacilityRepository facilityRepository,
			LoanRepository loanRepository, BankLoanService bankLoanService, CreditFacilityService creditFacilityService) {
		this.applicantRepository = applicantRepository;
		this.facilityRepository = facilityRepository;
		this.loanRepository = loanRepository;
		this.bankLoanService = bankLoanService;
		this.creditFacilityService = creditFacilityService;
	}

	@GetMapping("/applicant")
	public List<Applicant> getAllApplicants() {
		List<Applicant> applicants = (List<Applicant>) applicantRepository.findAll();
		return applicants;
	}

	@PostMapping("/applicant")
	public void saveApplicant(@RequestBody Applicant applicant) {
		applicantRepository.save(applicant);
	}

	@PostMapping("/getApplicant")
	public Applicant getApplicant(@RequestBody Long id) {
		Applicant applicant = applicantRepository.findById(id).get();
		if (applicant != null)
			return applicant;
		return new Applicant();
	}

	@PostMapping("/deleteApplicant")
	public void deleteApplicant(@RequestBody Long id) {
		applicantRepository.deleteById(id);
	}

	@GetMapping("/facility")
	public List<Facility> getAllFacility() {
		List<Facility> facilities = (List<Facility>) facilityRepository.findAll();
		return facilities;
	}

	@PostMapping("/facility")
	public void saveFacility(@RequestBody Facility facility) {
		facilityRepository.save(facility);
	}

	@PostMapping("/getFacility")
	public Facility getFacility(@RequestBody Long facId) {
		Facility facility = facilityRepository.findById(facId).get();
		if (facility != null)
			return facility;
		return new Facility();
	}

	@PostMapping("/deleteFacility")
	public void deleteFacility(@RequestBody Long id) {
		facilityRepository.deleteById(id);
	}

	@GetMapping("/loan")
	public List<Product> getAllLoan() {
		return bankLoanService.getAllLoans();
	}

	@PostMapping("/loan")
	public void saveLoan(@RequestBody Product loan) {
		bankLoanService.save(loan);
	}

	@PostMapping("/getLoan")
	public Loan getLoan(@RequestBody Long id) {
		Loan loan = loanRepository.findById(id).get();
		if (loan != null)
			return loan;
		return new Loan();
	}
	
	@PostMapping("/searchApplicantName")
	public List<Product> searchApplicantName(@RequestBody String applicantName) {
		return bankLoanService.searchApplicantName(applicantName);
	}

	@PostMapping("/deleteLoan")
	public void deleteLoan(@RequestBody Long id) {
		facilityRepository.deleteById(id);
	}
	
	@PostMapping("/saveCrFacility")
	public void saveCrFacility(@RequestBody CreditFacility crFacility) {
		creditFacilityService.save(crFacility);
	}
}
