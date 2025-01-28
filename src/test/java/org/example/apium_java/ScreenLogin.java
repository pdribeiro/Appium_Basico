package org.example.apium_java;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public  ScreenLogin(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id="login_username")
    @iOSFindBy(accessibility = "1231")
    private RemoteWebElement campoemail;

    @AndroidFindBy(id="login_password")
    @iOSFindBy(accessibility = "1231")
    private RemoteWebElement campsenha;

    @AndroidFindBy(id="login_button")
    @iOSFindBy(accessibility = "1231")
    private RemoteWebElement loginbutton;

}
