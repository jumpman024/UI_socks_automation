package com.socks.ui.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeSuite;

public class BaseUITest {

    @BeforeSuite
    public void setUp(){
        Configuration.baseUrl = "http://localhost";
        Configuration.browser = "com.socks.ui.SelenoidDriverProvider";
    }

    protected <T> T at(Class<T> pageClass){
        return Selenide.page(pageClass);
    }

}
