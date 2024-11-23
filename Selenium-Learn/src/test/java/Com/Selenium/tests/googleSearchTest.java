package Com.Selenium.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class googleSearchTest {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the chromedriver executable
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

        // Initialize the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testGoogleSearch() {
        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search box and enter a query
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium WebDriver");

        // Submit the search form
        searchBox.submit();

        // Wait for the results page to load and display the results
        driver.findElement(By.id("result-stats"));
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}




//        driver.manage().window().setSize(new Dimension(390, 844));

//        List<WebElement> Inputs = driver.findElements(By.tagName("a"));
//        System.out.println(Inputs.size());

//
//WebElement ShiftingContent = driver.findElement(By.linkText("Shifting Content"));
//        ShiftingContent.click();
//WebElement example1 = driver.findElement(By.linkText("Example 1: Menu Element"));
//        example1.click();
//WebElement UnorderedList = driver.findElement(By.cssSelector("ul"));
//List<WebElement> links = UnorderedList.findElements(By.tagName("a"));
//        System.out.println(links.size());
//        for(WebElement link : links){
//        System.out.println(link.getText());
//        }

