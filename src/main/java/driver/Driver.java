package driver;

import capabilitiesfactory.CapabilitiesFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static AndroidDriver<MobileElement> driver;

    private Driver() {
    }

    public static AndroidDriver getDriver() {
        System.out.println(driver);
        if (driver == null) {
            System.out.println("RR");
            driver = new AndroidDriver(CapabilitiesFactory.getAppiumServerUrl(), CapabilitiesFactory.getCapabilities());
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
        driver = null;
    }
}