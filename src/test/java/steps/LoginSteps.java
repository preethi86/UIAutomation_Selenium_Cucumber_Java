package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.LoginPageActions;
import utils.SeleniumDriver;

public class LoginSteps {

    LoginPageActions LoginPageActions = new LoginPageActions();

    @Given("user is on the Home Page {string} of AppyMonk Website")
    public void user_is_on_the_Home_Page_of_AppyMonk_Website(String webSiteURL) {
        SeleniumDriver.openPage(webSiteURL);
    }

    @When("user clicks on the signin button")
    public void user_clicks_on_the_signin_button() {
        LoginPageActions.clickSignin();
    }

    @Then("Login page should display with the text {string}")
    public void login_page_should_display_with_a_Welcome_text(String expectedText) {

        LoginPageActions.checkLoginText(expectedText);
    }

    @Given("user on the Login Page")
    public void user_on_the_Login_Page() {
        LoginPageActions.clickLogin();
    }






    @And("user enters the credentials username as {string} and password as {string}")
    public void user_enters_the_credentials_username_as_and_password_as(String userName, String password) {
        LoginPageActions.enterCredentials(userName, password);
    }

    @When("user click login button")
    public void user_click_login_button() {
        LoginPageActions.clickLogin();
    }

    @Then("user should see his details")
    public void user_should_see_his_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
