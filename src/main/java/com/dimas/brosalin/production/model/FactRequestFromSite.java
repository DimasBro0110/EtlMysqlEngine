package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

/*
* "Customerkey";"createdon";"mcs_amount";"mcs_urlrequestfromsite"
* */

@Entity
@Table(name = "FACT_REQUEST_FROM_SITE")
public class FactRequestFromSite {

    @Id
    @Column(name = "FACT_REQUEST_CUSTOMER_KEY")
    private String factRequestCustomerKey;

    @Column(name = "FACT_REQUEST_CREATE_ON")
    private String factRequestCreateDon;

    @Column(name = "FACT_REQUEST_MSC_AMOUNT")
    private String factRequestMscAmount;

    @Lob
    @Column(name = "FACT_REQUEST_MCS_URL_REQUEST_FROM_SITE")
    private String factRequestMcsUrlRequestFromSite;

    public String getFactRequestCustomerKey() {
        return factRequestCustomerKey;
    }

    public void setFactRequestCustomerKey(String factRequestCustomerKey) {
        this.factRequestCustomerKey = factRequestCustomerKey;
    }

    public String getFactRequestCreateDon() {
        return factRequestCreateDon;
    }

    public void setFactRequestCreateDon(String factRequestCreateDon) {
        this.factRequestCreateDon = factRequestCreateDon;
    }

    public String getFactRequestMscAmount() {
        return factRequestMscAmount;
    }

    public void setFactRequestMscAmount(String factRequestMscAmount) {
        this.factRequestMscAmount = factRequestMscAmount;
    }

    public String getFactRequestMcsUrlRequestFromSite() {
        return factRequestMcsUrlRequestFromSite;
    }

    public void setFactRequestMcsUrlRequestFromSite(String factRequestMcsUrlRequestFromSite) {
        this.factRequestMcsUrlRequestFromSite = factRequestMcsUrlRequestFromSite;
    }
}
