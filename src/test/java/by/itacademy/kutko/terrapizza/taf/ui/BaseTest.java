package by.itacademy.kutko.terrapizza.taf.ui;

import by.itacademy.kutko.terrapizza.taf.util.Singleton;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import by.itacademy.kutko.terrapizza.taf.po.HomePage;

public class BaseTest {

    @BeforeEach
    public void driverSetup() {
        HomePage homePage = new HomePage();
        homePage.openHomePage();
        homePage.closeCookiesBanner();
    }

    @AfterEach
    public void driverShutDown() {
        Singleton.quitDriver();
    }
}
