package com.test.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.repository.HomePageRepository;

@Service 
public class HomePageService {

    @Autowired 
    private HomePageRepository homePageRepository;

    public void verifyHomePage() {
        homePageRepository.verifyHomePage();
    }

    public void verifyNavigationBar() {
        homePageRepository.verifyNavigationBar();
    }

    public void verifyHomeButtonFunctionality() {
        homePageRepository.verifyHomeButtonFunctionality();
    }

    public void verifyLoadingTime() {
        homePageRepository.verifyLoadingTime();
    }

    public void verifyInformationDisplayed() {
        homePageRepository.verifyInformationDisplayed();
    }

    public void verifyNavigationToHomePage() {
        homePageRepository.verifyNavigationToHomePage();
    }

    public void verifyRedirectionToCorrectPage() {
        homePageRepository.verifyRedirectionToCorrectPage();
    }

    public void verifyUsabilityStandards() {
        homePageRepository.verifyUsabilityStandards();
    }

    public void verifyAccessibilityGuidelines() {
        homePageRepository.verifyAccessibilityGuidelines();
    }

    public void verifyIntegrationOfHomePage() {
        homePageRepository.verifyIntegrationOfHomePage();
    }

    public void verifyAcceptanceCriteria() {
        homePageRepository.verifyAcceptanceCriteria();
    }

    public void verifyFeatureWorks() {
        homePageRepository.verifyFeatureWorks();
    }

}