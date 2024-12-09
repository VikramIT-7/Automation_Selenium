package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    final WebDriver driver;
    private By jscroll  = By.className("jscroll-added");

    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    public void scrollToParagraph(int index){
        String script = "window.scrollTo(0, document.body.scrollHeight)"; //scrollTo(x-axis,y-axis)
        var js = (JavascriptExecutor)driver;

        while (getNoOfParagraphs()< index){
            js.executeScript(script);
        }
    }

    private int getNoOfParagraphs(){
        return driver.findElements(jscroll).size();
    }

}
