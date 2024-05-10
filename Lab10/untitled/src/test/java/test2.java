import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myshows.me/search/all/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("Uzbek228", "uzbek228");

        ShowPage showPage = new ShowPage(driver);
        showPage.watchShow();
    }
}
