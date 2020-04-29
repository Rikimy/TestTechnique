package stepDefinition;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageAcceuil;
import pages.PageFormulaire;
import stepDefinition.Initialisation;


public class TestPageFormulaire extends Initialisation
{

	private WebDriver driver=Initialisation.getDriver();
	
	private PageAcceuil pageAcceuil;
	private PageFormulaire pageFormulaire; 
	
	
	@Given("^I visit the website$")
	public void i_visit_the_website() throws Throwable {
		Initialisation.initialisation();
	}

	@When("^I want to contact the customer service$")
	public void i_want_to_contact_the_customer_service() throws Throwable {
		pageAcceuil = new PageAcceuil(driver);
		pageFormulaire = pageAcceuil.ClicLinkContact();
	}

	@Then("^I m able to find the form on the website$")
	public void i_m_able_to_find_the_form_on_the_website() throws Throwable {
		pageFormulaire.ClicRubriqueCompte();
	}

	@Then("^I can fullfill the form with data$")
	public void i_can_fullfill_the_form_with_data() throws Throwable {
	    pageFormulaire.RemplissageFormulaire("aaa@gmail.com", "Problème de connexion", "Petite description");
	}
}
