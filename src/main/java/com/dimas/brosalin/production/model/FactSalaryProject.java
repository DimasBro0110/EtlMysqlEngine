package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 23.07.17.
 */

/*
* "PROJECT_CFTID";"STATUS";"LISTTYPE";
* "DATEBEGIN";"DATECLOSE";"Name";
* "ACCEPTDATE";"DISCHARGEDATE";"CustomerKey";
* "CARDID";"CUR";"ACCNUM"
* */

@Entity
@Table(name = "FACT_SALARY_PROJECT")
public class FactSalaryProject {

    @Id
    @Column(name = "FACT_PROJECT_CFTID")
    private String factProjectCftid;

    @Column(name = "FACT_STATUS")
    private String factStatus;

    @Column(name = "FACT_LIST_TYPE")
    private String factListType;

    @Column(name = "FACT_DATE_BEGIN")
    private String factDateBegin;

    @Column(name = "DACT_DATE_CLOSE")
    private String factDateClose;

    @Column(name = "FACT_NAME")
    private String factName;

    @Column(name = "FACT_ACCEPT_DATE")
    private String factAcceptDate;

    @Column(name = "FACT_DISCHARGE_DATE")
    private String factDischargeDate;

    @Column(name = "FACT_CUSTOMER_KEY")
    private String factCustomerKey;

    @Column(name = "FACR_CARD_ID")
    private String factCardId;

    @Column(name = "FACT_CUR")
    private String factCur;

    @Column(name = "FACT_ACC_NUM")
    private String factAccNum;

    public String getFactProjectCftid() {
        return factProjectCftid;
    }

    public void setFactProjectCftid(String factProjectCftid) {
        this.factProjectCftid = factProjectCftid;
    }

    public String getFactStatus() {
        return factStatus;
    }

    public void setFactStatus(String factStatus) {
        this.factStatus = factStatus;
    }

    public String getFactListType() {
        return factListType;
    }

    public void setFactListType(String factListType) {
        this.factListType = factListType;
    }

    public String getFactDateBegin() {
        return factDateBegin;
    }

    public void setFactDateBegin(String factDateBegin) {
        this.factDateBegin = factDateBegin;
    }

    public String getFactDateClose() {
        return factDateClose;
    }

    public void setFactDateClose(String factDateClose) {
        this.factDateClose = factDateClose;
    }

    public String getFactName() {
        return factName;
    }

    public void setFactName(String factName) {
        this.factName = factName;
    }

    public String getFactAcceptDate() {
        return factAcceptDate;
    }

    public void setFactAcceptDate(String factAcceptDate) {
        this.factAcceptDate = factAcceptDate;
    }

    public String getFactDischargeDate() {
        return factDischargeDate;
    }

    public void setFactDischargeDate(String factDischargeDate) {
        this.factDischargeDate = factDischargeDate;
    }

    public String getFactCustomerKey() {
        return factCustomerKey;
    }

    public void setFactCustomerKey(String factCustomerKey) {
        this.factCustomerKey = factCustomerKey;
    }

    public String getFactCardId() {
        return factCardId;
    }

    public void setFactCardId(String factCardId) {
        this.factCardId = factCardId;
    }

    public String getFactCur() {
        return factCur;
    }

    public void setFactCur(String factCur) {
        this.factCur = factCur;
    }

    public String getFactAccNum() {
        return factAccNum;
    }

    public void setFactAccNum(String factAccNum) {
        this.factAccNum = factAccNum;
    }
}
