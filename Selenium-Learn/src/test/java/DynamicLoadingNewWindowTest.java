import BaseTest.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class DynamicLoadingNewWindowTest extends baseTests {

    @Test
    public void newWindowTest(){
        var button = homepage.Dynamic().openInNewWindowExample1();
        manager().switchToNewWindow();
        assertTrue(button.isStartButtonDisplayed(), "Button does not appear");
    }
}
