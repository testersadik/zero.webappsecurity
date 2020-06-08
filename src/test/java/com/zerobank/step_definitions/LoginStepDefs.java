package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {
    Pages page = new Pages();
    @Given("The	user should be in the login page")
    public void the_user_should_be_in_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters a valid credentials")
    public void the_user_enters_a_valid_credentials() {
        page.loginPage().login();
    }
    @Then("Account	summary	page should	be displayed")
    public void account_summary_page_should_be_displayed() {
        page.dashboardPage().verifyToTitle("Zero - Account Summary");
    }
    @When("The user enters a following invalid {string} and {string}")
    public void the_user_enters_a_following_invalid_and(String username, String password) {
         page.loginPage().loginAs(username,password);
    }
    @Then("Error message {string} should be displayed")
    public void error_message_should_be_displayed(String errorMessageText) {
        Assert.assertTrue(page.loginPage().errorMessage.isDisplayed());
        Assert.assertTrue(page.loginPage().errorMessage.getText().contains(errorMessageText));
    }

}
