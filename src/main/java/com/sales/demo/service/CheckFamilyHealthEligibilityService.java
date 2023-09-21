package com.sales.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.demo.repository.CheckFamilyHealthEligibilityRepository;

@Service
public class CheckFamilyHealthEligibilityService {

    @Autowired
    private CheckFamilyHealthEligibilityRepository checkFamilyHealthEligibilityRepository;

    public boolean checkEligibility(String productCode, String productDescription, String effectiveStartDate, String effectiveEndDate,
                         String newBusiness, String renewal, String term1, String term2, String term3, int adults,
                         int minChildren, int maxChildren, int minAge, int maxAge, String spouse, String son, String self,
                         String mother, String father, String daughter, String salaried, String business, String doctor,
                         String lawyer, String engineer, String ratingCalculator1, String ratingCalculator2) {

        int count = checkFamilyHealthEligibilityRepository.checkEligibility(productCode, productDescription, effectiveStartDate, effectiveEndDate,
                newBusiness, renewal, term1, term2, term3, adults, minChildren, maxChildren, minAge, maxAge, spouse, son, self,
                mother, father, daughter, salaried, business, doctor, lawyer, engineer, ratingCalculator1, ratingCalculator2);

        if (count > 0) {
            return true;
        }
        return false;
    }

}