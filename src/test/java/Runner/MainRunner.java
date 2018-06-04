package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (

        features = {"src/test/java/Feature/"},
        glue = {"Steps"},
        monochrome = true,
        tags = {"@AddIssue"},
        plugin = {"pretty", "html:CucumberFramework/target/cucumber",
                "json:target/cucumber",
                "com.cucumber.listener.ExtentCucumberFormatter:target/report.html"}


)

public class MainRunner extends AbstractTestNGCucumberTests {



}
