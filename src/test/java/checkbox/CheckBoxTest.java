package checkbox;

import base.BaseTest;
import checkBoxPage.CheckBoxPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxTest extends BaseTest {

    @Test
    public void testClickOnCheckboxes(){

        CheckBoxPage checkBoxes = homePage.clickOnCheckBoxLink();
        checkBoxes.clickOnCheckBox1();
        checkBoxes.clickOnCheckBox2();
        Assert.assertTrue(checkBoxes.CheckBoxOneIsSelected());
        Assert.assertFalse(checkBoxes.CheckBoxTwoIsSelected());

    }
}