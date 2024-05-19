package dropDown;

import base.BaseTest;
import dropDownPage.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {


    @Test
    public void testSelectOption2FromDropDownList(){

        DropDownPage dropDown = homePage.clickOnDropDownLink();
        dropDown.selectFromDropDownList("Option 2");
        String selectedOption = "Option 2";
        Assert.assertEquals(selectedOption , "Option 2");

    }
}
