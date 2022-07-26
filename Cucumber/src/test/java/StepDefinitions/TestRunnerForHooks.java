package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\HooksDemo\\HooksDemo.feature",
glue={"StepsForHooks"},
monochrome = true,

plugin={"pretty","html:target/HtmlReports/reports.html"})

public class TestRunnerForHooks {

}
