package stepDefinition;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.PageAcceuil;
import pages.PageApropos;
import stepDefinition.Initialisation;


public class TestPageAPropos extends Initialisation 
{
	
	private WebDriver driver=Initialisation.getDriver();
	
	private PageAcceuil pageAcceuil;
	private PageApropos pageApropos;
	
	
	@Given("^I visit happn website$")
	public void i_visit_happn_website() throws Throwable {
		Initialisation.initialisation();
	}

	@When("^I click on the link  -a propos-$")
	public void i_click_on_the_link_a_propos() throws Throwable {
		pageAcceuil = new PageAcceuil(driver);
		pageApropos = pageAcceuil.ClicLink_a_propos();
	}

	@Then("^I can see the three key numbers of happn$")
	public void i_can_see_the_three_key_numbers_of_happn() throws Throwable {
		boolean CleExist = pageApropos.VerificationChiffresCles();
		Assert.assertEquals(CleExist, true);
	}
}






