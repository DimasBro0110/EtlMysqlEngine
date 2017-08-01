package com.dimas.brosalin.production.model;

import javax.persistence.*;

/**
 * Created by DmitriyBrosalin on 19/07/2017.
 */


@Entity
@Table(name = "DIM_CUSTOMER")
public class DimCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int entityId;

    @Column(name = "CUSTOMER_KEY")
    private String customerKey;

    @Column(name = "ACCOUNT_ID")
    private String customerAccountId;

    @Column(name = "CARD_OPEN_DATE")
    private String customerCardOpenDate;

    @Column(name = "GENDER_TYPE")
    private String customerGenderType;

    @Column(name = "BIRTH_DATE")
    private String customerBirthDate;

    @Column(name = "BIRTH_PLACE")
    private String customerBirthPlace;

    @Column(name = "MARTIAL_STATUS")
    private String customerMaritalStatus;

    @Column(name = "EDUCATION")
    private String customerEducation;

    @Column(name = "CITIZENSHIP")
    private String customerCitizenship;

    @Column(name = "EMPLOYER")
    private String customerEmployer;

    @Column(name = "MOBILE_PHONE_AVAIL")
    private String customerMobilePhoneAvail;

    @Column(name = "HOME_PHONE_AVAIL")
    private String customerHomePhoneAvail;

    @Column(name = "EMAIL_AVAIL")
    private String customerEmailAvail;

    @Column(name = "DO_NOT_PHONE")
    private String customerDoNotPhone;

    @Column(name = "DO_NOT_SMS")
    private String customerDoNotSMS;

    @Column(name = "DO_NOT_EMAIL")
    private String customerDoNotEmail;

    @Column(name = "DO_NOT_POSTAL_MAIL")
    private String customerDoNotPostalMail;

    @Column(name = "DO_NOT_BULK_EMAIL")
    private String customerDoNotBulkEmail;

    @Column(name = "DO_NOT_BULK_POSTAL_MAIL")
    private String customerDoNotBulkPostalMail;

    @Column(name = "DO_NOT_BANNER_INTERNET_BANK")
    private String customerDoNotBannerInternetBank;

    @Column(name = "DO_NOT_COMMUNICATE")
    private String customerDoNotCommunicate;

    @Column(name = "DO_NOT_EMAIL_INTERNET_BANK")
    private String customerDoNotEmailInternetBank;

    @Column(name = "DO_NOT_PERSONAL_CHANNEL")
    private String customerDoNotPersonalChannel;

    @Column(name = "CDW_ID")
    private String customerCDW_ID;

    @Column(name = "DBO_ID")
    private String customerDBOID;

    @Column(name = "IS_EUROP")
    private String customerIsEurop;

    public String getCustomerKey() {
        return customerKey;
    }

    public void setCustomerKey(String customerKey) {
        this.customerKey = customerKey;
    }

    public String getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(String customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public String getCustomerCardOpenDate() {
        return customerCardOpenDate;
    }

    public void setCustomerCardOpenDate(String customerCardOpenDate) {
        this.customerCardOpenDate = customerCardOpenDate;
    }

    public String getCustomerGenderType() {
        return customerGenderType;
    }

    public void setCustomerGenderType(String customerGenderType) {
        this.customerGenderType = customerGenderType;
    }

    public String getCustomerBirthDate() {
        return customerBirthDate;
    }

    public void setCustomerBirthDate(String customerBirthDate) {
        this.customerBirthDate = customerBirthDate;
    }

    public String getCustomerBirthPlace() {
        return customerBirthPlace;
    }

    public void setCustomerBirthPlace(String customerBirthPlace) {
        this.customerBirthPlace = customerBirthPlace;
    }

    public String getCustomerMaritalStatus() {
        return customerMaritalStatus;
    }

    public void setCustomerMaritalStatus(String customerMaritalStatus) {
        this.customerMaritalStatus = customerMaritalStatus;
    }

    public String getCustomerEducation() {
        return customerEducation;
    }

    public void setCustomerEducation(String customerEducation) {
        this.customerEducation = customerEducation;
    }

    public String getCustomerCitizenship() {
        return customerCitizenship;
    }

    public void setCustomerCitizenship(String customerCitizenship) {
        this.customerCitizenship = customerCitizenship;
    }

    public String getCustomerEmployer() {
        return customerEmployer;
    }

    public void setCustomerEmployer(String customerEmployer) {
        this.customerEmployer = customerEmployer;
    }

    public String getCustomerMobilePhoneAvail() {
        return customerMobilePhoneAvail;
    }

    public void setCustomerMobilePhoneAvail(String customerMobilePhoneAvail) {
        this.customerMobilePhoneAvail = customerMobilePhoneAvail;
    }

    public String getCustomerHomePhoneAvail() {
        return customerHomePhoneAvail;
    }

    public void setCustomerHomePhoneAvail(String customerHomePhoneAvail) {
        this.customerHomePhoneAvail = customerHomePhoneAvail;
    }

    public String getCustomerEmailAvail() {
        return customerEmailAvail;
    }

    public void setCustomerEmailAvail(String customerEmailAvail) {
        this.customerEmailAvail = customerEmailAvail;
    }

    public String getCustomerDoNotPhone() {
        return customerDoNotPhone;
    }

    public void setCustomerDoNotPhone(String customerDoNotPhone) {
        this.customerDoNotPhone = customerDoNotPhone;
    }

    public String getCustomerDoNotSMS() {
        return customerDoNotSMS;
    }

    public void setCustomerDoNotSMS(String customerDoNotSMS) {
        this.customerDoNotSMS = customerDoNotSMS;
    }

    public String getCustomerDoNotEmail() {
        return customerDoNotEmail;
    }

    public void setCustomerDoNotEmail(String customerDoNotEmail) {
        this.customerDoNotEmail = customerDoNotEmail;
    }

    public String getCustomerDoNotPostalMail() {
        return customerDoNotPostalMail;
    }

    public void setCustomerDoNotPostalMail(String customerDoNotPostalMail) {
        this.customerDoNotPostalMail = customerDoNotPostalMail;
    }

    public String getCustomerDoNotBulkEmail() {
        return customerDoNotBulkEmail;
    }

    public void setCustomerDoNotBulkEmail(String customerDoNotBulkEmail) {
        this.customerDoNotBulkEmail = customerDoNotBulkEmail;
    }

    public String getCustomerDoNotBulkPostalMail() {
        return customerDoNotBulkPostalMail;
    }

    public void setCustomerDoNotBulkPostalMail(String customerDoNotBulkPostalMail) {
        this.customerDoNotBulkPostalMail = customerDoNotBulkPostalMail;
    }

    public String getCustomerDoNotBannerInternetBank() {
        return customerDoNotBannerInternetBank;
    }

    public void setCustomerDoNotBannerInternetBank(String customerDoNotBannerInternetBank) {
        this.customerDoNotBannerInternetBank = customerDoNotBannerInternetBank;
    }

    public String getCustomerDoNotCommunicate() {
        return customerDoNotCommunicate;
    }

    public void setCustomerDoNotCommunicate(String customerDoNotCommunicate) {
        this.customerDoNotCommunicate = customerDoNotCommunicate;
    }

    public String getCustomerDoNotEmailInternetBank() {
        return customerDoNotEmailInternetBank;
    }

    public void setCustomerDoNotEmailInternetBank(String customerDoNotEmailInternetBank) {
        this.customerDoNotEmailInternetBank = customerDoNotEmailInternetBank;
    }

    public String getCustomerDoNotPersonalChannel() {
        return customerDoNotPersonalChannel;
    }

    public void setCustomerDoNotPersonalChannel(String customerDoNotPersonalChannel) {
        this.customerDoNotPersonalChannel = customerDoNotPersonalChannel;
    }

    public String getCustomerCDW_ID() {
        return customerCDW_ID;
    }

    public void setCustomerCDW_ID(String customerCDW_ID) {
        this.customerCDW_ID = customerCDW_ID;
    }

    public String getCustomerDBOID() {
        return customerDBOID;
    }

    public void setCustomerDBOID(String customerDBOID) {
        this.customerDBOID = customerDBOID;
    }

    public String getCustomerIsEurop() {
        return customerIsEurop;
    }

    public void setCustomerIsEurop(String customerIsEurop) {
        this.customerIsEurop = customerIsEurop;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }
}
