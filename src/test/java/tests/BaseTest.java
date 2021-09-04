package tests;

import driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {
    @BeforeMethod
    public void setupDriver() {
        Driver.getDriver();
    }

    @AfterMethod
    public void quitDriver() {
        System.out.println("After");
        Driver.quitDriver();
    }
}