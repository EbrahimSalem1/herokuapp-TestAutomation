package upload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends BaseTest {


    String filePath = System.getProperty("user.dir")+ "\\src\\test\\resources\\files\\kascsakj.jpg";

    @Test
    public void testUploadImageAndValidateTextNameOfFile(){

        Assert.assertTrue(
                homePage.clickOnUploadLink()
                        .ChooseFileBtn(filePath)
                        .clickOnUploadBtn()
                        .getUploadedFileText().contains("kascsakj.jpg")

        );



//      String textUploadFile = driver.findElement(textUploadedFile).getText();
//      String actualTextUploaded = textUploadFile.getText();
//      String expectedTextUploaded = "kascsakj.jpg";
//      Assert.assertTrue(textUploadFile.contains("kascsakj.jpg"));

    }

}