package stepDefinition;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialisation {
	
	public static  WebDriver driver;
	public static Properties prop;
	
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	@BeforeClass
	public static  void initialisation() {	
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("C:/Users/Rikimy/Desktop/TestTechnique/TestTechnique/src/config");
			prop.load(fis);	
		}
		catch (IOException e) {
			e.getMessage();
		}	
		
		String browserName = prop.getProperty("browser");
		
		try {
			
			if (browserName.equals("chrome"))
			{System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rikimy\\Desktop\\TestTechnique\\TestTechnique\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
			else if (browserName.equals("FF"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rikimy\\Desktop\\TestTechnique\\TestTechnique\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		
		}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}
