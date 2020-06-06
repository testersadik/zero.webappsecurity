
  Feature: Pay Bills
    Background: the user is logged in
    Background: The user click on the "Pay Bills"

    Scenario: Account Activity page should have the title "Zero – Pay Bills".
      Then Account Activity page should have the title "Zero – Pay Bills".

    Scenario: The user completes a successful pay operation
      When The user enter following inputs to relevant fields
        |Payee Name     || apple     |
        |Account        || loan      |
        |Amount         || 10        |
        |Date           || 2020-06-19|
        |Description    || june loan |
      And The user click on the Pay
      Then The message "The payment was successfully submitted." should be displayed

    Scenario: The user should not be able to complete a successful pay operation without entering the amount
      When The user enter following inputs to relevant fields
        |Payee Name     || apple     |
        |Account        || loan      |
        |Date           || 2020-06-19|
        |Description    || june loan |
      When The user click on the Pay
      Then The error message "Please fill out this field message!" should be displayed

    Scenario: The user should not be able to complete a successful pay operation without entering the date
      When The user enter following inputs to relevant fields
        |Payee Name     || apple     |
        |Account        || loan      |
        |Amount         || 10        |
        |Description    || june loan |
      When The user click on the "Pay"
      Then The error message "Please fill out this field message!" should be displayed

     Scenario: The Amount field should not accept alphabetical characters.
       When The user enter "abcdef" to Amount field
       Then The Amount field should not accept alphabetical

    Scenario: The Amount field should not accept  special characters.
      When The user enter "#%%&&/" to Amount field
      Then The Amount field should not accept special characters

    Scenario: The Date field should not accept  alphabetical characters.
      When The user enter "abcdef" to Date field
      Then The Amount field should not accept special characters













    Pay Bills page should have the title Zero – Pay Bills. When user completes a
    successful Pay operation, The payment was successfully submitted. should be
    displayed. When user tries to make a payment without entering the amount or date,
    Please fill out this field message! should be displayed.
    Amount field should not accept alphabetical or special characters. Date field should
    not accept alphabetical characters.
    NOTE: . For the date input field you can just use sendKeys. No need to click on the date navigator.
