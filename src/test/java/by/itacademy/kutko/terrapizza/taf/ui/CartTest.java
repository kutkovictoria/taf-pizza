package by.itacademy.kutko.terrapizza.taf.ui;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.itacademy.kutko.terrapizza.taf.po.CartPage;
import by.itacademy.kutko.terrapizza.taf.po.HomePage;
import by.itacademy.kutko.terrapizza.taf.po.PizzaPage;

public class CartTest extends BaseTest {
    @Test
    public void testMargaritaAddedToCart() {
        HomePage homePage = new HomePage();
        PizzaPage pizzaPage = new PizzaPage();
        CartPage cartPage = new CartPage();
        homePage.openPizzaPage();
        pizzaPage.selectMargaritaGrandType();
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        pizzaPage.addMargaritaToCart();
        pizzaPage.openCart();
        String expectedTextForPizzaInCart = "Пицца Маргарита Гранд 32 см";
        try {
            Thread.sleep(300);
        } catch (Exception e) {
        }
        String actualTextForPizzaInCart = cartPage.getMargaritaCartText();
        Assertions.assertEquals(expectedTextForPizzaInCart, actualTextForPizzaInCart);
    }
}
