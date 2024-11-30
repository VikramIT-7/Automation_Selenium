package Internet.Page.Base;

import Formy.WebForm;
import Internet.Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseTests {

    private WebDriver driver;
    protected HomePage homepage;
    protected WebForm webForm;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //created object / instantiate the homepage class in the test class
        homepage = new HomePage(driver);
//        driver.get("https://formy-project.herokuapp.com/form");
        webForm = new WebForm(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}