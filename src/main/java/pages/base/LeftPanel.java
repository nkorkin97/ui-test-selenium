package pages.base;

import helpers.ElementsGroup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.TextBoxPage;

import java.util.List;
import java.util.NoSuchElementException;

import static org.openqa.selenium.By.*;

public class LeftPanel {

    @FindBy(xpath = "//div[@class='element-group']//ul[@class='menu-list']/li")
    List<WebElement> elementsList;

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
}
