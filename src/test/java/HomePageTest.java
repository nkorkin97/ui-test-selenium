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
                .checkEndpoint(ELEMENTS)
                .getLeftPanel().clickElementsGroup(TEXT_BOX);
//        sleep(10000);
    }
}
