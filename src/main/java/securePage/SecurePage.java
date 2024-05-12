package securePage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {

    WebDriver driver;

    public SecurePage(WebDriver driver){
        this.driver = driver;
    }

    private final By secureConfirmMessage = By.id("flash");


    @Step
    public String getSecureLoginMessage(){

        return driver.findElement(secureConfirmMessage).getText();

    }

}