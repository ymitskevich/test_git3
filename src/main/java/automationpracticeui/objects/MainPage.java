package automationpracticeui.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class MainPage {
    protected WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id ="search_query_top")
    private WebElement searchInput;

    @FindBy(name ="submit_search")
    private WebElement searchSubmitButton;

    @FindBy(className = "login")
    private WebElement signinButton;

    @FindBy(css = "[src='http://automationpractice.com/img/p/1/2/12-home_default.jpg']")
    private WebElement coolDress;

    public WebElement getSearchInput() {
        return searchInput;
    }

    public WebElement getSearchSubmitButton() {
        return searchSubmitButton;
    }

    public WebElement getSigninButton() {
        return signinButton;
    }

    public WebElement getCoolDress() {
        return coolDress;
    }

}
