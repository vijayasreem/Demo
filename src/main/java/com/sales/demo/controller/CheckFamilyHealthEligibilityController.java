package com.sales.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sales.demo.service.CheckFamilyHealthEligibilityService;

@RestController
@RequestMapping("/check-family-health-eligibility")
public class CheckFamilyHealthEligibilityController {

    @Autowired
    private CheckFamilyHealthEligibilityService checkFamilyHealthEligibilityService;

    @PostMapping
    public boolean checkEligibility(@RequestParam String productCode, @RequestParam String productDescription,
                                   @RequestParam String effectiveStartDate, @RequestParam String effectiveEndDate,
                                   @RequestParam String newBusiness, @RequestParam String renewal,
                                   @RequestParam String term1, @RequestParam String term2, @RequestParam String term3,
                                   @RequestParam int adults, @RequestParam int minChildren, @RequestParam int maxChildren,
                                   @RequestParam int minAge, @RequestParam int maxAge, @RequestParam String spouse,
                                   @RequestParam String son, @RequestParam String self, @RequestParam String mother,
                                   @RequestParam String father, @RequestParam String daughter,
                                   @RequestParam String salaried, @RequestParam String business,
                                   @RequestParam String doctor, @RequestParam String lawyer,
                                   @RequestParam String engineer, @RequestParam String ratingCalculator1,
                                   @RequestParam String ratingCalculator2) {

        return checkFamilyHealthEligibilityService.checkEligibility(productCode, productDescription, effectiveStartDate,
                effectiveEndDate, newBusiness, renewal, term1, term2, term3, adults, minChildren, maxChildren, minAge,
                maxAge, spouse, son, self, mother, father, daughter, salaried, business, doctor, lawyer, engineer,
                ratingCalculator1, ratingCalculator2);
    }

}