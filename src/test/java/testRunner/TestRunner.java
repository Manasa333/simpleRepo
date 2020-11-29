package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C://Users//manasa.gudem//IdeaProjects//cucumber//Features//orangehrm.feature",
        glue = "stepDefinition")


public class TestRunner {
}
