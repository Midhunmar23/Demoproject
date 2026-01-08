package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Base 
{
     
	
	 public WebDriver driver;
	@Parameters("browser")
	@BeforeMethod (alwaysRun = true)
	public void browserIntilization( String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver= new ChromeDriver();
			
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			driver= new FirefoxDriver();
		}
		else
		{
			throw new Exception("Not Connected");
		}
		
		driver.get("https://groceryapp.uniqassosiates.com/admin");
		driver.manage().window().maximize();
	}
	
	@AfterMethod (alwaysRun = true)
	public void closeBrowser()
	{
		//driver.close();
	}

}
