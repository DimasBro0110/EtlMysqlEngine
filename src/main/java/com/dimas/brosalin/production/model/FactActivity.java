package com.dimas.brosalin.production.model;

import javax.persistence.*;
import javax.validation.groups.ConvertGroup;

/**
 * Created by dmitriybrosalin on 22.07.17.
 */

/*
* ?ActivityKey?;?CustomerKey?;?CampaignKey?;
* ?ActivityType?;?ActualEnd?;?CreatedOn?;
* ?ModifiedOn?;?state?;?CampaignActivityKey?;
* ?Description?;?Subject?;?Source?
* */

@Entity
@Table(name = "FACT_ACTIVITY")
public class FactActivity {

    @Id
    @Column(name = "FACT_ACTIVITY_KEY")
    private String factActivityKey;

    @Column(name = "FACT_ACTIVITY_CUSTOMER_KEY")
    private String factActivityCustomerKey;

    @Column(name = "FACT_ACTIVITY_CAMPAIGN_KEY")
    private String factActivityCampaignKey;

    @Column(name = "FACT_ACTIVITY_TYPE")
    private String factActivityType;

    @Column(name = "FACT_ACTIVITY_ACTUAL_END")
    private String factActivityActualEnd;

    @Column(name = "FACT_ACTIVITY_CREATED_ON")
    private String factActivityCreatedOn;

    @Column(name = "FACT_ACTIVITY_MODIFIED_ON")
    private String factActivityModifiedOn;

    @Column(name = "FACT_ACTIVITY_STATE")
    private String factActivityState;

    @Column(name = "FACT_ACTIVITY_CAMPAIGN_ACTIVITY_KEY")
    private String factActivityCampaignActivityKey;

    @Lob
    @Column(name = "FACT_ACTIVITY_DESCRIPTION")
    private String factActivityDescription;

    @Lob
    @Column(name = "FACT_ACTIVITY_SUBJECT")
    private String factActivitySubject;

    @Lob
    @Column(name = "FACT_ACTIVITY_SOURCE")
    private String factActivitySource;

    public String getFactActivityKey() {
        return factActivityKey;
    }

    public void setFactActivityKey(String factActivityKey) {
        this.factActivityKey = factActivityKey;
    }

    public String getFactActivityCustomerKey() {
        return factActivityCustomerKey;
    }

    public void setFactActivityCustomerKey(String factActivityCustomerKey) {
        this.factActivityCustomerKey = factActivityCustomerKey;
    }

    public String getFactActivityType() {
        return factActivityType;
    }

    public void setFactActivityType(String factActivityType) {
        this.factActivityType = factActivityType;
    }

    public String getFactActivityActualEnd() {
        return factActivityActualEnd;
    }

    public void setFactActivityActualEnd(String factActivityActualEnd) {
        this.factActivityActualEnd = factActivityActualEnd;
    }

    public String getFactActivityCreatedOn() {
        return factActivityCreatedOn;
    }

    public void setFactActivityCreatedOn(String factActivityCreatedOn) {
        this.factActivityCreatedOn = factActivityCreatedOn;
    }

    public String getFactActivityModifiedOn() {
        return factActivityModifiedOn;
    }

    public void setFactActivityModifiedOn(String factActivityModifiedOn) {
        this.factActivityModifiedOn = factActivityModifiedOn;
    }

    public String getFactActivityState() {
        return factActivityState;
    }

    public void setFactActivityState(String factActivityState) {
        this.factActivityState = factActivityState;
    }

    public String getFactActivityCampaignActivityKey() {
        return factActivityCampaignActivityKey;
    }

    public void setFactActivityCampaignActivityKey(String factActivityCampaignActivityKey) {
        this.factActivityCampaignActivityKey = factActivityCampaignActivityKey;
    }

    public String getFactActivityDescription() {
        return factActivityDescription;
    }

    public void setFactActivityDescription(String factActivityDescription) {
        this.factActivityDescription = factActivityDescription;
    }

    public String getFactActivitySubject() {
        return factActivitySubject;
    }

    public void setFactActivitySubject(String factActivitySubject) {
        this.factActivitySubject = factActivitySubject;
    }

    public String getFactActivitySource() {
        return factActivitySource;
    }

    public void setFactActivitySource(String factActivitySource) {
        this.factActivitySource = factActivitySource;
    }

    public String getFactActivityCampaignKey() {
        return factActivityCampaignKey;
    }

    public void setFactActivityCampaignKey(String factActivityCampaignKey) {
        this.factActivityCampaignKey = factActivityCampaignKey;
    }
}
