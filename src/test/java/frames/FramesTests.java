package frames;

import base.BaseTest;
import framesPage.Frames;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends BaseTest {

    Frames framePage;
    protected String url = "https://demo.automationtesting.in/Frames.html";

    @BeforeMethod
    public void testSetUp(){
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        framePage = new Frames(driver);
    }

    @AfterMethod
    public void testTearDown(){
        driver.quit();
    }

    
    @Test
    public void testSwitchToFrameToInsertTextInputInsideFrame(){
        Frames singleFrame = framePage.insertTextInput("test Automation for Frame");
        String textInput = "test Automation for Frame";
        Assert.assertTrue(textInput.contains("test"));
        singleFrame.clickOnIframeWithInAnIframeBtn();
    }

}
