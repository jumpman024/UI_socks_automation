package com.socks.ui;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Map;

public class SelenoidDriverProvider implements WebDriverProvider {


    @Override
    public WebDriver createDriver(Capabilities desiredCapabilities) {
        DesiredCapabilities browser = new DesiredCapabilities();
        browser.setBrowserName("chrome");
        browser.setVersion("96.0");
        browser.setCapability("enableVNC", true);

        try {
            RemoteWebDriver driver = new RemoteWebDriver(
                    URI.create("http://localhost:8081/wd/hub").toURL(),
                    browser

            );
            driver.manage().window().setSize(new Dimension(1280, 1024));
//            driver.setFileDetector(new LocalFileDetector());
            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("browserVersion", "96.0");
//        capabilities.setCapability("enableVNC", true);
//        try {
//            RemoteWebDriver driver = new RemoteWebDriver(
//                    URI.create("http://selenoid:4444/wd/hub").toURL(),
//                    capabilities
//            );
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//
//    }
    }
}
