package com.sel.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sel.base.BaseTest;
import com.sel.config.ConfigReader;
import com.sel.pages.HomePage;

public class HomePageTest extends BaseTest {
    @Test
    public void homePageLoads() {
        new HomePage(driver).open(ConfigReader.baseUrl());

        boolean headerLinkText = driver.findElement(By.linkText("RESTful API")).isDisplayed();
        Assert.assertTrue(headerLinkText);
    }

    @Test
    public void clickViewEndpointTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver).open(ConfigReader.baseUrl());

        WebElement viewEndpointButton = homePage.clickViewEndpointButton(3);
        Assert.assertTrue(viewEndpointButton.isDisplayed());
        viewEndpointButton.click();
    }

    @Test
    public void clickPublicButton() throws InterruptedException {
        HomePage homePage = new HomePage(driver).open(ConfigReader.baseUrl());

        //View Endpoints button
        WebElement viewEndpointButton = homePage.clickViewEndpointButton(3);
        Assert.assertTrue(viewEndpointButton.isDisplayed());
        viewEndpointButton.click();
        
        //Public Button
        WebElement publicButton = homePage.clickPublicButton(3);
        Assert.assertTrue(publicButton.isDisplayed()); 
        publicButton.click();
    }
}
