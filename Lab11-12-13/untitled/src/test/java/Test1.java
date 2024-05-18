import org.openqa.selenium.WebDriver;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
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