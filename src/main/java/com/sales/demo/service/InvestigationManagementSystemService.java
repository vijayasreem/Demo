package com.sales.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.repository.InvestigationManagementSystemRepository;

@Service
public class InvestigationManagementSystemService {

    @Autowired
    InvestigationManagementSystemRepository investigationManagementSystemRepository;

    public void allocateCasesToInternalInvestigators() {
        // implementation of code to allocate cases to Internal investigators
    }

    public void allocateCasesToExternalInvestigators() {
        // implementation of code to allocate cases to External investigators
    }

    public void generateInvoicesForExternalInvestigators() {
        // implementation of code to generate invoices for External investigators
    }

    public void submitReportsToLSOAndClaimsTeam() {
        // implementation of code to submit reports to LSO and Claims team
    }

    public void sendEmailsAndNotificationsToUsers() {
        // implementation of code to send emails and notifications to users
    }

    public void waiveOffCases() {
        // implementation of code to waive off cases
    }

    public void maintainHistoryOfCases() {
        // implementation of code to maintain history of cases
    }
}