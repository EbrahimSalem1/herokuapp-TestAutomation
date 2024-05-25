package jsAlerts;

import base.BaseTest;
import javascriptAlertsPage.JavaScriptAlerts;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JsScriptAlertsTest extends BaseTest {


    @Test
    public void testClickOnJsConfirmBtnAndGetJsAlertConfirmMs(){

        JavaScriptAlerts jsAlert = homePage.clickOnJavaScriptAlertsLinkText();
        jsAlert.clickOnJsConfirmBtn();
        jsAlert.acceptAlert();
        Assert.assertEquals(jsAlert.getConfirmResultMs(),"You clicked: Ok");
    }

    @Test
    public void testClickOnJsPromptBtnAndGetJsPromptConfirmMs(){

        JavaScriptAlerts jsPrompt = homePage.clickOnJavaScriptAlertsLinkText();
        jsPrompt.clickOnPromptBtn();
        jsPrompt.enterPromptText("Ebrahim Software Test Automation Engineer");
        jsPrompt.acceptPromptAlert();
        Assert.assertTrue(jsPrompt.getJsPromptResultMs().contains("You entered: Ebrahim"));
    }
}