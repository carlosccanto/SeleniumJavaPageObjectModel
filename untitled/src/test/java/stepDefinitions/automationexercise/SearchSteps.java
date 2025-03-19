package stepDefinitions.automationexercise;

import hooks.DriverMananger;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.automationexercise.AccountCreatePage;
import pages.automationexercise.CompletePage;
import pages.automationexercise.HomePage;
import pages.automationexercise.RegisterPage;

public class SearchSteps {

    private final HomePage homePage;
    private final RegisterPage registerPage;
    private final CompletePage completePage;
    private final AccountCreatePage accountCreatePage;

    public SearchSteps(DriverMananger webDriverManager) {
        this.homePage = new HomePage(webDriverManager.getDriver());
        this.registerPage = new RegisterPage(webDriverManager.getDriver());
        this.completePage = new CompletePage(webDriverManager.getDriver());
        this.accountCreatePage = new AccountCreatePage(webDriverManager.getDriver());

    }

    @Given("I Navigate to automationexercise page")
    public void loadAutomationPage() {
        homePage.open();
    }

    @Given("I Click on the login button")
    public void loginButton() {
        homePage.login();
    }

    @When("I Enter name {string}")
    public void nameButton(String text) {
        registerPage.name(text);
    }

    @When("I Enter email address {string}")
    public void emailButton(String text) {
        registerPage.email(text);
    }

    @When("I Click Signup button")
    public void button() {
        registerPage.SingUp();
    }

    @When("I Click Title Mr")
    public void genre() { completePage.genre(); }

    @When("I Fill Password {string}")
    public void pass(String text) { completePage.pass(text);}

    @When("Select day of birth")
    public void days() { completePage.days();}

    @When("Select month of birth")
    public void months() { completePage.months();}

    @When("Select year of birth")
    public void years() { completePage.years();}

    @When("I Fill First name field {string}")
    public void name(String text) { completePage.firstName(text);}

    @When("I Fill Last name field {string}")
    public void lastName(String text) { completePage.lastName(text);}

    @When("I Fill Address field {string}")
    public void address(String text) { completePage.address(text);}

    @When("I Select country")
    public void country() { completePage.country();}

    @When("I Fill State field {string}")
    public void state(String text) { completePage.state(text);}

    @When("I Fill City field {string}")
    public void city(String text) { completePage.city(text);}

    @When("I Fill Zipcode field {string}")
    public void zipCode(String text) { completePage.zipCode(text);}

    @When("I Fill Mobile Number field {string}")
    public void mobileNumber(String text) { completePage.mobilNumber(text);}

    @When("I Click Create Account button")
    public void createAccount() { completePage.createAccount(); }

    @Then("the text {string} should be visible on the result page on the Search Engine page")
    public void checkContent(String text) {accountCreatePage.resultContain(text);}


}

