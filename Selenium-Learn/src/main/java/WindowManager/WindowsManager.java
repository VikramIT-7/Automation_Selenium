package WindowManager;

import org.openqa.selenium.WebDriver;

public class WindowsManager {
    final WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowsManager(WebDriver driver){
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack(){
        navigate.back();

    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToWindowsOrTabs(String title){
        var windows = driver.getWindowHandles();

        System.out.println("Number of Tabs: "+ windows);

        // this will provide the window handles / unique identifiers for the windows/tabs
        System.out.println("Window Handle");
        windows.forEach(System.out::println);

        // now switch to the tabs
        for(String window : windows){
            System.out.println("Switching to Windows:" + window);
            driver.switchTo().window(window);

            System.out.println("Current Window Title: " + driver.getTitle());

            //break out of loop when the tab is found
            if(title.equals(driver.getTitle())){
                break;
            }
        }
    }

    public void switchToNewWindow(){
        var windows = driver.getWindowHandles();
        windows.forEach(driver.switchTo()::window);
    }
}
