package checkbox;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class CheckBoxTest extends BaseTest {



    private final By checkBoxesLinkText = By.linkText("Checkboxes");
    private final By checkBoxesForm = By.xpath("//input[@type='checkbox']");




    @Test
    public void testClickOnCheckboxes(){

        WebElement CheckBoxLink = driver.findElement(checkBoxesLinkText);
        CheckBoxLink.click();

         List<WebElement> checkBoxes =  driver.findElements(checkBoxesForm);

         for(WebElement element : checkBoxes){

             element.click();

             if(element.isSelected()){
                 Assert.assertTrue(element.isSelected() , "CheckBox is Selected");
             }

         }
    }
}