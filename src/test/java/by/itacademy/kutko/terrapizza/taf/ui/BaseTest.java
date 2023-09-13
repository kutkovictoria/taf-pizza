package by.itacademy.kutko.terrapizza.taf.ui;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import po.HomePage;

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

    @AfterEach
    public void driverShutDown() {
        driver.quit();
    }
}
