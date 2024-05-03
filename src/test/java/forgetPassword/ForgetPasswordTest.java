package forgetPassword;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTest extends BaseTest {



    private final By forgetPasswordLinkText = By.linkText("Forgot Password");
    private final By emilaField = By.id("email");
    private final By RetrievePasswordBtn = By.id("form_submit");
    private final By exceptionTextError = By.cssSelector("body > h1");




    @Test
    public void testRetrievePassword(){

        WebElement clickOnForgetPasswordLink = driver.findElement(forgetPasswordLinkText);
        clickOnForgetPasswordLink.click();


        WebElement enterEmail = driver.findElement(emilaField);
        enterEmail.sendKeys("test1@gmail.com");


        WebElement clickOnRetrievePasswordBtn = driver.findElement(RetrievePasswordBtn);
        clickOnRetrievePasswordBtn.click();


        WebElement getTextExceptionError = driver.findElement(exceptionTextError);

        String ActualTextExceptionError = getTextExceptionError.getText();
        String ExpectedTextExceptionError = "Internal Server Error";
        Assert.assertEquals(ActualTextExceptionError , ExpectedTextExceptionError);

    }

}
