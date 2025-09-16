import base.BaseTest;
import org.testng.annotations.Test;
import pages.TextBoxPage;

import static helpers.Cards.*;
import static java.lang.Thread.sleep;

public class HomePageTest extends BaseTest {



    @Test
    void test() throws InterruptedException {
        app.getHomePage()
                .clickElementsCard(ELEMENTS)
                .checkEndpoint(ELEMENTS)
                .getLeftPanel()
                .clickDisclosureButton(FORMS)
                .checkDisclosureButtonShow(FORMS)
                .checkDisclosureButtonCollapse(ELEMENTS)
                .clickDisclosureButton(ELEMENTS)
                .checkDisclosureButtonShow(ELEMENTS)
                .clickTextBox();
        sleep(3000);
    }
}
