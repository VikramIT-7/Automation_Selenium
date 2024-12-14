package WysiwygPageTest;

import BaseTest.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WysiwygPageTests extends baseTests {

    @Test
    public void iFrameTests(){
        var frame = homepage.Wysiwyg();
        frame.clearTextInBody();
        frame.enterTextInBody("Hello World");
        assertEquals(frame.getBodyText(), "Hello World", "Text is incorrect");
    }
}
