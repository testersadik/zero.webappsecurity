@ZB_004 @pay_bills
Feature: Pay Bills all page verifications

  Background:
    Given the user is logged in
    Then The user click on the "Pay Bills"

  Scenario: Account Activity page should have the title "Zero – Pay Bills".
    Then The title contains "Pay Bills"

  Scenario: The user completes a successful pay operation
    When The user completes a Pay operation with these "10" and "2020-09-09"
    And The user click on the Pay
    Then  The message "The payment was successfully submitted." should be displayed

  @wip
    Scenario Outline: The user should not be able to complete a successful pay operation <testType>
    When The user enter following inputs to relevant fields "<amount>" "<date>" "<testType>"
    And The user click on the Pay
    Then The validation message "Please fill out this field." should be displayed on related "<field>"
    Examples:
      | amount |      date    |field|                                     testType                            |
      |        |  2020-06-27  |amount|Unsuccessful pay operation with blank amount                             |
      |   12   |              |date  |Unsuccessful pay operation with blank date                               |

  Scenario Outline: Amount field and Date field should not accept invalid input <testType>
    When The user enter following inputs to relevant fields "<amount>" "<date>" "<testType>"
    Then The Amount field and Date field should be empty
    Examples:
      | amount |      date    |                                     testType                            |
      | abc    |              |Unsuccessful pay operation with invalid amount (alphabetical characters) |
      |  */_+  |              |Unsuccessful pay operation with invalid amount (special characters)      |
      |        | asdsadsads   |Unsuccessful pay operation with invalid amount                           |



