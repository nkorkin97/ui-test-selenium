import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pages.TestPage;

import static java.lang.Thread.sleep;
import static managers.DriverManager.getDriver;

public class Test extends BaseTest {



    @org.testng.annotations.Test
    void test() throws InterruptedException {
        TestPage testPage = new TestPage();
        PageFactory.initElements(getDriver(), testPage);
//        Assert.assertTrue(getDriver().getCurrentUrl().contains("demoqa"));
        testPage.clickElementCard();
        sleep(1000);
    }
}
