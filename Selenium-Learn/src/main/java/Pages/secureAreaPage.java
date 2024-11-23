package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class secureAreaPage {
    private WebDriver driver;
    private By statusAlert = By.id("flash");

    public secureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String statusAlertCheck (){
        return driver.findElement(statusAlert).getText();
    }


}
