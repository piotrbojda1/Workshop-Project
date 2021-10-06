Feature: Adding new address to account

  Scenario Outline: As logged user add new address to account
    Given Login to account
    When Click field Addresses after the log in
    And Create new address
    Then Enter alias <alias>
    And Enter address<address>
    And Enter city <city>
    And Enter postalcode <postalcode>
    And select country
    And Enter phone <phone>
    And Confirm form
    And New address added
    And Close browser
    Examples:
      | alias | address  | city     | postalcode | phone  |
      | piotr | dsafafsa | Szczecin | 32-311     | 123456 |