import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private WebDriver driver;
    private By textField1 = By.xpath("//input[@class='Input__field' and @type='text'][1]");
    private By emailField = By.xpath("//div[@name='email']/input[@class='Input__field' and @type='email']");
    private By passwordField1 = By.xpath("//div[@name='password']/input[@class='Input__field' and @type='password']");
    private By passwordField2 = By.xpath("//div[@name='password2']/input[@class='Input__field' and @type='password']");
    private By loginButton = By.xpath("//button[@class='Button Button--info m RegistrationPage__button']");
    public void clickLogin() {
        driver.findElement(loginButton).click();
        BrowserManager.LOGGER.info("Clicked login button");
    }
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterText1(String text) {
        driver.findElement(textField1).sendKeys(text);
        BrowserManager.LOGGER.info("Entered text in first text field: " + text);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
        BrowserManager.LOGGER.info("Entered email: " + email);
    }

    public void enterPassword1(String password) {
        driver.findElement(passwordField1).sendKeys(password);
        BrowserManager.LOGGER.info("Entered password in first password field");
    }

    public void enterPassword2(String password) {
        driver.findElement(passwordField2).sendKeys(password);
        BrowserManager.LOGGER.info("Entered password in second password field");
    }
}
