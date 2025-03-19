package pages.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    private static final String BASE_URL = "http://automationexercise.com";

    private static final String CSS_INPUT_LOGIN = "i.fa.fa-lock";
    private static final String CSS_HOME_PAGE = "img[alt='Website for automation practice']";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL);
    }

    public void waitLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(CSS_HOME_PAGE)));
        element.click();
    }

    public void login() {
        final WebElement loginButton = driver.findElement(By.cssSelector(CSS_INPUT_LOGIN));
        loginButton.click();
    }

}
