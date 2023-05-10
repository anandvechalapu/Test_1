package com.test.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HomePageRepository extends JpaRepository {

    void verifyHomePage();
    void verifyNavigationBar();
    void verifyHomeButtonFunctionality();
    void verifyLoadingTime();
    void verifyInformationDisplayed();
    void verifyNavigationToHomePage();
    void verifyRedirectionToCorrectPage();
    void verifyUsabilityStandards();
    void verifyAccessibilityGuidelines();
    void verifyIntegrationOfHomePage();
    void verifyAcceptanceCriteria();
    void verifyFeatureWorks();
}