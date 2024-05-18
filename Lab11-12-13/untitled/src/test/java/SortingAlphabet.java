import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortingAlphabet {
    private WebDriver driver;
    private By alphabetButton = By.xpath("//button[contains(text(), 'алфавит')]");
    public SortingAlphabet(WebDriver driver) {
        this.driver = driver;
    }
    public void clickAlphabetButton() {
        driver.findElement(alphabetButton).click();
        BrowserManager.LOGGER.info("Clicked alphabet button");
    }
}
