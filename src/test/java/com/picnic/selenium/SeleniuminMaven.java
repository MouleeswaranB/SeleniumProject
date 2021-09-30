package com.picnic.selenium;

 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

 

public class SeleniuminMaven {
    public static void main(String[]args) throws InterruptedException {
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\mouleeswaranb\\eclipse-workspace_Selenium learning_6127\\SeleniumProject\\drivers\\chromedriver.exe");
    	
	    //public void mavsel() throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
        
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        Thread.sleep(2000);
        WebElement sample=driver.findElement(By.id("btnLogin"));
        sample.click();
        Thread.sleep(3000);//timing in milli seconds
        driver.quit();
}
	//private static Object chromedriver() {
		// TODO Auto-generated method stub
		//return null;
	//}
}
