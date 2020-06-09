package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class AccountSummary extends BasePage{

    @FindBy(className= "board-header")
    public List<WebElement> accountTypes;

    @FindBy(xpath= "//th[.='Credit Card']/../th")
    public List<WebElement> creditAccountsColumns;


}
