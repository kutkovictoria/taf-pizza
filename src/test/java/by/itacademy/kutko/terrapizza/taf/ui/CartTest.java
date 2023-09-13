package by.itacademy.kutko.terrapizza.taf.ui;

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
        homePage.openPizzaPage();
        //pizzaPage.selectMargaritaType();
        pizzaPage.addMargaritaToCart();
        pizzaPage.openCart();
        String expectedTextForPizzaInCart = "Пицца Маргарита Классическая";
        String actualTextForPizzaInCart = cartPage.getMargaritaCartLink();
        Assertions.assertEquals(expectedTextForPizzaInCart, actualTextForPizzaInCart);
    }
}
