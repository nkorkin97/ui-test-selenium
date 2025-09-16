package pages.base;

import helpers.Cards;
import helpers.ElementsGroup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.TextBoxPage;

import java.util.List;
import java.util.NoSuchElementException;

import static helpers.ElementsGroup.*;
import static managers.AppManager.getTextBoxPage;
import static managers.DriverManager.*;
import static org.openqa.selenium.By.*;

public class LeftPanel {

    @FindBy(xpath = "//div[@class='element-group']//ul[@class='menu-list']/li")
    List<WebElement> elementsList;

    String disclosureButtonTemplate = "//div[@class='element-group']//div[contains(text(), '%s')]/following-sibling::div[@class='header-right']";
//    String itemTemplate = "//div[@class='element-group']//ul[@class='menu-list']/li//span[contains(text(), '%s')]/ancestor::li";
    public void init(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void clickElementsGroup(ElementsGroup elementsGroup) {
        WebElement element = elementsList
                .stream()
                .filter(elementsList -> !elementsList
                        .findElements(xpath("./span[contains(text(), '" + elementsGroup.getElementsGroupName() + "')]")).isEmpty())
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Элемент с текстом '" + elementsGroup.getElementsGroupName() + "' не найден"));
        element.click();
    }

    public TextBoxPage clickTextBox() {
        clickElementsGroup(TEXT_BOX);
        return getTextBoxPage();
    }

//    public TextBoxPage clickTextBox() {
//        WebElement item = getDriver().findElement(By.xpath(String.format(itemTemplate, TEXT_BOX.getElementsGroupName())));
//        item.click();
//        return getTextBoxPage();
//    }

    public LeftPanel clickDisclosureButton(Cards card) {
        stabilityWait();
        WebElement element = getDriver().findElement(By.xpath(String.format(disclosureButtonTemplate, card.getCardName())));
        element.click();
        return this;
    }

    public LeftPanel checkDisclosureButtonShow(Cards card) {
        WebElement element = getDriver().findElement(By.xpath(String.format(disclosureButtonTemplate, card.getCardName())));
        WebElement list = element.findElement(By.xpath("./ancestor::div[@class='element-group']//div[contains(@class, 'element-list')]"));
        wait.until(ExpectedConditions.attributeContains(list, "class", "show"));
        return this;
    }

    public LeftPanel checkDisclosureButtonCollapse(Cards card) {
        WebElement element = getDriver().findElement(By.xpath(String.format(disclosureButtonTemplate, card.getCardName())));
        WebElement list = element.findElement(By.xpath("./ancestor::div[@class='element-group']//div[contains(@class, 'element-list')]"));
        wait.until(ExpectedConditions.attributeContains(list, "class", "collapse"));
        return this;
    }
}
