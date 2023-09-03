package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead2 {

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
		Thread.sleep(3000);
		//driver.findElement(By.name("firstName")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		//ID retrieving
		WebElement firstlead = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-row')]/table/tbody/tr/td/div/a"));
		String ID = firstlead.getText();
		System.out.println(ID);
		
		//Name Retrieving
		WebElement firstname = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-body')]/div/table/tbody/tr/td[5]/div/a"));
		String name1 = firstname.getText();
		System.out.println("The old company name is "+name1);
		
		firstlead.click();
		
		String Title = driver.getTitle();
		if(Title.equals("View Lead | opentaps CRM"))
		{
			System.out.println("Landed in correct page");
		}
		else 
		{
			System.out.println("Landed in wrong page"+ Title);
		}
		
		driver.findElement(By.linkText("Edit")).click();
		System.out.println(driver.getTitle());
		WebElement companyname = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		companyname.click();
		Thread.sleep(3000);
		companyname.clear();
		String Text = "TestL";
		companyname.sendKeys(Text);
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		WebElement confirmname = driver.findElement(By.id("viewLead_companyName_sp"));
		String CN = confirmname.getText();
		if(CN.contains(Text))
		{
			System.out.println("The name is changed successfully, the new name is - "+CN);
		}
		else
		{
		System.out.println("The name is not changed, Kindly check it");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
