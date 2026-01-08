package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Login extends Base
{
	@Test
	   public void login()
	   {
		    String username="admin";
		    String password="admin";
		    
		   WebElement usernamefiled= driver.findElement(By.xpath("//input[@name='username']"));
		   usernamefiled.sendKeys( username);
		   WebElement psswd= driver.findElement(By.xpath("//input[@name='password']"));
		   psswd.sendKeys(password);
		   WebElement clck=driver.findElement(By.xpath("//button[text()='Sign In']"));
		   clck.click();
	   }
	@Test
	  public void logininCorectUserNamecPass()
	  {
		

	    String usern="admin@1234";
	    String passd="admin";
		
		  WebElement uname= driver.findElement(By.xpath("//input[@name='username']"));
		   uname.sendKeys(usern);
		   WebElement psswd= driver.findElement(By.xpath("//input[@name='password']"));
		   psswd.sendKeys(passd);
		   WebElement clck=driver.findElement(By.xpath("//button[text()='Sign In']"));
		   clck.click();
	  }
	
	   @Test
	    public void logincUserNameinPass()
	    {
		   String usern="admin@123";
		    String passd="admin";
	    	WebElement uname= driver.findElement(By.xpath("//input[@name='username']"));
			   uname.sendKeys(usern);
			   WebElement psswd= driver.findElement(By.xpath("//input[@name='password']"));
			   psswd.sendKeys(passd);
			   WebElement clck=driver.findElement(By.xpath("//button[text()='Sign In']"));
			   clck.click();
	    }
	   @Test
	   
	   public void logincUserNameinPassincor()
	    {
		   String usern="admin";
		    String passd="admin@123";
	    	WebElement uname= driver.findElement(By.xpath("//input[@name='username']"));
			   uname.sendKeys(usern);
			   WebElement psswd= driver.findElement(By.xpath("//input[@name='password']"));
			   psswd.sendKeys(passd);
			   WebElement clck=driver.findElement(By.xpath("//button[text()='Sign In']"));
			   clck.click();
	    }
	    
	   @Test
	    public void loginNull()
	    {
		   String usern="ad@124";
		    String passd="Pass@123";
	    	WebElement uname= driver.findElement(By.xpath("//input[@name='username']"));
			   uname.sendKeys(usern);
			   WebElement psswd= driver.findElement(By.xpath("//input[@name='password']"));
			   psswd.sendKeys(passd);
			   WebElement clck=driver.findElement(By.xpath("//button[text()='Sign In']"));
			   clck.click();
	    }
	

}
