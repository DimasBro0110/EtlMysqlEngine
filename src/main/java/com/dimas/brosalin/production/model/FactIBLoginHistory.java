package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

/*
* "CustomerKey";"DTIME";"USERAGENT";"AUTHTYPE";"REQUESTERCHANNEL";"COUNTRYCODE"
* */

@Entity
@Table(name = "FACT_IB_LOGIN_HISTORY")
public class FactIBLoginHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_IB_CUSTOMER_KEY")
    private String factIbCustomerKey;

    @Column(name = "FACT_IB_DTIME")
    private String factIbDtime;

    @Column(name = "FACT_IB_USER_AGENT")
    private String factIbUserAgent;

    @Column(name = "FACT_IB_AUTH_TYPE")
    private String factIbAuthType;

    @Column(name = "FACT_IB_REQUSTER_CHANNEL")
    private String factIbRequesterChannel;

    @Column(name = "FACT_IB_COUNTRY_CODE")
    private String factIbCountryCode;

    public String getFactIbCustomerKey() {
        return factIbCustomerKey;
    }

    public void setFactIbCustomerKey(String factIbCustomerKey) {
        this.factIbCustomerKey = factIbCustomerKey;
    }

    public String getFactIbDtime() {
        return factIbDtime;
    }

    public void setFactIbDtime(String factIbDtime) {
        this.factIbDtime = factIbDtime;
    }

    public String getFactIbUserAgent() {
        return factIbUserAgent;
    }

    public void setFactIbUserAgent(String factIbUserAgent) {
        this.factIbUserAgent = factIbUserAgent;
    }

    public String getFactIbAuthType() {
        return factIbAuthType;
    }

    public void setFactIbAuthType(String factIbAuthType) {
        this.factIbAuthType = factIbAuthType;
    }

    public String getFactIbRequesterChannel() {
        return factIbRequesterChannel;
    }

    public void setFactIbRequesterChannel(String factIbRequesterChannel) {
        this.factIbRequesterChannel = factIbRequesterChannel;
    }

    public String getFactIbCountryCode() {
        return factIbCountryCode;
    }

    public void setFactIbCountryCode(String factIbCountryCode) {
        this.factIbCountryCode = factIbCountryCode;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
