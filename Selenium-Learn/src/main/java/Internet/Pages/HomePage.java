package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By HoversLink = By.linkText("Hovers");
    private By keyPresses = By.linkText("Key Presses");
    private By JSalerts = By.linkText("JavaScript Alerts");
    private By fileUpload = By.linkText("File Upload");
    private By entryAd = By.linkText("Entry Ad");
    private By contextMenu = By.linkText("Context Menu");
    private By wysiwyg = By.linkText("WYSIWYG Editor");
    private By frame = By.linkText("Frames");
    private By dynamicLoading = By.linkText("Dynamic Loading");


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

    public jsAlertPage alert(){
        driver.findElement(JSalerts).click();
        return new jsAlertPage(driver);
    }

    public fileUploadPage file(){
        driver.findElement(fileUpload).click();
        return new fileUploadPage(driver);
    }

    public EntryAdPage entryAd (){
        driver.findElement(entryAd).click();
        return new EntryAdPage(driver);
    }

    public ContextMenuPage contextMenu(){
        driver.findElement(contextMenu).click();
        return new ContextMenuPage(driver);
    }

    public WysiwygPage Wysiwyg(){
        driver.findElement(wysiwyg).click();
        return new WysiwygPage(driver);
    }

    public FramesPage frame(){
        driver.findElement(frame).click();
        return new FramesPage(driver);
    }

    public DynamicLoadingPage Dynamic(){
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }




//    Generic method to call get links
//    private void getLink(String textLink){
//        driver.findElement(By.linkText(textLink)).click();
//    }
}
