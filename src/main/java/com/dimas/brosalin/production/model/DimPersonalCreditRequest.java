package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */


@Entity
@Table(name = "DIM_PERSONAL_CREDIT_REQUEST")
public class DimPersonalCreditRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

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

    @Column(name = "PERSONAL_EMPLOYER_OWNERSHIP_TYPE")
    private String personalEmployerOwnershipType;

    @Column(name = "PERSONAL_EMPLOYER_INDUSTRY_TYPE")
    private String personalEmployerIndustryType;

    @Column(name = "PERSONAL_NUMBER_OF_EMPLOYEES_TYPE")
    private String personalNumberOfEmployeesType;

    @Column(name = "PERSONAL_EMPLOYER_JOB_STATUS")
    private String personalEmployerJobStatus;

    @Column(name = "PERSONAL_MCS_EMPLOYER_NAME")
    private String personalMcsEmployerName;

    public String getPersonalCreditRequestKey() {
        return personalCreditRequestKey;
    }

    public void setPersonalCreditRequestKey(String personalCreditRequestKey) {
        this.personalCreditRequestKey = personalCreditRequestKey;
    }

    public String getPersonalCustomerKey() {
        return personalCustomerKey;
    }

    public void setPersonalCustomerKey(String personalCustomerKey) {
        this.personalCustomerKey = personalCustomerKey;
    }

    public String getPersonalNumberOfDependents() {
        return personalNumberOfDependents;
    }

    public void setPersonalNumberOfDependents(String personalNumberOfDependents) {
        this.personalNumberOfDependents = personalNumberOfDependents;
    }

    public String getPersonalMilitaryStatus() {
        return personalMilitaryStatus;
    }

    public void setPersonalMilitaryStatus(String personalMilitaryStatus) {
        this.personalMilitaryStatus = personalMilitaryStatus;
    }

    public String getPersonalJobStatus() {
        return personalJobStatus;
    }

    public void setPersonalJobStatus(String personalJobStatus) {
        this.personalJobStatus = personalJobStatus;
    }

    public String getPersonalIncome() {
        return personalIncome;
    }

    public void setPersonalIncome(String personalIncome) {
        this.personalIncome = personalIncome;
    }

    public String getPersonalMultipleIncomeSources() {
        return personalMultipleIncomeSources;
    }

    public void setPersonalMultipleIncomeSources(String personalMultipleIncomeSources) {
        this.personalMultipleIncomeSources = personalMultipleIncomeSources;
    }

    public String getPersonalCosts() {
        return personalCosts;
    }

    public void setPersonalCosts(String personalCosts) {
        this.personalCosts = personalCosts;
    }

    public String getPersonalOtherBankCredits() {
        return personalOtherBankCredits;
    }

    public void setPersonalOtherBankCredits(String personalOtherBankCredits) {
        this.personalOtherBankCredits = personalOtherBankCredits;
    }

    public String getPersonalOtherBankCards() {
        return personalOtherBankCards;
    }

    public void setPersonalOtherBankCards(String personalOtherBankCards) {
        this.personalOtherBankCards = personalOtherBankCards;
    }

    public String getPersonalScoringPoint() {
        return personalScoringPoint;
    }

    public void setPersonalScoringPoint(String personalScoringPoint) {
        this.personalScoringPoint = personalScoringPoint;
    }

    public String getPersonalIsCarOwner() {
        return personalIsCarOwner;
    }

    public void setPersonalIsCarOwner(String personalIsCarOwner) {
        this.personalIsCarOwner = personalIsCarOwner;
    }

    public String getPersonalIsRealtyOwner() {
        return personalIsRealtyOwner;
    }

    public void setPersonalIsRealtyOwner(String personalIsRealtyOwner) {
        this.personalIsRealtyOwner = personalIsRealtyOwner;
    }

    public String getPersonalStartDate() {
        return personalStartDate;
    }

    public void setPersonalStartDate(String personalStartDate) {
        this.personalStartDate = personalStartDate;
    }

    public String getPersonalEndDate() {
        return personalEndDate;
    }

    public void setPersonalEndDate(String personalEndDate) {
        this.personalEndDate = personalEndDate;
    }

    public String getPersonalProductRequestKey() {
        return personalProductRequestKey;
    }

    public void setPersonalProductRequestKey(String personalProductRequestKey) {
        this.personalProductRequestKey = personalProductRequestKey;
    }

    public String getPersonalAnnuity() {
        return personalAnnuity;
    }

    public void setPersonalAnnuity(String personalAnnuity) {
        this.personalAnnuity = personalAnnuity;
    }

    public String getPersonalEmployerOwnershipType() {
        return personalEmployerOwnershipType;
    }

    public void setPersonalEmployerOwnershipType(String personalEmployerOwnershipType) {
        this.personalEmployerOwnershipType = personalEmployerOwnershipType;
    }

    public String getPersonalEmployerIndustryType() {
        return personalEmployerIndustryType;
    }

    public void setPersonalEmployerIndustryType(String personalEmployerIndustryType) {
        this.personalEmployerIndustryType = personalEmployerIndustryType;
    }

    public String getPersonalNumberOfEmployeesType() {
        return personalNumberOfEmployeesType;
    }

    public void setPersonalNumberOfEmployeesType(String personalNumberOfEmployeesType) {
        this.personalNumberOfEmployeesType = personalNumberOfEmployeesType;
    }

    public String getPersonalEmployerJobStatus() {
        return personalEmployerJobStatus;
    }

    public void setPersonalEmployerJobStatus(String personalEmployerJobStatus) {
        this.personalEmployerJobStatus = personalEmployerJobStatus;
    }

    public String getPersonalMcsEmployerName() {
        return personalMcsEmployerName;
    }

    public void setPersonalMcsEmployerName(String personalMcsEmployerName) {
        this.personalMcsEmployerName = personalMcsEmployerName;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
