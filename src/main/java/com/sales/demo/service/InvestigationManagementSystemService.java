package com.sales.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sales.demo.repository.InvestigationManagementSystemRepository;
import com.sales.demo.model.InvestigationManagementSystem;

@Service
public class InvestigationManagementSystemService {

    @Autowired
    private InvestigationManagementSystemRepository investigationManagementSystemRepository;

    public InvestigationManagementSystem findByCaseNumber(Long caseNumber) {
        return investigationManagementSystemRepository.findByCaseNumber(caseNumber);
    }

    public List<InvestigationManagementSystem> findByAllocateToInternalOrExternalInvestigator(String internalOrExternal) {
        return investigationManagementSystemRepository.findByAllocateToInternalOrExternalInvestigator(internalOrExternal);
    }

    public void generateInvoiceForExternalInvestigators() {
        investigationManagementSystemRepository.generateInvoiceForExternalInvestigators();
    }

    public void submitReportsToLSOAndClaimsTeam() {
        investigationManagementSystemRepository.submitReportsToLSOAndClaimsTeam();
    }

    public void sendEmailsAndNotificationsToUsers() {
        investigationManagementSystemRepository.sendEmailsAndNotificationsToUsers();
    }

    public void waiveOffCases() {
        investigationManagementSystemRepository.waiveOffCases();
    }

    public void maintainHistoryOfCases() {
        investigationManagementSystemRepository.maintainHistoryOfCases();
    }

}