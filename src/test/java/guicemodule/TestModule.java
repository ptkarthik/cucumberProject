package guicemodule;

import com.google.inject.AbstractModule;
import driverinitiator.DriverInitiator;
import driverpackages.DriverSetter;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;
import utils.PropertyReader;


public class TestModule extends AbstractModule {
    @Override
    protected void configure() {
        if (DriverInitiator.getDriver() == null) {
            WebDriver driver = DriverSetter.getInstanceDriver(PropertyReader.getProp().
                    getProperty("browser"));  // Get WebDriver based on browser type
            DriverInitiator.setDriver(driver);
        }
        bind(WebDriver.class).toInstance(DriverInitiator.getDriver());  // Bind WebDriver from threadLocal
        bind(RegistrationPage.class).asEagerSingleton();
    }
}


