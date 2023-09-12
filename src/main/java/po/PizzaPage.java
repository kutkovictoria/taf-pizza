package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {
    WebDriver driver;
    private String margaritaLink = "Пицца Маргарита";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMargaritaLink() {
        WebElement margaritaLinkElement = driver.findElement(By.xpath(margaritaLink));
        margaritaLinkElement.click();
    }
}
