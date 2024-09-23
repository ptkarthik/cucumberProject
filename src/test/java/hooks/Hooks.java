package hooks;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import driverinitiator.DriverInitiator;
import driverpackages.DriverSetter;
import guicemodule.TestModule;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import runners.Testrunner;
import stepdefenitions.RegistrationScenarios;
import utils.PropertyReader;


public class Hooks {

    @Inject
    private WebDriver driver;
    private Injector injector;
    public static final Logger logger = LogManager.getLogger(Hooks.class);

    @Inject
    RegistrationPage registrationPage;

    @Before
    public void setUp() {
        Testrunner.getInjector().injectMembers(this); // Use injector to inject members
        driver = DriverInitiator.getDriver();

        if (driver == null) {
            driver = DriverSetter.getInstanceDriver(PropertyReader.getProp().getProperty("browser"));
            DriverInitiator.setDriver(driver);
        }
        // Set up the WebDriver instance
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Register.html");
        logger.info("Starting browser and opening application");
    }

//    @After
//    public void tearDown() {
//        // Tear down the WebDriver instance
//        logger.info("Closing browser");
//        if (DriverInitiator.getDriver() != null) {
//            DriverInitiator.getDriver().quit();
//        }
//    }

}
