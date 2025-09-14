package pages;

import helpers.ElementsGroup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.base.BasePage;

import java.nio.file.WatchEvent;

import static managers.DriverManager.getDriver;

public class TextBoxPage extends BasePage {

    public void init(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public TextBoxPage checkEndpoint(ElementsGroup element) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(element.getElementsGroupEndpoint()));
        return this;
    }
}
