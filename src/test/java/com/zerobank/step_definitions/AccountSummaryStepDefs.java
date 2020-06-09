package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;

public class AccountSummaryStepDefs {
    Pages page = new Pages();
    @When("the user is logged in")
    public void the_user_is_logged_in() {
        Driver.get().get(ConfigurationReader.get("url"));
        page.loginPage().login();
    }
    @Then("The title contains {string}")
    public void the_title_contains(String title) {
        page.dashboardPage().verifyToTitle(title);
    }

    @Then("Account summary page should have following account types:")
    public void account_summary_page_should_have_following_account_types(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes= BrowserUtils.getElementsText(page.accountSummary().accountTypes);
        page.accountSummary().assertTwoArrayLists(actualAccountTypes,expectedAccountTypes);

    }

    @Then("Credit Accounts table must have following columns")
    public void credit_Accounts_table_must_have_following_columns(List<String> expectedColumns) {
        List<String> actualColumns= BrowserUtils.getElementsText(page.accountSummary().creditAccountsColumns);
        page.accountSummary().assertTwoArrayLists(actualColumns,expectedColumns);


    }



}
