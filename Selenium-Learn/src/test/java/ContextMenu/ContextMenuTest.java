package ContextMenu;

import BaseTest.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends baseTests {
    @Test
    public void contextMenuTests(){
        var context = homepage.contextMenu();
        context.clickOnHotSpot();
        String message = context.getAlertMessage();
        context.acceptAlert();
        assertEquals(message, "You selected a context menu", "Message is incorrect");
    }
}
