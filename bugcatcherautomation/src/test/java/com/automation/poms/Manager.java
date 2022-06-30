package com.automation.poms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manager {
    private WebDriver driver;

    @FindBy(id="defectName")
    public WebElement userInput;

    @FindBy(id="testerName")
    public WebElement selectName;

    @FindBy(id="Submit")
    public WebElement submitButton;

    public Manager(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
}
    public void enterDefect(String defectName){
    this.userInput.sendKeys(defectName);
}
    public void enterTesterName(String selectName){
        this.selectName.click();
}
    public void clickButton(){
        this.submitButton.click();
}

}

