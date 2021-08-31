import driver.Driver;
import org.testng.annotations.AfterSuite;

public abstract class BaseTest {

    @AfterSuite
    public void quitDriver(){
        Driver.quitDriver();
    }
}
