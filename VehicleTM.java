package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VehicleTM {
	
	public void Mixter() throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Myrmc\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("http://192.168.1.28");
		driver.manage().window().maximize(); 
		
		driver.findElement(By.id("mat-input-0")).sendKeys("email");
		driver.findElement(By.id("mat-input-1")).sendKeys("pass");
		driver.findElement(By.id("mat-input-1")).sendKeys(Keys.ENTER);
		
//		System.out.println("Login successfully");
		
		Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".col-md-3:nth-child(1) b")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".form-control")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".form-control")).sendKeys("tambaram");
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".form-control")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#mat-select-value-3 > .mat-select-placeholder")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".mat-option-text")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-2")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.id("mat-input-2")).sendKeys("8011111111");
//	    Thread.sleep(3000);
	    
//	    Alternate number
	    driver.findElement(By.id("mat-input-3")).click();
	    
	    driver.findElement(By.id("mat-input-3")).sendKeys("8011111112");
//	    Thread.sleep(3000);    
	    
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
//	    Thread.sleep(5000);
	    driver.findElement(By.cssSelector(".mat-option-text")).click();
//	    Thread.sleep(5000);
	 	driver.findElement(By.cssSelector(".mat-raised-button > .mat-button-wrapper")).click();
	 	
	 	System.out.println("Transit mixer Now booking done");
//	 	Thread.sleep(5000);
	 	driver.close();
	}
	

}
