import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;
public class SearchPage {
    private WebDriver driver;
    private By searchInput = By.className("SearchField__input");
    private By searchButton = By.className("SearchField__submit");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearch(String query) {
        driver.findElement(searchInput).sendKeys(query);
        BrowserManager.LOGGER.info("Entered search query: " + query);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
        BrowserManager.LOGGER.info("Clicked search button");
    }
}