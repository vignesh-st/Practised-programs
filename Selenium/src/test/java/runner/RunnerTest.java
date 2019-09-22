package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/java/features/createLead.feature", glue="implementation", monochrome=true 
/*,dryRun=true,
snippets=SnippetType.CAMELCASE*/
,tags="@Smoke")
public class RunnerTest extends AbstractTestNGCucumberTests{
	

}

/*a  if u want to run all the feature file in a specific package
b. want to run few(any 5) feature files out of 10  inside the package
c. explore what plugin attribute in cucumber options. 
if u have multiple packages, how u will define in ur glue attribute

*/