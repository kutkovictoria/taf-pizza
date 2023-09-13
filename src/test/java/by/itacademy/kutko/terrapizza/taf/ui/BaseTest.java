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
        HomePage homePage = new HomePage(driver);
        homePage.closeCookiesBanner();
    }

    /*public void driverShutDown() {
        driver.quit();
    }*/
}
