package pages.base;

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
}
