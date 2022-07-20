package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/OfreciendoAlSuscriptor.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "stepdefinitions")

public class OfreciendoAlSuscriptorRunner {

}
