package DropdownTest;

import BaseTest.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Dropdown extends baseTests {
    @Test
    public void testSelectOptions(){
        var dropdownPage = homepage.clickDropdownPage();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedoptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedoptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedoptions.contains(option), "Option not selected");
    }
}
