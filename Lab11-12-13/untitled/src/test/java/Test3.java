import org.openqa.selenium.WebDriver;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/search/all/");

        // Предположим, что это страница, где находится кнопка "алфавит"
        SortingAlphabet somePage = new SortingAlphabet(driver);
        somePage.clickAlphabetButton();

        Thread.sleep(3000);

        somePage.clickAlphabetButton();

        Thread.sleep(3000);

    }
}
