package com.socks.ui.tests;

import com.codeborne.selenide.Condition;
import com.socks.ui.LoggedUserPage;
import com.socks.ui.MainPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;


public class TestLogin extends BaseUITest {


    @Test
    public void userCanLoginWithValidCredentials() throws InterruptedException {

        MainPage.open()
        .loginAs("testuser","123456");

        LoggedUserPage loggedUserPage = at(LoggedUserPage.class);
        loggedUserPage.logoutBtn().shouldHave(text("Logged in as test test"));
        loggedUserPage.userName().shouldHave(text("Logout"));
    }
}
