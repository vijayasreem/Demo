package com.sales.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckFamilyHealthEligibilityRepository extends JpaRepository<Object, Long> {
    @Query("SELECT count(*) FROM family_health_insurance " +
            "WHERE product_code = :productCode AND " +
            "product_description = :productDescription AND " +
            "effective_start_date >= :effectiveStartDate AND " +
            "effective_end_date <= :effectiveEndDate AND " +
            "business_type IN (:newBusiness, :renewal) AND " +
            "min_term IN (:term1, :term2, :term3) AND " +
            "adults = :adults AND " +
            "children BETWEEN :minChildren AND :maxChildren AND " +
            "age_range BETWEEN :minAge AND :maxAge AND " +
            "relationship IN (:spouse, :son, :self, :mother, :father, :daughter) AND " +
            "occupation IN (:salaried, :business, :doctor, :lawyer, :engineer) AND " +
            "rating_calculator IN (:ratingCalculator1, :ratingCalculator2)")
    int checkEligibility(String productCode, String productDescription, String effectiveStartDate, String effectiveEndDate,
                         String newBusiness, String renewal, String term1, String term2, String term3, int adults,
                         int minChildren, int maxChildren, int minAge, int maxAge, String spouse, String son, String self,
                         String mother, String father, String daughter, String salaried, String business, String doctor,
                         String lawyer, String engineer, String ratingCalculator1, String ratingCalculator2);

}