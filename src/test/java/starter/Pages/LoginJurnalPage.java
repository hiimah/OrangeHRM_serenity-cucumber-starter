package starter.Pages;


import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://account.mekari.com/users/sign_in")
public class LoginJurnalPage extends PageObject {

    @FindBy(id = "user_email")
    WebElement fieldEmail;

    @FindBy(id = "user_password")
    WebElement fieldPassword;

    @FindBy(id = "new-signin-button")
    WebElement loginButton;

    public void inputUserEmail(){
        fieldEmail.sendKeys("hiimahh67@gmail.com");
    }

    public void inputPassword(){
        fieldPassword.sendKeys("Muallimah2611@");
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}
