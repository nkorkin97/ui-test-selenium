package base;

import managers.AppManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static managers.DriverManager.getDriver;

public class BaseTest {

    public WebDriver driver;
    public AppManager app;
    @BeforeMethod
    public void beforeMethod() {
        driver = getDriver();
        app = new AppManager();
        getDriver().get("https://demoqa.com/");
    }

    @AfterMethod
    public void afterMethod() {
        if(getDriver()!=null) {
            getDriver().quit();
        }
    }
}
