package starter.StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import net.thucydides.core.annotations.Steps;
import starter.Step.AddContactStep;

public class AddContactStepdefs {

    @Steps
    AddContactStep addContactStep;

    @When("I click contact menu")
    public void clickContactMenu(){
        addContactStep.clickContactMenu();
    }
    @Then("Contact page appear")
    public void contactPageAppear() {
        addContactStep.verifyContactPage();
    }

    @When("I click new contact")
    public void clickNewContact(){
        addContactStep.clickContactMenu();
    }

    @Then("Create new contact page appear")
    public void createNewContactPageAppear() {
        addContactStep.clickNewContact();
    }

    @When("I fill name with {string}")
    public void fillName(String name) {
        addContactStep.fillContactName(name);
    }

    @And("I choose contact type as customer")
    public void ChooseContactTypeAsCustomer() {
        addContactStep.selectAsCustomer();
    }

    @And("I click add button")
    public void ClickAddButton() {
        addContactStep.clickAddButton();
    }

    @Then("Contact with name {string} is created")
    public void contactNameCreated(String name) {
        addContactStep.verifyContactCreated(name);
    }

    @And("Contact type should be {string}")
    public void contactTypeShouldBe(String type) {
        addContactStep.verifyType(type);
    }


    @Then("I input Number Phone {string}")
    public void iInputNumberPhone(String number) {
        addContactStep.fillNumberPhone(number);
    }
}





