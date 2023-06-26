package com.redhat.appfoundations.camel.quarkus;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {


    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("ppsn")
    private String ppsn;

    @JsonProperty("gender")
    private String gender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(String concurrency) {
        this.concurrency = concurrency;
    }

    @JsonProperty("concurrency")
    private String concurrency;

    public String getPpsn() {
        return ppsn;
    }

    public void setPpsn(String ppsn) {
        this.ppsn = ppsn;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    @JsonProperty("surName")
    private String surName;

    @JsonProperty("placeOfBirth")
    private String placeOfBirth;
    
    @JsonProperty("dateOfIssue")
    private String dateOfIssue;
    
    @JsonProperty("dateOfExpiry")
    private String dateOfExpiry;

    @JsonProperty("licenceNumber")
    private String licenceNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
