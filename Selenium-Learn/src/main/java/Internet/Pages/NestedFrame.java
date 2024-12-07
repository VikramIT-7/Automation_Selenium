package Internet.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFrame {
    private WebDriver driver;
    private int frame1 = 0;
    private int frame2 = 1;
    private By body = By.tagName("body");

    public NestedFrame(WebDriver driver){
        this.driver = driver;
    }

    public String getFrameText(){
        SwitchToFrame1();
        SwitchToFrameLeft();
        String text = driver.findElement(body).getText();
        exitFrame();
        return text;
    }

    public String getFrameTextBottom(){
        SwitchToFrame2();
        String text = driver.findElement(body).getText();
        exitFrame();
        return text;
    }


    private void SwitchToFrame1(){
        driver.switchTo().frame(frame1);
    }

    private void SwitchToFrame2(){
        driver.switchTo().frame(frame2);
    }

    private void SwitchToFrameLeft(){
        driver.switchTo().frame("frame-left");
    }

    private void exitFrame(){
        driver.switchTo().parentFrame();
    }
}
