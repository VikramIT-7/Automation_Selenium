package jsDropdownTest;

import BaseTest.baseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;


public class JsDropdownTests extends baseTests {
    @Test
    public void Dropdown(){
        var dropdown = homepage.clickDropdownPage();
        dropdown.selectDropdown();

        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropdown::selectFromDropdown);

        var selectedOptions = dropdown.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All Options are not Selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Size is incorrect");
    }
}
