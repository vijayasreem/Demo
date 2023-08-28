package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sales.demo.model.PolicyEndorsement;

@Repository
public interface PolicyEndorsementRepository extends JpaRepository<PolicyEndorsement, Long> {

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.policyNumber = :policyNumber")
    PolicyEndorsement findByPolicyNumber(@Param("policyNumber") String policyNumber);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.customerName = :customerName")
    PolicyEndorsement findByCustomerName(@Param("customerName") String customerName);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.intermediaryName = :intermediaryName")
    PolicyEndorsement findByIntermediaryName(@Param("intermediaryName") String intermediaryName);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.lineOfBusiness = :lineOfBusiness")
    PolicyEndorsement findByLineOfBusiness(@Param("lineOfBusiness") String lineOfBusiness);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.productName = :productName")
    PolicyEndorsement findByProductName(@Param("productName") String productName);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.productVariant = :productVariant")
    PolicyEndorsement findByProductVariant(@Param("productVariant") String productVariant);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.unitOffice = :unitOffice")
    PolicyEndorsement findByUnitOffice(@Param("unitOffice") String unitOffice);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.policyStatus = :policyStatus")
    PolicyEndorsement findByPolicyStatus(@Param("policyStatus") String policyStatus);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.policyStartDate = :policyStartDate")
    PolicyEndorsement findByPolicyStartDate(@Param("policyStartDate") String policyStartDate);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.policyEndDate = :policyEndDate")
    PolicyEndorsement findByPolicyEndDate(@Param("policyEndDate") String policyEndDate);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.endorsementType = :endorsementType")
    PolicyEndorsement findByEndorsementType(@Param("endorsementType") String endorsementType);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.endorsementSubType = :endorsementSubType")
    PolicyEndorsement findByEndorsementSubType(@Param("endorsementSubType") String endorsementSubType);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.typeOfService = :typeOfService")
    PolicyEndorsement findByTypeOfService(@Param("typeOfService") String typeOfService);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.mphDetails = :mphDetails")
    PolicyEndorsement findByMphDetails(@Param("mphDetails") String mphDetails);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.mphAddress = :mphAddress")
    PolicyEndorsement findByMphAddress(@Param("mphAddress") String mphAddress);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.bankAccount = :bankAccount")
    PolicyEndorsement findByBankAccount(@Param("bankAccount") String bankAccount);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.contactPerson = :contactPerson")
    PolicyEndorsement findByContactPerson(@Param("contactPerson") String contactPerson);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.trustDetails = :trustDetails")
    PolicyEndorsement findByTrustDetails(@Param("trustDetails") String trustDetails);

    @Query("SELECT p FROM PolicyEndorsement p WHERE p.trustAddress = :trustAddress")
    PolicyEndorsement findByTrustAddress(@Param("trustAddress") String