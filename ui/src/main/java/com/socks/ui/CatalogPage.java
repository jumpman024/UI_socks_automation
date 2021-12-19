package com.socks.ui;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.*;

public class CatalogPage {
    public static CatalogPage open() {
            Selenide.open("/category.html");
            return Selenide.page(CatalogPage.class);
    }

    public CatalogPage addItemByIndex(int index) {
        $$("#products > div:nth-child(1) > div > div.text > p.buttons > a.btn.btn-primary").get(index).click();
        return this;
    }

    public ShoppingCartPage goToCart() {
        $("#numItemsInCart").click();
        return page(ShoppingCartPage.class);
    }

    //What is the difference between  public void goToCart() AND public ShoppingCartPage goToCart()
//    public void goToCart() {
//        $("#numItemsInCart").click();
//        return page(ShoppingCartPage.class);
//    }
}
