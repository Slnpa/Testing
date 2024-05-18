import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RemarkSeries {
    private By posterImage = By.xpath("//div[@class='ShowCatalogCard__poster-wrapper']/div[@class='ShowCatalogCard__poster']");
    private By watchedButton = By.xpath("//div[@class='EpisodeWatchLabel']");
    private WebDriver driver;
    public void clickPosterImage() {
        driver.findElement(posterImage).click();
        BrowserManager.LOGGER.info("Clicked poster image");
    }
    public RemarkSeries(WebDriver driver) {
        this.driver = driver;
    }
    public void clickWatchedButton() {
        driver.findElement(watchedButton).click();
        BrowserManager.LOGGER.info("Clicked watched button");
    }
}
