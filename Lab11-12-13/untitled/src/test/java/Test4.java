import org.openqa.selenium.WebDriver;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/search/all/");

        // Предположим, что это страница, где находится кнопка "Завершен"
        FinishedSeries somePage = new FinishedSeries(driver);
        somePage.clickFinishedButton();

        Thread.sleep(3000);

    }
}
