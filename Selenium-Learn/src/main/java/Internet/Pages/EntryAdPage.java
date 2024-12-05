package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EntryAdPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private By closeButton = By.cssSelector("#modal .modal .modal-footer p");


    public EntryAdPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(1));
    }

    public void clickCloseButton(){
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("modal")));
            wait.until(ExpectedConditions.elementToBeClickable(closeButton)).click();
        }
        catch (Exception e){
            System.out.println("Exception encountered" + e.getMessage());
            System.out.println("Page Source" + driver.getPageSource());
        }
    }
}
