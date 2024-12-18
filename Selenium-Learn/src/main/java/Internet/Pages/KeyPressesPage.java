package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {

    private WebDriver driver;
    private By inputField = By.id("target");
    private By messageOnField = By.id("result");

    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    public void enterText(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public String getMessage(){
        return driver.findElement(messageOnField).getText();
    }

}
