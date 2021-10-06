package steps.Task1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featuresTask1/",
        glue = {"steps.Task1"},
        plugin = {"pretty","html:out"})

public class testRunner {
}
