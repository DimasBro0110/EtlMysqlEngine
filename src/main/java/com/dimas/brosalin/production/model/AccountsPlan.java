package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dmitriybrosalin on 22.07.17.
 */

@Entity
@Table(name = "ACCOUNTS_PLAN")
public class AccountsPlan {

    @Id
    @Column(name = "ACCOUNT_PLAN_CODE")
    private String accountPlanCode;

    @Column(name = "ACCOUNT_PLAN_DESCRIPTION")
    private String accountPlanDescription;

    public String getAccountPlanCode() {
        return accountPlanCode;
    }

    public void setAccountPlanCode(String accountPlanCode) {
        this.accountPlanCode = accountPlanCode;
    }

    public String getAccountPlanDescription() {
        return accountPlanDescription;
    }

    public void setAccountPlanDescription(String accountPlanDescription) {
        this.accountPlanDescription = accountPlanDescription;
    }
}
