package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//wormi//IdeaProjects//nopCommerceV001_Cucumber//features//OrangeHRM.feature",
        glue = "stepDefinitions"
)

public class TestRunner {
}
