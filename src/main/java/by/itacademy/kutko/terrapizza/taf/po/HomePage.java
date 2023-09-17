package by.itacademy.kutko.terrapizza.taf.po;

import by.itacademy.kutko.terrapizza.taf.util.Singleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    private String pizzaPageLink = "//ul[@class='menu-navigation__main active']/..//a[@href='/catalog/picca']";

    public HomePage() {
        this.driver = Singleton.getDriver();
    }

    public void openHomePage() {
        driver.get("https://terrapizza.by/");
    }

    public void closeCookiesBanner() {
        WebElement closeCookiesBanner = driver.findElement(By.xpath("//button[@class='close-icon']"));
        closeCookiesBanner.click();
    }

    public void openPizzaPage() {
        WebElement pizzaPageLinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(pizzaPageLink)));
        pizzaPageLinkElement.click();
    }
}
