package hooks;

import driverinitiator.DriverInitiator;
import driverpackages.DriverSetter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.PropertyReader;


public class Hooks {


    @Before
    public void setUp() {

        // Set up the WebDriver instance
        System.out.println("Starting browser and opening application");
        DriverInitiator.threadLocal.set(DriverSetter.getDriver(PropertyReader.getProp().
                getProperty("browser")));
        DriverInitiator.threadLocal.get().manage().window().maximize();
        DriverInitiator.threadLocal.get().get("https://testautomationpractice.blogspot.com/");
    }

    @After
    public void tearDown() {
        // Tear down the WebDriver instance
        System.out.println("Closing browser");
        if (DriverInitiator.threadLocal.get() != null) {
            DriverInitiator.threadLocal.get().quit();
        }
    }

}
