package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvestigationManagementSystemRepository extends JpaRepository<InvestigationManagementSystem, Long> {

    InvestigationManagementSystem findByCaseNumber(Long caseNumber);

    List<InvestigationManagementSystem> findByAllocateToInternalOrExternalInvestigator(String internalOrExternal);

    void generateInvoiceForExternalInvestigators();

    void submitReportsToLSOAndClaimsTeam();

    void sendEmailsAndNotificationsToUsers();

    void waiveOffCases();

    void maintainHistoryOfCases();

}