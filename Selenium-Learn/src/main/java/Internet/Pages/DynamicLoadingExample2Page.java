package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample2Page {
    final WebDriver driver;
    private By start = By.cssSelector("#start button");
    private By result = By.id("finish");
    public DynamicLoadingExample2Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStart(){
        driver.findElement(start).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(result));
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }


}
