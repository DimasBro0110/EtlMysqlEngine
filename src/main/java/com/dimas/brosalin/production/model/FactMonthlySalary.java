package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by dmitriybrosalin on 24.07.17.
 */

@Entity
@Table(name = "FACT_MONTHLY_SALARY")
public class FactMonthlySalary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "FACT_SALARY_CUSTOMER_KEY")
    private String factSalaryCustomerKey;

    @Column(name = "FACT_DATE_KEY")
    private String factDateKey;

    @Column(name = "FACT_AMOUNT")
    private String factAmount;

    public String getFactSalaryCustomerKey() {
        return factSalaryCustomerKey;
    }

    public void setFactSalaryCustomerKey(String factSalaryCustomerKey) {
        this.factSalaryCustomerKey = factSalaryCustomerKey;
    }

    public String getFactDateKey() {
        return factDateKey;
    }

    public void setFactDateKey(String factDateKey) {
        this.factDateKey = factDateKey;
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
