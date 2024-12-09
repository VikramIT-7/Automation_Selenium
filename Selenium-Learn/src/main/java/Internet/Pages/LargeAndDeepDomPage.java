package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDomPage {
    final WebDriver driver;
    private By tableId = By.id("large-table");

    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }

    public void ScrollToTable(){
        WebElement tableElement = driver.findElement(tableId);
        String script = ("arguments[0].scrollIntoView();");
        ((JavascriptExecutor)driver).executeScript(script, tableElement); //tableElement is used as object in the
        // executeScript function call


    }


}
