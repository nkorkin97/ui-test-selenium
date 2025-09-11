package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage extends BasePage {

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(), 'Elements')]")
    WebElement elementCard;

    public void clickElementCard() {
        elementCard.click();
    }
}
