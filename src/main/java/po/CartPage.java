package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    private String margaritaCartLink = "//*[@id='basket-el-0']/div[2]/div[1]/div[1]";

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getMargaritaCartLink() {
        WebElement textMargaritaCartLinkElement = driver.findElement(By.xpath(margaritaCartLink));
        return textMargaritaCartLinkElement.getText();
    }
}
