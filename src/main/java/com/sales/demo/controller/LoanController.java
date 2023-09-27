package com.sales.demo.controller;

import com.sales.demo.model.Loan;
import com.sales.demo.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    private final LoanService loanService;

    @Autowired
    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @GetMapping("/approved")
    public List<Loan> getApprovedLoans() {
        return loanService.getApprovedLoans();
    }

    @GetMapping("/amount/{amount}")
    public List<Loan> getLoansByAmount(@PathVariable double amount) {
        return loanService.getLoansByAmount(amount);
    }

    @GetMapping("/customer/{customerId}")
    public List<Loan> getLoansByCustomerId(@PathVariable String customerId) {
        return loanService.getLoansByCustomerId(customerId);
    }

    @GetMapping("/proper-vehicle-value")
    public List<Loan> getLoansWithProperVehicleValue() {
        return loanService.getLoansWithProperVehicleValue();
    }

    // Add more endpoints for other business methods as per your requirements

}