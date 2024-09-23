package driverinitiator;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;


@Setter
@Getter
public class DriverInitiator {

    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();

    public static void setDriver(WebDriver driver) {
        threadLocal.set(driver);
    }

    public static WebDriver getDriver() {
        return threadLocal.get();
    }

    public static void removeDriver() {
        threadLocal.remove();
    }
}


