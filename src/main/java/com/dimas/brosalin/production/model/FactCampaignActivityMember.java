package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 22.07.17.
 */

/*
* CampaignActivityMemberKey;CampaignActivityKey;CustomerKey
* */

@Entity
@Table(name = "FACT_CAMPAIGN_ACTIVITY_MEMBER")
public class FactCampaignActivityMember {

    @Id
    @Column(name = "FACT_CAMPAIGN_ACTIVITY_MEMBER")
    private String factCampaignActivityMember;

    @Column(name = "FACT_CAMPAIGN_ACTIVITY_KEY")
    private String factCampaignActivityKey;

    @Column(name = "FACT_CUSTOMER_KEY")
    private String factCustomerKey;

    public String getFactCampaignActivityMember() {
        return factCampaignActivityMember;
    }

    public void setFactCampaignActivityMember(String factCampaignActivityMember) {
        this.factCampaignActivityMember = factCampaignActivityMember;
    }

    public String getFactCampaignActivityKey() {
        return factCampaignActivityKey;
    }

    public void setFactCampaignActivityKey(String factCampaignActivityKey) {
        this.factCampaignActivityKey = factCampaignActivityKey;
    }

    public String getFactCustomerKey() {
        return factCustomerKey;
    }

    public void setFactCustomerKey(String factCustomerKey) {
        this.factCustomerKey = factCustomerKey;
    }
}
