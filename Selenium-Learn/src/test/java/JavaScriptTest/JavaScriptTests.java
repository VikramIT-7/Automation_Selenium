package JavaScriptTest;

import BaseTest.baseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends baseTests {

    @Test
    public void JavaScriptTest(){
        homepage.LDP().ScrollToTable();

    }
}
