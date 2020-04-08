$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Openfeatures/opentestcase.feature");
formatter.feature({
  "line": 2,
  "name": "Opencart Homepage",
  "description": "This feature verifies the Registration functionality on Opencart Homepage",
  "id": "opencart-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Opencart"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "validating Registration",
  "description": "",
  "id": "opencart-homepage;validating-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tc_01_Registration"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "clicks on Myaccount",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "clicks on Register",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "enters First Name in details",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "enters Last Name in details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "enters Email in details",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enters Telephone in details",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "enters Password in details",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "enters confirm Password in details",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "clicks on privacy policy in details",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "clicks on submit in details",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "takes a Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.chromeBrowser()"
});
formatter.result({
  "duration": 52486709900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.Myaccount()"
});
formatter.result({
  "duration": 1372374300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.clicks_on_Register()"
});
formatter.result({
  "duration": 10474293900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enters_First_Name_in_details()"
});
formatter.result({
  "duration": 627661300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enters_Last_Name_in_details()"
});
formatter.result({
  "duration": 341107700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enters_Email_in_details()"
});
formatter.result({
  "duration": 1608046500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enters_Telephone_in_details()"
});
formatter.result({
  "duration": 373780500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enters_Password_in_details()"
});
formatter.result({
  "duration": 405821600,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enters_confirm_Password_in_details()"
});
formatter.result({
  "duration": 319927300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.clicks_on_privacy_policy_in_details()"
});
formatter.result({
  "duration": 147474900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.clicks_on_submit_in_details()"
});
formatter.result({
  "duration": 3453997100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.takes_a_screenshot()"
});
formatter.result({
  "duration": 1578253700,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "validating login",
  "description": "",
  "id": "opencart-homepage;validating-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@tc_02_login"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "clicks on Myaccount in homepage",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "clicks on login",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "enter \u003cusername\u003e and \u003cpassword\u003e in the field",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "click submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "takes a screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.chromeBrowser()"
});
formatter.result({
  "duration": 58479395800,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlogin.Myaccount1()"
});
formatter.result({
  "duration": 181000900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlogin.opencart()"
});
formatter.result({
  "duration": 3306959100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlogin.enter_and_in_the_field()"
});
formatter.result({
  "duration": 4519250100,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlogin.click_submit_button()"
});
formatter.result({
  "duration": 4986307300,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlogin.takes_a_screenshot()"
});
formatter.result({
  "duration": 1569435700,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "validating Laptops\u0026Notebooks",
  "description": "",
  "id": "opencart-homepage;validating-laptops\u0026notebooks",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 29,
      "name": "@tc_03_Laptop"
    }
  ]
});
formatter.step({
  "line": 31,
  "name": "I launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 32,
  "name": "clicks on laptops\u0026Notebooks",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "clicks on Addtocart",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "takes a ScreenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.chromeBrowser()"
});
formatter.result({
  "duration": 44848649900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlaptop.notebook()"
});
formatter.result({
  "duration": 8866310900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlaptop.clicks_on_Addtocart()"
});
formatter.result({
  "duration": 643443900,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinitionlaptop.takes_a_screenshot()"
});
formatter.result({
  "duration": 2130390300,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "validating Contactus",
  "description": "",
  "id": "opencart-homepage;validating-contactus",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 37,
      "name": "@tc_04_contactus"
    }
  ]
});
formatter.step({
  "line": 39,
  "name": "I launch Chrome Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 40,
  "name": "clicks on contact us",
  "keyword": "Then "
});
formatter.step({
  "line": 41,
  "name": "enters name on Your name field",
  "keyword": "Then "
});
formatter.step({
  "line": 42,
  "name": "enters email address",
  "keyword": "Then "
});
formatter.step({
  "line": 43,
  "name": "enters info related to enquiry",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "clicks on submit",
  "keyword": "Then "
});
formatter.step({
  "line": 45,
  "name": "clicks on continue",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "takes a screenShot",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.chromeBrowser()"
});
formatter.result({
  "duration": 50581368800,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.clicks_on_contact_us()"
});
formatter.result({
  "duration": 3365739800,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.enters_name_on_Your_name_field()"
});
formatter.result({
  "duration": 1451611700,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.enters_email_address()"
});
formatter.result({
  "duration": 618007800,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.enters_info_related_to_enquiry()"
});
formatter.result({
  "duration": 1245980400,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.clicks_on_submit()"
});
formatter.result({
  "duration": 7764516200,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.clicksoncontinue()"
});
formatter.result({
  "duration": 7033395000,
  "status": "passed"
});
formatter.match({
  "location": "StepdefinitionContactus.takes_a_screenshot()"
});
formatter.result({
  "duration": 1914423200,
  "status": "passed"
});
});