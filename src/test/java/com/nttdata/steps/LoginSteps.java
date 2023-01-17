package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.SearchScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class LoginSteps {
    private AppiumDriver driver;

    LoginScreen loginScreen;
    SearchScreen searchScreen;

    @Step("Click en usuario standard")
    public void clickUserStandard(){
        loginScreen.clickUserStandard();
    }

    public void clickLoginButton(){
        loginScreen.clickLoginButton();
    }

    @Step("Cantidad de items")
    public int getItemSize(){
        List<MobileElement> items = driver.findElementsByXPath("//android.widget.ScrollView[@content-desc=\"test-PRODUCTS\"]/android.view.ViewGroup/android.view.ViewGroup[1]");
        return items.size();
    }

    @Step("Aparece el titulo esperado")
    public String   getTitleText(){
        return searchScreen.getResultText();
    }
}
