
Feature: Account Activity
  Background: the user is logged in
  Scenario: The user should  be able see the Account Activity page which has information about account activity
    When The user click on the "Account Activity"
    Then Account Activity page should have the title "Zero – Account summary".
    Then In the Account drop down default option should be Savings
    Then  Account activity page should have to following account types:
    |Savings      |
    |Checking     |
    |Loan         |
    |Credit Card  |
    |Brokerage    |
    Then Transactions table should have following column names
    |Date         |
    |Description  |
    |Deposit      |
    |Withdrawal   |

