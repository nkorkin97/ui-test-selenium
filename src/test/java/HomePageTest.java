import base.BaseTest;
import org.testng.annotations.Test;

import static helpers.Cards.*;
import static helpers.ElementsGroup.*;
import static java.lang.Thread.sleep;

public class HomePageTest extends BaseTest {



    @Test
    void test() throws InterruptedException {
        app.getHomePage()
                .clickElementsCard()
                .checkEndpoint(ELEMENTS);

        app.getTextBoxPage()
                .getLeftPanel()
                .clickElementsGroup(TEXT_BOX);

        app.getTextBoxPage()
                .checkEndpoint(TEXT_BOX);

        app.getTextBoxPage()
                .getLeftPanel()
                .clickElementsGroup(CHECK_BOX);

        sleep(10000);
    }
}
