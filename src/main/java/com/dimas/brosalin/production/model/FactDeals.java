package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */
/*
"DealKey";"CustomerKey";"ProductKey";"ActualStartDate";
"ActualEndDate";"ScheduledEndDate";"Rate";
"Value";"InitialAmountBase";"CurrencyName";
"ProductRequestKey";"DealStatus";"IsDesignDBO";
"CreatedOn";"CFTNumber"
 */

@Entity
@Table(name = "FACT_DEALS")
public class FactDeals {

    @Id
    @Column(name = "FACT_DEALS_KEY")
    private String factDealsKey;

    @Column(name = "FACT_DEALS_CUSTOMER_KEY")
    private String factDealsCustomerKey;

    @Column(name = "FACT_DEALS_PRODUCT_KEY")
    private String factDealsProductKey;

    @Column(name = "FACT_DEALS_ACTUAL_START_DATE")
    private String factDealsActualStartDate;

    @Column(name = "FACT_DEALS_ACTUAL_END_DATE")
    private String factDealsActualEndDate;

    @Column(name = "FACT_DEALS_SCHEDULED_END_DATE")
    private String factDealsScheduledEndDate;

    @Column(name = "FACT_DEALS_RATE")
    private String factDealsRate;

    @Column(name = "FACT_DEALS_VALUE")
    private String factDealsValue;

    @Column(name = "FACT_DEALS_INITIAL_AMOUNT_BASE")
    private String factDealsInitialAmountBase;

    @Column(name = "FACT_DEALS_CURRENCY_NAME")
    private String factDealsCurrencyName;

    @Column(name = "FACT_DEALS_PRODUCT_REQUEST_KEY")
    private String factDealsProductRequestKey;

    @Column(name = "FACT_DEALS_DEAL_STATUS")
    private String factDealsDealStatus;

    @Column(name = "FACT_DEALS_IS_DESIGNED_DBO")
    private String factDealsIsDesignDbo;

    @Column(name = "FACT_DEALS_CREATED_ON")
    private String factDealsCreatedOn;

    @Column(name = "FACT_DEALS_CFT_NUMBER")
    private String factDealsCftNumber;

    public String getFactDealsKey() {
        return factDealsKey;
    }

    public void setFactDealsKey(String factDealsKey) {
        this.factDealsKey = factDealsKey;
    }

    public String getFactDealsCustomerKey() {
        return factDealsCustomerKey;
    }

    public void setFactDealsCustomerKey(String factDealsCustomerKey) {
        this.factDealsCustomerKey = factDealsCustomerKey;
    }

    public String getFactDealsProductKey() {
        return factDealsProductKey;
    }

    public void setFactDealsProductKey(String factDealsProductKey) {
        this.factDealsProductKey = factDealsProductKey;
    }

    public String getFactDealsActualStartDate() {
        return factDealsActualStartDate;
    }

    public void setFactDealsActualStartDate(String factDealsActualStartDate) {
        this.factDealsActualStartDate = factDealsActualStartDate;
    }

    public String getFactDealsActualEndDate() {
        return factDealsActualEndDate;
    }

    public void setFactDealsActualEndDate(String factDealsActualEndDate) {
        this.factDealsActualEndDate = factDealsActualEndDate;
    }

    public String getFactDealsScheduledEndDate() {
        return factDealsScheduledEndDate;
    }

    public void setFactDealsScheduledEndDate(String factDealsScheduledEndDate) {
        this.factDealsScheduledEndDate = factDealsScheduledEndDate;
    }

    public String getFactDealsRate() {
        return factDealsRate;
    }

    public void setFactDealsRate(String factDealsRate) {
        this.factDealsRate = factDealsRate;
    }

    public String getFactDealsValue() {
        return factDealsValue;
    }

    public void setFactDealsValue(String factDealsValue) {
        this.factDealsValue = factDealsValue;
    }

    public String getFactDealsInitialAmountBase() {
        return factDealsInitialAmountBase;
    }

    public void setFactDealsInitialAmountBase(String factDealsInitialAmountBase) {
        this.factDealsInitialAmountBase = factDealsInitialAmountBase;
    }

    public String getFactDealsCurrencyName() {
        return factDealsCurrencyName;
    }

    public void setFactDealsCurrencyName(String factDealsCurrencyName) {
        this.factDealsCurrencyName = factDealsCurrencyName;
    }

    public String getFactDealsProductRequestKey() {
        return factDealsProductRequestKey;
    }

    public void setFactDealsProductRequestKey(String factDealsProductRequestKey) {
        this.factDealsProductRequestKey = factDealsProductRequestKey;
    }

    public String getFactDealsDealStatus() {
        return factDealsDealStatus;
    }

    public void setFactDealsDealStatus(String factDealsDealStatus) {
        this.factDealsDealStatus = factDealsDealStatus;
    }

    public String getFactDealsIsDesignDbo() {
        return factDealsIsDesignDbo;
    }

    public void setFactDealsIsDesignDbo(String factDealsIsDesignDbo) {
        this.factDealsIsDesignDbo = factDealsIsDesignDbo;
    }

    public String getFactDealsCreatedOn() {
        return factDealsCreatedOn;
    }

    public void setFactDealsCreatedOn(String factDealsCreatedOn) {
        this.factDealsCreatedOn = factDealsCreatedOn;
    }

    public String getFactDealsCftNumber() {
        return factDealsCftNumber;
    }

    public void setFactDealsCftNumber(String factDealsCftNumber) {
        this.factDealsCftNumber = factDealsCftNumber;
    }
}
