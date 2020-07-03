package co.com.sophos.prueba.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/openTarifario.feature",
        glue = "co.com.sophos.prueba.step_definition",
        snippets = SnippetType.CAMELCASE
)
public class OpenTarifario {
}
