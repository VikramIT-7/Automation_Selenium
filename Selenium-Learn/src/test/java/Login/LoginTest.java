package Login;

import Base.baseTests;
import Pages.LoginPage;
import Pages.secureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTest extends baseTests {
    @Test
    public void testSucessfulLogin(){
        LoginPage loginPage = homepage.clickFormAuthentication();
        loginPage.setUsername("tomsmith ");
        loginPage.setPassword("SuperSecretPassword!");
        secureAreaPage secureAreaPage = loginPage.clickLoginButton();
        //Need to fix this later
//        assertTrue(secureAreaPage.statusAlertCheck().contains("\n" +
//                "            You logged into a secure area!\n" +
//                "            "),"text is incorrect");
        ;
    }
}
