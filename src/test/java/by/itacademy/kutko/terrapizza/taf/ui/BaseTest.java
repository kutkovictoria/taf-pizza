package by.itacademy.kutko.terrapizza.taf.ui;

import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import po.CartPage;
import po.HomePage;
import po.PizzaPage;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void driverSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://terrapizza.by/");
        WebElement closeCookiesBanner = driver.findElement(By.xpath("//button[@class='close-icon']"));
        closeCookiesBanner.click();
    }

    /*public void driverShutDown() {
        driver.quit();
    }*/
}
