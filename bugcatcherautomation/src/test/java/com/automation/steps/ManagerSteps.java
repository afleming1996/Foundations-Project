package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManagerSteps {
@Given("the manager is logged in to their homepage")
public void the_menager_is_logged_in_to_their_homepage(){
    TestRunner.driver.get("File://C:/Users/aflem/OneDrive/Desktop/Revature/Week4/Day4/Login-Automation-Example/bugcatcherautomation/src/test/resources/webpages/Manager-Page.html");
}





@When("the manager enters the defect name")
public void the_manager_enters_the_defect_name(){
    TestRunner.manager.enterDefect("My Defect");
} 
@Then("the manager should have assigned the defect name")
public void the_manager_should_have_assigned_the_defect_name() {
    TestRunner.wait.until(ExpectedConditions.textToBePresentInElementValue(By.id("defectName"), "My Defect"));
    WebElement userInput = TestRunner.driver.findElement(By.id("defectName"));
    
}





@When("the manager enters the Tester Chosen")
public void the_manager_enters_the_Tester_Chosen(){
     TestRunner.manager.enterTesterName("Nightwing");
}
@When("the manager clicks the submit button")
public void the_manager_clicks_the_submit_button(){
    TestRunner.manager.clickButton();
}
@Then("the manager should have assigned the defect")
public void the_manager_should_have_assigned_the_defect(){
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    TestRunner.driver.switchTo().alert().accept();

}
}
