package com.sales.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sales.demo.model.InvestigationManagementSystem;
import com.sales.demo.service.InvestigationManagementSystemService;

@RestController
@RequestMapping("/investigation-management-system")
public class InvestigationManagementSystemController {

    @Autowired
    private InvestigationManagementSystemService investigationManagementSystemService;
    
    @GetMapping("/{caseNumber}")
    public InvestigationManagementSystem findByCaseNumber(@PathVariable Long caseNumber) {
        return investigationManagementSystemService.findByCaseNumber(caseNumber);
    }

    @GetMapping("/allocate/{internalOrExternal}")
    public List<InvestigationManagementSystem> findByAllocateToInternalOrExternalInvestigator(@PathVariable String internalOrExternal) {
        return investigationManagementSystemService.findByAllocateToInternalOrExternalInvestigator(internalOrExternal);
    }

    @PostMapping("/invoice")
    public void generateInvoiceForExternalInvestigators() {
        investigationManagementSystemService.generateInvoiceForExternalInvestigators();
    }

    @PostMapping("/report")
    public void submitReportsToLSOAndClaimsTeam() {
        investigationManagementSystemService.submitReportsToLSOAndClaimsTeam();
    }

    @PostMapping("/notification")
    public void sendEmailsAndNotificationsToUsers() {
        investigationManagementSystemService.sendEmailsAndNotificationsToUsers();
    }

    @PostMapping("/waive")
    public void waiveOffCases() {
        investigationManagementSystemService.waiveOffCases();
    }

    @PostMapping("/history")
    public void maintainHistoryOfCases() {
        investigationManagementSystemService.maintainHistoryOfCases();
    }

}