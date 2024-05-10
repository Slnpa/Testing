import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShowPage {
    private WebDriver driver;

    public ShowPage(WebDriver driver) {
        this.driver = driver;
    }

    public void watchShow() throws InterruptedException {
        WebElement sherlockElement = driver.findElement(By.xpath("//div[contains(text(),'Шерлок')]"));
        sherlockElement.click();
        Thread.sleep(3000);
        WebElement watchingButton = driver.findElement(By.xpath("//button[contains(@class,'ShowStatusBar__option') and contains(text(),'Смотрю')]"));
        watchingButton.click();
    }
}