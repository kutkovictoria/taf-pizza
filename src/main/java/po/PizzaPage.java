package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {
    WebDriver driver;
    private String margaritaTypeLink = "//li[@data-id='589']";
    private String addMargaritaToCartLink = "//*[@id='menu-card-364']/div[3]/div[3]/div[2]/div[2]/button";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMargaritaTypeLink() {
        WebElement margaritaTypeLinkElement = driver.findElement(By.xpath(margaritaTypeLink));
    }

    public void clickAddMargaritaToCartLink() {
        WebElement addMargaritaToCartLinkElement = driver.findElement(By.xpath(addMargaritaToCartLink));
    }
}
