package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 20/07/2017.
 */

@Entity
@Table(name = "FACT_CASE_PRODUCT_REQUEST")
public class FactCaseProductRequest {

    @Id
    @Column(name = "FACT_CASE_KEY")
    private String factCaseKey;

    @Column(name = "FACT_CASE_PRODUCT_REQUEST_KEY")
    private String factCaseProductRequestKey;

    public String getFactCaseKey() {
        return factCaseKey;
    }

    public void setFactCaseKey(String factCaseKey) {
        this.factCaseKey = factCaseKey;
    }

    public String getFactCaseProductRequestKey() {
        return factCaseProductRequestKey;
    }

    public void setFactCaseProductRequestKey(String factCaseProductRequestKey) {
        this.factCaseProductRequestKey = factCaseProductRequestKey;
    }
}
