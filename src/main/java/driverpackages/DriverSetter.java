package driverpackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverSetter {

    public static WebDriver getInstanceDriver(String driver) {
        String driverName = driver.toLowerCase();
        WebDriver driverObj = null;
        switch (driverName) {
            case "chrome": {
                driverObj = new ChromeDriver();
                break;
            }
            case "firefox": {
                driverObj = new FirefoxDriver();
                break;
            }
            case "edge": {
                driverObj = new EdgeDriver();
                break;
            }
            default: {
                driverObj = new ChromeDriver();
                break;
            }
        }
        return driverObj;
    }
}