package uploadPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    WebDriver driver;


    public UploadPage(WebDriver driver){
        this.driver = driver;
    }


    private final By chooseFileBtn = By.id("file-upload");
    private final By fileSubmitBtn = By.id("file-submit");
    private final By textUploadedFile = By.id("uploaded-files");


    @Step
    public UploadPage ChooseFileBtn(String file){
        driver.findElement(chooseFileBtn).sendKeys(file);
        return this;
    }
    @Step
    public UploadPage clickOnUploadBtn(){
        driver.findElement(fileSubmitBtn).click();
        return this;
    }
    @Step
    public String getUploadedFileText(){

        return driver.findElement(textUploadedFile).getText();
    }






}
