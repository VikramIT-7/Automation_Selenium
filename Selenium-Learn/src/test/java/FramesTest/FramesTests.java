package FramesTest;

import Internet.Page.Base.baseTests;
import Internet.Pages.NestedFrame;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends baseTests {

    @Test
    public void frameTest(){
        var frame = homepage.frame();
        NestedFrame nestedFrame = frame.nested();
        String text = nestedFrame.getFrameText();
        assertEquals(text, "LEFT", "Text is incorrect");
    }

    @Test
    public void frameTest2(){
        var frame = homepage.frame();
        NestedFrame nestedFrame = frame.nested();
        String text2 = nestedFrame.getFrameTextBottom();
        assertEquals(text2, "BOTTOM", "Text is incorrect");
    }
}
