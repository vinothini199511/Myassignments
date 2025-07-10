package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

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
				driver.findElement(By.partialLinkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinothini");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ganesan");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Welcome");
				driver.findElement(By.className("smallSubmit")).click();
				String Title = driver.getTitle();
				System.out.println(Title);
				if(Title.contains("Lead")) {
					System.out.println("Title verified");
				}
				
				
				driver.close();
				
	}

}
