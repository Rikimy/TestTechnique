package stepDefinition;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import pages.PageAcceuil;
import pages.PageCookies;
import stepDefinition.Initialisation;


public class TestPageCookies extends Initialisation
{
	private WebDriver driver=Initialisation.getDriver();
	
	private PageAcceuil pageAcceuil;
	private PageCookies pageCookies;
	
	@Given("^I visit website$")
	public void i_visit_happn_website() throws Throwable {
		Initialisation.initialisation();
	}
	
	@When("^I want to access to the page ? Charte d utilisation des cookies ?$")
	public void i_want_to_access_to_the_page_Charte_d_utilisation_des_cookies() throws Throwable {
		pageAcceuil = new PageAcceuil(driver);
		pageCookies = pageAcceuil.ClicLinkCookies();
	}
	
	@Then("^Je suis sur la page cookies$")
	public void je_suis_sur_la_page_cookies() throws Throwable {
		boolean TitreExist = pageCookies.VerificationTitre();
		Assert.assertEquals(TitreExist, true);
	}

	@Then("^I m able to see all different headers of the chart$")
	public void i_m_able_to_see_all_different_headers_of_the_chart() throws Throwable {
		boolean ChartesExist = pageCookies.VerificationHeaderCharte();
		Assert.assertEquals(ChartesExist, true);
	}

}
