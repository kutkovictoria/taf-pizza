package by.itacademy.kutko.terrapizza.taf.po;

import by.itacademy.kutko.terrapizza.taf.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PizzaPage {
    WebDriver driver;
    private String margaritaTypeLink = "//div[@title='Пицца Маргарита']/..//div[text()='Классическая']";
    private String margaritaOptionGrandLink = "//li[@data-id='589'][text()='Гранд']";
    private String addMargaritaToCartLink = "//button[@data-id='364']";
    private String cartLink = "//div[@class='basket__btn-top basket__top basket__btn-top--sm']";

    public PizzaPage() {
        this.driver = Singleton.getDriver();
    }

    public void selectMargaritaGrandType() {
        WebElement margaritaTypeElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(margaritaTypeLink)));
        margaritaTypeElement.click();
        WebElement margaritaOptionGrandElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(margaritaOptionGrandLink)));
        margaritaOptionGrandElement.click();
    }

    public void addMargaritaToCart() {
        WebElement addMargaritaToCartLinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(addMargaritaToCartLink)));
        addMargaritaToCartLinkElement.click();
    }

    public void openCart() {
        WebElement clickCartLinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(cartLink)));
        clickCartLinkElement.click();
    }
}
