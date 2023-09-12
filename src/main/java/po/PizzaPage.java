package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PizzaPage {
    WebDriver driver;
    private String margaritaLink = "//div[@title='Пицца Маргарита']";
    private String margaritaTypeLink = "//li[@data-id='589']";
    private String addToCartLink = "//button[@data-id='364']";

    public PizzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMargaritaLink() {
        WebElement margaritaLinkElement = driver.findElement(By.xpath(margaritaLink));
        margaritaLinkElement.click();
    }
    public void clickMargaritaTypeLink(){
        WebElement margaritaTypeLinkElement = driver.findElement(By.xpath(margaritaTypeLink));
    }
    public void clickAddToCartLink(){
        WebElement addToCartLinkElement = driver.findElement(By.xpath(addToCartLink));
    }
}
