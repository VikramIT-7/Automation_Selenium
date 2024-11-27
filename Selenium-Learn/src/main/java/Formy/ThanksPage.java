package Formy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksPage {
    private WebDriver driver;
    private By statusCheck = By.cssSelector(".alert.alert-success");

    public ThanksPage(WebDriver driver){
        this.driver = driver;
    }

    public String setStatusCheck(){
        return driver.findElement(statusCheck).getText();
    }

}
