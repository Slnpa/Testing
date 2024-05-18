import org.openqa.selenium.WebDriver;

public class Test5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/search/all/");

        // Предположим, что это страница, где находятся изображение постера и кнопка "Смотрю"
        ChangeStatusWithoutReg somePage = new ChangeStatusWithoutReg(driver);
        somePage.clickPosterImage();

        Thread.sleep(3000);

        somePage.clickWatchingButton();

        Thread.sleep(3000);

    }
}
