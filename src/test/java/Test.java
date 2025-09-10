import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Test extends BaseTest {


    @org.testng.annotations.Test
    void test() throws InterruptedException {
        Assert.assertTrue(driver.getCurrentUrl().contains("demoqa"));
    }
}
