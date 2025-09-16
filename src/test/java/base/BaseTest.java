package base;

import managers.AppManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import static managers.DriverManager.getDriver;

public class BaseTest {

    public WebDriver driver;
    public AppManager app;

//    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

    @BeforeMethod
    public void beforeMethod() {
        driver = getDriver();
        app = new AppManager();
        getDriver().get("http://85.192.34.140:8081/");
    }

    @AfterMethod
    public void afterMethod() {
        if(getDriver()!=null) {
            getDriver().quit();
        }
    }
}
