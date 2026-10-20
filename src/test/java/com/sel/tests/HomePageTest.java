package com.sel.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
        // WebDriverWait wait = new WebDriverWait(
        //     driver, Duration.ofSeconds(15)
        // );

        // boolean headerLinkText = wait.until(
        //     ExpectedConditions.visibilityOfElementLocated(
        //         By.linkText("RESTful API")
        //     )
        // ).isDisplayed();

        // Assert.assertTrue(
        //     headerLinkText,
        //     "RESTful API link should be displayed"
        // );
    }
}
