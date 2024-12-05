package EntryAd;

import Internet.Page.Base.baseTests;
import org.testng.annotations.Test;

public class EntryAdTests extends baseTests {
    @Test
    public void entryAdTest(){
        var entry = homepage.entryAd();
        entry.clickCloseButton();
    }
}
