package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity extends BasePage{
    @FindBy(xpath= "//th[.='Date']/../th")
    public List<WebElement> showTransactionsColumns;

    public Select getSelectClassForDropdown(){
        return new Select(Driver.get().findElement(By.id("aa_accountId")));
    }

}
