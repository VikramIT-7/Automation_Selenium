package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class fileUploadPage {
    private WebDriver driver;
    private By fileUploader = By.id("file-upload");
    private By uploadButon = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public fileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public void uploadFile(String filePath){
        driver.findElement(fileUploader).sendKeys(filePath);
        clickUploadButton();
    }

    public void clickUploadButton(){
        driver.findElement(uploadButon).click();
    }

    public String getUploadedFileText(){
        return driver.findElement(uploadedFiles).getText();
    }
}
