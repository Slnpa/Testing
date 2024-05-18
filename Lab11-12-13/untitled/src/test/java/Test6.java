import org.openqa.selenium.WebDriver;

public class Test6 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/search/all/");

        // Предположим, что это страница, где находятся изображение постера и кнопка "Просмотрено"
        RemarkSeries somePage = new RemarkSeries(driver);
        somePage.clickPosterImage();

        Thread.sleep(3000);

        somePage.clickWatchedButton();

        Thread.sleep(3000);

    }
}
