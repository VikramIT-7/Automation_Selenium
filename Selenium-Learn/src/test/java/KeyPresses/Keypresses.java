package KeyPresses;

import Internet.Page.Base.baseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Keypresses extends baseTests {

    @Test
    public void testMessage(){
        var KeyPage = homepage.key();
        KeyPage.enterText("₹" + Keys.LEFT_CONTROL);
        assertEquals(KeyPage.getMessage(), "You entered: CONTROL", "Message is incorrect");
    }
}
