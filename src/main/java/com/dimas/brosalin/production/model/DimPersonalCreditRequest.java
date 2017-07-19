package com.dimas.brosalin.production.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */

/*
* "PersonalCreditRequestKey";"CustomerKey";"NumberOfDependents";
* "MilitaryStatus";"JobStatus";"Income";
* "MultipleIncomeSources";"Costs";"OtherBankCredits";
* "OtherBankCards";"ScoringPoint";"IsCarOwner";
* "IsRealtyOwner";"StartDate";"EndDate";
* "ProductRequestKey";"Annuity";"EmployerOwnershipType";
* "EmployerIndustryType";"NumberOfEmployeesType";"EmployerJobStatus";
* "mcs_Employer_Name"
* */

@Entity
@Table(name = "DIM_PERSONAL_CREDIT_REQUEST")
public class DimPersonalCreditRequest {

    @Id
    @Column(name = "PERSONAL_CREDIT_REQUEST_KEY")
    private String personalCreditRequestKey;

    @Column(name = "PERSONAL_CUSTOMER_KEY")
    private String personalCustomerKey;

    @Column(name = "PERSONAL_NUMBER_OF_DEPENDENTS")
    private String personalNumberOfDependents;

    @Column(name = "PERSONAL_MILITARY_STATUS")
    private String personalMilitaryStatus;

    @Column(name = "PERSONAL_JOB_STATUS")
    private String personalJobStatus;

    @Column(name = "PERSONAL_INCOME")
    private String personalIncome;

    @Column(name = "PERSONAL_MULTIPLE_INCOME_SOURCES")
    private String personalMultipleIncomeSources;

    @Column(name = "PERSONAL_COSTS")
    private String personalCosts;

    @Column(name = "PERSONAL_OTHER_BANK_CREDITS")
    private String personalOtherBankCredits;

    @Column(name = "PERSONAL_OTHER_BANK_CARDS")
    private String personalOtherBankCards;

    @Column(name = "PERSONAL_SCORING_POINT")
    private String personalScoringPoint;

    @Column(name = "PERSONAL_IS_CAR_OWNER")
    private String personalIsCarOwner;

    @Column(name = "PERSONAL_IS_REALTY_OWNER")
    private String personalIsRealtyOwner;

    @Column(name = "PERSONAL_START_DATE")
    private String personalStartDate;

    @Column(name = "PERSONAL_END_DATE")
    private String personalEndDate;

    @Column(name = "PERSONAL_PRODUCT_REQUEST_KEY")
    private String personalProductRequestKey;

    @Column(name = "PERSONAL_ANNUITY")
    private String personalAnnuity;

    private String personalEmployerOwnershipType;

    private String personalEmployerIndustryType;

    private String personalNumberOfEmployeesType;

    private String personalEmployerJobStatus;

    private String personalMcsEmployerName;

}
