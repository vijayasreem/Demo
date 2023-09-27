package com.sales.demo.controller;

import com.sales.demo.model.LoanApplication;
import com.sales.demo.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loanApplications")
public class LoanApplicationController {

    private final LoanApplicationService loanApplicationService;

    @Autowired
    public LoanApplicationController(LoanApplicationService loanApplicationService) {
        this.loanApplicationService = loanApplicationService;
    }

    @GetMapping("/validFileFormat")
    public ResponseEntity<List<LoanApplication>> findByValidFileFormat() {
        List<LoanApplication> loanApplications = loanApplicationService.findByValidFileFormat();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/validCustomerIncome")
    public ResponseEntity<List<LoanApplication>> findByValidCustomerIncome() {
        List<LoanApplication> loanApplications = loanApplicationService.findByValidCustomerIncome();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/validCustomerAge")
    public ResponseEntity<List<LoanApplication>> findByValidCustomerAge() {
        List<LoanApplication> loanApplications = loanApplicationService.findByValidCustomerAge();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/validCreditScore")
    public ResponseEntity<List<LoanApplication>> findByValidCreditScore() {
        List<LoanApplication> loanApplications = loanApplicationService.findByValidCreditScore();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/validVendorBankAccount")
    public ResponseEntity<List<LoanApplication>> findByValidVendorBankAccount() {
        List<LoanApplication> loanApplications = loanApplicationService.findByValidVendorBankAccount();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/sufficientFunds")
    public ResponseEntity<List<LoanApplication>> findBySufficientFunds() {
        List<LoanApplication> loanApplications = loanApplicationService.findBySufficientFunds();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/autoApprovedPayments")
    public ResponseEntity<List<LoanApplication>> findByAutoApprovedPayments() {
        List<LoanApplication> loanApplications = loanApplicationService.findByAutoApprovedPayments();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    @GetMapping("/paymentApprovalRequired")
    public ResponseEntity<List<LoanApplication>> findByPaymentApprovalRequired() {
        List<LoanApplication> loanApplications = loanApplicationService.findByPaymentApprovalRequired();
        return new ResponseEntity<>(loanApplications, HttpStatus.OK);
    }

    // Implement your remaining business methods here

    @PostMapping("/verifyDocuments")
    public ResponseEntity<String> verifyDocuments(@RequestBody LoanApplication loanApplication) {
        // Implement verifyDocuments logic
        return new ResponseEntity<>("Verification successful", HttpStatus.OK);
    }

    @PostMapping("/validateCreditEvaluation")
    public ResponseEntity<String> validateCreditEvaluation(@RequestBody LoanApplication loanApplication) {
        // Implement validateCreditEvaluation logic
        return new ResponseEntity<>("Credit evaluation successful", HttpStatus.OK);
    }

    @PostMapping("/checkCustomerAge")
    public ResponseEntity<String> checkCustomerAge(@RequestBody LoanApplication loanApplication) {
        // Implement checkCustomerAge logic
        return new ResponseEntity<>("Customer age check successful", HttpStatus.OK);
    }

    @PostMapping("/checkCreditScore")
    public ResponseEntity<String> checkCreditScore(@RequestBody LoanApplication loanApplication) {
        // Implement checkCreditScore logic
        return new ResponseEntity<>("Credit score check successful", HttpStatus.OK);
    }

    @PostMapping("/processDisbursement")
    public ResponseEntity<String> processDisbursement(@RequestBody LoanApplication loanApplication) {
        // Implement processDisbursement logic
        return new ResponseEntity<>("Disbursement process successful", HttpStatus.OK);
    }
}