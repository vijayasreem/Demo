package com.sales.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.service.InvestigationManagementSystemService;

@RestController
@RequestMapping("/investigation")
public class InvestigationManagementSystemController {
    
    @Autowired
    InvestigationManagementSystemService investigationManagementSystemService;

    @PostMapping("/allocate-internal")
    public ResponseEntity<?> allocateCasesToInternalInvestigators() {
        investigationManagementSystemService.allocateCasesToInternalInvestigators();
        return ResponseEntity.ok("Cases successfully allocated to Internal investigators");
    }

    @PostMapping("/allocate-external")
    public ResponseEntity<?> allocateCasesToExternalInvestigators() {
        investigationManagementSystemService.allocateCasesToExternalInvestigators();
        return ResponseEntity.ok("Cases successfully allocated to External investigators");
    }

    @PostMapping("/generate-invoices")
    public ResponseEntity<?> generateInvoicesForExternalInvestigators() {
        investigationManagementSystemService.generateInvoicesForExternalInvestigators();
        return ResponseEntity.ok("Invoices successfully generated for External investigators");
    }

    @PostMapping("/submit-reports")
    public ResponseEntity<?> submitReportsToLSOAndClaimsTeam() {
        investigationManagementSystemService.submitReportsToLSOAndClaimsTeam();
        return ResponseEntity.ok("Reports successfully submitted to LSO and Claims team");
    }

    @PostMapping("/send-emails")
    public ResponseEntity<?> sendEmailsAndNotificationsToUsers() {
        investigationManagementSystemService.sendEmailsAndNotificationsToUsers();
        return ResponseEntity.ok("Emails and notifications successfully sent to users");
    }

    @PostMapping("/waive-off")
    public ResponseEntity<?> waiveOffCases() {
        investigationManagementSystemService.waiveOffCases();
        return ResponseEntity.ok("Cases successfully waived off");
    }

    @PostMapping("/maintain-history")
    public ResponseEntity<?> maintainHistoryOfCases() {
        investigationManagementSystemService.maintainHistoryOfCases();
        return ResponseEntity.ok("History of cases successfully maintained");
    }

}