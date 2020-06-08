@wip
  Feature: Account Summary
    Background: the user is logged in
    Scenario: The user should  be able see the Account summary page which has information about account summary
      Then The title contains "Zero – Account summary".
      Then  Account summary page should have to following account types:
      |Cash Accounts      |
      |Investment Accounts|
      |Loan Accounts      |
      |Credit Accounts    |
      Then Credit Accounts table must have columns Account, Credit Card and Balance.
      |Account     |
      |Credit Card |
      |Balance     |
