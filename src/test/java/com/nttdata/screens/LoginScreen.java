package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LoginScreen extends PageObject {

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@content-desc=\"test-standard_user\"]/android.widget.TextView")
    private WebElement btnUserStandard;

    @AndroidFindBy(xpath= "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;



    public void clickUserStandard(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        btnUserStandard.click();
    }

    public void clickLoginButton(){
        getDriver().manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        btnLogin.click();
    }
}
