package com.sel.pages;

import java.time.Duration;
import java.util.Objects;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private final WebDriver driver;
    private final @NonNull By pageHeading = By.cssSelector("h1");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage open(String url) {
        Objects.requireNonNull(url, "URL must not be null");

        if (url.isBlank()){
            throw new IllegalArgumentException("URL must not be blank");    
        }
        
        driver.get(url);
        return this;
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public boolean hasHeading() {
        return !driver.findElements(pageHeading).isEmpty();
    }

    public WebElement clickViewEndpointButton(int time){
        By viewEndpointsButton =
            By.xpath("//button[contains(., 'View Endpoints')]");

        WebDriverWait wait = waitTimer(time);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(viewEndpointsButton));
    }

    public WebElement clickPublicButton(int time){
        By publicButton =
            By.cssSelector("button[value='public']");

        WebDriverWait wait = waitTimer(time);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(publicButton));
    }

    public WebDriverWait waitTimer(int time){
        return new WebDriverWait(driver, Duration.ofSeconds(time));
    }
}
