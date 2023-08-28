package com.sales.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.model.PolicyLevelCustomerDetails;
import com.sales.demo.service.PolicyLevelCustomerDetailsService;

@RestController
@RequestMapping("/policy-level-customer-details")
public class PolicyLevelCustomerDetailsController {

    @Autowired
    private PolicyLevelCustomerDetailsService policyLevelCustomerDetailsService;

    @GetMapping("/search/{searchParameters}")
    public List<PolicyLevelCustomerDetails> findBySearchParameters(@PathVariable String searchParameters) {
        return policyLevelCustomerDetailsService.findBySearchParameters(searchParameters);
    }

    @GetMapping("/endorsement-processing/{endorsementProcessing}")
    public PolicyLevelCustomerDetails findByEndorsementProcessing(@PathVariable String endorsementProcessing) {
        return policyLevelCustomerDetailsService.findByEndorsementProcessing(endorsementProcessing);
    }

    @GetMapping("/rejection-reason/{rejectionReason}")
    public List<PolicyLevelCustomerDetails> findByRejectionReason(@PathVariable String rejectionReason) {
        return policyLevelCustomerDetailsService.findByRejectionReason(rejectionReason);
    }

    @GetMapping("/notes-for-maker/{notesForMaker}")
    public List<PolicyLevelCustomerDetails> findByNotesForMaker(@PathVariable String notesForMaker) {
        return policyLevelCustomerDetailsService.findByNotesForMaker(notesForMaker);
    }

    @PutMapping("/approve-endorsement/{endorsementProcessing}")
    public void approveEndorsement(@PathVariable String endorsementProcessing) {
        policyLevelCustomerDetailsService.approveEndorsement(endorsementProcessing);
    }

    @PutMapping("/reject-endorsement")
    public void rejectEndorsement(@RequestBody PolicyLevelCustomerDetails policyLevelCustomerDetails) {
        policyLevelCustomerDetailsService.rejectEndorsement(policyLevelCustomerDetails.getEndorsementProcessing(), policyLevelCustomerDetails.getRejectionReason());
    }

    @PutMapping("/send-to-maker")
    public void sendToMaker(@RequestBody PolicyLevelCustomerDetails policyLevelCustomerDetails) {
        policyLevelCustomerDetailsService.sendToMaker(policyLevelCustomerDetails.getEndorsementProcessing(), policyLevelCustomerDetails.getNotesForMaker());
    }
}