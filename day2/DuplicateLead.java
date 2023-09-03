package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("http://leaftaps.com/opentaps/control/login");//launch the URL
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //Pass the values in username by finding the element
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click(); 
		driver.findElement(By.xpath("(//div[@class='x-tab-strip-wrap']//li)[3]")).click();
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		//capturing the first name
		System.out.println("capturing and viewing first name....");
		WebElement firstname = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-body')]/div/table/tbody/tr/td[3]/div/a"));
		String name1 = firstname.getText();
		WebElement lastname = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-body')]/div/table/tbody/tr/td[4]/div/a"));
		String name2 = lastname.getText();
		String Name = name1+name2;
		System.out.println(Name);
		
		//clicking the first name
		firstname.click();
		
		//duplicate lead
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String titlev = driver.getTitle();
		if(titlev.contains("Duplicate Lead"))
		{
			System.out.println("Landed in duplicate lead page");
			
		}
		else
		{
			System.out.println("Landed in "+ titlev);
		}
		
		driver.findElement(By.xpath("//input[@value = 'Create Lead']")).click();
		
		//confirming the duplicate lead
		WebElement FN = driver.findElement(By.xpath("//span[@id = 'viewLead_firstName_sp']"));
		String firstN = FN.getText();
		WebElement LN = driver.findElement(By.xpath("//span[@id = 'viewLead_lastName_sp']"));
		String LastN = LN.getText();
		String combinedname = firstN+LastN;
		
		if(Name.equals(combinedname)) {
			System.out.println("Both the names are Matching");
			System.out.println(Name);
			System.out.println(combinedname);
		}
		else
		{
			System.out.println("Both names are not matching, Kindly check it");
			System.out.println(Name);
			System.out.println(combinedname);
		}
		
		Thread.sleep(3000);
		driver.close();
		}
		
	}


