package managers;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Optional;

public class DriverManager {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    public static WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(5));

    public static void stabilityWait() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebDriver getDriver() {
        if(driver.get()==null) {
            createDriver();
        }
        return driver.get();
    }

    public static void createDriver() {
//        driver.set(ChromeDriverManager.getInstance().capabilities(getChromeOptions()).create());
        switch (Optional.ofNullable(System.getProperty("browser")).orElse("chrome")) {
            case "chrome":
                driver.set(new ChromeDriver(getChromeOptions()));
                break;
            case "firefox":
                driver.set(new FirefoxDriver(getFirefoxOptions()));
                break;
        }
    }

    private static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        return chromeOptions;
    }

    private static FirefoxOptions getFirefoxOptions() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
//        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        return firefoxOptions;
    }
}
