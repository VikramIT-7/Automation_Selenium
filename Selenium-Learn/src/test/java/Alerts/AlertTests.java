package Alerts;

import BaseTest.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends baseTests {
    @Test
    public void alertTest(){
        var alertPage = homepage.alert();
        alertPage.clickJSButton();
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResults(), "You successfully clicked an alert", "Text is incorrect");
    }

    @Test
    public void getTextFromAlert(){
        var alertPage = homepage.alert();
        alertPage.clickJSconfirmButton();
        String text = alertPage.getAlertText();
        alertPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Text is incorrect");
    }

    @Test
    public void enterAndVerifyTextOnPrompt(){
        var alertPage = homepage.alert();
        alertPage.clickJSPromptButton();
        String text = "Hello!";
        alertPage.alert_enterTextOnAlert(text);
        alertPage.alert_clickToAccept();
        assertEquals(alertPage.getResults(), "You entered: " + text, "Text is incorrect");
    }
}