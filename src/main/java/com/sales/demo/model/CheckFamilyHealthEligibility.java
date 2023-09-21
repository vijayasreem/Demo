package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CheckFamilyHealthEligibility {

    @Id
    private String productCode;
    private String productDescription;
    private String effectiveStartDate;
    private String effectiveEndDate;
    private String businessType;
    private String minTerm;
    private int adults;
    private int children;
    private int ageRange;
    private String relationship;
    private String occupation;
    private String ratingCalculator;

    public CheckFamilyHealthEligibility(){

    }

    public CheckFamilyHealthEligibility(String productCode, String productDescription, String effectiveStartDate,
                                       String effectiveEndDate, String businessType, String minTerm, int adults,
                                       int children, int ageRange, String relationship, String occupation,
                                       String ratingCalculator) {
        this.productCode = productCode;
        this.productDescription = productDescription;
        this.effectiveStartDate = effectiveStartDate;
        this.effectiveEndDate = effectiveEndDate;
        this.businessType = businessType;
        this.minTerm = minTerm;
        this.adults = adults;
        this.children = children;
        this.ageRange = ageRange;
        this.relationship = relationship;
        this.occupation = occupation;
        this.ratingCalculator = ratingCalculator;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(String effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public String getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(String effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getMinTerm() {
        return minTerm;
    }

    public void setMinTerm(String minTerm) {
        this.minTerm = minTerm;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(int ageRange) {
        this.ageRange = ageRange;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getRatingCalculator() {
        return ratingCalculator;
    }

    public void setRatingCalculator(String ratingCalculator) {
        this.ratingCalculator = ratingCalculator;
    }

}