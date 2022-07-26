package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Features\\BackgroundDemo\\Background.feature",
glue={"stepsForBackground"},
monochrome = true,

plugin={"pretty","html:target/HtmlReports/reports.html"})

public class TestRunnerForBackground {

}
