package login;

import base.BaseTest;
import loginPage.LoginPage;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import securePage.SecurePage;

import static utilities.DataDrivenClass.JsonClass.readJson;

public class LoginTest extends BaseTest {


    String jsonLoginFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\dataDrivenJson\\login.json";



    @Test
    public void testGetSecureLoginConfirmMessage(){

        LoginPage login = homePage.clickOnFormAuthenticationLink();
        login.enterLoginUserName(readJson(jsonLoginFilePath , "userName1"));
        login.enterLoginPassword(readJson(jsonLoginFilePath , "password1"));

        SecurePage secure = loginPage.clickOnLogin();
        String actualSecureMessage = secure.getSecureLoginMessage();
        Assert.assertTrue(actualSecureMessage.contains("You logged into a secure area!"));

    }


}
