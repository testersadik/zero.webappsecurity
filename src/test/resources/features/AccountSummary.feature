
  Feature: Account Summary
    Background:
      Given the user is logged in
    Scenario: The user should  be able see the Account summary page which has information about account summary
      Then The title contains "Zero - Account Summary"
      And  Account summary page should have following account types:
      |Cash Accounts      |
      |Investment Accounts|
      |Credit Accounts    |
      |Loan Accounts      |
      And Credit Accounts table must have following columns
      |Account     |
      |Credit Card |
      |Balance     |
