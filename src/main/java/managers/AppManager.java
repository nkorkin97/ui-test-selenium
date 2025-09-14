package managers;

import org.openqa.selenium.WebDriver;
import pages.HomePage;

import static managers.DriverManager.getDriver;

public class AppManager {
    HomePage homePage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
            homePage.init(getDriver());
        }
        return this.homePage;
    }
}
