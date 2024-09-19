package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Registration.feature"},
        glue = {"stepdefenitions","hooks"}
        , plugin = {"pretty", "html:target/cucumber-report.html"} )
public class Testrunner {

}

