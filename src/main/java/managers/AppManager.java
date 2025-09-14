package managers;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

public class AppManager {
    HomePage homePage;
    WebDriver driver;

    public AppManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
            homePage.init(driver);
        }
        return this.homePage;
    }
}
