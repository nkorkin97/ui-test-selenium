package managers;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.TextBoxPage;

import static managers.DriverManager.getDriver;

public class AppManager {
    HomePage homePage;
    TextBoxPage textBoxPage;

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage();
            homePage.init(getDriver());
        }
        return this.homePage;
    }

    public TextBoxPage getTextBoxPage() {
        if (textBoxPage == null) {
            textBoxPage = new TextBoxPage();
            textBoxPage.init(getDriver());
        }
        return this.textBoxPage;
    }
}
