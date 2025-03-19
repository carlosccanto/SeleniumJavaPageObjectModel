package pages.automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class AccountCreatePage extends BasePage {
    private static final String CSS_ACCOUNT_CREATED = "a[data-qa='continue-button']";

    public AccountCreatePage(WebDriver driver) {
        super(driver);
    }

    public void resultContain(String text) {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(
                        new ExpectedCondition<Boolean>() {
                            public Boolean apply(WebDriver driver) {
                                final String content =
                                        driver.findElement(By.cssSelector(CSS_ACCOUNT_CREATED))
                                                .getText();
                                return content.contains(text);
                            }
                        });
    }

}
