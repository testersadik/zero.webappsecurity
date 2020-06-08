
  Feature:Login
    Background:
      Given The	user should be in the login page

    Scenario: The user should be able to login with valid	credentials

      When The user enters a valid credentials
      Then  Account	summary	page should	be displayed

    Scenario Outline: The user should not be able to login with invalid	credentials
      When The user enters a following invalid "<username>" and "<password>"
      Then  Error message "Login and/or password are wrong." should be displayed
      Examples:
        | username | password |
        |          |          |
        | username |          |
        |          |password  |
        | sdsa     |adfdsa    |