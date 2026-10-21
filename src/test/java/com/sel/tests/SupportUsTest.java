package com.sel.tests;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sel.base.BaseTest;
import com.sel.config.ConfigReader;
import com.sel.pages.SupportUs;

public class SupportUsTest extends BaseTest {
private static final String SUPPORT_US_BASE_URL = ConfigReader.baseUrl()+"support-us/";

    @Test
    public void clickRestFundamentalsTest() {
        SupportUs supportUs = new SupportUs(driver).open(SUPPORT_US_BASE_URL);
        
        WebElement supportUsButton = supportUs.clickSupportUsButton();
        Assert.assertTrue(supportUsButton.isDisplayed());
        supportUsButton.click();
    }
}
