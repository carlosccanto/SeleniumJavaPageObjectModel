package pages.automationexercise;

import java.lang.Thread;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class CompletePage extends BasePage {

    private static final String CSS_BUTTON_GENRE = "#id_gender1";
    private static final String CSS_BUTTON_PASS = "#password";
    private static final String CSS_BUTTON_DAYS = "#days";
    private static final String CSS_BUTTON_MONTHS = "#months";
    private static final String CSS_BUTTON_YEARS = "#years";
    private static final String CSS_BUTTON_FIRSTNAME = "#first_name";
    private static final String CSS_BUTTON_LASTNAME = "#last_name";
    private static final String CSS_BUTTON_ADDRESS = "#address1";
    private static final String CSS_BUTTON_COUTRY = "#country";
    private static final String CSS_BUTTON_STATE = "#state";
    private static final String CSS_BUTTON_CITY = "#city";
    private static final String CSS_BUTTON_ZIPCODE = "#zipcode";
    private static final String CSS_BUTTON_MOBILNUMBER = "#mobile_number";
    private static final String CSS_BUTTON_CREATEACCOUNT = "button[data-qa='create-account']";



    public CompletePage(WebDriver driver) {
        super(driver);
    }

    public void genre() {
        final WebElement genreButton = driver.findElement(By.cssSelector(CSS_BUTTON_GENRE));
        genreButton.click();

    }

    public void pass(String text) {
        final WebElement passButton = driver.findElement(By.cssSelector(CSS_BUTTON_PASS));
        passButton.sendKeys(text);
    }

    public void days() {
        final WebElement dayDropdown = driver.findElement(By.cssSelector(CSS_BUTTON_DAYS));
        Select selectDay = new Select(dayDropdown);
        selectDay.selectByValue("1");

    }

    public void months() {
        final WebElement monthsDropdown = driver.findElement(By.cssSelector(CSS_BUTTON_MONTHS));
        Select selectMonth = new Select(monthsDropdown);
        selectMonth.selectByValue("3");

    }

    public void years() {
        final WebElement yearsDropdown = driver.findElement(By.cssSelector(CSS_BUTTON_YEARS));
        Select selectYear = new Select(yearsDropdown);
        selectYear.selectByValue("1993");

    }

    public void firstName(String text) {
        final WebElement firstNameButton = driver.findElement(By.cssSelector(CSS_BUTTON_FIRSTNAME));
        firstNameButton.sendKeys(text);
    }

    public void lastName(String text) {
        final WebElement lastNameButton = driver.findElement(By.cssSelector(CSS_BUTTON_LASTNAME));
        lastNameButton.sendKeys(text);
    }

    public void address(String text) {
        final WebElement addressButton = driver.findElement(By.cssSelector(CSS_BUTTON_ADDRESS));
        addressButton.sendKeys(text);
    }

    public void country() {
        final WebElement coutryDropdown = driver.findElement(By.cssSelector(CSS_BUTTON_COUTRY));
        Select selectCountry = new Select(coutryDropdown);
        selectCountry.selectByValue("India");

    }

    public void state(String text) {
        final WebElement stateButton = driver.findElement(By.cssSelector(CSS_BUTTON_STATE));
        stateButton.sendKeys(text);
    }

    public void city(String text) {
        final WebElement cityButton = driver.findElement(By.cssSelector(CSS_BUTTON_CITY));
        cityButton.sendKeys(text);
    }

    public void zipCode(String text) {
        final WebElement ZipCodeButton = driver.findElement(By.cssSelector(CSS_BUTTON_ZIPCODE));
        ZipCodeButton.sendKeys(text);
    }

    public void mobilNumber(String text) {
        final WebElement mobilNumberButton = driver.findElement(By.cssSelector(CSS_BUTTON_MOBILNUMBER));
        mobilNumberButton.sendKeys(text);
        mobilNumberButton.sendKeys(Keys.TAB);
    }

    public void createAccount() {

        final WebElement createAccountButton = driver.findElement(By.cssSelector(CSS_BUTTON_CREATEACCOUNT));
        createAccountButton.sendKeys(Keys.ENTER);

    }

}
