package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 22.07.17.
 */

/*
* "ID";"CODE";"ACCOUNT_NO";"CustomerKey_Account";
* "CustomerKey_Card";"CARD_TYPE";"DETAILED_CARD_TYPE";
* "ISSUE_DATE";"CONTRACT_CREATE_DATE";"CARD_END_DATE";
* "VALID_THRU_DATE";"IS_MAIN_CARD";"PAYMENT_SYSTEM";
* "HAS_SMS_NOTICE";"HAS_EMAIL_NOTICE";"REISSUE_CARD";
* "STATUS";"STATE"
* */

@Entity
@Table(name = "FACT_DL_CARDS")
public class FactDLCards {

    @Id
    @Column(name = "FACT_DL_CARDS_ID")
    private String factCardsId;

    @Column(name = "FACT_ACCOUNT_NO")
    private String factAccountNo;

    @Column(name = "FACT_CUSTOMER_KEY_ACCOUNT")
    private String factCustomerKeyAccount;

    @Column(name = "FACT_CUSTOMER_KEY_CARD")
    private String factCustomerKeyCard;

    @Column(name = "FACT_CARD_TYPE")
    private String factCardType;

    @Column(name = "FACT_DETAILED_CARD_TYPE")
    private String factDetailedCardType;

    @Column(name = "FACT_ISSUE_DATE")
    private String factIssueDate;

    @Column(name = "FACT_CONTRACT_CREATE_DATE")
    private String factContractCreateDate;

    @Column(name = "FACT_CARD_END_DATE")
    private String factCardEndDate;

    @Column(name = "FACT_VALID_THRU_DATE")
    private String factValidThruDate;

    @Column(name = "FACT_IS_MAIN_CARD")
    private String factIsMainCard;

    @Column(name = "FACT_PAYMENT_SYSTEM")
    private String factPaymentSystem;

    @Column(name = "FACT_HAS_SMS_NOTICE")
    private String factHasSmsNotice;

    @Column(name = "FACT_HAS_EMAIL_NOTICE")
    private String factHasEmailNotice;

    @Column(name = "FACT_REISSUE_CARD")
    private String factReissueCard;

    @Column(name = "FACT_STATUS")
    private String factStatus;

    @Column(name = "FACT_STATE")
    private String factState;

    public String getFactCardsId() {
        return factCardsId;
    }

    public void setFactCardsId(String factCardsId) {
        this.factCardsId = factCardsId;
    }

    public String getFactAccountNo() {
        return factAccountNo;
    }

    public void setFactAccountNo(String factAccountNo) {
        this.factAccountNo = factAccountNo;
    }

    public String getFactCustomerKeyAccount() {
        return factCustomerKeyAccount;
    }

    public void setFactCustomerKeyAccount(String factCustomerKeyAccount) {
        this.factCustomerKeyAccount = factCustomerKeyAccount;
    }

    public String getFactCustomerKeyCard() {
        return factCustomerKeyCard;
    }

    public void setFactCustomerKeyCard(String factCustomerKeyCard) {
        this.factCustomerKeyCard = factCustomerKeyCard;
    }

    public String getFactCardType() {
        return factCardType;
    }

    public void setFactCardType(String factCardType) {
        this.factCardType = factCardType;
    }

    public String getFactDetailedCardType() {
        return factDetailedCardType;
    }

    public void setFactDetailedCardType(String factDetailedCardType) {
        this.factDetailedCardType = factDetailedCardType;
    }

    public String getFactIssueDate() {
        return factIssueDate;
    }

    public void setFactIssueDate(String factIssueDate) {
        this.factIssueDate = factIssueDate;
    }

    public String getFactContractCreateDate() {
        return factContractCreateDate;
    }

    public void setFactContractCreateDate(String factContractCreateDate) {
        this.factContractCreateDate = factContractCreateDate;
    }

    public String getFactCardEndDate() {
        return factCardEndDate;
    }

    public void setFactCardEndDate(String factCardEndDate) {
        this.factCardEndDate = factCardEndDate;
    }

    public String getFactValidThruDate() {
        return factValidThruDate;
    }

    public void setFactValidThruDate(String factValidThruDate) {
        this.factValidThruDate = factValidThruDate;
    }

    public String getFactIsMainCard() {
        return factIsMainCard;
    }

    public void setFactIsMainCard(String factIsMainCard) {
        this.factIsMainCard = factIsMainCard;
    }

    public String getFactPaymentSystem() {
        return factPaymentSystem;
    }

    public void setFactPaymentSystem(String factPaymentSystem) {
        this.factPaymentSystem = factPaymentSystem;
    }

    public String getFactHasSmsNotice() {
        return factHasSmsNotice;
    }

    public void setFactHasSmsNotice(String factHasSmsNotice) {
        this.factHasSmsNotice = factHasSmsNotice;
    }

    public String getFactHasEmailNotice() {
        return factHasEmailNotice;
    }

    public void setFactHasEmailNotice(String factHasEmailNotice) {
        this.factHasEmailNotice = factHasEmailNotice;
    }

    public String getFactReissueCard() {
        return factReissueCard;
    }

    public void setFactReissueCard(String factReissueCard) {
        this.factReissueCard = factReissueCard;
    }

    public String getFactStatus() {
        return factStatus;
    }

    public void setFactStatus(String factStatus) {
        this.factStatus = factStatus;
    }

    public String getFactState() {
        return factState;
    }

    public void setFactState(String factState) {
        this.factState = factState;
    }
}
