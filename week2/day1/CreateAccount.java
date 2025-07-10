package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) {
		// chromedriverinitialized
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		
		ChromeDriver driver = new ChromeDriver(options);

		//Launch the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		//Click on the CRM/SFA link
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		
		//Click on  account
		driver.findElement(By.linkText("Accounts")).click();
		//clikck on create account
		driver.findElement(By.linkText("Create Account")).click();
		//input account name
		driver.findElement(By.id("accountName")).sendKeys("Vinothini1195");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("51");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String Title = driver.getTitle();
		System.out.println(Title);
		
		if
			(Title.contains("Account Details")) {
			System.out.println("title Verified");
		}
		driver.close();
		
		
		
		

	}

}
