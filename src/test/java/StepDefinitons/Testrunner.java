package StepDefinitons;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources\\Feature", glue = "StepDefinitons", dryRun = false, monochrome = true)
public class Testrunner {

}
