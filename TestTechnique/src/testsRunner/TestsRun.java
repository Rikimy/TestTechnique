package testsRunner;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions.Options(features="C:\\Users\\Rikimy\\Desktop\\TestTechnique\\TestTechnique\\features",glue= {"stepDefinition"})
