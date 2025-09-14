package pages.base;

import helpers.Cards;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import static org.openqa.selenium.By.*;

public class LeftPanel {

    @FindBy(xpath = "//div[@class='element-group']//ul[@class='menu-list']/li")
    List<WebElement> elementsList;

    public void init(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void clickBtn(String string) {
        WebElement element = elementsList
                .stream()
                .filter(elementsList -> !elementsList
                        .findElements(By.xpath("./span[contains(text(), '" + string + "')]")).isEmpty())
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Элемент с текстом '" + string + "' не найден"));

        element.click();
    }
}
