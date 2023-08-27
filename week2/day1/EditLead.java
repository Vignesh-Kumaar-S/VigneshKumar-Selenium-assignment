package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("http://leaftaps.com/opentaps/control/login");//launch the URL
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //Pass the values in username by finding the element
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vignesh");
		driver.findElement(By.name("departmentName")).sendKeys("QA");
		driver.findElement(By.name("description")).sendKeys("sampleDescription");
		driver.findElement(By.name("primaryEmail")).sendKeys("sampleDescription");
		//selecting the state using select class.
		WebElement statedropdown = driver.findElement(By.name("generalStateProvinceGeoId"));
		statedropdown.click();
		Select stateProvince = new Select(statedropdown);
		stateProvince.selectByVisibleText("Arkansas");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		//EDIT Part starts
		driver.findElement(By.linkText("Edit")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This edited important notes.");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
	}

}