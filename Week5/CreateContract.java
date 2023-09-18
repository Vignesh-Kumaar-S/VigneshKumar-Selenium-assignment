package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Week5.Baseclass;

public class CreateContract extends Baseclass{

	@Test
	public void createcontactcase() throws InterruptedException {
		// TODO Auto-generated method stub
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Vignesh");
		driver.findElement(By.id("lastNameField")).sendKeys("kUMAR S");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='lastNameLocal']")).sendKeys("Vignesh");
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("sampleDescription");
		driver.findElement(By.name("primaryEmail")).sendKeys("sampleDescription");
		
		WebElement country = driver.findElement(By.xpath("//select[@name='generalCountryGeoId']"));
		Select coun = new Select(country);
		coun.selectByVisibleText("United States");
		
		
		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select province = new Select(state);
		province.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@value = 'Create Contact']")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		
		System.out.println("Edit action started");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("This edited important notes.");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		
		
		
	}

}
