// Spring Boot Entity/Model
package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyLevelCustomerDetails {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String searchParameters;
    private String endorsementProcessing;
    private String rejectionReason;
    private String notesForMaker;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSearchParameters() {
        return searchParameters;
    }

    public void setSearchParameters(String searchParameters) {
        this.searchParameters = searchParameters;
    }

    public String getEndorsementProcessing() {
        return endorsementProcessing;
    }

    public void setEndorsementProcessing(String endorsementProcessing) {
        this.endorsementProcessing = endorsementProcessing;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public String getNotesForMaker() {
        return notesForMaker;
    }

    public void setNotesForMaker(String notesForMaker) {
        this.notesForMaker = notesForMaker;
    }

}