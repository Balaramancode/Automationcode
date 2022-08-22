package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gangvehicle {
	
	public void motor() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\New folder\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//				driver.get("https://stage.myrmc.in/login");
		
		driver.get("http://192.168.1.28/login");
		driver.manage().window().maximize(); 
		
		//				driver.findElement(By.id("mat-input-0")).sendKeys("myrmcapps@gmail.com");
		//				driver.findElement(By.id("mat-input-1")).sendKeys("sandy@170");
		//				driver.findElement(By.id("mat-input-1")).sendKeys(Keys.ENTER);

		
		driver.findElement(By.id("mat-input-0")).sendKeys("m41801600@gmail.com");
		driver.findElement(By.id("mat-input-1")).sendKeys("bala123");
		driver.findElement(By.id("mat-input-1")).sendKeys(Keys.ENTER);
		
		System.out.println("Raman construction Login successful");
		
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".col-md-3:nth-child(2) .mb-3")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".form-control")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector(".form-control")).sendKeys("egmore metro");
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".form-control")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#mat-select-value-3 > .mat-select-placeholder")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.cssSelector("#mat-option-6 > .mat-option-text")).click();
//	    Thread.sleep(1000);
	    driver.findElement(By.id("mat-input-2")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-2")).sendKeys("8046464646");
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-3")).sendKeys("8025252525");
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#mat-radio-2 .mat-radio-inner-circle")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".ng-tns-c92-13 > .mat-form-field-infix")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".mat-option-text")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector("#mat-radio-5 .mat-radio-inner-circle")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-4")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-4")).sendKeys("1");
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-5")).sendKeys("1");
//	    Thread.sleep(3000);
	    driver.findElement(By.id("mat-input-6")).sendKeys("1");
//	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='mat-radio-9']")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id='mat-radio-11']")).click();
//	    Thread.sleep(3000);
	    driver.findElement(By.cssSelector(".mat-raised-button > .mat-button-wrapper")).click();
	    
	    System.out.println("Pump & gang internal booking done");
//	    Thread.sleep(3000);
	    driver.close();

		
		
	}

}
