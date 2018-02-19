package helpers;

import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


/**
 * @author CHIRAG
 *
 */

// Uncomment @RunWith if you are using Junit to run Test 
// @RunWith(Cucumber.class)

@CucumberOptions(features={"classpath:Adidasfeatures"}
//@CucumberOptions(features={"classpath:Adidasfeatures/Men Basketball Search Result Count Verification.feature"}
					//,glue={"src/test/java/stepdefinitions/GoogleSearch","Hook"}
					,glue={"helpers","classpath:stepDefinitions"}
					//,glue={"helpers","classpath:stepDefinitions/Adidas_Mens_Basketball_Search_Count_Validation"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@web"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}