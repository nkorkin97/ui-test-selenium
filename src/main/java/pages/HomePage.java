package pages;


import helpers.Cards;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static helpers.Cards.ELEMENTS;
import static managers.DriverManager.getDriver;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(), 'Elements')]")
    WebElement elementsCard;

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(), 'Forms')]")
    WebElement formsCard;


    public HomePage clickElementsCard() {
        elementsCard.click();
        return this;
    }

    public HomePage checkEndpoint(Cards element) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(element.getCardEndpoint()));
        return this;
    }

    public void init(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }
}
