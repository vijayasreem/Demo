
package com.sales.demo.repository;

import com.sales.demo.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

    @Query("SELECT l FROM Loan l WHERE l.status = 'APPROVED'")
    List<Loan> findApprovedLoans();

    @Query("SELECT l FROM Loan l WHERE l.loanAmount = :amount")
    List<Loan> findLoansByAmount(double amount);

    @Query("SELECT l FROM Loan l WHERE l.customerId = :customerId")
    List<Loan> findLoansByCustomerId(String customerId);

    @Query("SELECT l FROM Loan l WHERE l.vehicleValue >= l.loanAmount")
    List<Loan> findLoansWithProperVehicleValue();

    // Add more custom queries as per your requirements

}
