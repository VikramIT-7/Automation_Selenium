package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage clickFormAuthentication (){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownPage(){
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }

//    Generic method to call get links
//    private void getLink(String textLink){
//        driver.findElement(By.linkText(textLink)).click();
//    }
}
