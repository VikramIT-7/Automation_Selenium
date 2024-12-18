package Internet.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {

    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    public void selectFromDropdown(String options){
        findDropdownElements().selectByVisibleText(options);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropdownElements().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    public void selectDropdown(){
        String script = "arguments[0].setAttribute('message', '')";
        var js = (JavascriptExecutor)driver;
        js.executeScript(script, findDropdownElements());
    }

    private Select findDropdownElements(){
        return new Select(driver.findElement(dropdown));
    }
}
