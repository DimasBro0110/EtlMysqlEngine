package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_MONTHLY_PENSION")
public class FactMontlyPension {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_PENSION_CUSTOMER_KEY")
    private String factPensionCustomerKey;

    @Column(name = "FACT_PENSION_DATE_KEY")
    private String factPensionDateKey;

    @Column(name = "FACT_AMOUNT")
    private String factAmount;

    public String getFactPensionCustomerKey() {
        return factPensionCustomerKey;
    }

    public void setFactPensionCustomerKey(String factPensionCustomerKey) {
        this.factPensionCustomerKey = factPensionCustomerKey;
    }

    public String getFactPensionDateKey() {
        return factPensionDateKey;
    }

    public void setFactPensionDateKey(String factPensionDateKey) {
        this.factPensionDateKey = factPensionDateKey;
    }

    public String getFactAmount() {
        return factAmount;
    }

    public void setFactAmount(String factAmount) {
        this.factAmount = factAmount;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
