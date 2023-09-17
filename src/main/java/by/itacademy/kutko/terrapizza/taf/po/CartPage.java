package by.itacademy.kutko.terrapizza.taf.po;

import by.itacademy.kutko.terrapizza.taf.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    private String margaritaCartLink = "//div[@class='basket__products-item-name']";

    public CartPage() {
        this.driver = Singleton.getDriver();
    }

    public String getMargaritaCartLink() {
        WebElement textMargaritaCartLinkElement = driver.findElement(By.xpath(margaritaCartLink));
        return textMargaritaCartLinkElement.getText();
    }
}
