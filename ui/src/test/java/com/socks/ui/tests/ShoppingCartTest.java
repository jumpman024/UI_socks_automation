package com.socks.ui.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.socks.ui.CatalogPage;
import com.socks.ui.ShoppingCartPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ShoppingCartTest extends BaseUITest {

    @Test
    public void userCanAddItemToCartFromCatalog() {
        CatalogPage.open()
                .addItemByIndex(0)
                .goToCart();

        at(ShoppingCartPage.class).totalAmount().shouldHave(Condition.exactText("$104.98"));
    }

    @Test
    public void testCanDeleteItemFromCart() {
      ShoppingCartPage.open();
      //Get browser cookie
      String cookies = WebDriverRunner.getWebDriver().manage().getCookieNamed("md.sid").getValue();


    }

//    @AfterMethod
//    public void tearDown() {
//        Selenide.clearBrowserCookies();
//    }
}
