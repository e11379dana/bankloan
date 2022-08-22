package com.example.bankloan;

import java.math.BigDecimal;
import java.util.Date;
import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bankloan.model.Applicant;
import com.example.bankloan.model.Facility;
import com.example.bankloan.model.Loan;
import com.example.bankloan.repo.ApplicantRepository;
import com.example.bankloan.repo.FacilityRepository;
import com.example.bankloan.repo.LoanRepository;

@SpringBootApplication
public class BankloanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankloanApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(ApplicantRepository applicantRepository, FacilityRepository facilityRepository, LoanRepository loanRepository) {
		Applicant applicant1 = new Applicant("Suresh", "Lor 2, Toa Payoh", new Date());
		Applicant applicant2 = new Applicant("Dananjaya", "Lor 3, Paya Lebar", new Date());
		Applicant applicant3 = new Applicant("Chey Huat", "Lor 2, Chinatown", new Date());
		Applicant applicant4 = new Applicant("Wee Yen", "Lor 2, Bugis", new Date());
		Applicant applicant5 = new Applicant("Michelle", "Lor 5, Tanah Merah", new Date());
		applicantRepository.save(applicant1);
		applicantRepository.save(applicant2);
		applicantRepository.save(applicant3);
		applicantRepository.save(applicant4);
		applicantRepository.save(applicant5);
		
		Facility facility1 = new Facility("FX", "Foreign Exchange");
		Facility facility2 = new Facility("LOC", "Letter of Credit");
		facilityRepository.save(facility1);
		facilityRepository.save(facility2);
		
		Loan loan1 = new Loan(1, 6, "Housing", new BigDecimal(123000), 1.5, 60.0, new BigDecimal(123000));
		Loan loan2 = new Loan(2, 6, "Vehicle", new BigDecimal(240000), 1.75, 48.0, new BigDecimal(200000));
		Loan loan3 = new Loan(2, 7, "Investment", new BigDecimal(500000), 2.0, 24.0, new BigDecimal(500000));
		loanRepository.save(loan1);
		loanRepository.save(loan2);
		loanRepository.save(loan3);
		
        return args -> {
            applicantRepository.findAll().forEach(System.out::println);
            facilityRepository.findAll().forEach(System.out::println);
            loanRepository.findAll().forEach(System.out::println);
        };
    }

}
