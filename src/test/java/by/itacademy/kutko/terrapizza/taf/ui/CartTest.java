package by.itacademy.kutko.terrapizza.taf.ui;

import org.junit.jupiter.api.Test;
import po.HomePage;
import po.PizzaPage;

public class CartTest extends BaseTest {
    @Test
    public void testMargaritaAddedToCart() {
        HomePage homePage = new HomePage(driver);
        PizzaPage pizzaPage = new PizzaPage(driver);
        homePage.clickPizzaLink();
        pizzaPage.clickMargaritaLink();
        pizzaPage.clickMargaritaTypeLink();
        pizzaPage.clickAddMargaritaToCartLink();
    }
}
