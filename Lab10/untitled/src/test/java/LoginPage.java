import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) throws InterruptedException {
        WebElement loginButton = driver.findElement(By.xpath("//div[contains(text(),'Войти')]"));
        loginButton.click();
        Thread.sleep(1000);
        WebElement loginField = driver.findElement(By.name("login"));
        loginField.sendKeys(username);
        Thread.sleep(1000);
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
        passwordField.submit();
        Thread.sleep(1000);
    }
}