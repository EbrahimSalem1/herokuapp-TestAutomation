package javascriptAlertsPage;

import io.qameta.allure.Step;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlerts {

    WebDriver driver;

    public JavaScriptAlerts(WebDriver driver){
     this.driver = driver;
    }

    private final By jsConfirmBtn = By.cssSelector("button[onclick='jsConfirm()']");
    private  final By getJsConfirmResult = By.xpath("//p[@id='result']");
    private final By jsPromptBtn = By.cssSelector("button[onclick='jsPrompt()']");
    private final By getJsPromptResult = By.xpath("//p[@id='result']");




    @Step
    public JavaScriptAlerts clickOnJsConfirmBtn(){
        driver.findElement(jsConfirmBtn).click();
        return this;
    }

    @Step
    public JavaScriptAlerts acceptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    @Step
    public String getConfirmResultMs(){
        return driver.findElement(getJsConfirmResult).getText();
    }

    @Step
    public JavaScriptAlerts clickOnPromptBtn(){
        driver.findElement(jsPromptBtn).click();
        return this;
    }

    @Step
    public JavaScriptAlerts enterPromptText(String text){
        driver.switchTo().alert().sendKeys(text);
        return this;
    }

    @Step
    public JavaScriptAlerts acceptPromptAlert(){
        driver.switchTo().alert().accept();
        return this;
    }

    @Step
    public String getJsPromptResultMs(){
        return driver.findElement(getJsPromptResult).getText();
    }
}