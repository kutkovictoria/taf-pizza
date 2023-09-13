package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver driver;
    private String pizzaPageLink = "html/body/div[3]/div[2]/div/div/div/div/div/ul/li[10]/a"; //a[@href='/catalog/picca']

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openPizzaPage() {
        WebElement pizzaPageLinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(pizzaPageLink)));
        pizzaPageLinkElement.click();
    }
}
