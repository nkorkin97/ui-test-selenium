package managers;

import pages.HomePage;
import pages.TextBoxPage;

import static managers.DriverManager.getDriver;

public class AppManager {
//    HomePage homePage;
//    TextBoxPage textBoxPage;

    public static ThreadLocal<HomePage> homePage = new ThreadLocal<>();
    public static ThreadLocal<TextBoxPage> textBoxPage = new ThreadLocal<>();

    public static HomePage getHomePage() {
        if(homePage.get()==null) {
            createHomePage();
        }
        return homePage.get();
    }

    public static TextBoxPage getTextBoxPage() {
        if(textBoxPage.get()==null) {
            createTextBoxPage();
        }
        return textBoxPage.get();
    }

    public static void createHomePage() {
        homePage.set(new HomePage().init(getDriver()));
    }

    public static void createTextBoxPage() {
        textBoxPage.set(new TextBoxPage().init(getDriver()));
    }


//    public HomePage getHomePage() {
//        if (homePage == null) {
//            homePage = new HomePage();
//            homePage.init(getDriver());
//        }
//        return this.homePage;
//    }
//
//    public TextBoxPage getTextBoxPage() {
//        if (textBoxPage == null) {
//            textBoxPage = new TextBoxPage();
//            textBoxPage.init(getDriver());
//        }
//        return this.textBoxPage;
//    }


}
