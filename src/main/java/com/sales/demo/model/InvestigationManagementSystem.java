package com.sales.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class InvestigationManagementSystem {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long caseNumber;
    
    private String internalOrExternal;
    
    private String status;
    
    private String invoices;
    
    private String reports;
    
    private String emails;
    
    private String notifications;
    
    private String waiveOff;
    
    private String history;
    
    public InvestigationManagementSystem() {
    }
    
    public Long getCaseNumber() {
        return caseNumber;
    }
    
    public void setCaseNumber(Long caseNumber) {
        this.caseNumber = caseNumber;
    }
    
    public String getInternalOrExternal() {
        return internalOrExternal;
    }
    
    public void setInternalOrExternal(String internalOrExternal) {
        this.internalOrExternal = internalOrExternal;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getInvoices() {
        return invoices;
    }
    
    public void setInvoices(String invoices) {
        this.invoices = invoices;
    }
    
    public String getReports() {
        return reports;
    }
    
    public void setReports(String reports) {
        this.reports = reports;
    }
    
    public String getEmails() {
        return emails;
    }
    
    public void setEmails(String emails) {
        this.emails = emails;
    }
    
    public String getNotifications() {
        return notifications;
    }
    
    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }
    
    public String getWaiveOff() {
        return waiveOff;
    }
    
    public void setWaiveOff(String waiveOff) {
        this.waiveOff = waiveOff;
    }
    
    public String getHistory() {
        return history;
    }
    
    public void setHistory(String history) {
        this.history = history;
    }
    
}