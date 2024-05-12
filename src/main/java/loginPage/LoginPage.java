package loginPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import securePage.SecurePage;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }



    private final By userNameField = By.id("username");
    private final By passwordField = By.id("password");
    private final By loginBtn = By.cssSelector(".radius");


    @Step
    public void enterLoginUserName(String userName){

         driver.findElement(userNameField).sendKeys(userName);
    }

    @Step
    public void enterLoginPassword(String password){

        driver.findElement(passwordField).sendKeys(password);
    }

    @Step
    public SecurePage clickOnLogin(){
        driver.findElement(loginBtn).click();
        return new SecurePage(driver);
    }


}
