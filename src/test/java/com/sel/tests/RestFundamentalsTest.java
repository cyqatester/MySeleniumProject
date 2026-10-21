package com.sel.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sel.base.BaseTest;
import com.sel.config.ConfigReader;
import com.sel.pages.RestFundamentals;

public class RestFundamentalsTest extends BaseTest {

    private static final String REST_FUNDAMENTALS_BASE_URL = ConfigReader.baseUrl()+"rest-fundamentals";

    @Test
    public void clickRestFundamentalsTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(ConfigReader.baseUrl());
        
        WebElement restFundamentalsButton = restFundamentals.clickRestFundamentalsButton();
        Assert.assertTrue(restFundamentalsButton.isDisplayed());
        restFundamentalsButton.click();
    }

    @Test
    public void clickRestFundamentalsLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement restFundamentalsLink = restFundamentals.clickRestFundamentalsLink();
        Assert.assertTrue(restFundamentalsLink.isDisplayed());
        restFundamentalsLink.click();
    }

    @Test
    public void clickRestApiHistoryLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement apiHistoryLink = restFundamentals.clickApiHistoryLink();
        Assert.assertTrue(apiHistoryLink.isDisplayed());
        apiHistoryLink.click();
    }

    @Test
    public void clickGetRequestinJavaLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement getRequestInJavaLink = restFundamentals.clickGetRequestInJavaLink();
        Assert.assertTrue(getRequestInJavaLink.isDisplayed());
        getRequestInJavaLink.click();
    }

    @Test
    public void clickPostRequestinJavaLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement postRequestInJavaLink = restFundamentals.clickPostRequestInJavaLink();
        Assert.assertTrue(postRequestInJavaLink.isDisplayed());
        postRequestInJavaLink.click();
    }

    @Test
    public void clickPutRequestinJavaLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement putRequestInJavaLink = restFundamentals.clickPutRequestInJavaLink();
        Assert.assertTrue(putRequestInJavaLink.isDisplayed());
        putRequestInJavaLink.click();
    }

    @Test
    public void clickPatchRequestinJavaLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement patchRequestInJavaLink = restFundamentals.clickPatchRequestInJavaLink();
        Assert.assertTrue(patchRequestInJavaLink.isDisplayed());
        patchRequestInJavaLink.click();
    }

    @Test
    public void clickDeleteRequestinJavaLinkTest() {
        RestFundamentals restFundamentals = new RestFundamentals(driver).open(REST_FUNDAMENTALS_BASE_URL);
        
        WebElement deleteRequestInJavaLink = restFundamentals.clickDeleteRequestInJavaLink();
        Assert.assertTrue(deleteRequestInJavaLink.isDisplayed());
        deleteRequestInJavaLink.click();
    }
}
