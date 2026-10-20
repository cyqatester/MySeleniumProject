package com.sel.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sel.driver.DriverFactory;

import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class ScreenshotUtils {
    private static final DateTimeFormatter FORMAT =
            DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss-SSS");

    private ScreenshotUtils() {}

    public static Path capture(String testName) {
        try {
            WebDriver driver = DriverFactory.getDriver();
            if (!(driver instanceof TakesScreenshot)) {
                return null;
            }

            Path directory = Path.of("target", "screenshots");
            Files.createDirectories(directory);

            String safeName = testName.replaceAll("[^a-zA-Z0-9._-]", "_");
            Path destination = directory.resolve(
                    safeName + "-" + LocalDateTime.now().format(FORMAT) + ".png");

            byte[] screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.BYTES);
            Files.write(destination, screenshot);
            System.out.println("Failure screenshot saved to: " + destination);
            return destination;
        } catch (Exception e) {
            System.err.println("Could not capture failure screenshot: " + e.getMessage());
            return null;
        }
    }
}
