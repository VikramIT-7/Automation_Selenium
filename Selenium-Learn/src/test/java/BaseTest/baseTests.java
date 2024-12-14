package BaseTest;

import Formy.WebForm;
import Internet.Pages.HomePage;
import Utility.WindowsManager;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;

public class baseTests {

    protected WebDriver driver;
    protected HomePage homepage;
    protected WebForm webForm;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        goHome();
        //created object / instantiate the homepage class in the test class
        homepage = new HomePage(driver);
//        driver.get("https://formy-project.herokuapp.com/form");
        webForm = new WebForm(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowsManager manager(){
        return new WindowsManager(driver);
    }

//    @AfterMethod
    public void testScreenshots(ITestResult result){

        //If block will capture failed Screenshots
        if(ITestResult.FAILURE == result.getStatus()){
            var picture = (TakesScreenshot)driver;
            File sceenshot = picture.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(sceenshot, new File("resources/Screenshots/FailedScreenShots" + result.getName() + ".jpg"));
            }catch (Exception e){
                e.printStackTrace(); //this will print the exception
            }
        }
        //Else block will capture Pass Screenshots
        else {
            var picture = (TakesScreenshot)driver;
            File sceenshot = picture.getScreenshotAs(OutputType.FILE);
            try{
                Files.move(sceenshot, new File("resources/Screenshots/PassedScreenShots" + result.getName() + ".jpg"));
            }catch (Exception e){
                e.printStackTrace(); //this will print the exception
            }
        }
    }
}
