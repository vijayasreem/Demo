package com.sales.demo.service;

import com.sales.demo.model.LoanApplication;
import com.sales.demo.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanApplicationService {

    private final LoanApplicationRepository loanApplicationRepository;

    @Autowired
    public LoanApplicationService(LoanApplicationRepository loanApplicationRepository) {
        this.loanApplicationRepository = loanApplicationRepository;
    }

    public List<LoanApplication> findByValidFileFormat() {
        return loanApplicationRepository.findByValidFileFormat();
    }

    public List<LoanApplication> findByValidCustomerIncome() {
        return loanApplicationRepository.findByValidCustomerIncome();
    }

    public List<LoanApplication> findByValidCustomerAge() {
        return loanApplicationRepository.findByValidCustomerAge();
    }

    public List<LoanApplication> findByValidCreditScore() {
        return loanApplicationRepository.findByValidCreditScore();
    }

    public List<LoanApplication> findByValidVendorBankAccount() {
        return loanApplicationRepository.findByValidVendorBankAccount();
    }

    public List<LoanApplication> findBySufficientFunds() {
        return loanApplicationRepository.findBySufficientFunds();
    }

    public List<LoanApplication> findByAutoApprovedPayments() {
        return loanApplicationRepository.findByAutoApprovedPayments();
    }

    public List<LoanApplication> findByPaymentApprovalRequired() {
        return loanApplicationRepository.findByPaymentApprovalRequired();
    }

    // Implement your remaining business methods here
}