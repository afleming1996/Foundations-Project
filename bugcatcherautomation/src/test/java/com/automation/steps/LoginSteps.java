package com.automation.steps;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
    
    /*user agnostic */
    
@Given("the employee is on the login page")
public void the_employee_is_on_the_login_page() {
    TestRunner.driver.get("File://C:/Users/aflem/OneDrive/Desktop/Revature/Week4/Day4/Login-Automation-Example/bugcatcherautomation/src/test/resources/webpages/Login-Page.html");
}
@When("the employee clicks the login button")
public void the_employee_clicks_the_login_button() {
    TestRunner.login.clickButton();
}



    /*Manager steps */

@When("the manager enters his correct username")
public void the_manager_enters_his_correct_username() {
    TestRunner.login.enterUsername("TheBatman");
}
@When("the manager enters his correct password")
public void the_manager_enters_his_correct_password() {
    TestRunner.login.enterPassword("password");
}

@Then("the manager should be logged in the manager homepage")
public void the_manager_should_be_logged_in_the_manager_homepage() {
    TestRunner.wait.until(ExpectedConditions.titleIs("Manager-Homepage"));
    String title= TestRunner.driver.getTitle();
    Assert.assertEquals("Manager-Homepage", title);
}




    /*Tester steps */

@When("the tester enters his correct username")
public void the_tester_enters_his_correct_username() {
    TestRunner.login.enterUsername("Nightwing");
}
@When("the tester enters his correct password")
public void the_tester_enters_his_correct_password() {
    TestRunner.login.enterPassword("password");
}
@Then("the tester should be logged in the tester homepage")
public void the_tester_should_be_logged_in_the_tester_homepage() {
    TestRunner.wait.until(ExpectedConditions.titleIs("Tester-Page"));
    String title = TestRunner.driver.getTitle();
    Assert.assertEquals("Tester-Page", title);
}


}
