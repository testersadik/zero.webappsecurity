package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import com.zerobank.utilities.Pages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class PayBillStepDefs {
    Pages page = new Pages();

    @When("The user completes a Pay operation with these {string} and {string}")
    public void the_user_completes_a_Pay_operation_with_these_and(String amount, String date) {
        page.payBillsPage().amuountInput.sendKeys(amount);
        page.payBillsPage().dateInput.sendKeys(date);
    }

    @Then("The message {string} should be displayed")
    public void the_message_should_be_displayed(String messageText) {
        page.dashboardPage().verifyElementDisplayedByLocatingText(messageText);
    }

    @When("The user enter following inputs to relevant fields {string} {string} {string}")
    public void the_user_enter_following_inputs_to_relevant_fields(String amount,String date, String testType) {
        page.payBillsPage().amuountInput.sendKeys(amount);
        page.payBillsPage().dateInput.sendKeys(date);
    }

    @Then("The Amount field and Date field should be empty")
    public void the_Amount_field_and_Date_field_should_be_empty() {
       Assert.assertEquals("fail","",page.payBillsPage().amuountInput.getAttribute("value"));
       Assert.assertEquals("fail","",page.payBillsPage().dateInput.getAttribute("value"));
    }


    @Then("The validation message {string} should be displayed on related {string}")
    public void the_validation_message_should_be_displayed_on_related(String expectedMessage, String fieldName) {
        // Write code here that turns the phrase above into concrete actions
       // String actualMessage = Driver.get().findElement(By.xpath("//*[contains(text(),'"+fieldName+"')]")).getAttribute("validationMessage");
       // String actualMessage = page.payBillsPage().amuountInput.getAttribute("validationMessage");
        String actualMessage = Driver.get().findElement(By.cssSelector("input[name='"+fieldName+"']")).getAttribute("validationMessage");

        Assert.assertEquals(actualMessage,expectedMessage);

    }
    @When("The user click on the Pay")
    public void the_user_click_on_the_Pay() {
        // Write code here that turns the phrase above into concrete actions
        page.payBillsPage().payButton.click();
    }


}
