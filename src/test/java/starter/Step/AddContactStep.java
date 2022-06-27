package starter.Step;

import starter.Pages.ContactDetail;
import starter.Pages.ContactPage;
import starter.Pages.CreateContactPage;
import starter.Pages.MenuPage;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.*;

public class AddContactStep {

    MenuPage menuPage;
    ContactPage contactPage;
    CreateContactPage createContactPage;
    ContactDetail contactDetail;

    @Step
    public void clickContactMenu() {
        menuPage.open();
        menuPage.clickContactMenu();
    }
    @Step
    public void verifyContactPage(){
        String headerPage=contactPage.getHeaderPage();
        assertTrue(headerPage.equalsIgnoreCase("contacts"));
    }

    @Step
    public void clickNewContact(){
        contactPage.clickNewContact();
    }

    @Step
    public void verifyCreateNewContactPage(){
        String headerPage=createContactPage.getNewContactHeader();
        assertTrue(headerPage.equalsIgnoreCase("create new contact"));
    }

    @Step
    public void fillContactName(String name){
        createContactPage.fillName(name);
    }

    @Step
    public void selectAsCustomer(){
        createContactPage.chooseTypeAsCustomer();
    }

    @Step
    public void clickAddButton(){
        createContactPage.clickAddButton();
    }

    @Step
    public  void verifyContactCreated(String ExpectedName) {
        String actualName = contactDetail.getContactName();
        assertTrue(ExpectedName.equalsIgnoreCase(actualName));
        String type= contactDetail.getCustomerType();
        assertTrue(type.equalsIgnoreCase("customer"));
    }

    @Step
    public void verifyType(String Type){
        String getType = contactDetail.getCustomerType();
        assertTrue(getType.equalsIgnoreCase(Type));
    }

    @Step
    public void fillNumberPhone(String number){
        createContactPage.fillNumberPhone(number);
    }
}
