
package com.sales.demo.repository;

import com.sales.demo.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Long> {

    @Query("SELECT l FROM LoanApplication l WHERE l.fileType IN ('PDF', 'JPEG')")
    List<LoanApplication> findByValidFileFormat();

    @Query("SELECT l FROM LoanApplication l WHERE l.customerIncome > 100000")
    List<LoanApplication> findByValidCustomerIncome();

    @Query("SELECT l FROM LoanApplication l WHERE l.customerAge >= 18 AND l.customerAge <= 65")
    List<LoanApplication> findByValidCustomerAge();

    @Query("SELECT l FROM LoanApplication l WHERE l.creditScore > 600")
    List<LoanApplication> findByValidCreditScore();

    @Query("SELECT l FROM LoanApplication l WHERE LENGTH(l.vendorBankAccountNumber) = 9 AND LENGTH(l.vendorRoutingNumber) = 9")
    List<LoanApplication> findByValidVendorBankAccount();

    @Query("SELECT l FROM LoanApplication l WHERE l.availableBalance >= l.paymentAmount")
    List<LoanApplication> findBySufficientFunds();

    @Query("SELECT l FROM LoanApplication l WHERE l.paymentAmount <= 1000.0")
    List<LoanApplication> findByAutoApprovedPayments();

    @Query("SELECT l FROM LoanApplication l WHERE l.paymentApprovalRequired = true AND l.paymentApproved = false")
    List<LoanApplication> findByPaymentApprovalRequired();

}
