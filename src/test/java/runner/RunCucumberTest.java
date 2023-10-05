package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags = {"~@igore"},
        glue = {"steps"},
        snippets = SnippetType.CAMELCASE

)
public class RunCucumberTest extends RunBase {
    @AfterClass
    public static void stop() {
        driver.quit();
    }
}
