package EntryAd;

import BaseTest.baseTests;
import org.testng.annotations.Test;

public class EntryAdTests extends baseTests {
    @Test
    public void entryAdTest(){
        var entry = homepage.entryAd();
        entry.clickCloseButton();
    }
}
