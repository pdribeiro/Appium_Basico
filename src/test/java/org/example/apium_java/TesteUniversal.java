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
import java.util.Locale;

public class TesteUniversal {

    private static ScreenLogin Screenlogin;
    private static AppiumDriver<RemoteWebElement> driver;

    public  static String local = "";
    public static String plataforma = "";

    @BeforeClass
    public static void caps() throws MalformedURLException {

        local = System.getProperty("local").toLowerCase();
        plataforma = System.getProperty("plataforma").toLowerCase();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        if (local.equals("local") && plataforma.equals("android")){
        capabilities.setCapability("app", new File("apps/app-debug.apk"));
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformName","emulator-5554");
        capabilities.setCapability("unicodeKeyboard",true);
        driver = new AndroidDriver<RemoteWebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        Screenlogin = new ScreenLogin(driver);

        }else {


        }
    }

    @Test
    public void testelogin(){
        Screenlogin.logar();
    }
}
