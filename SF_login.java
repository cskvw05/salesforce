package salesforce;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SF_login {

	public static void main(String[] args) {

		ChromeOptions options = new ChromeOptions();

		options.addArguments("--disable-notifications");
		
		

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver(options);

		driver.manage().window().maximize();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://login.salesforce.com");

		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp@123");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'slds-button slds-icon-waffle_container')]")).click();
		
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		driver.findElement(By.xpath("//p[text()='Opportunities']")).click();
		
		driver.findElement(By.className("forceActionLink")).click();
		
		driver.findElement(By.xpath("//label[text()='Opportunity Name']/following::input")).sendKeys("Salesforce Automation by Vigneshwaran C S K");
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).click();
		
		
		driver.findElement(By.xpath("//td[@data-value='2021-12-04']")).click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input slds-combobox__input'])[3]")).click();
		
		driver.findElement(By.xpath("//span[@title='Needs Analysis']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		String name = "Vigneshwaran C S K"; 
		
		if(name.equals ("Vigneshwaran C S "))
		{

			System.out.println("Name displayed is correct");

		}
		else {

			System.out.println("Name displayed is  wrong");

		}

	}
		
		
		
		
		
		//WebElement dropDown1 = driver.findElement(By.id("dropdown-element-181"));
		//Select drop = new Select(dropDown1);
		//drop.selectByVisibleText("Needs Analysis");
		
		
		
		
		
		
		
		
		//Salesforce Automation by Vigneshwaran C S K
		
		
		
		
		
		
		







		//Set<String> winset = driver.getWindowHandles();
		//List<String> winlist = new ArrayList<String>(winset);

		//driver.switchTo().window(winlist.get(1));

		//driver.findElement(By.name("email")).sendKeys("user@phptravels.com");
		//driver.findElement(By.name("password")).sendKeys("demouser");

	}


