package Fillform;

import Internet.Page.Base.baseTests;
import org.testng.annotations.Test;

public class FormFill extends baseTests {

    @Test
    public void formFillTest(){
        webForm.setFirstName();
        webForm.setLastName();
        webForm.setHighSchool();
        webForm.setCollege();
        webForm.setGradSchool();
        webForm.setMale();
        webForm.setFemale();
        webForm.setPreferNot();
        webForm.setDate();
//        ThanksPage page = webForm.setsubmit();
//        String status = page.setStatusCheck();
//        System.out.println(status);

    }
}
