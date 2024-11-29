package Formy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebForm {
    private WebDriver driver;
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By highSchool = By.id("radio-button-1");
    private By college = By.id("radio-button-2");
    private By gradSchool = By.id("radio-button-3");
    private By male = By.id("checkbox-1");
    private By female = By.id("checkbox-2");
    private By preferNot = By.id("checkbox-3");
    private By date = By.id("datepicker");
//    private By submitBtn = By.xpath("//a[@role='button']");

    public WebForm(WebDriver driver){
        this.driver = driver;
    }

    public void setFirstName(){
        driver.findElement(firstName).sendKeys("Test-first");
    }

    public void setLastName(){
        driver.findElement(lastName).sendKeys("Test-last");
    }

    public void setHighSchool(){
        driver.findElement(highSchool).click();
    }

    public void setCollege(){
        driver.findElement(college).click();
    }

    public void setGradSchool(){
        driver.findElement(gradSchool).click();
    }

    public void setMale(){
        driver.findElement(male).click();
    }

    public void setFemale(){
        driver.findElement(female).click();
    }

    public void setPreferNot(){
        driver.findElement(preferNot).click();
    }

    public void setDate(){
        driver.findElement(date).sendKeys("01/08/1999");
    }

//    public ThanksPage setsubmit(){
//        driver.findElement(submitBtn).click();
//        return new ThanksPage(driver);
//    }
}
