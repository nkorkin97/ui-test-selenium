package pages;

import data_owner.DefaultData;
import data_owner.textbox.TextBoxData;
import helpers.ElementsGroup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.base.BasePage;

import static managers.DriverManager.getDriver;
import static managers.DriverManager.wait;

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

    public TextBoxPage fillFullName(DefaultData defaultData) {
        fieldFullName.sendKeys(defaultData.fullName());
        return this;
    }

    public TextBoxPage fillEmail(DefaultData defaultData) {
        fieldEmail.sendKeys(defaultData.email());
        return this;
    }

    public TextBoxPage fillCurrentAddress(DefaultData defaultData) {
        fieldCurrentAddress.sendKeys(defaultData.currentAddress());
        return this;
    }

    public TextBoxPage fillPermanentAddress(DefaultData defaultData) {
        fieldPermanentAddress.sendKeys(defaultData.permanentAddress());
        return this;
    }

    public TextBoxPage clickSubmit() {
        buttonSubmit.click();
        wait.until(ExpectedConditions.visibilityOf(fieldOutput));
        return this;
    }

    public TextBoxPage checkOutput(DefaultData defaultData) {
        Assert.assertTrue(fieldOutput.findElement(By.xpath(".//p[@id='name']")).getText().contains(defaultData.fullName()));
        Assert.assertTrue(fieldOutput.findElement(By.xpath(".//p[@id='email']")).getText().contains(defaultData.email()));
        Assert.assertTrue(fieldOutput.findElement(By.xpath(".//p[@id='currentAddress']")).getText().contains(defaultData.currentAddress()));
        Assert.assertTrue(fieldOutput.findElement(By.xpath(".//p[@id='permanentAddress']")).getText().contains(defaultData.permanentAddress()));
        return this;
    }
}
