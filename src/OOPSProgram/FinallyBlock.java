package OOPSProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chrome.driver\\112 version chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
									
		driver.get("https://classic.freecrm.com/index.html");
								
		driver.manage().window().maximize();	
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("speedway2016");
	     
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Speedway@2016");
		
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();	

		
	}

}
