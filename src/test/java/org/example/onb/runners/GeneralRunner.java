package org.example.onb.runners;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org.example.onb.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Onboarding"

)
public class GeneralRunner {


}
