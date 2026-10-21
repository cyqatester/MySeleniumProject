package com.sel.pages;

import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sel.utils.WaitTimerUtils;

public class RestFundamentals {
    private final WebDriver driver;

    public RestFundamentals(WebDriver driver) {
        this.driver = driver;
    }

    public RestFundamentals open(String url) {
        Objects.requireNonNull(url, "URL must not be null");

        if (url.isBlank()){
            throw new IllegalArgumentException("URL must not be blank");    
        }
        
        driver.get(url);
        return this;
    }

    public WebElement clickRestFundamentalsButton(){
        //get the first element
        By restFundamentalsButton = By.xpath("(//a[@href='/rest-fundamentals#rest'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(restFundamentalsButton));
    }

    public WebElement clickRestFundamentalsLink(){
        //get the first element link
        By restFundamentalsLink = By.xpath("(//a[@href='/rest-fundamentals'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(restFundamentalsLink));
    }

    public WebElement clickApiHistoryLink(){
        //get the first element link
        By apiHistoryLink = By.xpath("(//a[@href='/rest-api-history'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(apiHistoryLink));
    }

    public WebElement clickGetRequestInJavaLink(){
        //get the first element link
        By getRequestInJavaLink = By.xpath("(//a[@href='/send-a-get-request-java'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getRequestInJavaLink));
    }

    public WebElement clickPostRequestInJavaLink(){
        //get the first element link
        By postRequestInJavaLink = By.xpath("(//a[@href='/send-a-post-request-java'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(postRequestInJavaLink));
    }

    public WebElement clickPutRequestInJavaLink(){
        //get the first element link
        By putRequestInJavaLink = By.xpath("(//a[@href='/send-a-put-request-java'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(putRequestInJavaLink));
    }

    public WebElement clickPatchRequestInJavaLink(){
        //get the first element link
        By patchRequestInJavaLink = By.xpath("(//a[@href='/send-a-patch-request-java'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(patchRequestInJavaLink));
    }

    public WebElement clickDeleteRequestInJavaLink(){
        //get the first element link
        By deleteRequestInJavaLink = By.xpath("(//a[@href='/send-a-delete-request-java'])[1]");

        WebDriverWait wait = WaitTimerUtils.waitTimer(driver);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(deleteRequestInJavaLink));
    }
}
