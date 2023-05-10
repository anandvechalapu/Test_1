package com.test.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.test.service.HomePageService;

@RestController
public class HomePageController {

    @Autowired
    private HomePageService homePageService;

    @GetMapping("/verifyHomePage")
    public void verifyHomePage() {
        homePageService.verifyHomePage();
    }

    @GetMapping("/verifyNavigationBar")
    public void verifyNavigationBar() {
        homePageService.verifyNavigationBar();
    }

    @GetMapping("/verifyHomeButtonFunctionality")
    public void verifyHomeButtonFunctionality() {
        homePageService.verifyHomeButtonFunctionality();
    }

    @GetMapping("/verifyLoadingTime")
    public void verifyLoadingTime() {
        homePageService.verifyLoadingTime();
    }

    @GetMapping("/verifyInformationDisplayed")
    public void verifyInformationDisplayed() {
        homePageService.verifyInformationDisplayed();
    }

    @GetMapping("/verifyNavigationToHomePage")
    public void verifyNavigationToHomePage() {
        homePageService.verifyNavigationToHomePage();
    }

    @GetMapping("/verifyRedirectionToCorrectPage")
    public void verifyRedirectionToCorrectPage() {
        homePageService.verifyRedirectionToCorrectPage();
    }

    @GetMapping("/verifyUsabilityStandards")
    public void verifyUsabilityStandards() {
        homePageService.verifyUsabilityStandards();
    }

    @GetMapping("/verifyAccessibilityGuidelines")
    public void verifyAccessibilityGuidelines() {
        homePageService.verifyAccessibilityGuidelines();
    }

    @GetMapping("/verifyIntegrationOfHomePage")
    public void verifyIntegrationOfHomePage() {
        homePageService.verifyIntegrationOfHomePage();
    }

    @GetMapping("/verifyAcceptanceCriteria")
    public void verifyAcceptanceCriteria() {
        homePageService.verifyAcceptanceCriteria();
    }

    @GetMapping("/verifyFeatureWorks")
    public void verifyFeatureWorks() {
        homePageService.verifyFeatureWorks();
    }

}