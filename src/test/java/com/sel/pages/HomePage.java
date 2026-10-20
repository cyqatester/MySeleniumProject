package com.sel.pages;

import java.util.Objects;

import org.jspecify.annotations.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
