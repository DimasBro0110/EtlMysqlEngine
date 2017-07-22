package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 22.07.17.
 */

@Entity
@Table(name = "DIM_CAMPAIGN")
public class DimCampaign {

    @Id
    @Column(name = "DIM_CAMPAIGN_KEY")
    private String dimCampaignKey;

    @Column(name = "DIM_CAMPAIGN_NAME")
    private String dimCampaignName;

    @Column(name = "DIM_CAMPAIGN_STATE")
    private String dimCampaignState;

    @Column(name = "DIM_CAMPAIGN_TYPE")
    private String dimCampaignType;

    @Column(name = "DIM_CAMPAIGN_ACTUAL_START")
    private String dimCampaignActualStart;

    @Column(name = "DIM_CAMPAIGN_PRODUCT_SUBGROUP_KEY")
    private String dimCampaignProductSubgroupKey;

    @Column(name = "DIM_CAMPAIGN_OUTGOING_CALL")
    private String dimCampaignOutgoingCall;

    @Column(name = "DIM_CAMPAIGN_SMS_CHANNEL")
    private String dimCampaignSmsChannel;

    @Column(name = "DIM_CAMPAIGN_CALL_CHANNEL")
    private String dimCampaignCallChannel;

    @Column(name = "DIM_CAMPAIGN_CRM_HINT_CHANNEL")
    private String dimCampaignCrmHintChannel;

    @Column(name = "DIM_CAMPAIGN_EMAIL_CHANNEL")
    private String dimCampaignEmailChannel;

    @Column(name = "DIM_CAMPAIGN_INTERNET_BANK_CHANNEL")
    private String dimCampaignInternetBankChannel;

    @Column(name = "DIM_CAMPAIGN_ATM_CHANNEL")
    private String dimCampaignAtmChannel;

    @Column(name = "DIM_CAMPAIGN_OPPORTUNITY_CHANNEL")
    private String dimCampaignOpportunityChannel;

    @Column(name = "DIM_CAMPAIGN_LETTER_CHANNEL")
    private String dimCampaignLetterChannel;

    @Column(name = "DIM_CAMPAIGN_TEMPLATE_PRODUCT_KEY")
    private String dimCampaignTemplateProductKey;

    @Column(name = "DIM_CAMPAIGN_TEMPLATE_PRODUCT_SUBGROUP_KEY")
    private String getDimCampaignTemplateProductSubgroupKey;

    public String getDimCampaignKey() {
        return dimCampaignKey;
    }

    public void setDimCampaignKey(String dimCampaignKey) {
        this.dimCampaignKey = dimCampaignKey;
    }

    public String getDimCampaignName() {
        return dimCampaignName;
    }

    public void setDimCampaignName(String dimCampaignName) {
        this.dimCampaignName = dimCampaignName;
    }

    public String getDimCampaignState() {
        return dimCampaignState;
    }

    public void setDimCampaignState(String dimCampaignState) {
        this.dimCampaignState = dimCampaignState;
    }

    public String getDimCampaignType() {
        return dimCampaignType;
    }

    public void setDimCampaignType(String dimCampaignType) {
        this.dimCampaignType = dimCampaignType;
    }

    public String getDimCampaignActualStart() {
        return dimCampaignActualStart;
    }

    public void setDimCampaignActualStart(String dimCampaignActualStart) {
        this.dimCampaignActualStart = dimCampaignActualStart;
    }

    public String getDimCampaignProductSubgroupKey() {
        return dimCampaignProductSubgroupKey;
    }

    public void setDimCampaignProductSubgroupKey(String dimCampaignProductSubgroupKey) {
        this.dimCampaignProductSubgroupKey = dimCampaignProductSubgroupKey;
    }

    public String getDimCampaignOutgoingCall() {
        return dimCampaignOutgoingCall;
    }

    public void setDimCampaignOutgoingCall(String dimCampaignOutgoingCall) {
        this.dimCampaignOutgoingCall = dimCampaignOutgoingCall;
    }

    public String getDimCampaignSmsChannel() {
        return dimCampaignSmsChannel;
    }

    public void setDimCampaignSmsChannel(String dimCampaignSmsChannel) {
        this.dimCampaignSmsChannel = dimCampaignSmsChannel;
    }

    public String getDimCampaignCallChannel() {
        return dimCampaignCallChannel;
    }

    public void setDimCampaignCallChannel(String dimCampaignCallChannel) {
        this.dimCampaignCallChannel = dimCampaignCallChannel;
    }

    public String getDimCampaignCrmHintChannel() {
        return dimCampaignCrmHintChannel;
    }

    public void setDimCampaignCrmHintChannel(String dimCampaignCrmHintChannel) {
        this.dimCampaignCrmHintChannel = dimCampaignCrmHintChannel;
    }

    public String getDimCampaignEmailChannel() {
        return dimCampaignEmailChannel;
    }

    public void setDimCampaignEmailChannel(String dimCampaignEmailChannel) {
        this.dimCampaignEmailChannel = dimCampaignEmailChannel;
    }

    public String getDimCampaignInternetBankChannel() {
        return dimCampaignInternetBankChannel;
    }

    public void setDimCampaignInternetBankChannel(String dimCampaignInternetBankChannel) {
        this.dimCampaignInternetBankChannel = dimCampaignInternetBankChannel;
    }

    public String getDimCampaignAtmChannel() {
        return dimCampaignAtmChannel;
    }

    public void setDimCampaignAtmChannel(String dimCampaignAtmChannel) {
        this.dimCampaignAtmChannel = dimCampaignAtmChannel;
    }

    public String getDimCampaignOpportunityChannel() {
        return dimCampaignOpportunityChannel;
    }

    public void setDimCampaignOpportunityChannel(String dimCampaignOpportunityChannel) {
        this.dimCampaignOpportunityChannel = dimCampaignOpportunityChannel;
    }

    public String getDimCampaignLetterChannel() {
        return dimCampaignLetterChannel;
    }

    public void setDimCampaignLetterChannel(String dimCampaignLetterChannel) {
        this.dimCampaignLetterChannel = dimCampaignLetterChannel;
    }

    public String getDimCampaignTemplateProductKey() {
        return dimCampaignTemplateProductKey;
    }

    public void setDimCampaignTemplateProductKey(String dimCampaignTemplateProductKey) {
        this.dimCampaignTemplateProductKey = dimCampaignTemplateProductKey;
    }

    public String getGetDimCampaignTemplateProductSubgroupKey() {
        return getDimCampaignTemplateProductSubgroupKey;
    }

    public void setGetDimCampaignTemplateProductSubgroupKey(String getDimCampaignTemplateProductSubgroupKey) {
        this.getDimCampaignTemplateProductSubgroupKey = getDimCampaignTemplateProductSubgroupKey;
    }
}
