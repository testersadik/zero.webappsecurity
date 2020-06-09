package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class PayBillsPage extends BasePage {


    @FindBy(css = ".ui-state-default.ui-corner-top")
    public List<WebElement> subTabs;
    @FindBy(id = "sp_amount")
    public WebElement amuountInput;
    @FindBy(id = "sp_date")
    public WebElement dateInput;
    @FindBy(id = "pay_saved_payees")
    public WebElement payButton;


//    /**
//     * this method will navigate subTabs
//     * @param subTabName comes form feature
//     * it will wait for clickablility and click
//     */
//    public void navigateToSubTabs(String subTabName) {
//        BrowserUtils.waitForClickablility(Driver.get().findElement(By.xpath("//li[contains(@class,'ui-state-default ui-corner-top')]//a[contains(text(),'" + subTabName + "')]")), 5).click();
//    }


    /**
     * This method verify that relevant input validation error message and display
     * It takes expected message and relevant input name value, it passes assertion
     * @param message
     * @param inputName
     */
    public void verifyValidationErrorMessage(String message, String inputName){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        WebElement field = Driver.get().findElement(By.cssSelector("input[name='"+inputName+"']"));
        Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", field);
        String actualMessage = (String)js.executeScript("return arguments[0].validationMessage;", field);
        Assert.assertEquals(message,actualMessage);
        boolean isRequired = (Boolean) js.executeScript("return arguments[0].required;",field);
    //Assert.assertFalse(is_valid);
     System.out.println("isRequired = " + isRequired);
      //  BrowserUtils.waitFor(2);
    // Assert.assertTrue((Boolean)((JavascriptExecutor)Driver.get()).executeScript("return arguments[0].validity.valid;", field));
   //Assert.assertTrue(isRequired);
        // !!!! *********   isDisplay yapılamıyor *********!!!!!!!!!!!!!!!!!!!!!!!
//        the validation message is actual displayed and visible when the error happens.
//        Since the default message isn't shown in the page DOM then you won't be able to define a locator for the message itself.
//        Instead you should opt-in to perform visual validation.
    }





}
