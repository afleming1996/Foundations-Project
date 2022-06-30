package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tester {
    private WebDriver driver;

    @FindBy( id ="defectId")
    public WebElement defectId;

    @FindBy( id = "status")
    public WebElement accDecStatus;

    @FindBy(id="submitButton")
    public WebElement accDecButton;

    @FindBy(id = "acceptedDefectId")
    public WebElement updatedDefectId;

    @FindBy(id= "Fixed")
    public WebElement updatedStatus;

    @FindBy(id="updatedSubmitButton")
    public WebElement updatedSubmitButton;

    public Tester(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void selectDefectId(String defectId){
        this.defectId.click();
    }
    public void selctUpdatedDefectId(String acceptedDefectId){
        this.updatedDefectId.click();
    }
    public void statusSelector(String status){
        this.accDecStatus.click();
    }
    public void updatedStatusSelector(String Fixed){
        this.updatedStatus.click();
    }
    public void clickButton(){
        this.accDecButton.click();
    }
    public void updatedSubmit(){
        this.updatedSubmitButton.click();
    }
}
