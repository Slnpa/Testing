import org.openqa.selenium.WebDriver;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserManager.getDriver();
        driver.get("https://myshows.me/");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();

        Thread.sleep(3000);

        loginPage.clickRegister();

        Thread.sleep(3000);

        // Добавляем шаги регистрации
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.enterText1("фы");
        registrationPage.enterEmail("uzbekrol@gmail.com");
        registrationPage.enterPassword1("123");
        registrationPage.enterPassword2("123");

        Thread.sleep(3000);
        registrationPage.clickLogin();
    }
}
