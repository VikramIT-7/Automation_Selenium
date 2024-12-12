package WindowManagerTests;
import Internet.Page.Base.baseTests;
import org.testng.annotations.Test;

public class WindowsManagerTest extends baseTests {
    @Test
    public void testNavigation(){
        homepage.Dynamic().dynamic1();
        manager().goBack();
        manager().goForward();
        manager().refreshPage();
        manager().goTo("https://www.google.com/");
    }
}
