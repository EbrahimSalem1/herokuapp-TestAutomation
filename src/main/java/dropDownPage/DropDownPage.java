package dropDownPage;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {

    WebDriver driver;
    Select select;


    public DropDownPage(WebDriver driver){
        this.driver = driver;
    }

    private final By dropDownList = By.id("dropdown");


    @Step
    public void selectFromDropDownList(String text){
       select = new Select(driver.findElement(dropDownList));
       select.selectByVisibleText(text);
    }


}
