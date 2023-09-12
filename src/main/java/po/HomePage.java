package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private String pizzaLink = "//a[@href='/catalog/picca']";

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPizzaLink() {
        WebElement pizzaLinkElement = driver.findElement(By.xpath(pizzaLink));
        pizzaLinkElement.click();
    }
}
