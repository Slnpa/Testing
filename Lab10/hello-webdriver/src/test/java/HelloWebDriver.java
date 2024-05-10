import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myshows.me/search/all/");

        Thread.sleep(3000);

        SearchPage searchPage = new SearchPage(driver);
        searchPage.enterSearch("Острые козырьки");
        Thread.sleep(3000);
        searchPage.clickSearch();

        Thread.sleep(3000);

        ShowPage showPage = new ShowPage(driver);
        showPage.clickShowTitle();
    }
}
