package testsRun;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import steps.Hook;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
//        tags = {"@ArezzoCartEntrega,@ArezzoCart"},
//        tags = {"@Smoke"},
        strict = false,
        glue = ("steps")
)

public class RunTest extends Hook {
}
