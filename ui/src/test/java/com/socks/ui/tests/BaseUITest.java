package com.socks.ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void setUp() throws InterruptedException {
        Configuration.baseUrl = "http://localhost";
//        Configuration.baseUrl = "https://www.google.com.ua/maps/";
        Configuration.browser = "com.socks.ui.SelenoidDriverProvider";
//        Configuration.browser = "chrome";
    }

    protected <T> T at(Class<T> pageClass){
        return Selenide.page(pageClass);
    }

}
