import base.BaseTest;
import helpers.Cards;
import org.testng.Assert;

import static helpers.Cards.*;
import static java.lang.Thread.sleep;
import static managers.DriverManager.getDriver;

public class HomePageTest extends BaseTest {



    @org.testng.annotations.Test
    void test() {
        app.getHomePage()
                .clickElementsCard()
                .checkEndpoint(ELEMENTS);
    }
}
