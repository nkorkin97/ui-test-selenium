package pages;

import data_owner.textbox.TextBoxData;
import helpers.ElementsGroup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.base.BasePage;

import static managers.DriverManager.getDriver;

public class TextBoxPage extends BasePage {

    @FindBy(xpath = "//input[@id='userName']")
    WebElement fieldFullName;

    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement fieldEmail;

    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement fieldCurrentAddress;

    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement fieldPermanentAddress;

    @FindBy(xpath = "//button[@id='submit']")
    WebElement buttonSubmit;

    @FindBy(xpath = "//div[@id='output']")
    WebElement fieldOutput;

    public TextBoxPage init(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        return this;
    }

    public TextBoxPage fillFullName(String fullName) {
        fieldFullName.sendKeys(fullName);
        return this;
    }

    public TextBoxPage fillEmail(String email) {
        fieldEmail.sendKeys(email);
        return this;
    }

    public TextBoxPage fillCurrentAddress(String currentAddress) {
        fieldCurrentAddress.sendKeys(currentAddress);
        return this;
    }

    public TextBoxPage fillPermanentAddress(String permanentAddress) {
        fieldPermanentAddress.sendKeys(permanentAddress);
        return this;
    }

    public TextBoxPage clickSubmit() {
        buttonSubmit.click();
        return this;
    }
}
