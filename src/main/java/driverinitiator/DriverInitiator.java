package driverinitiator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.WebDriver;


@Setter
@Getter
public class DriverInitiator {
    public static ThreadLocal<WebDriver> threadLocal = new ThreadLocal<>();
}
