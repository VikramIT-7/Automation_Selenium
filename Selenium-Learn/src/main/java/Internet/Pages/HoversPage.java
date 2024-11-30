package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    final WebDriver driver;
    private By figureBox = By.className("figure");
    private By boxCaption = By.className("figcaption");

    public HoversPage(WebDriver driver){
        this.driver = driver;
    }
    /*
        @param starts from index 1
     */

    public FigureCaptions hoverOverActions(int index){
        WebElement figure = driver.findElements(figureBox).get(index-1);
        Actions actions = new Actions(driver);
        actions.moveToElement(figure).perform();
        return new FigureCaptions(figure.findElement(boxCaption));
    }

    public class FigureCaptions{
        private WebElement captions;
        private By header = By.tagName("h5");
        private By profileLink = By.tagName("a");

        public FigureCaptions(WebElement captions){
            this.captions = captions;
        }

        public boolean isCaptionDisplayed(){
            return captions.isDisplayed();
        }

        public String getTitle(){
            return captions.findElement(header).getText();
        }

        public String getLink(){
            return captions.findElement(profileLink).getAttribute("href");
        }

        public String getLinkText(){
            return captions.findElement(profileLink).getText();
        }
    }

}
