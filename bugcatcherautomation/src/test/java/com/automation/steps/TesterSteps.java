package com.automation.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.automation.runner.TestRunner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TesterSteps {
    @Given("the tester is logged into their homepage")
public void the_tester_is_logged_into_their_homepage() {
    TestRunner.driver.get("File://C:/Users/aflem/OneDrive/Desktop/Revature/Week4/Day4/Login-Automation-Example/bugcatcherautomation/src/test/resources/webpages/Tester-page.html");
}
    @When("the tester clicks on the submit defects button")
public void the_tester_clicks_on_the_submit_defects_button() {
    TestRunner.tester.clickButton();
    
    
}
    @When("the tester clicks the updated defect submit button")
public void the_tester_clicks_the_updated_defect_submit_button() {
    TestRunner.tester.updatedSubmit();
}



@When("the tester clicks on the accept defect selection")
public void the_tester_clicks_on_the_accept_defect_selection() {
    Select testdefect = new Select(TestRunner.driver.findElement(By.id("status")));
    testdefect.selectByVisibleText("Accept");
}
@Then("the tester should accept the defect")
public void the_tester_should_accept_the_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    TestRunner.driver.switchTo().alert().accept();

}


@When("the tester clicks on the decline defect selection")
public void the_tester_clicks_on_the_decline_defect_selection() {
    Select testdefect = new Select(TestRunner.driver.findElement(By.id("status")));
        testdefect.selectByVisibleText("Decline");
}
@Then("the tester should decline the defect")
public void the_tester_should_decline_the_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    TestRunner.driver.switchTo().alert().accept();
}


@When("the tester clicks the rejected selector")
public void the_tester_clicks_the_rejected_selector() {
    Select testdefect = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        testdefect.selectByVisibleText("Reject");
}
@Then("the tester should reject the defect")
public void the_tester_should_reject_the_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    TestRunner.driver.switchTo().alert().accept();
}


@When("the tester clicks the fixed selector")
public void the_tester_clicks_the_fixed_selector() {
    Select testdefect = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        testdefect.selectByVisibleText("Fix");

}
@Then("the tester should have fixed the defect")
public void the_tester_should_have_fixed_the_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    TestRunner.driver.switchTo().alert().accept();
}


@When("the tester clicks the shelved selector")
public void the_tester_clicks_the_shelved_selector() {
    Select testdefect = new Select(TestRunner.driver.findElement(By.id("Fixed")));
        testdefect.selectByVisibleText("Shelve");
}
@Then("the tester should have shelved the defect")
public void the_tester_should_have_shelved_the_defect() {
    TestRunner.wait.until(ExpectedConditions.alertIsPresent());
    TestRunner.driver.switchTo().alert().accept();
}
}
