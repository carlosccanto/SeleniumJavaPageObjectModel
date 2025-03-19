package pages.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

    private static final String CSS_INPUT_NAME = "input[name='name']";
    private static final String CSS_INPUT_EMAIL = "input[data-qa='signup-email']";
    private static final String CSS_BUTTON_SINGUP = "button[data-qa='signup-button']";

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void name(String text) {
        final WebElement nameImput = driver.findElement(By.cssSelector(CSS_INPUT_NAME));
        nameImput.sendKeys(text);
    }

    public void email(String text) {
        final WebElement emailImput = driver.findElement(By.cssSelector(CSS_INPUT_EMAIL));
        emailImput.sendKeys(text);
    }

    public void SingUp() {
        final WebElement SingUpButton = driver.findElement(By.cssSelector(CSS_BUTTON_SINGUP));
        SingUpButton.click();
    }

}
