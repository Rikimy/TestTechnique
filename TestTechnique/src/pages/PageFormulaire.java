package pages;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageFormulaire {
	
	private WebDriver driver;
	
	private By rubriqueMonCompte = By.xpath("//h3[text()='Mon compte']");
	private By question = By.xpath("//li[@class='faq__articles__element']/a[contains(text(),'Comment partager mon compte Instagram')]");
	private By email = By.className("faq__contact__form-input");
	private By liste = By.className("faq__contact__form-select");
	private By zoneTexte = By.className("faq__contact__form-textarea");
	private By captcha = By.className("recaptcha-checkbox-border");
	
	
	public PageFormulaire(WebDriver driver) {
		this.driver=driver;	
	}
	
	public void ClicRubriqueCompte() throws InterruptedException
	{
		System.out.println(" Clic sur la rubrique 'Mon compte'");
		WebElement CompteElement=driver.findElement(rubriqueMonCompte);
		String parent = driver.getWindowHandle();
		if(CompteElement.isDisplayed()||CompteElement.isEnabled())
			
			{CompteElement.click();
			
				//Ce bloc gère l'ouverture de la page contact dans un nouveau onglet du navigateur
				Set<String> TousLesTabs=driver.getWindowHandles();
				for(String child:TousLesTabs)
				{
					if(!parent.equalsIgnoreCase(child))
					{
						driver.switchTo().window(child);
						WebElement faqQuestion = driver.findElement(question);
						if(faqQuestion.isDisplayed())
							{CompteElement.click();
							Thread.sleep(3000);
							}
						else
							{System.out.println("Elément non trouvé");
							
							}
					}
					
				}
			}
		else 
			{
			System.out.println("Elément non trouvé");
			}
		
	}
	
	
	public void RemplissageFormulaire(String mail, String option, String description) {
		
		//Remplissage du champ mail
		WebElement champEmail = driver.findElement(email);
		if(champEmail.isDisplayed())
			champEmail.sendKeys(mail);
		
		//Sélection d'une option de la liste déroulante
		Select objSelect = new Select(driver.findElement(liste));
		objSelect.deselectByVisibleText(option);
		
		//Remplissage du champ description
		WebElement champDescription = driver.findElement(zoneTexte);
		if(champDescription.isDisplayed())
			champDescription.sendKeys(description);
		
		//Clic sur le checkbox captcha
		WebElement checkboxCaptcha = driver.findElement(captcha);
		if(checkboxCaptcha.isDisplayed())
			checkboxCaptcha.click();
	}
	
	
	

}
