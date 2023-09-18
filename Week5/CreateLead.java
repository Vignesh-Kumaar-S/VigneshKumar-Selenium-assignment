package Week5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test
public class CreateLead extends Baseclass{

	public void createleadcase() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
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

		
		
		
		
		
	}

}
