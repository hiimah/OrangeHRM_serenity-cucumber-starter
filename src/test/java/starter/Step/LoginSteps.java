package starter.Step;

import starter.Pages.DashboardPage;
import starter.Pages.LoginJurnalPage;
import starter.Pages.LoginPage;
import net.thucydides.core.annotations.Step;
import static org.junit.Assert.*;

public class LoginSteps {

    LoginPage loginpage;
    DashboardPage dashboardPage;

    LoginJurnalPage loginJurnalPage;

    @Step
    public void openLoginPage(){
        loginpage.open();
    }

    @Step
    public void InputUserName(){
        loginpage.InputUserName();
    }

    @Step
    public void InputPassword(){
        loginpage.InputPassword();
    }

    @Step
    public void clickLoginButton(){
        loginpage.clickLoginButton();
    }

    @Step
    public void verifyDashboardPage(){
        String header = dashboardPage.getHeaderText();
        assertTrue(header.equalsIgnoreCase("dashboard"));
        assertTrue(dashboardPage.isQuickLaunchAppear());
    }

//    public void verifyWelcome(){
//        String header = dashboardPage.getWelcomeText();
//        //System.out.println(header);
//        assertTrue(header.contains("Welcome"));
//    }

    @Step
    public void loginInJurnal() {
        loginJurnalPage.open();
        loginJurnalPage.inputUserEmail();
        loginJurnalPage.inputPassword();
        loginJurnalPage.clickLoginButton();

        }
}
