package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_TRANSACTIONS_CDW")
public class FactTransactions_CDW {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_TRANSACTION_ID")
    private String factTransactionId;

    @Column(name = "FACT_TRANSACTION_DATE")
    private String factTransactionDate;

    @Column(name = "FACT_TRANSACTION_ACC_NO_DEBIT")
    private String factTransactionAccNoDebit;

    @Column(name = "FACT_TRANSACTION_CUSTOMER_KEY_DEBIT")
    private String factTransactionCustomerKeyDebit;

    @Column(name = "FACT_TRANSACTION_ACC_NO_CREDIT")
    private String factTransactionAccNoCredit;

    @Column(name = "FACT_TRANSACTION_CUSTOMER_KEY_CREDIT")
    private String factTransactionCustomerKeyCredit;

    @Column(name = "FACT_TRANSACTION_AMOUNT_EQ")
    private String factTransactionAmountEq;

    @Column(name = "FACT_TRANSACTION_CODE")
    private String factTransactionCode;

    @Column(name = "FACT_TRANSACTION_CARD")
    private String factTransactionCard;

    @Column(name = "FACT_TRANSACTION_IS_IB_BANK_OPERATION")
    private String factTransactionIsIbBankOperation;

    @Column(name = "FACT_TRANSACTION_IS_OWN_TERMINAL")
    private String factTransactionIsOwnTerminal;

    @Column(name = "FACT_TRANSACTION_MCC")
    private String factTransactionMcc;

    @Column(name = "FACT_TRANSACTION_PAY_AMT")
    private String factTransactionPayAmt;

    @Column(name = "FACT_TRANSACTION_CURRENCY_NAME")
    private String factTransactionCurrencyName;

    @Column(name = "FACT_TRANSACTION_PAYMENT_SYSTEM")
    private String factTransactionPaymentSystem;

    @Column(name = "FACT_TRANSACTION_TERMINAL_CODE")
    private String factTransactionTerminalCode;

    @Column(name = "FACT_TRANSACTION_ADDRESS")
    private String factTransactionAddress;

    @Column(name = "FACT_TRANSACTION_OLTP_CODE")
    private String factTransactionOltpCode;

    @Column(name = "FACT_TRANSACTION_DEVICE_TYPE")
    private String factTransactionDeviceType;

    @Column(name = "FACT_TRANSACTION_TRANS_DETAIL")
    private String factTransactionTransDetail;

    @Column(name = "FACT_TRANSACTION_TRANS_TYPE")
    private String factTransactionTransType;

    @Column(name = "FACT_TRANSACTION_NAME")
    private String factTransactionName;

    @Column(name = "FACT_TRANSACTION_OP_TYPE")
    private String factTransactionOpType;

    public String getFactTransactionId() {
        return factTransactionId;
    }

    public void setFactTransactionId(String factTransactionId) {
        this.factTransactionId = factTransactionId;
    }

    public String getFactTransactionDate() {
        return factTransactionDate;
    }

    public void setFactTransactionDate(String factTransactionDate) {
        this.factTransactionDate = factTransactionDate;
    }

    public String getFactTransactionAccNoDebit() {
        return factTransactionAccNoDebit;
    }

    public void setFactTransactionAccNoDebit(String factTransactionAccNoDebit) {
        this.factTransactionAccNoDebit = factTransactionAccNoDebit;
    }

    public String getFactTransactionCustomerKeyDebit() {
        return factTransactionCustomerKeyDebit;
    }

    public void setFactTransactionCustomerKeyDebit(String factTransactionCustomerKeyDebit) {
        this.factTransactionCustomerKeyDebit = factTransactionCustomerKeyDebit;
    }

    public String getFactTransactionAccNoCredit() {
        return factTransactionAccNoCredit;
    }

    public void setFactTransactionAccNoCredit(String factTransactionAccNoCredit) {
        this.factTransactionAccNoCredit = factTransactionAccNoCredit;
    }

    public String getFactTransactionCustomerKeyCredit() {
        return factTransactionCustomerKeyCredit;
    }

