$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Task1.feature");
formatter.feature({
  "line": 1,
  "name": "Adding new address to account",
  "description": "",
  "id": "adding-new-address-to-account",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "As logged user add new address to account",
  "description": "",
  "id": "adding-new-address-to-account;as-logged-user-add-new-address-to-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login to account",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click field Addresses after the log in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter alias \u003calias\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter address\u003caddress\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter city \u003ccity\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter postalcode \u003cpostalcode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter phone \u003cphone\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Confirm form",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "New address added",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Close browser",
  "keyword": "And "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "adding-new-address-to-account;as-logged-user-add-new-address-to-account;",
  "rows": [
    {
      "cells": [
        "alias",
        "address",
        "city",
        "postalcode",
        "phone"
      ],
      "line": 17,
      "id": "adding-new-address-to-account;as-logged-user-add-new-address-to-account;;1"
    },
    {
      "cells": [
        "piotr",
        "dsafafsa",
        "Szczecin",
        "32-311",
        "123456"
      ],
      "line": 18,
      "id": "adding-new-address-to-account;as-logged-user-add-new-address-to-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 18,
  "name": "As logged user add new address to account",
  "description": "",
  "id": "adding-new-address-to-account;as-logged-user-add-new-address-to-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "Login to account",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Click field Addresses after the log in",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Create new address",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Enter alias piotr",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Enter addressdsafafsa",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Enter city Szczecin",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Enter postalcode 32-311",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Enter phone 123456",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Confirm form",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "New address added",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Close browser",
  "keyword": "And "
});
formatter.match({
  "location": "AddressesSteps.logInToAccount()"
});
formatter.result({
  "duration": 4368004600,
  "status": "passed"
});
formatter.match({
  "location": "AddressesSteps.clickFieldAddressesOnAccount()"
});
formatter.result({
  "duration": 272935700,
  "status": "passed"
});
formatter.match({
  "location": "AddressesSteps.createNewAddress()"
});
formatter.result({
  "duration": 290965200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "piotr",
      "offset": 12
    }
  ],
  "location": "AddressesSteps.enterAlias(String)"
});
formatter.result({
  "duration": 140569400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "dsafafsa",
      "offset": 13
    }
  ],
  "location": "AddressesSteps.enterAddress(String)"
});
formatter.result({
  "duration": 99209600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " Szczecin",
      "offset": 10
    }
  ],
  "location": "AddressesSteps.enterCity(String)"
});
formatter.result({
  "duration": 153886900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " 32-311",
      "offset": 16
    }
  ],
  "location": "AddressesSteps.enterPostalcode(String)"
});
formatter.result({
  "duration": 123951900,
  "status": "passed"
});
formatter.match({
  "location": "AddressesSteps.selectCountryFromList()"
});
formatter.result({
  "duration": 177023800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": " 123456",
      "offset": 11
    }
  ],
  "location": "AddressesSteps.enterPhone(String)"
});
formatter.result({
  "duration": 131991100,
  "status": "passed"
});
formatter.match({
  "location": "AddressesSteps.confirmForm()"
});
formatter.result({
  "duration": 391553900,
  "status": "passed"
});
formatter.match({
  "location": "AddressesSteps.confirmAddress()"
});
formatter.result({
  "duration": 30089000,
  "status": "passed"
});
formatter.match({
  "location": "AddressesSteps.closeBrowser()"
});
formatter.result({
  "duration": 664987600,
  "status": "passed"
});
});