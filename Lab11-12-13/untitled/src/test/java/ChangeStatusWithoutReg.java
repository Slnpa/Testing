import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeStatusWithoutReg {
    private By posterImage = By.xpath("//div[@class='ShowCatalogCard__poster']/img");
    private By watchingButton = By.xpath("//button[@class='ShowStatusBar__option' and contains(text(), 'Смотрю')]");
    private WebDriver driver;
    public void clickPosterImage() {
        driver.findElement(posterImage).click();
        BrowserManager.LOGGER.info("Clicked poster image");
    }
    public ChangeStatusWithoutReg(WebDriver driver) {
        this.driver = driver;
    }
    public void clickWatchingButton() {
        driver.findElement(watchingButton).click();
        BrowserManager.LOGGER.info("Clicked watching button");
    }
}
