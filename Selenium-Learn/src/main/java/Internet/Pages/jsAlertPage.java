package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class jsAlertPage {
    private WebDriver driver;
    private By jsalertButton = By.xpath(".//button[text() ='Click for JS Alert']");
    private By jsConfirmButton = By.xpath(".//button[text() ='Click for JS Confirm']");
    private By jsPromptButton = By.xpath(".//button[text() ='Click for JS Prompt']");
    private By results = By.id("result");

    //constructor
    public jsAlertPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickJSButton(){
        driver.findElement(jsalertButton).click();
    }
    
    public void clickJSconfirmButton(){
        driver.findElement(jsConfirmButton).click();
    }

    public void clickJSPromptButton(){
        driver.findElement(jsPromptButton).click();
    }

    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getAlertText(){
        return driver.switchTo().alert().getText();
    }

    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void alert_enterTextOnAlert(String text){
        driver.switchTo().alert().sendKeys(text);
    }

    public String getResults(){
        return driver.findElement(results).getText();
    }
}
