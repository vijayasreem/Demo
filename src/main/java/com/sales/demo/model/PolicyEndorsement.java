trustAddress);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.endorsementStatus = :endorsementStatus")
    PolicyEndorsement findByEndorsementStatus(@Param("endorsementStatus") String endorsementStatus);
}

package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PolicyEndorsement {

    @Id
    private Long id;
    private String policyNumber;
    private String customerName;
    private String intermediaryName;
    private String lineOfBusiness;
    private String productName;
    private String productVariant;
    private String unitOffice;
    private String policyStatus;
    private String policyStartDate;
    private String policyEndDate;
    private String endorsementType;
    private String endorsementSubType;
    private String typeOfService;
    private String mphDetails;
    private String mphAddress;
    private String bankAccount;
    private String contactPerson;
    private String trustDetails;
    private String trustAddress;
    private String endorsementStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIntermediaryName() {
        return intermediaryName;
    }

    public void setIntermediaryName(String intermediaryName) {
        this.intermediaryName = intermediaryName;
    }

    public String getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(String lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductVariant() {
        return productVariant;
    }

    public void setProductVariant(String productVariant) {
        this.productVariant = productVariant;
    }

    public String getUnitOffice() {
        return unitOffice;
    }

    public void setUnitOffice(String unitOffice) {
        this.unitOffice = unitOffice;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public String getPolicyStartDate() {
        return policyStartDate;
    }

    public void setPolicyStartDate(String policyStartDate) {
        this.policyStartDate = policyStartDate;
    }

    public String getPolicyEndDate() {
        return policyEndDate;
    }

    public void setPolicyEndDate(String policyEndDate) {
        this.policyEndDate = policyEndDate;
    }

    public String getEndorsementType() {
        return endorsementType;
    }

    public void setEndorsementType(String endorsementType) {
        this.endorsementType = endorsementType;
    }

    public String getEndorsementSubType() {
        return endorsementSubType;
    }

    public void setEndorsementSubType(String endorsementSubType) {
        this.endorsementSubType = endorsementSubType;
    }

    public String getTypeOfService() {
        return typeOfService;
    }

    public void setTypeOfService(String typeOfService) {
        this.typeOfService = typeOfService;
    }

    public String getMphDetails() {
        return mphDetails;
    }

    public void setMphDetails(String mphDetails) {
        this.mphDetails = mphDetails;
    }

    public String getMphAddress() {
        return mphAddress;
    }

    public void setMphAddress(String mphAddress) {
        this.mphAddress = mphAddress;
    }

    public String getBank