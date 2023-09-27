
package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LoanApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileType;
    private double customerIncome;
    private int customerAge;
    private int creditScore;
    private String vendorBankAccountNumber;
    private String vendorRoutingNumber;
    private double availableBalance;
    private double paymentAmount;
    private boolean paymentApprovalRequired;
    private boolean paymentApproved;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public double getCustomerIncome() {
        return customerIncome;
    }

    public void setCustomerIncome(double customerIncome) {
        this.customerIncome = customerIncome;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public String getVendorBankAccountNumber() {
        return vendorBankAccountNumber;
    }

    public void setVendorBankAccountNumber(String vendorBankAccountNumber) {
        this.vendorBankAccountNumber = vendorBankAccountNumber;
    }

    public String getVendorRoutingNumber() {
        return vendorRoutingNumber;
    }

    public void setVendorRoutingNumber(String vendorRoutingNumber) {
        this.vendorRoutingNumber = vendorRoutingNumber;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public boolean isPaymentApprovalRequired() {
        return paymentApprovalRequired;
    }

    public void setPaymentApprovalRequired(boolean paymentApprovalRequired) {
        this.paymentApprovalRequired = paymentApprovalRequired;
    }

    public boolean isPaymentApproved() {
        return paymentApproved;
    }

    public void setPaymentApproved(boolean paymentApproved) {
        this.paymentApproved = paymentApproved;
    }
}
