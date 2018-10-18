package com.aconex.fieldautomation.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/com/aconex/fieldautomation/feature"},
        glue = {"com.aconex.fieldautomation/steps"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber/html", "json:target/cucumber/cucumber.json"}
)

public class MainRunner extends AbstractTestNGCucumberTests {
}
