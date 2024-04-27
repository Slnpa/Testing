import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://myshows.me/search/all/");

        Thread.sleep(3000);
        // Найти элемент <input> по классу
        WebElement searchInput = driver.findElement(By.className("SearchField__input"));

        // Ввести текст "Острые козырьки" в поле ввода
        searchInput.sendKeys("Острые козырьки");
        Thread.sleep(3000);
        // Найти элемент <button> по классу
        WebElement searchButton = driver.findElement(By.className("SearchField__submit"));

        // Нажать на кнопку "Найти"
        searchButton.click();
        Thread.sleep(3000);
        // Найти элемент <div> с классом "ShowCatalogCard__title" и текстом "Острые козырьки"
        WebElement showTitle = driver.findElement(By.xpath("//div[@class='ShowCatalogCard__title' and contains(text(),'Острые козырьки')]"));

        // Нажать на элемент с названием шоу
        showTitle.click();
    }
}
