import base.BaseTest;
import data_owner.textbox.TextBoxData;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.Test;

import static helpers.Cards.*;

public class TextBoxPage extends BaseTest {


    @Test
    void fillFormTest() {

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
                .fillFullName(textBoxData)
                .fillEmail(textBoxData)
                .fillCurrentAddress(textBoxData)
                .fillPermanentAddress(textBoxData)
                .clickSubmit()
                .checkOutput(textBoxData);
    }
}
