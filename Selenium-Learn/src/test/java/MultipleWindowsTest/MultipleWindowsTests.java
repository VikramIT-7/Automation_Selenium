package MultipleWindowsTest;

import Internet.Page.Base.baseTests;
import org.testng.annotations.Test;

public class MultipleWindowsTests extends baseTests {

    @Test
    public void testMultipleWindows(){
        homepage.multipleWindowsPage().setClickHere();
        manager().switchToWindowsOrTabs("New Window");
    }
}