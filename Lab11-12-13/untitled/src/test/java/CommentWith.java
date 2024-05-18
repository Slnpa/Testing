import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommentWith {
    private WebDriver driver;
    public CommentWith(org.openqa.selenium.WebDriver driver) {
        this.driver = driver;
    }
    // В новом классе, например, CommentPage
    private By labelButton = By.xpath("//div[contains(text(), '859')]");
    private By positiveVoteButton = By.xpath("//span[@class='CommentFooter__vote CommentFooter__vote--positive']");
    private By textComment = By.cssSelector(".Textarea .Textarea__field");
    private By writeButton = By.xpath("//button[@class='Button Button--primary m']");
    public void clickLabelButton() {
        driver.findElement(labelButton).click();
        BrowserManager.LOGGER.info("Clicked label button");
    }
    public void clickWriteButton() {
        driver.findElement(writeButton).click();
        BrowserManager.LOGGER.info("Clicked label button");
    }
    public void enterComment(String comment) {
        driver.findElement(textComment).sendKeys(comment);
        BrowserManager.LOGGER.info("Entered username: " + comment);
    }
    public void clickPositiveVoteButton() {
        driver.findElement(positiveVoteButton).click();
        BrowserManager.LOGGER.info("Clicked positive vote button");
    }
}
