package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContract {

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
		driver.close();
		
		
		
	}

}
