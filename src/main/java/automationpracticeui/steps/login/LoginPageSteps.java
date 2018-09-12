package automationpracticeui.steps.login;

import automationpracticeui.objects.login.LoginPage;
import automationpracticeui.steps.MainPageSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSteps extends MainPageSteps {
    private LoginPage loginPage;

    public LoginPageSteps(WebDriver driver) {
        super(driver);
        loginPage = PageFactory.initElements(driver, LoginPage.class);
    }

    public SignUpPageSteps performEmailRegistration(String email) {
        loginPage.getEmailAddressRegistrationInput().clear();
        loginPage.getEmailAddressRegistrationInput().sendKeys(email);
        loginPage.getEmailAddressRegistrationButton().click();
        return new SignUpPageSteps(driver);

    }


}
