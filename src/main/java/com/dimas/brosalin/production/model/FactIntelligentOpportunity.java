package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_INTELLIGENT_OPPORTUNITY")
public class FactIntelligentOpportunity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_INTELLIGENT_OPPORTUNITY_KEY")
    private String factIntelligentOpportunityKey;

    @Column(name = "FACT_INTELLIGENT_SUBJECT")
    private String factIntelligentSubject;

    @Column(name = "FACT_INTELLIGENT_STATUS")
    private String factIntelligentStatus;

    @Column(name = "FACT_INTELLIGENT_END_DATE")
    private String factIntelligentEndDate;

    @Column(name = "FACT_INTELLIGENT_IS_DISPLAY_TO_MANAGER")
    private String factIntelligentIsDisplayToManager;

    @Column(name = "FACT_INTELLIGENT_FOR_INTERNET_BANK_TYPE")
    private String factIntelligentForInternetBankType;

    @Column(name = "FACT_INTELLIGENT_REFUSAL_REASON")
    private String factIntelligentRefusalReason;

    @Column(name = "FACT_INTELLIGENT_CUSTOMER_KEY")
    private String factIntelligentCustomerKey;

    @Column(name = "FACT_INTELLIGENT_CAMPAIGN_KEY")
    private String factIntelligentCampaignKey;

    @Column(name = "FACT_INTELLIGENT_MODIFIED_ON")
    private String factIntelligentModifiedOn;

    @Column(name = "FACT_INTELLIGENT_SELLING_TOOL_NAME")
    private String factIntelligentSellingToolName;

    @Column(name = "FACT_INTELLIGENT_CAMPAIGN_ACTIVITY_KEY")
    private String factIntelligentCampaignActivityKey;

    @Column(name = "FACT_INTELLIGENT_DISPLAY_ON_ATM_TYPE")
    private String factIntelligentDisplayOnAtmType;

    @Column(name = "FACT_INTELLIGENT_PRESSED_MORE")
    private String factIntelligentPressedMore;

    @Column(name = "FACT_INTELLIGENT_PRESSED_NOT_NOW")
    private String factIntelligentPressedNotNow;

    @Column(name = "FACT_INTELLIGENT_BANNER_DISPLAYED")
    private String factIntelligentBannerDisplayed;

    public String getFactIntelligentOpportunityKey() {
        return factIntelligentOpportunityKey;
    }

    public void setFactIntelligentOpportunityKey(String factIntelligentOpportunityKey) {
        this.factIntelligentOpportunityKey = factIntelligentOpportunityKey;
    }

    public String getFactIntelligentSubject() {
        return factIntelligentSubject;
    }

    public void setFactIntelligentSubject(String factIntelligentSubject) {
        this.factIntelligentSubject = factIntelligentSubject;
    }

    public String getFactIntelligentStatus() {
        return factIntelligentStatus;
    }

    public void setFactIntelligentStatus(String factIntelligentStatus) {
        this.factIntelligentStatus = factIntelligentStatus;
    }

    public String getFactIntelligentEndDate() {
        return factIntelligentEndDate;
    }

    public void setFactIntelligentEndDate(String factIntelligentEndDate) {
        this.factIntelligentEndDate = factIntelligentEndDate;
    }

    public String getFactIntelligentIsDisplayToManager() {
        return factIntelligentIsDisplayToManager;
    }

    public void setFactIntelligentIsDisplayToManager(String factIntelligentIsDisplayToManager) {
        this.factIntelligentIsDisplayToManager = factIntelligentIsDisplayToManager;
    }

    public String getFactIntelligentForInternetBankType() {
        return factIntelligentForInternetBankType;
    }

    public void setFactIntelligentForInternetBankType(String factIntelligentForInternetBankType) {
        this.factIntelligentForInternetBankType = factIntelligentForInternetBankType;
    }

    public String getFactIntelligentRefusalReason() {
        return factIntelligentRefusalReason;
    }

    public void setFactIntelligentRefusalReason(String factIntelligentRefusalReason) {
        this.factIntelligentRefusalReason = factIntelligentRefusalReason;
    }

    public String getFactIntelligentCustomerKey() {
        return factIntelligentCustomerKey;
    }

    public void setFactIntelligentCustomerKey(String factIntelligentCustomerKey) {
        this.factIntelligentCustomerKey = factIntelligentCustomerKey;
    }

    public String getFactIntelligentCampaignKey() {
        return factIntelligentCampaignKey;
    }

    public void setFactIntelligentCampaignKey(String factIntelligentCampaignKey) {
        this.factIntelligentCampaignKey = factIntelligentCampaignKey;
    }

    public String getFactIntelligentModifiedOn() {
        return factIntelligentModifiedOn;
    }

    public void setFactIntelligentModifiedOn(String factIntelligentModifiedOn) {
        this.factIntelligentModifiedOn = factIntelligentModifiedOn;
    }

    public String getFactIntelligentSellingToolName() {
        return factIntelligentSellingToolName;
    }

    public void setFactIntelligentSellingToolName(String factIntelligentSellingToolName) {
        this.factIntelligentSellingToolName = factIntelligentSellingToolName;
    }

    public String getFactIntelligentCampaignActivityKey() {
        return factIntelligentCampaignActivityKey;
    }

    public void setFactIntelligentCampaignActivityKey(String factIntelligentCampaignActivityKey) {
        this.factIntelligentCampaignActivityKey = factIntelligentCampaignActivityKey;
    }

    public String getFactIntelligentDisplayOnAtmType() {
        return factIntelligentDisplayOnAtmType;
    }

    public void setFactIntelligentDisplayOnAtmType(String factIntelligentDisplayOnAtmType) {
        this.factIntelligentDisplayOnAtmType = factIntelligentDisplayOnAtmType;
    }

    public String getFactIntelligentPressedMore() {
        return factIntelligentPressedMore;
    }

    public void setFactIntelligentPressedMore(String factIntelligentPressedMore) {
        this.factIntelligentPressedMore = factIntelligentPressedMore;
    }

    public String getFactIntelligentPressedNotNow() {
        return factIntelligentPressedNotNow;
    }

    public void setFactIntelligentPressedNotNow(String factIntelligentPressedNotNow) {
        this.factIntelligentPressedNotNow = factIntelligentPressedNotNow;
    }

    public String getFactIntelligentBannerDisplayed() {
        return factIntelligentBannerDisplayed;
    }

    public void setFactIntelligentBannerDisplayed(String factIntelligentBannerDisplayed) {
        this.factIntelligentBannerDisplayed = factIntelligentBannerDisplayed;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
