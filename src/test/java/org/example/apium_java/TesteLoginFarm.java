package org.example.apium_java;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class TesteLoginFarm {

    private static ScreenLogin Screenlogin;
    private static AppiumDriver<RemoteWebElement> driver;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("browserstack.user","pedrofranco_poBsEN");
        capabilities.setCapability("browserstack.key","a3vpVKsfRzDejQBApzsG");

        capabilities.setCapability("app","bs://6a152d7daa1803ba4cdb78292e836b0d6af139fe");


        capabilities.setCapability("device","Google Pixel 3");
        capabilities.setCapability("os_version","9.0");

        driver = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), capabilities);
        Screenlogin = new ScreenLogin(driver);
    }
    @Test
    public void testelogin(){

        Screenlogin.logar();
    }
}
