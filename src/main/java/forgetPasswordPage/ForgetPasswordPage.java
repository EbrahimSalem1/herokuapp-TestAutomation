package forgetPasswordPage;

//import ForgetPasswordExceptionPage.ForgetPasswordException;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {

    WebDriver driver;

    public ForgetPasswordPage(WebDriver driver){
        this.driver = driver;
    }

    private final By emilaField = By.id("email");
    private final By retrievePasswordBtn = By.id("form_submit");
    private final By getExceptionTextError = By.cssSelector("body > h1");


    @Step
    public void enterForgetPasswordEmail(String email){

        driver.findElement(emilaField).sendKeys(email);
    }


    @Step
    public void clickOnRetrievedBtn(){
        driver.findElement(retrievePasswordBtn).click();
    }

    @Step
    public String getExceptionError(){
        return driver.findElement(getExceptionTextError).getText();
    }

}