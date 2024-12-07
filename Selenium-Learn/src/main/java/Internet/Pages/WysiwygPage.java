package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygPage {
    private WebDriver driver;
    private String iframe = "mce_0_ifr";
    private By iFrameBody = By.id("tinymce");

    public WysiwygPage(WebDriver driver){
        this.driver = driver;
    }

    public void clearTextInBody(){
        switchToFrame();
        driver.findElement(iFrameBody).clear();
        exitFromFrame();
    }

    public void enterTextInBody(String text){
        switchToFrame();
        driver.findElement(iFrameBody).sendKeys(text);
        exitFromFrame();
    }

    public String getBodyText(){
        switchToFrame();
        String text = driver.findElement(iFrameBody).getText();
        exitFromFrame();
        return text;
    }

    private void switchToFrame(){
        driver.switchTo().frame(iframe);
    }

    private void exitFromFrame(){
        driver.switchTo().parentFrame();
    }
}
