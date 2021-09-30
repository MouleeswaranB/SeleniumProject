/**
* 
*/
package com.picniiic.SeleniumGA1;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
import com.picniiic.SeleniumGA1.LoginPage;
 
/**
* @author Mukesh_50
*
*/
public class VerifyWordPresssLogin 
{
 


 public static void main (String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\mouleeswaranb\\\\\\\\eclipse-workspace_Selenium learning_6127\\\\\\\\SeleniumProject\\\\\\\\drivers\\\\\\\\chrome.exe");
	WebDriver driver = new ChromeDriver();

		 
		driver.manage().window().maximize();
		 
		driver.get("https://demosite.center/wordpresswp-login.php");
		 
		LoginPage login=new LoginPage(driver);
		
		login.clickOnLoginButton();
		 
		 driver.quit();
 
}
}