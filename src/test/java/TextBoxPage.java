import base.BaseTest;
import data_owner.textbox.TextBoxData;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

import static helpers.Cards.*;
import static java.lang.Thread.sleep;

public class TextBoxPage extends BaseTest {



    @Test
    void test() throws InterruptedException {

        TextBoxData textBoxData = ConfigFactory.create(TextBoxData.class);

        app.getHomePage()
                .clickElementsCard(ELEMENTS)
                .checkEndpoint(ELEMENTS)
                .getLeftPanel()
                .clickDisclosureButton(FORMS)
                .checkDisclosureButtonShow(FORMS)
                .checkDisclosureButtonCollapse(ELEMENTS)
                .clickDisclosureButton(ELEMENTS)
                .checkDisclosureButtonShow(ELEMENTS)
                .clickTextBox()
                .fillFullName(textBoxData.fullName());

        sleep(10000);
    }
}
