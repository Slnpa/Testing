import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    private WebDriver driver;
    private By searchInput = By.className("SearchField__input");
    private By searchButton = By.className("SearchField__submit");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearch(String query) {
        driver.findElement(searchInput).sendKeys(query);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }
}
