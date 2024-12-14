package DynamicLoadingTest;

import Internet.Page.Base.baseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class DynamicLoadingTests extends baseTests {
    @Test
    public void dynamicLoadingTest(){
        var dynamic = homepage.Dynamic().dynamic1();
        dynamic.clickStartBtn();
        String text = dynamic.getResultText();
        assertEquals(text, "Hello World!", "Text is Incorrect");
    }

    @Test
    public void dynamicLoadingTest2(){
        var dynamic = homepage.Dynamic().dynamic2();
        dynamic.clickStart();
        String text = dynamic.getResult();
        assertEquals(text, "Hello World!", "Text is incorrect");
    }
}

