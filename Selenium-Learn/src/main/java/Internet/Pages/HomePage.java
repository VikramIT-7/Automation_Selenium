package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By HoversLink = By.linkText("Hovers");
    private By keyPresses = By.linkText("Key Presses");

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

    public HoversPage clickHovers(){
        driver.findElement(HoversLink).click();
        return new HoversPage(driver);
    }

    public KeyPressesPage key(){
        driver.findElement(keyPresses).click();
        return new KeyPressesPage(driver);
    }

//    Generic method to call get links
//    private void getLink(String textLink){
//        driver.findElement(By.linkText(textLink)).click();
//    }
}
