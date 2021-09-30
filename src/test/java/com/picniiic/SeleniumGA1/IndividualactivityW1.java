package com.picniiic.SeleniumGA1;

import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
public class IndividualactivityW1 {
 
WebDriver driver;
 
/**
* This function will execute before each Test tag in testng.xml
* @param browser
* @throws Exception
*/
@BeforeTest // which will be executed first before all the test methods
@Parameters("browser") //@Parameter is used to pass the values(during run time) to the test methods as arguments using .xml file
public void setup(String browser) throws Exception{
 
//Check if parameter passed as 'chrome'
if (browser.equalsIgnoreCase("chrome")){
//set path to chromedriver.exe
System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\mouleeswaranb\\\\\\\\eclipse-workspace_Selenium learning_6127\\\\\\\\SeleniumProject\\\\\\\\drivers\\\\\\\\chromedriver.exe");
driver = new ChromeDriver(); 
}

else{
//If no browser passed throw exception
throw new Exception("Browser is not correct");
}
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
 
@Test
public void testParameterWithXML() throws Exception{
	driver.get("https://www.saucedemo.com/");   

	driver.manage().window().maximize();//to maximize the window
	WebDriverWait wait = new WebDriverWait(driver,40);
	
		
	//Login
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name"))).sendKeys("standard_user");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password"))).sendKeys("secret_sauce");
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login-button"))).click();
	Thread.sleep(6000);

	//Assertion
        WebElement logo=driver.findElement(By.className("app_logo"));
	System.out.println("Is swaglabs logo is present?"+logo.isDisplayed());
	
	//Select Product
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Sauce Labs Backpack"))).click();
    
        //AddtoCart
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add-to-cart-sauce-labs-backpack"))).click();
	Thread.sleep(6000);
	
	//ClickonCarticon
	wait.until(ExpectedConditions.presenceOfElementLocated(By.className("shopping_cart_badge"))).click();
	Thread.sleep(6000);
			
	//Checkout
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("checkout"))).click();
	Thread.sleep(6000);
	
	//Firstname
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("first-name"))).sendKeys("Moulee");
	Thread.sleep(3000);
		
	//Lastname
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("last-name"))).sendKeys("Latchu");
	Thread.sleep(2000);
	
	
	//Postalcode
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("postal-code"))).sendKeys("600099");
	Thread.sleep(1000);
	
	//Continue
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("continue"))).click();
	Thread.sleep(3000);
	
	//Finish
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish"))).click();
	Thread.sleep(3000);
	
	//Back2Home
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("back-to-products"))).click();
	Thread.sleep(3000);
	
	//Logoutclick
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("react-burger-menu-btn"))).click();
	Thread.sleep(3000);
	
	//Logoutbtnclick
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logout_sidebar_link"))).click();
	Thread.sleep(3000);
	
	    driver.quit();
}


}