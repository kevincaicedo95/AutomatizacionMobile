package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ComprarCamisaRoja.feature",
        glue = {"stepDefinitions"},
        snippets = CAMELCASE
)

public class ComprarCamisetaRojaRunner {
}
