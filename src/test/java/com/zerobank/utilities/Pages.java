package com.zerobank.utilities;

import com.zerobank.pages.*;

public class Pages {


    private LoginPage loginPage;
    private AccountSummary accountSummary;
    private AccountActivity accountActivity;
    private DashboardPage dashboardPage;
    private PayBillsPage payBillsPage;

    public LoginPage loginPage(){
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public AccountSummary accountSummary(){
        if (accountSummary == null) {
            accountSummary = new AccountSummary();
        }
        return accountSummary;
    }

    public AccountActivity accountActivity() {
        if (accountActivity == null) {
            accountActivity = new AccountActivity();
        }
        return accountActivity;
    }
    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage();
        }
        return dashboardPage;
    }
    public PayBillsPage payBillsPage() {
        if (payBillsPage == null) {
            payBillsPage = new PayBillsPage();
        }
        return payBillsPage;
    }


}
