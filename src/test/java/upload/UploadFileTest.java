package upload;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest extends BaseTest {


    private final By fileUploadLinkText = By.linkText("File Upload");
    private final By chooseFileBtn = By.id("file-upload");
    String filePath = System.getProperty("user.dir")+ "\\src\\test\\resources\\files\\kascsakj.jpg";
    private final By fileSubmitBtn = By.id("file-submit");
    private final By textUploadedFile = By.id("uploaded-files");


    @Test
    public void testUploadImageAndValidateTextNameOfFile(){

        WebElement clickOnFileUploadLinkText = driver.findElement(fileUploadLinkText);
        clickOnFileUploadLinkText.click();

        WebElement fileUpload = driver.findElement(chooseFileBtn);
        fileUpload.sendKeys(filePath);

        WebElement clickOnFileSubmitBtn = driver.findElement(fileSubmitBtn);
        clickOnFileSubmitBtn.click();



        WebElement textUploadFile = driver.findElement(textUploadedFile);
        String actualTextUploaded = textUploadFile.getText();
        String expectedTextUploaded = "kascsakj.jpg";

        if(textUploadFile.isDisplayed()){
            Assert.assertEquals(actualTextUploaded , expectedTextUploaded);
        }


    }

}