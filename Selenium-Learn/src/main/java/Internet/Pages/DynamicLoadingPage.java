package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    private WebDriver driver;
    private By Example1 = By.linkText("Example 1: Element on page that is hidden");
    private By Example2 = By.linkText("Example 2: Element rendered after the fact");

    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    public DynamicLoadingExample1Page dynamic1(){
        driver.findElement(Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page dynamic2(){
        driver.findElement(Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }


}
