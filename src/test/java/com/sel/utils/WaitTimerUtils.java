package com.sel.utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WaitTimerUtils {

    private static final int TIMEOUT_DURATION = 5;

    public static WebDriverWait waitTimer(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT_DURATION));
    }
}
