package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    final WebDriver driver;
    private By clickHere = By.linkText("Click Here");
    public MultipleWindowsPage(WebDriver driver){
        this.driver = driver;
    }

    public void setClickHere(){
        driver.findElement(clickHere).click();
    }
}
