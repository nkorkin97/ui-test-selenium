import base.BaseTest;
import org.testng.annotations.Test;
import pages.TextBoxPage;

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
                .clickTextBox().checkEndpoint(TEXT_BOX);
    }
}
