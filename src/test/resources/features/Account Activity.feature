@ZB_003 @account_activity
Feature: Account Activity
  Background:
    Given the user is logged in
  Scenario: The user should  be able see the Account Activity page which has certain information about account activity
    When The user click on the "Account Activity"
    Then The title contains "Zero - Account Activity"
    And In the Account drop down default option should be "Savings"
    And  Account activity page should have following account types
    |Savings      |
    |Checking     |
    |Loan         |
    |Credit Card  |
    |Brokerage    |
    And Transactions table should have following column names
    |Date         |
    |Description  |
    |Deposit      |
    |Withdrawal   |

