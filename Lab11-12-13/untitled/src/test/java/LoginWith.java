import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginWith {
    private By usernameField = By.xpath("//input[@autocomplete='username']");
    private By passwordField = By.xpath("//input[@autocomplete='current-password']");
    private By loginButton = By.xpath("//button[@class='Button Button--info m ModalLoginForm__submit']");
    private By clickTitle = By.xpath("//span[contains(@class,'Unwatched-showTitle-title') and contains(text(),'Шерлок')]");
    private By willButton = By.xpath("//button[contains(@class,'ShowStatusBar__option') and contains(text(),'Буду')]");
    private By episodeCheckButton = By.xpath("//h3[contains(text(),'2 сезон')]/following-sibling::div[contains(@class, 'EpisodeWatchLabel')]");

    private WebDriver driver;
    private By loginButtonf = By.className("HeaderLogin__username");

    public LoginWith(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        driver.findElement(loginButtonf).click();
        BrowserManager.LOGGER.info("Clicked login button");
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
        BrowserManager.LOGGER.info("Entered username: " + username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
        BrowserManager.LOGGER.info("Entered password");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
        BrowserManager.LOGGER.info("Clicked login button");
    }

    public void clickShowTitle() {
        driver.findElement(clickTitle).click();
        BrowserManager.LOGGER.info("Clicked show title");
    }

    public void clickWillButton() {
        WebElement block = driver.findElement(By.cssSelector(".ShowStatusBar__list"));
        WebElement button = block.findElement(willButton);
        button.click();
        BrowserManager.LOGGER.info("Clicked will button");
    }

    public void clickEpisodeCheckButton() {
        WebElement button = driver.findElement(episodeCheckButton);
        button.click();
        BrowserManager.LOGGER.info("Clicked episode check button");
    }

    public void clickSeasonBlockAndNextButton() {
        // Находим блок сезона
        WebElement seasonBlock = driver.findElement(By.xpath("//div[contains(@class, 'Col left all episodes-by-season__season-row_column') and .//a[@href='/view/7718/sherlock-season-2/']]"));

        // Находим следующий блок
        WebElement nextBlock = seasonBlock.findElement(By.xpath("./following-sibling::div"));

        // Кликаем по элементу внутри следующего блока
        WebElement episodeWatchLabel = nextBlock.findElement(By.className("EpisodeWatchLabel"));
        episodeWatchLabel.click();

        BrowserManager.LOGGER.info("Clicked season block and next button");
    }

    public void clickConfirmButtonInModal() {
        WebDriverWait wait = new WebDriverWait(driver, 10); // ожидание до 10 секунд
        By modalSelector = By.cssSelector("div.vfm__content.vfm--outline-none.Modal__wrapper");
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalSelector));

        // Находим кнопку внутри модального окна и кликаем по ней
        By confirmButtonSelector = By.cssSelector("button.Button.Button--info.Button--narrow.m.ConfirmModal__confirm-button");
        WebElement confirmButton = driver.findElement(confirmButtonSelector);
        confirmButton.click();

        BrowserManager.LOGGER.info("Clicked confirm button in modal");
    }



}
