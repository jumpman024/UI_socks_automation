package com.socks.ui;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {


    public static MainPage open() throws InterruptedException {
        Selenide.open("/");
        Thread.sleep(100000);
        return new MainPage();
    }

    public void loginAs(String username, String password) {
        $("#login > a").click();
        $("#username-modal").setValue(username);
        $("#password-modal").setValue(password);
        $("#login-modal > div > div > div.modal-body > form > p > button").click();
    }
}
