package po;

import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private String pizzalink = "//a[@href='/catalog/picca']";
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
}
