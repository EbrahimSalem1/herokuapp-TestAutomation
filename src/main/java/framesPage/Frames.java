package framesPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.swing.plaf.PanelUI;

public class Frames {
    WebDriver driver;

    public Frames(WebDriver driver){
        this.driver = driver;
    }


    private final String frame = "singleframe";
    private final By textInputFrame = By.xpath("(//input[@type='text'])[1]");
    private final By IframeWithInAnIframe = By.linkText("Iframe with in an Iframe");



    private Frames switchToFrame(){
        driver.switchTo().frame(frame);
        return this;
    }

    private Frames switchToParent(){
        driver.switchTo().parentFrame();
        return this;
    }

    public Frames insertTextInput(String textInput){
        switchToFrame();
        driver.findElement(textInputFrame).sendKeys(textInput);
        switchToParent();
        return this;
    }

    public Frames clickOnIframeWithInAnIframeBtn(){
        driver.findElement(IframeWithInAnIframe).click();
        return this;
    }

}