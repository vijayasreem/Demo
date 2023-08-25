package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestigationManagementSystemRepository extends JpaRepository<InvestigationManagementSystem, Long>{

    void allocateCasesToInternalInvestigators();
    void allocateCasesToExternalInvestigators();
    void generateInvoicesForExternalInvestigators();
    void submitReportsToLSOAndClaimsTeam();
    void sendEmailsAndNotificationsToUsers();
    void waiveOffCases();
    void maintainHistoryOfCases();

}