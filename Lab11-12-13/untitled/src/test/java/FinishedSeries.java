import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FinishedSeries {
    private WebDriver driver;
    private By finishedButton = By.xpath("//a[contains(text(), 'Завершен')]");
    public FinishedSeries(WebDriver driver) {
        this.driver = driver;
    }
    public void clickFinishedButton() {
        driver.findElement(finishedButton).click();
        BrowserManager.LOGGER.info("Clicked finished button");
    }
}
