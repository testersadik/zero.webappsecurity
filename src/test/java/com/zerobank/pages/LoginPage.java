package com.zerobank.pages;

import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(id="user_login")
    public WebElement userName;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;



    public void login() {
        userName.sendKeys(ConfigurationReader.get("username")+Keys.TAB+
                ConfigurationReader.get("password")+ Keys.ENTER);
    }
    public void loginAs(String username , String password) {
        userName.sendKeys(username+Keys.TAB+
                password+ Keys.ENTER);
    }



}
