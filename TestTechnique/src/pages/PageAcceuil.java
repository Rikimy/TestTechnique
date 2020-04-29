package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import stepDefinition.Initialisation;

public class PageAcceuil extends Initialisation {

	protected WebDriver driver;
	private By lienApropos = By.linkText("� propos");
	private By lienCookies = By.className("cookie-bar__link");
	private By lienContact = By.xpath("//a[@href='/fr/contact/']");
	
	//Initialisation de la page
	public PageAcceuil(WebDriver driver)
	{
		this.driver=driver;
	}
	//Clic sur le lien A propos
	public PageApropos ClicLink_a_propos()
	
	{
		System.out.println("Clic sur le lien � propos");
		WebElement AproposElement=driver.findElement(lienApropos);
		
		if(AproposElement.isDisplayed()||AproposElement.isEnabled())
			AproposElement.click();
		else System.out.println("El�ment non trouv�");
		
		return new PageApropos(driver);
	    
	}
	
	//Clic sur le lien cookies
	public PageCookies ClicLinkCookies()
		
	{
		System.out.println(" Clic sur le lien En savoir plus et param�trer les cookies");
		WebElement CookieElement=driver.findElement(lienCookies);
		
		if(CookieElement.isDisplayed()||CookieElement.isEnabled())
			CookieElement.click();
		
		else System.out.println("El�ment non trouv�");
		return new PageCookies(driver);
	    
	}

	//Clic sur le lien Contact
	public PageFormulaire ClicLinkContact()
	
	{
		System.out.println(" Clic sur le lien Contact");
		WebElement ContactElement=driver.findElement(lienContact);
		
		if(ContactElement.isDisplayed()||ContactElement.isEnabled())
			ContactElement.click();
		else System.out.println("El�ment non trouv�");
		
		return new PageFormulaire(driver);
	    
	}
	
	
	
}
