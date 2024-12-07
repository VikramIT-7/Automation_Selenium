package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    final WebDriver driver;
    private By startBtn = By.cssSelector("#start button");
    private By result = By.id("finish");
    public DynamicLoadingExample1Page(WebDriver driver){
        this.driver = driver;
    }

    public void clickStartBtn(){
        driver.findElement(startBtn).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated((result)));
    }

    public String getResultText(){
        return driver.findElement(result).getText();
    }

}
