package com.example.bankloan.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	long applicantId;
	long facId;
	String loanType;
	BigDecimal amount;
	double rate;
	double term;
	BigDecimal outstandingBal;

	public Loan() {

	}

	public Loan(long applicantId, long facId, String loanType, BigDecimal amount, double rate, double term, BigDecimal outstandingBal) {
		this.applicantId = applicantId;
		this.facId = facId;
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

	public long getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(long applicantId) {
		this.applicantId = applicantId;
	}

	public long getFacId() {
		return facId;
	}

	public void setFacId(long facId) {
		this.facId = facId;
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