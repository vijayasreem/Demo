package com.sales.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.model.PolicyEndorsement;
import com.sales.demo.service.PolicyEndorsementService;

@RestController
@RequestMapping("/endorsement")
public class PolicyEndorsementController {
    
    @Autowired
    private PolicyEndorsementService policyEndorsementService;
    
    @PostMapping("/save")
    public String saveEndorsement(@RequestBody PolicyEndorsement policyEndorsement) {
        policyEndorsementService.save(policyEndorsement);
        return "Endorsement saved successfully!";
    }
    
    @GetMapping("/get/{policyNumber}")
    public Optional<PolicyEndorsement> getEndorsementByPolicyNumber(@PathVariable String policyNumber) {
        return policyEndorsementService.findByPolicyNumber(policyNumber);
    }
    
    @GetMapping("/getByCustomerName/{customerName}")
    public Optional<PolicyEndorsement> getEndorsementByCustomerName(@PathVariable String customerName) {
        return policyEndorsementService.findByCustomerName(customerName);
    }
    
    @GetMapping("/getByIntermediaryName/{intermediaryName}")
    public Optional<PolicyEndorsement> getEndorsementByIntermediaryName(@PathVariable String intermediaryName) {
        return policyEndorsementService.findByIntermediaryName(intermediaryName);
    }
    
    @GetMapping("/getByLineOfBusiness/{lineOfBusiness}")
    public Optional<PolicyEndorsement> getEndorsementByLineOfBusiness(@PathVariable String lineOfBusiness) {
        return policyEndorsementService.findByLineOfBusiness(lineOfBusiness);
    }
    
    @GetMapping("/getByProductName/{productName}")
    public Optional<PolicyEndorsement> getEndorsementByProductName(@PathVariable String productName) {
        return policyEndorsementService.findByProductName(productName);
    }
    
    @GetMapping("/getByProductVariant/{productVariant}")
    public Optional<PolicyEndorsement> getEndorsementByProductVariant(@PathVariable String productVariant) {
        return policyEndorsementService.findByProductVariant(productVariant);
    }
    
    @GetMapping("/getByUnitOffice/{unitOffice}")
    public Optional<PolicyEndorsement> getEndorsementByUnitOffice(@PathVariable String unitOffice) {
        return policyEndorsementService.findByUnitOffice(unitOffice);
    }
    
    @GetMapping("/getByPolicyStatus/{policyStatus}")
    public Optional<PolicyEndorsement> getEndorsementByPolicyStatus(@PathVariable String policyStatus) {
        return policyEndorsementService.findByPolicyStatus(policyStatus);
    }
    
    @GetMapping("/getByPolicyStartDate/{policyStartDate}")
    public Optional<PolicyEndorsement> getEndorsementByPolicyStartDate(@PathVariable String policyStartDate) {
        return policyEndorsementService.findByPolicyStartDate(policyStartDate);
    }
    
    @GetMapping("/getByPolicyEndDate/{policyEndDate}")
    public Optional<PolicyEndorsement> getEndorsementByPolicyEndDate(@PathVariable String policyEndDate) {
        return policyEndorsementService.findByPolicyEndDate(policyEndDate);
    }
    
    @GetMapping("/getByEndorsementType/{endorsementType}")
    public Optional<Policy