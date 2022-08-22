package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Boomvehicle {
	
	public void carriage() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		//				driver.get("https://stage.myrmc.in/login");
		
		driver.get("http://192.168.1.28/login");	
		driver.manage().window().maximize(); 
		
		//				driver.findElement(By.id("mat-input-0")).sendKeys("email");
		//				driver.findElement(By.id("mat-input-1")).sendKeys("pass");
		//				driver.findElement(By.id("mat-input-1")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("mat-input-0")).sendKeys("email");
		driver.findElement(By.id("mat-input-1")).sendKeys("pass");
		driver.findElement(By.id("mat-input-1")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		System.out.println("Raman construction Login successful");
		
//		Thread.sleep(3000);
		//		select vehicle
		driver.findElement(By.cssSelector(".col-md-3:nth-child(3) img")).click();
		Thread.sleep(3000);
		//		location input field     .
		driver.findElement(By.cssSelector(".form-control")).click();
//		Thread.sleep(1000);
		//		location input
		driver.findElement(By.cssSelector(".form-control")).sendKeys("adambakkam");
//		Thread.sleep(1000);
		//		location enter
	    driver.findElement(By.cssSelector(".form-control")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    //	    contact field
	    driver.findElement(By.id("mat-input-2")).click();
//	    Thread.sleep(3000);
	    //	    contact input
	    driver.findElement(By.id("mat-input-2")).sendKeys("8034567890");
//	    Thread.sleep(3000);
	    //	    Alternate contact field
	    driver.findElement(By.id("mat-input-3")).click();
	    
	    driver.findElement(By.id("mat-input-3")).sendKeys("8034567891");
	    //	    vehicle number select
	    driver.findElement(By.cssSelector(".mat-select-placeholder")).click();
//	    Thread.sleep(3000);
	    //	    vehicle number select enter
	    driver.findElement(By.cssSelector(".mat-option-text")).click();
	    Thread.sleep(3000);
	    //	    select now mode
	    driver.findElement(By.cssSelector("#mat-radio-5 .mat-radio-inner-circle")).click();
//	    Thread.sleep(3000);
	    //	    Book now
	    driver.findElement(By.cssSelector(".mat-raised-button > .mat-button-wrapper")).click();
	   
	    System.out.println("Boom placer internal booking successful");
	    
//	    Thread.sleep(3000);
	    driver.close();

		
	}

}
