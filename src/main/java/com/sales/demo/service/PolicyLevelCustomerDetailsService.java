package com.sales.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.model.PolicyLevelCustomerDetails;
import com.sales.demo.repository.PolicyLevelCustomerDetailsRepository;

@Service
public class PolicyLevelCustomerDetailsService {
    @Autowired
    private PolicyLevelCustomerDetailsRepository policyLevelCustomerDetailsRepository;

    public List<PolicyLevelCustomerDetails> findBySearchParameters(String searchParameters) {
        return policyLevelCustomerDetailsRepository.findBySearchParameters(searchParameters);
    }

    public PolicyLevelCustomerDetails findByEndorsementProcessing(String endorsementProcessing) {
        return policyLevelCustomerDetailsRepository.findByEndorsementProcessing(endorsementProcessing);
    }

    public List<PolicyLevelCustomerDetails> findByRejectionReason(String rejectionReason) {
        return policyLevelCustomerDetailsRepository.findByRejectionReason(rejectionReason);
    }

    public List<PolicyLevelCustomerDetails> findByNotesForMaker(String notesForMaker) {
        return policyLevelCustomerDetailsRepository.findByNotesForMaker(notesForMaker);
    }

    public void approveEndorsement(String endorsementProcessing) {
        PolicyLevelCustomerDetails policyLevelCustomerDetails = policyLevelCustomerDetailsRepository.findByEndorsementProcessing(endorsementProcessing);
        policyLevelCustomerDetails.setEndorsementProcessing("Approved");
        policyLevelCustomerDetailsRepository.save(policyLevelCustomerDetails);
    }

    public void rejectEndorsement(String endorsementProcessing, String rejectionReason) {
        PolicyLevelCustomerDetails policyLevelCustomerDetails = policyLevelCustomerDetailsRepository.findByEndorsementProcessing(endorsementProcessing);
        policyLevelCustomerDetails.setEndorsementProcessing("Rejected");
        policyLevelCustomerDetails.setRejectionReason(rejectionReason);
        policyLevelCustomerDetailsRepository.save(policyLevelCustomerDetails);
    }

    public void sendToMaker(String endorsementProcessing, String notesForMaker) {
        PolicyLevelCustomerDetails policyLevelCustomerDetails = policyLevelCustomerDetailsRepository.findByEndorsementProcessing(endorsementProcessing);
        policyLevelCustomerDetails.setEndorsementProcessing("Sent to Maker");
        policyLevelCustomerDetails.setNotesForMaker(notesForMaker);
        policyLevelCustomerDetailsRepository.save(policyLevelCustomerDetails);
    }
}