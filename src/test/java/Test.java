import base.BaseTest;
import org.testng.Assert;

import static java.lang.Thread.sleep;
import static managers.DriverManager.getDriver;

public class Test extends BaseTest {



    @org.testng.annotations.Test
    void test() throws InterruptedException {
        app.getHomePage().clickElementsCard();
        Assert.assertEquals(getDriver().getCurrentUrl(), "https://demoqa.com/elements");
        sleep(1000);
    }
}
