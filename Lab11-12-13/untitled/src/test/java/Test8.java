import org.openqa.selenium.WebDriver;

public class Test8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/");

        LoginWith loginPage = new LoginWith(driver);
        loginPage.clickLogin();
        loginPage.enterUsername("авыа");
        loginPage.enterPassword("аыв");
        loginPage.clickLoginButton();

        Thread.sleep(3000);
        CommentWith commentPage = new CommentWith(driver);
        commentPage.clickLabelButton();

        Thread.sleep(3000);

        commentPage.enterComment("hello");
        commentPage.clickWriteButton();

        Thread.sleep(3000);
    }
}
