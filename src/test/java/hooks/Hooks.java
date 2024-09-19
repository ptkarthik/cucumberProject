package hooks;

import driverinitiator.DriverInitiator;
import driverpackages.DriverSetter;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.PropertyReader;


public class Hooks {

    public static final Logger logger = LogManager.getLogger(Hooks.class);

    @Before
    public void setUp() {
        // Set up the WebDriver instance
        logger.info("Starting browser and opening application");
        DriverInitiator.threadLocal.set(DriverSetter.getDriver(PropertyReader.getProp().
                getProperty("browser")));
        DriverInitiator.threadLocal.get().manage().window().maximize();
        DriverInitiator.threadLocal.get().get("https://demo.automationtesting.in/");
    }

    @After
    public void tearDown() {
        // Tear down the WebDriver instance
        logger.info("Closing browser");
        if (DriverInitiator.threadLocal.get() != null) {
            DriverInitiator.threadLocal.get().quit();
        }
    }

}
