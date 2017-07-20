package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

/*
* "ProductRequestKey";"CustomerKey";"SalesChannel";
* "SellingToolName";"ProductKey";"CreatedOn";
* "Rate";"Value";"CurrencyName";
* "CustomerIntelegentOpportunityKey";"StageName";"RefusalReason";
* "DateStage0";"DateStage1";"DateStage2";
* "DateStage3";"DateStage4";"DateStage5";
* "DateStage6"
* */

@Entity
@Table(name = "FACT_PRODUCT_REQUEST")
public class FactProductRequest {

    @Id
    @Column(name = "FACT_PRODUCT_REQUEST_KEY")
    private String factProductRequestKey;

    @Column(name = "FACT_CUSTOMER_KEY")
    private String factCustomerKey;

    @Column(name = "FACT_SALES_CHANNEL")
    private String factSalesChannel;

    @Column(name = "FACT_SELLING_TOOL_NAME")
    private String factSellingToolName;

    @Column(name = "FACT_PRODUCT_KEY")
    private String factProductKey;

    @Column(name = "FACT_CREATED_ON")
    private String factCreatedOn;

    @Column(name = "FACT_RATE")
    private String factRate;

    @Column(name = "FACT_VALUE")
    private String factValue;

    @Column(name = "FACT_CURRENCY_NAME")
    private String factCurrencyName;

    @Column(name = "FACT_CUSTOMER_INTELLIGENT_OPPORTUNITY_KEY")
    private String factCustomerIntelegentOpportunityKey;

    @Column(name = "FACT_STAGE_NAME")
    private String factStageName;

    @Column(name = "FACT_REFUSAL_NAME")
    private String factRefusalName;

    @Column(name = "FACT_DATE_STAGE_0")
    private String factDateStage0;

    @Column(name = "FACT_DATE_STAGE_1")
    private String factDateStage1;

    @Column(name = "FACT_DATE_STAGE_2")
    private String factDateStage2;

    @Column(name = "FACT_DATE_STAGE_3")
    private String factDateStage3;

    @Column(name = "FACT_DATE_STAGE_4")
    private String factDateStage4;

    @Column(name = "FACT_DATE_STAGE_5")
    private String factDateStage5;

    @Column(name = "FACT_DATE_STAGE_6")
    private String factDateStage6;

    public String getFactProductRequestKey() {
        return factProductRequestKey;
    }

    public void setFactProductRequestKey(String factProductRequestKey) {
        this.factProductRequestKey = factProductRequestKey;
    }

    public String getFactCustomerKey() {
        return factCustomerKey;
    }

    public void setFactCustomerKey(String factCustomerKey) {
        this.factCustomerKey = factCustomerKey;
    }

    public String getFactSalesChannel() {
        return factSalesChannel;
    }

    public void setFactSalesChannel(String factSalesChannel) {
        this.factSalesChannel = factSalesChannel;
    }

    public String getFactSellingToolName() {
        return factSellingToolName;
    }

    public void setFactSellingToolName(String factSellingToolName) {
        this.factSellingToolName = factSellingToolName;
    }

    public String getFactProductKey() {
        return factProductKey;
    }

    public void setFactProductKey(String factProductKey) {
        this.factProductKey = factProductKey;
    }

    public String getFactCreatedOn() {
        return factCreatedOn;
    }

    public void setFactCreatedOn(String factCreatedOn) {
        this.factCreatedOn = factCreatedOn;
    }

    public String getFactRate() {
        return factRate;
    }

    public void setFactRate(String factRate) {
        this.factRate = factRate;
    }

    public String getFactValue() {
        return factValue;
    }

    public void setFactValue(String factValue) {
        this.factValue = factValue;
    }

    public String getFactCurrencyName() {
        return factCurrencyName;
    }

    public void setFactCurrencyName(String factCurrencyName) {
        this.factCurrencyName = factCurrencyName;
    }

    public String getFactCustomerIntelegentOpportunityKey() {
        return factCustomerIntelegentOpportunityKey;
    }

    public void setFactCustomerIntelegentOpportunityKey(String factCustomerIntelegentOpportunityKey) {
        this.factCustomerIntelegentOpportunityKey = factCustomerIntelegentOpportunityKey;
    }

    public String getFactStageName() {
        return factStageName;
    }

    public void setFactStageName(String factStageName) {
        this.factStageName = factStageName;
    }

    public String getFactRefusalName() {
        return factRefusalName;
    }

    public void setFactRefusalName(String factRefusalName) {
        this.factRefusalName = factRefusalName;
    }

    public String getFactDateStage0() {
        return factDateStage0;
    }

    public void setFactDateStage0(String factDateStage0) {
        this.factDateStage0 = factDateStage0;
    }

    public String getFactDateStage1() {
        return factDateStage1;
    }

    public void setFactDateStage1(String factDateStage1) {
        this.factDateStage1 = factDateStage1;
    }

    public String getFactDateStage2() {
        return factDateStage2;
    }

    public void setFactDateStage2(String factDateStage2) {
        this.factDateStage2 = factDateStage2;
    }

    public String getFactDateStage3() {
        return factDateStage3;
    }

    public void setFactDateStage3(String factDateStage3) {
        this.factDateStage3 = factDateStage3;
    }

    public String getFactDateStage4() {
        return factDateStage4;
    }

    public void setFactDateStage4(String factDateStage4) {
        this.factDateStage4 = factDateStage4;
    }

    public String getFactDateStage5() {
        return factDateStage5;
    }

    public void setFactDateStage5(String factDateStage5) {
        this.factDateStage5 = factDateStage5;
    }

    public String getFactDateStage6() {
        return factDateStage6;
    }

    public void setFactDateStage6(String factDateStage6) {
        this.factDateStage6 = factDateStage6;
    }
}
