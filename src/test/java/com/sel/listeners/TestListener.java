package com.sel.listeners;

import com.sel.utils.ScreenshotUtils;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getTestClass().getRealClass().getSimpleName()
                + "_" + result.getMethod().getMethodName();

        System.err.println("TEST FAILED: " + testName);
        if (result.getThrowable() != null) {
            result.getThrowable().printStackTrace();
        }

        ScreenshotUtils.capture(testName);
    }
}
