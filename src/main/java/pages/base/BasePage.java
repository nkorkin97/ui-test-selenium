package pages.base;

import static managers.DriverManager.getDriver;

public class BasePage {

    LeftPanel leftPanel;

    public LeftPanel getLeftPanel() {
        if (leftPanel == null) {
            leftPanel = new LeftPanel();
            leftPanel.init(getDriver());
        }
        return this.leftPanel;
    }
}
