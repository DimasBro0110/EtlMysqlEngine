package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

@Entity
@Table(name = "FACT_CASE_DEAL")
public class FactCaseDeal {

    @Id
    @Column(name = "FACT_CASE_KEY")
    private String factCaseKey;

    @Column(name = "FACT_DEAL_KEY")
    private String factDealKey;

    public String getFactCaseKey() {
        return factCaseKey;
    }

    public void setFactCaseKey(String factCaseKey) {
        this.factCaseKey = factCaseKey;
    }

    public String getFactDealKey() {
        return factDealKey;
    }

    public void setFactDealKey(String factDealKey) {
        this.factDealKey = factDealKey;
    }
}
