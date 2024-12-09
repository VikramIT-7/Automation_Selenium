package JavaScriptTest;

import Internet.Page.Base.baseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends baseTests {

    @Test
    public void JavaScriptTest(){
        homepage.LDP().ScrollToTable();

    }
}
