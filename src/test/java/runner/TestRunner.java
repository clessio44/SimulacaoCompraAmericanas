package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/adicionar_produto.feature",
		glue = "steps",
		tags = {""},
		snippets = SnippetType.CAMELCASE,
		monochrome = false,
		strict = true,
		dryRun = false
		,plugin = {"pretty", "html:target/report-html"}
		)

public class TestRunner {

}
