package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_ACCOUNT_OPER_CDW")
public class FactAccount_Oper_CDW {

    @Id
    @Column(name = "FACT_ACCOUNT_OPER_KEY")
    private String factAccountOperKey;

    @Column(name = "FACT_ACCOUNT_DFROM")
    private String factAccountDfrom;

    @Column(name = "FACT_ACCOUNT_AMOUNT_EQ")
    private String factAccountAmountEq;

    @Column(name = "FACT_ACCOUNT_NO")
    private String factAccountNo;

    @Column(name = "FACT_ACCOUNT_CORR_ACCOUNT_NUMBER")
    private String factAccountCorrAccountNumber;

    @Column(name = "FACT_ACCOUNT_CUSTOMER_KEY_DEBIT")
    private String factAccountCustomerKeyDebit;

    @Column(name = "FACT_ACCOUNT_CUSTOMER_KEY_CREDIT")
    private String factAccountCustomerKeyCredit;

    @Column(name = "FACT_ACCOUNT_GROUND")
    private String factAccountGround;

    @Column(name = "FACT_ACCOUNT_ID_DOC")
    private String factAccountIdDoc;

    public String getFactAccountOperKey() {
        return factAccountOperKey;
    }

    public void setFactAccountOperKey(String factAccountOperKey) {
        this.factAccountOperKey = factAccountOperKey;
    }

    public String getFactAccountDfrom() {
        return factAccountDfrom;
    }

    public void setFactAccountDfrom(String factAccountDfrom) {
        this.factAccountDfrom = factAccountDfrom;
    }

    public String getFactAccountAmountEq() {
        return factAccountAmountEq;
    }

    public void setFactAccountAmountEq(String factAccountAmountEq) {
        this.factAccountAmountEq = factAccountAmountEq;
    }

    public String getFactAccountNo() {
        return factAccountNo;
    }

    public void setFactAccountNo(String factAccountNo) {
        this.factAccountNo = factAccountNo;
    }

    public String getFactAccountCorrAccountNumber() {
        return factAccountCorrAccountNumber;
    }

    public void setFactAccountCorrAccountNumber(String factAccountCorrAccountNumber) {
        this.factAccountCorrAccountNumber = factAccountCorrAccountNumber;
    }

    public String getFactAccountCustomerKeyDebit() {
        return factAccountCustomerKeyDebit;
    }

    public void setFactAccountCustomerKeyDebit(String factAccountCustomerKeyDebit) {
        this.factAccountCustomerKeyDebit = factAccountCustomerKeyDebit;
    }

    public String getFactAccountCustomerKeyCredit() {
        return factAccountCustomerKeyCredit;
    }

    public void setFactAccountCustomerKeyCredit(String factAccountCustomerKeyCredit) {
        this.factAccountCustomerKeyCredit = factAccountCustomerKeyCredit;
    }

    public String getFactAccountGround() {
        return factAccountGround;
    }

    public void setFactAccountGround(String factAccountGround) {
        this.factAccountGround = factAccountGround;
    }

    public String getFactAccountIdDoc() {
        return factAccountIdDoc;
    }

    public void setFactAccountIdDoc(String factAccountIdDoc) {
        this.factAccountIdDoc = factAccountIdDoc;
    }
}
