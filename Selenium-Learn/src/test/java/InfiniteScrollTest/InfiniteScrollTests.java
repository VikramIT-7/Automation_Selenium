package InfiniteScrollTest;

import BaseTest.baseTests;
import org.testng.annotations.Test;

public class InfiniteScrollTests extends baseTests {

    @Test
    public void infiniteScrollTest(){
        homepage.infiniteScrollPage().scrollToParagraph(10);
    }
}
