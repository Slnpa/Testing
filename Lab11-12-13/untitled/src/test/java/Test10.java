import org.openqa.selenium.WebDriver;

public class Test10 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/");

        LoginWith loginPage = new LoginWith(driver);
        loginPage.clickLogin();
        loginPage.enterUsername("авыа");
        loginPage.enterPassword("аыв");
        loginPage.clickLoginButton();

        Thread.sleep(3000);

        loginPage.clickShowTitle();
        Thread.sleep(3000);
        loginPage.clickSeasonBlockAndNextButton();
        Thread.sleep(3000);
        loginPage.clickConfirmButtonInModal();
    }
}
