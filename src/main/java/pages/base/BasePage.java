package pages.base;

import helpers.Cards;
import helpers.ElementsGroup;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import static managers.DriverManager.getDriver;
import static managers.DriverManager.wait;

public class BasePage {

    LeftPanel leftPanel;

    public BasePage() {
        this.leftPanel = new LeftPanel();
        leftPanel.init(getDriver());
    }

    public LeftPanel getLeftPanel() {
        return leftPanel;
    }

    public BasePage checkEndpoint(Cards card) {
        wait.until(ExpectedConditions.urlContains(card.getCardEndpoint()));
//        Assert.assertTrue(getDriver().getCurrentUrl().contains(card.getCardEndpoint()));
        return this;
    }

    public BasePage checkEndpoint(ElementsGroup element) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(element.getElementsGroupEndpoint()));
        return this;
    }
}
