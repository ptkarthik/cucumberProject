package pages;

import driverpackages.DriverSetter;
import driverinitiator.DriverInitiator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverInitiator.getDriver(), this);
    }
}
