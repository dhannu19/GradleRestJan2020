package runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = { "pretty", "html:CucumberReport",
		"json:CucumberReport/Common/common.json" }, features = "src/test/java", tags = {
				"@tag2", "~@wip", "~@dip" }, glue = { "stepdefinition" }, monochrome = true)





public class runnerTC {

}
