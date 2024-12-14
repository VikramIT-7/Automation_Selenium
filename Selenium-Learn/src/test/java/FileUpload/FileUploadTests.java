package FileUpload;

import BaseTest.baseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends baseTests {

    @Test
    public void fileUploadTest(){
        var fileUpload = homepage.file();
        fileUpload.uploadFile("D:\\Selenium\\Selenium-Learn\\resources\\chromedriver.exe");
        assertEquals(fileUpload.getUploadedFileText(), "chromedriver.exe", "Text is incorrect");
    }
}
