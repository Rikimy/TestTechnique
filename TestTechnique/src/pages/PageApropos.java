package pages;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PageApropos  {
	
	private WebDriver driver;
	private JavascriptExecutor jse;

	private By cleUne = By.xpath("//ul[@class='numbers']/li[1]/span");
	private By cleDeux = By.xpath("//ul[@class='numbers']/li[2]/span");
	private By cleTrois = By.xpath("//ul[@class='numbers']/li[3]/span");
	
	//Initialisation de la page
	public PageApropos(WebDriver driver)
	{
		this.driver=driver;
	}
	 
	 public boolean VerificationChiffresCles (){
		 
		 //Scroller dans la page pour arriver au niveau des chiffres cl�s
		 jse = (JavascriptExecutor)driver;
		 jse.executeScript("scroll(0,1500)");
		 
		 //V�rifier l'existence des chiffres cl�s
		 Object tableauCle[] = {cleUne, cleDeux, cleTrois};
		 int i = 0;
	     boolean flag = true;
	     
		 while((i < tableauCle.length) & flag );
		 {
		 try {
		      driver.findElement((By) tableauCle[i]);
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














