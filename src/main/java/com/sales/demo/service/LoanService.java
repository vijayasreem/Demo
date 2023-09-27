package com.sales.demo.service;

import com.sales.demo.model.Loan;
import com.sales.demo.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getApprovedLoans() {
        return loanRepository.findApprovedLoans();
    }

    public List<Loan> getLoansByAmount(double amount) {
        return loanRepository.findLoansByAmount(amount);
    }

    public List<Loan> getLoansByCustomerId(String customerId) {
        return loanRepository.findLoansByCustomerId(customerId);
    }

    public List<Loan> getLoansWithProperVehicleValue() {
        return loanRepository.findLoansWithProperVehicleValue();
    }

    // Add more business methods as per your requirements

}