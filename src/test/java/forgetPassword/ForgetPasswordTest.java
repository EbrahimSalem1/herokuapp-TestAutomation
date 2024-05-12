package forgetPassword;

import base.BaseTest;
import forgetPasswordPage.ForgetPasswordPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static utilities.DataDrivenClass.JsonClass.readJson;

public class ForgetPasswordTest extends BaseTest {


    String jsonForgetPasswordFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\dataDrivenJson\\forgetPassword.json";

    @Test
    public void testForgetPasswordExceptionError(){

        ForgetPasswordPage forget = homePage.clickOnForgetPasswordLink();
        forget.enterForgetPasswordEmail(readJson(jsonForgetPasswordFilePath , "email1"));
        forget.clickOnRetrievedBtn();
        String actualExceptionError = forget.getExceptionError();
        Assert.assertEquals(actualExceptionError,"Internal Server Error");

    }

}
