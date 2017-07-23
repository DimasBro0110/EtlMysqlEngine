package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_INCIDENT")
public class FactIncident {

    @Id
    @Column(name = "FACT_INCIDENT_KEY")
    private String factIncidentKey;

    @Column(name = "FACT_INCIDENT_CUSTOMER_KEY")
    private String factIncidentCustomerKey;

    @Column(name = "FACT_INCIDENT_FOLLOW_UP_BY")
    private String factIncidentFollowUpBy;

    @Column(name = "FACT_INCIDENT_PREVIOUS_CASE_KEY")
    private String factIncidentPreviousCaseKey;

    @Column(name = "FACT_INCIDENT_PREFERRED_CONTACT_METHOD")
    private String factIncidentPreferredContactMethod;

    @Column(name = "FACT_INCIDENT_STATUS")
    private String factIncidentStatus;

    @Column(name = "FACT_INCIDENT_CASE_ORIGIN")
    private String factIncidentCaseOrigin;

    @Column(name = "FACT_INCIDENT_TYPE")
    private String factIncidentType;

    @Column(name = "FACT_SUB_TYPE")
    private String factSubType;

    public String getFactIncidentKey() {
        return factIncidentKey;
    }

    public void setFactIncidentKey(String factIncidentKey) {
        this.factIncidentKey = factIncidentKey;
    }

    public String getFactIncidentCustomerKey() {
        return factIncidentCustomerKey;
    }

    public void setFactIncidentCustomerKey(String factIncidentCustomerKey) {
        this.factIncidentCustomerKey = factIncidentCustomerKey;
    }

    public String getFactIncidentFollowUpBy() {
        return factIncidentFollowUpBy;
    }

    public void setFactIncidentFollowUpBy(String factIncidentFollowUpBy) {
        this.factIncidentFollowUpBy = factIncidentFollowUpBy;
    }

    public String getFactIncidentPreviousCaseKey() {
        return factIncidentPreviousCaseKey;
    }

    public void setFactIncidentPreviousCaseKey(String factIncidentPreviousCaseKey) {
        this.factIncidentPreviousCaseKey = factIncidentPreviousCaseKey;
    }

    public String getFactIncidentPreferredContactMethod() {
        return factIncidentPreferredContactMethod;
    }

    public void setFactIncidentPreferredContactMethod(String factIncidentPreferredContactMethod) {
        this.factIncidentPreferredContactMethod = factIncidentPreferredContactMethod;
    }

    public String getFactIncidentStatus() {
        return factIncidentStatus;
    }

    public void setFactIncidentStatus(String factIncidentStatus) {
        this.factIncidentStatus = factIncidentStatus;
    }

    public String getFactIncidentCaseOrigin() {
        return factIncidentCaseOrigin;
    }

    public void setFactIncidentCaseOrigin(String factIncidentCaseOrigin) {
        this.factIncidentCaseOrigin = factIncidentCaseOrigin;
    }

    public String getFactIncidentType() {
        return factIncidentType;
    }

    public void setFactIncidentType(String factIncidentType) {
        this.factIncidentType = factIncidentType;
    }

    public String getFactSubType() {
        return factSubType;
    }

    public void setFactSubType(String factSubType) {
        this.factSubType = factSubType;
    }
}
