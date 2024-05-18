import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;
public class BrowserManager {
    private static WebDriver driver;
    public static final Logger LOGGER = Logger.getLogger(BrowserManager.class.getName());

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            LOGGER.info("Browser started");
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            LOGGER.info("Browser closed");
            driver = null;
        }
    }
}