import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.logging.Logger;
public class LoginPage {
    private WebDriver driver;
    private By loginButton = By.className("HeaderLogin__username");
    private By registerButton = By.xpath("//a[@href='/registration/' and @class='ModalLoginForm__signup']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
        BrowserManager.LOGGER.info("Clicked login button");
    }

    public void clickRegister() {
        driver.findElement(registerButton).click();
        BrowserManager.LOGGER.info("Clicked register button");
    }
}

