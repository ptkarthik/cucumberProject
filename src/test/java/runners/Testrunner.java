package runners;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guicemodule.TestModule;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Registration.feature"},
        glue = {"stepdefenitions","hooks"}
        , plugin = {"pretty", "html:target/cucumber-report.html"} )
public class Testrunner {
    private static final Injector injector = Guice.createInjector(new TestModule());

    public static Injector getInjector() {
        return injector;
    }
}
