package com.example.bankloan.model;

import java.math.BigDecimal;

public class Product {
	long id;
	Applicant applicant;
	Facility facility;
	String loanType;
	BigDecimal amount;
	double rate;
	double term;
	BigDecimal outstandingBal;

	public Product() {

	}

	public Product(Applicant applicant, Facility facility, String loanType, BigDecimal amount, double rate, double term,
			BigDecimal outstandingBal) {
		this.applicant = applicant;
		this.facility = facility;
		this.loanType = loanType;
		this.amount = amount;
		this.rate = rate;
		this.term = term;
		this.outstandingBal = outstandingBal;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Applicant getApplicant() {
		return applicant;
	}

	public void setApplicant(Applicant applicant) {
		this.applicant = applicant;
	}

	public Facility getFacility() {
		return facility;
	}

	public void setFacility(Facility facility) {
		this.facility = facility;
	}
	
	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getTerm() {
		return term;
	}

	public void setTerm(double term) {
		this.term = term;
	}

	public BigDecimal getOutstandingBal() {
		return outstandingBal;
	}

	public void setOutstandingBal(BigDecimal outstandingBal) {
		this.outstandingBal = outstandingBal;
	}

}
