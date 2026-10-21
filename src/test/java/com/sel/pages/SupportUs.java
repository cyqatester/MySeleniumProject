package com.sel.pages;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sel.utils.WaitTimerUtils;

public class SupportUs {
    private final WebDriver driver;

    public SupportUs(WebDriver driver) {
        this.driver = driver;
    }

    public SupportUs open(String url) {
        Objects.requireNonNull(url, "URL must not be null");

        if (url.isBlank()){
            throw new IllegalArgumentException("URL must not be blank");    
        }
        
        driver.get(url);
        return this;
    }

    public WebElement clickSupportUsButton(){
        //get the first element
        By supportUsButton = By.xpath("(//a[@href='/support-us'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(supportUsButton));
    }
}


