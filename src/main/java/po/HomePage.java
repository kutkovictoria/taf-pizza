package po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private String pizzaLink = "html/body/div[3]/div[2]/div/div/div/div/div/ul/li[10]/a"; //a[@href='/catalog/picca']

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickPizzaLink() {
        //WebElement pizzaLinkElement = driver.findElement(By.xpath(pizzaLink));
        WebElement pizzaLinkElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(pizzaLink)));
                        //presenceOfElementLocated(By.xpath(pizzaLink)));
        pizzaLinkElement.click();
    }
}
