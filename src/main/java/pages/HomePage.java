package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(), 'Elements')]")
    WebElement elementsCard;

    @FindBy(xpath = "//div[@class='card-body']//h5[contains(text(), 'Forms')]")
    WebElement formsCard;


    public void clickElementsCard() {
        elementsCard.click();
    }

    public void init(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
