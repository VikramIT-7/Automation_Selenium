package Hovers;

import Internet.Page.Base.baseTests;
import Internet.Pages.HoversPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTests extends baseTests {
    @Test
    public void hoverTest(){
        var hovers = homepage.clickHovers();
        var caption = hovers.hoverOverActions(1);
        assertTrue(caption.isCaptionDisplayed(), "Caption is not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Title is incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Link Text is incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link is incorrect");
    }
}
