package com.sel.tests;

import org.openqa.selenium.By;
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
}
