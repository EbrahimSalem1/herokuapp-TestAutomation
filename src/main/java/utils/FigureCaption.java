package utils;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FigureCaption {

    WebElement caption;

    public FigureCaption(WebElement caption) {

        this.caption = caption;
    }

    private final By userName = By.tagName("h5");
    private final By profile = By.tagName("a");




    @Step
    public String getUserNameFigureText(){
        return caption.findElement(userName).getText();
    }

    @Step
    public String getProfileFigureText(){
        return caption.findElement(profile).getText();
    }

}