    public void setFactTransactionCustomerKeyCredit(String factTransactionCustomerKeyCredit) {
        this.factTransactionCustomerKeyCredit = factTransactionCustomerKeyCredit;
    }

    public String getFactTransactionAmountEq() {
        return factTransactionAmountEq;
    }

    public void setFactTransactionAmountEq(String factTransactionAmountEq) {
        this.factTransactionAmountEq = factTransactionAmountEq;
    }

    public String getFactTransactionCode() {
        return factTransactionCode;
    }

    public void setFactTransactionCode(String factTransactionCode) {
        this.factTransactionCode = factTransactionCode;
    }

    public String getFactTransactionCard() {
        return factTransactionCard;
    }

    public void setFactTransactionCard(String factTransactionCard) {
        this.factTransactionCard = factTransactionCard;
    }

    public String getFactTransactionIsIbBankOperation() {
        return factTransactionIsIbBankOperation;
    }

    public void setFactTransactionIsIbBankOperation(String factTransactionIsIbBankOperation) {
        this.factTransactionIsIbBankOperation = factTransactionIsIbBankOperation;
    }

    public String getFactTransactionIsOwnTerminal() {
        return factTransactionIsOwnTerminal;
    }

    public void setFactTransactionIsOwnTerminal(String factTransactionIsOwnTerminal) {
        this.factTransactionIsOwnTerminal = factTransactionIsOwnTerminal;
    }

    public String getFactTransactionMcc() {
        return factTransactionMcc;
    }

    public void setFactTransactionMcc(String factTransactionMcc) {
        this.factTransactionMcc = factTransactionMcc;
    }

    public String getFactTransactionPayAmt() {
        return factTransactionPayAmt;
    }

    public void setFactTransactionPayAmt(String factTransactionPayAmt) {
        this.factTransactionPayAmt = factTransactionPayAmt;
    }

    public String getFactTransactionCurrencyName() {
        return factTransactionCurrencyName;
    }

    public void setFactTransactionCurrencyName(String factTransactionCurrencyName) {
        this.factTransactionCurrencyName = factTransactionCurrencyName;
    }

    public String getFactTransactionPaymentSystem() {
        return factTransactionPaymentSystem;
    }

    public void setFactTransactionPaymentSystem(String factTransactionPaymentSystem) {
        this.factTransactionPaymentSystem = factTransactionPaymentSystem;
    }

    public String getFactTransactionTerminalCode() {
        return factTransactionTerminalCode;
    }

    public void setFactTransactionTerminalCode(String factTransactionTerminalCode) {
        this.factTransactionTerminalCode = factTransactionTerminalCode;
    }

    public String getFactTransactionAddress() {
        return factTransactionAddress;
    }

    public void setFactTransactionAddress(String factTransactionAddress) {
        this.factTransactionAddress = factTransactionAddress;
    }

    public String getFactTransactionOltpCode() {
        return factTransactionOltpCode;
    }

    public void setFactTransactionOltpCode(String factTransactionOltpCode) {
        this.factTransactionOltpCode = factTransactionOltpCode;
    }

    public String getFactTransactionDeviceType() {
        return factTransactionDeviceType;
    }

    public void setFactTransactionDeviceType(String factTransactionDeviceType) {
        this.factTransactionDeviceType = factTransactionDeviceType;
    }

    public String getFactTransactionTransDetail() {
        return factTransactionTransDetail;
    }

    public void setFactTransactionTransDetail(String factTransactionTransDetail) {
        this.factTransactionTransDetail = factTransactionTransDetail;
    }

    public String getFactTransactionTransType() {
        return factTransactionTransType;
    }

    public void setFactTransactionTransType(String factTransactionTransType) {
        this.factTransactionTransType = factTransactionTransType;
    }

    public String getFactTransactionName() {
        return factTransactionName;
    }

    public void setFactTransactionName(String factTransactionName) {
        this.factTransactionName = factTransactionName;
    }

    public String getFactTransactionOpType() {
        return factTransactionOpType;
    }

    public void setFactTransactionOpType(String factTransactionOpType) {
        this.factTransactionOpType = factTransactionOpType;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
