package com.zerobank.step_definitions;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.graalvm.compiler.asm.sparc.SPARCAssembler.Br;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityStepDef {

    Pages page = new Pages();
    @When("The user click on the {string}")
    public void the_user_click_on_the(String tab) { page.dashboardPage().navigateToTab(tab);
    }

    @Then("In the Account drop down default option should be {string}")
    public void in_the_Account_drop_down_default_option_should_be(String defaultOption) {
        Assert.assertTrue(defaultOption.contains(page.accountActivity().getSelectClassForDropdown().getFirstSelectedOption().getText()));
    }

    @And("Account activity page should have following account types")
    public void account_activity_page_should_have_following_account_types(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes= BrowserUtils.getElementsText(page.accountActivity().getSelectClassForDropdown().getAllSelectedOptions());
        page.accountSummary().assertTwoArrayLists(actualAccountTypes,expectedAccountTypes);
    }

    @And("Transactions table should have following column names")
    public void transactions_table_should_have_following_column_names(List<String> expectedAccountTypes) {
        List<String> actualAccountTypes= BrowserUtils.getElementsText(page.accountActivity().showTransactionsColumns);
        page.accountSummary().assertTwoArrayLists(actualAccountTypes,expectedAccountTypes);
    }



}
