package com.socks.ui;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import io.qameta.allure.Step;

public class ShoppingCartPage {

    @Step
    public SelenideElement totalAmount() {
        return $("#orderGrandTotal");
    }

    @Step
    public static ShoppingCartPage open() {
        Selenide.open("/basket.html");
        return new ShoppingCartPage();
    }

    @Step
    public ShoppingCartPage deleteItem() {
        $("#cart-list > tr > td:ntn-child(8) > a > i").click();
        return this;
    }




}
