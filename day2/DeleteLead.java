package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.xpath("(//div[@class='x-tab-strip-wrap']//li)[2]")).click();
		//driver.findElement(By.xpath("//input[@name= 'phoneNumber']")).sendKeys("9876543452");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		System.out.println("capturing and viewing first ID....");
		WebElement firstlead = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-row')]/table/tbody/tr/td/div/a"));
		String ID = firstlead.getText();
		System.out.println(firstlead.getText());
		firstlead.click();
		
		System.out.println("Deleting the first ID.....");
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
		System.out.println("Searching the deleted ID.....");
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name = 'id']")).sendKeys(ID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		
		if(driver.findElement(By.xpath("//div[text()='No records to display'] ")).isDisplayed()) 
		{
		WebElement message = driver.findElement(By.xpath("//div[text()='No records to display'] "));
		String MSG = message.getText();
		System.out.println(MSG);
		if (MSG.contains("No records to display")) {
			System.out.println("The record deleted successfully");
		}
		}
		else 
		{
			System.out.println("The list of data is shown , Kindly check it");
		}
		
		Thread.sleep(3000);
		driver.close();
		}
	
	}
		
	


