package homePage;

import checkBoxPage.CheckBoxPage;
import forgetPasswordPage.ForgetPasswordPage;
import io.qameta.allure.Step;
import loginPage.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import statusCodePage.StatusPage;
import uploadPage.UploadPage;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }


    private final By checkBoxesLinkText = By.linkText("Checkboxes");
    private final By fileUploadLinkText = By.linkText("File Upload");
    private final By statusCodeLinkText = By.linkText("Status Codes");
    private final By forgetPasswordLinkText = By.linkText("Forgot Password");
    private final By formAuthenticationLinkText = By.linkText("Form Authentication");



    @Step
    public CheckBoxPage clickOnCheckBoxLink(){

        driver.findElement(checkBoxesLinkText).click();
        return new CheckBoxPage(driver);

    }

    @Step
    public UploadPage clickOnUploadLink(){
        driver.findElement(fileUploadLinkText).click();
        return new UploadPage(driver);
    }


    @Step
    public StatusPage clickOnStatusCodeLink(){

        driver.findElement(statusCodeLinkText).click();
        return new StatusPage(driver);
    }

    @Step
    public ForgetPasswordPage clickOnForgetPasswordLink(){

        driver.findElement(forgetPasswordLinkText).click();
        return new ForgetPasswordPage(driver);
    }


    @Step
    public LoginPage clickOnFormAuthenticationLink(){

        driver.findElement(formAuthenticationLinkText).click();
        return new LoginPage(driver);
    }

}
