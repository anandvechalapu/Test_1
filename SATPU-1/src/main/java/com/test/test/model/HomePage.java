package com.test.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HomePage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean verifyHomePage;
    private boolean verifyNavigationBar;
    private boolean verifyHomeButtonFunctionality;
    private boolean verifyLoadingTime;
    private boolean verifyInformationDisplayed;
    private boolean verifyNavigationToHomePage;
    private boolean verifyRedirectionToCorrectPage;
    private boolean verifyUsabilityStandards;
    private boolean verifyAccessibilityGuidelines;
    private boolean verifyIntegrationOfHomePage;
    private boolean verifyAcceptanceCriteria;
    private boolean verifyFeatureWorks;

    public HomePage() {
    }

    public HomePage(boolean verifyHomePage,
                    boolean verifyNavigationBar,
                    boolean verifyHomeButtonFunctionality,
                    boolean verifyLoadingTime,
                    boolean verifyInformationDisplayed,
                    boolean verifyNavigationToHomePage,
                    boolean verifyRedirectionToCorrectPage,
                    boolean verifyUsabilityStandards,
                    boolean verifyAccessibilityGuidelines,
                    boolean verifyIntegrationOfHomePage,
                    boolean verifyAcceptanceCriteria,
                    boolean verifyFeatureWorks) {
        this.verifyHomePage = verifyHomePage;
        this.verifyNavigationBar = verifyNavigationBar;
        this.verifyHomeButtonFunctionality = verifyHomeButtonFunctionality;
        this.verifyLoadingTime = verifyLoadingTime;
        this.verifyInformationDisplayed = verifyInformationDisplayed;
        this.verifyNavigationToHomePage = verifyNavigationToHomePage;
        this.verifyRedirectionToCorrectPage = verifyRedirectionToCorrectPage;
        this.verifyUsabilityStandards = verifyUsabilityStandards;
        this.verifyAccessibilityGuidelines = verifyAccessibilityGuidelines;
        this.verifyIntegrationOfHomePage = verifyIntegrationOfHomePage;
        this.verifyAcceptanceCriteria = verifyAcceptanceCriteria;
        this.verifyFeatureWorks = verifyFeatureWorks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isVerifyHomePage() {
        return verifyHomePage;
    }

    public void setVerifyHomePage(boolean verifyHomePage) {
        this.verifyHomePage = verifyHomePage;
    }

    public boolean isVerifyNavigationBar() {
        return verifyNavigationBar;
    }

    public void setVerifyNavigationBar(boolean verifyNavigationBar) {
        this.verifyNavigationBar = verifyNavigationBar;
    }

    public boolean isVerifyHomeButtonFunctionality() {
        return verifyHomeButtonFunctionality;
    }

    public void setVerifyHomeButtonFunctionality(boolean verifyHomeButtonFunctionality) {
        this.verifyHomeButtonFunctionality = verifyHomeButtonFunctionality;
    }

    public boolean isVerifyLoadingTime() {
        return verifyLoadingTime;
    }

    public void setVerifyLoadingTime(boolean verifyLoadingTime) {
        this.verifyLoadingTime = verifyLoadingTime;
    }

    public boolean isVerifyInformationDisplayed() {
        return verifyInformationDisplayed;
    }

    public void setVerifyInformationDisplayed(boolean verifyInformationDisplayed) {
        this.verifyInformationDisplayed = verifyInformationDisplayed;
    }

    public boolean isVerifyNavigationToHomePage() {
        return verifyNavigationToHomePage;
    }

    public void setVerifyNavigationToHomePage(boolean verifyNavigationToHomePage) {
        this.verifyNavigationToHomePage = verifyNavigationToHomePage;
    }

    public boolean isVerifyRedirectionToCorrectPage() {
        return verifyRedirectionToCorrectPage;
    }

    public void setVerifyRedirectionToCorrectPage(boolean verifyRedirectionToCorrectPage) {
        this.verifyRedirectionToCorrectPage = verifyRedirectionToCorrectPage;
    }

    public boolean isVerifyUsabilityStandards() {
        return verifyUsabilityStandards