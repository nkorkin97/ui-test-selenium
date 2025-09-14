import base.BaseTest;
import helpers.Cards;
import org.testng.Assert;
import org.testng.annotations.Test;

import static helpers.Cards.*;
import static java.lang.Thread.sleep;
import static managers.DriverManager.getDriver;

public class HomePageTest extends BaseTest {



    @Test
    void test() {
        app.getHomePage()
                .clickElementsCard()
                .checkEndpoint(ELEMENTS);
    }
}
