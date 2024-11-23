package Login;

import Base.baseTests;
import Pages.LoginPage;
import Pages.secureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends baseTests {
    @Test
    public void testSucessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith ");
        loginPage.setPassword("SuperSecretPassword!");
        secureAreaPage secureAreaPage = loginPage.clickLoginButton();
        assertEquals(secureAreaPage.statusAlertCheck(),
                "You logged into a secure area!",
                "Login text is incorrect");
    }
}
