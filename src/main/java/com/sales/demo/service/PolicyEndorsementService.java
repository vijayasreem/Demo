package com.sales.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.PolicyEndorsement;
import com.sales.demo.repository.PolicyEndorsementRepository;

@Service
public class PolicyEndorsementService {
	 	
	@Autowired
	private PolicyEndorsementRepository policyEndorsementRepository;
	
	public Optional<PolicyEndorsement> findByPolicyNumber(String policyNumber) {
		return policyEndorsementRepository.findByPolicyNumber(policyNumber);
	}
	
	public Optional<PolicyEndorsement> findByCustomerName(String customerName) {
		return policyEndorsementRepository.findByCustomerName(customerName);
	}
	
	public Optional<PolicyEndorsement> findByIntermediaryName(String intermediaryName) {
		return policyEndorsementRepository.findByIntermediaryName(intermediaryName);
	}
	
	public Optional<PolicyEndorsement> findByLineOfBusiness(String lineOfBusiness) {
		return policyEndorsementRepository.findByLineOfBusiness(lineOfBusiness);
	}
	
	public Optional<PolicyEndorsement> findByProductName(String productName) {
		return policyEndorsementRepository.findByProductName(productName);
	}
	
	public Optional<PolicyEndorsement> findByProductVariant(String productVariant) {
		return policyEndorsementRepository.findByProductVariant(productVariant);
	}
	
	public Optional<PolicyEndorsement> findByUnitOffice(String unitOffice) {
		return policyEndorsementRepository.findByUnitOffice(unitOffice);
	}
	
	public Optional<PolicyEndorsement> findByPolicyStatus(String policyStatus) {
		return policyEndorsementRepository.findByPolicyStatus(policyStatus);
	}
	
	public Optional<PolicyEndorsement> findByPolicyStartDate(String policyStartDate) {
		return policyEndorsementRepository.findByPolicyStartDate(policyStartDate);
	}
	
	public Optional<PolicyEndorsement> findByPolicyEndDate(String policyEndDate) {
		return policyEndorsementRepository.findByPolicyEndDate(policyEndDate);
	}
	
	public Optional<PolicyEndorsement> findByEndorsementType(String endorsementType) {
		return policyEndorsementRepository.findByEndorsementType(endorsementType);
	}
	
	public Optional<PolicyEndorsement> findByEndorsementSubType(String endorsementSubType) {
		return policyEndorsementRepository.findByEndorsementSubType(endorsementSubType);
	}
	
	public Optional<PolicyEndorsement> findByTypeOfService(String typeOfService) {
		return policyEndorsementRepository.findByTypeOfService(typeOfService);
	}
	
	public Optional<PolicyEndorsement> findByMphDetails(String mphDetails) {
		return policyEndorsementRepository.findByMphDetails(mphDetails);
	}
	
	public Optional<PolicyEndorsement> findByMphAddress(String mphAddress) {
		return policyEndorsementRepository.findByMphAddress(mphAddress);
	}
	
	public Optional<PolicyEndorsement> findByBankAccount(String bankAccount) {
		return policyEndorsementRepository.findByBankAccount(bankAccount);
	}
	
	public Optional<PolicyEndorsement> findByContactPerson(String contactPerson) {
		return policyEndorsementRepository.findByContactPerson(contactPerson);
	}
	
	public Optional<PolicyEndorsement> findByTrustDetails(String trustDetails) {
		return policyEndorsementRepository.findByTrustDetails(trustDetails);
	}
	
	public Optional<PolicyEndorsement> findByTrustAddress(String trustAddress) {
		return policyEndorsementRepository.findByTrustAddress(trustAddress);
	}