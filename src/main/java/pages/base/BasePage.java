package pages.base;

import helpers.Cards;
import helpers.ElementsGroup;
import org.testng.Assert;
import pages.HomePage;

import static managers.DriverManager.getDriver;

public class BasePage {

    LeftPanel leftPanel;

    public BasePage() {
        this.leftPanel = new LeftPanel();
        leftPanel.init(getDriver());
    }

    public LeftPanel getLeftPanel() {
        return leftPanel;
    }

    public BasePage checkEndpoint(Cards element) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(element.getCardEndpoint()));
        return this;
    }

    public BasePage checkEndpoint(ElementsGroup element) {
        Assert.assertTrue(getDriver().getCurrentUrl().contains(element.getElementsGroupEndpoint()));
        return this;
    }
}
