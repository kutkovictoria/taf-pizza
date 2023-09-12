package by.itacademy.kutko.terrapizza.taf.ui;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import po.CartPage;
import po.HomePage;
import po.PizzaPage;

public class CartTest extends BaseTest {
    @Test
    public void testMargaritaAddedToCart() {
        HomePage homePage = new HomePage(driver);
        PizzaPage pizzaPage = new PizzaPage(driver);
        CartPage cartPage = new CartPage(driver);
        homePage.clickPizzaLink();
        //pizzaPage.clickMargaritaTypeLink();
        pizzaPage.clickAddMargaritaToCartLink();
        pizzaPage.clickCurtLink();
        String expectedTextForPizzaInCart = "Пицца Маргарита";
        String actualTextForPizzaInCart = cartPage.getMargaritaCartLink();
        Assertions.assertEquals(expectedTextForPizzaInCart,actualTextForPizzaInCart);
    }
}
