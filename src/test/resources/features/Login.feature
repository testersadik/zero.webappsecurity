
  Feature:Login
    Scenario: The user should be able to login with valid	credentials
      Given The	user should be in the login page
      When The user enters a valid credentials
      Then  Account	summary	page should	be displayed

    Scenario: The user should not be able to login with invalid	credentials
      Given The	user should be in the login page
      When The user enters a following invalid credentials
      ||||
      |username|||
      |||password|
      |sdsa||adfdsa|
      Then  Error message "Login and/or password are wrong." should be displayed

