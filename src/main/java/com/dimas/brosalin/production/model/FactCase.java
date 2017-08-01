package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_CASE")
public class FactCase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_CASE_KEY")
    private String factCaseKey;

    @Column(name = "FACT_CASE_CREATE_DATE")
    private String factCaseCreateDate;

    @Column(name = "FACT_CASE_CUSTOMER_KEY")
    private String factCaseCustomerKey;

    @Lob
    @Column(name = "FACT_CASE_TYPE")
    private String factCaseType;

    public String getFactCaseKey() {
        return factCaseKey;
    }

    public void setFactCaseKey(String factCaseKey) {
        this.factCaseKey = factCaseKey;
    }

    public String getFactCaseCreateDate() {
        return factCaseCreateDate;
    }

    public void setFactCaseCreateDate(String factCaseCreateDate) {
        this.factCaseCreateDate = factCaseCreateDate;
    }

    public String getFactCaseCustomerKey() {
        return factCaseCustomerKey;
    }

    public void setFactCaseCustomerKey(String factCaseCustomerKey) {
        this.factCaseCustomerKey = factCaseCustomerKey;
    }

    public String getFactCaseType() {
        return factCaseType;
    }

    public void setFactCaseType(String factCaseType) {
        this.factCaseType = factCaseType;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
