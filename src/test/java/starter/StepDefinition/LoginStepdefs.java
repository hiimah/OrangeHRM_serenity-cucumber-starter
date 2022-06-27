package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.DefaultUrl;
import starter.Step.LoginSteps;
import net.thucydides.core.annotations.Steps;

@DefaultUrl("https://opensource-demo.orangehrmlive.com/")
public class LoginStepdefs {

    @Steps
    LoginSteps loginSteps;
    @Given("I already on login page")
    public void iAlreadyOnLoginPage() {
        loginSteps.openLoginPage();
    }

    @When("I input my username")
    public void iInputMyUsername() {
        loginSteps.InputUserName();
    }

    @And("I input my password")
    public void iInputMyPassword() {
        loginSteps.InputPassword();
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginSteps.clickLoginButton();
    }

    @Then("The system show dashboard page")
    public void theSystemShowDashboardPage() {
        loginSteps.verifyDashboardPage();
    }

//    @And("The system show welcome message")
//    public void theSystemShowWelcomeMessage() {
//        loginSteps.verifyWelcome();
//    }

//    @Given("I already logged in")
//    public void iAlreadyLoggedIn() {
//        loginSteps.openLoginPage();
//        loginSteps.InputUsername();
//        loginSteps.inputPassword();
//        loginSteps.clickLoginButton();

    @Given("I already logged in")
    public void iAlreadyLoggedIn() {
        loginSteps.loginInJurnal();
    }
}
