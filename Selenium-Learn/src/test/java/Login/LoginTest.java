package Login;

import BaseTest.baseTests;
import Internet.Pages.LoginPage;
import Internet.Pages.secureAreaPage;
import org.testng.annotations.Test;

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
