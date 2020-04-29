package pages;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageCookies {

	private WebDriver driver;
	
	private By TitrePageCookie = By.className("page__header__title subpage__header");
	private By charte1 = By.xpath("//h2[contains(text(),\"1. Qu’est-ce qu’un cookie\")]");
	private By charte2 = By.xpath("//h2[contains(text(),\"2. Est-ce qu’il y a aussi des cookies sur les applications mobiles\")]");
	private By charte3 = By.xpath("//h2[contains(text(),\"3. Quelles sont les différentes catégories de cookie\")]");
	private By charte4 = By.xpath("//h2[contains(text(),\"4. Pourquoi HAPPN utilise des cookies et des Identifiants mobiles\")]");
	private By charte5 = By.xpath("//h2[contains(text(),\"5. À quel moment les cookies sont déposés\")]");
	private By charte6 = By.xpath("//h2[contains(text(),\"6. À quel moment les Identifiants mobiles sont collectés\")]");
	private By charte7 = By.xpath("//h2[contains(text(),\"7. Quelles sont les différentes fonctionnalités des cookies\")]");
	private By charte8 = By.xpath("//h2[contains(text(),\"8. Liste des Cookies Web et Outils\")]");
	private By charte9 = By.xpath("//h2[contains(text(),\"9. Gérer vos cookies et vos Identifiants mobiles\")]");
	private By charte10 = By.xpath("//h2[contains(text(),\"10. Contact\")]");
	
	public PageCookies(WebDriver driver) {
		this.driver=driver;
	}

	public boolean VerificationTitre() {
		WebElement element = driver.findElement(TitrePageCookie);
		String pageText = element.getText();
		String expectedPageText = "Charte d’utilisation des cookies";
		return pageText.contains(expectedPageText);
	}
	
	public boolean VerificationHeaderCharte (){
		 Object tableauCharte[] = {charte1, charte2, charte3,charte4,charte5,charte6,charte7,charte8,charte9,charte10};
		 int i = 0;
	     boolean flag = true;
		 while((i < tableauCharte.length) & flag );
		 {
		 try {
		      driver.findElement((By) tableauCharte[i]);
		      flag = true;
		    }
		 catch (NoSuchElementException e) {
		      flag = false;
		    } 
		 	i++;
		 	
		 }
		 return flag;	
		 
	 }	
}
