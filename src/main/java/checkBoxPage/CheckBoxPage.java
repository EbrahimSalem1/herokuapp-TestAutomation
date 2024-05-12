package checkBoxPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    WebDriver driver;

    public CheckBoxPage(WebDriver driver){

        this.driver = driver;
    }

    private final By checkBoxOne = By.xpath("(//input)[1]");
    private final By checkBoxTwo = By.xpath("(//input)[2]");



    @Step
    public void clickOnCheckBox1(){
        driver.findElement(checkBoxOne).click();
    }

    @Step
    public void clickOnCheckBox2(){
        driver.findElement(checkBoxTwo).click();

    }

    @Step
    public boolean CheckBoxOneIsSelected(){
        return driver.findElement(checkBoxOne).isSelected();
    }

    @Step
    public boolean CheckBoxTwoIsSelected(){
        return driver.findElement(checkBoxTwo).isSelected();
    }

}
