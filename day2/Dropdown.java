package week2.day2;

import java.awt.List;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//TC-1
		WebElement Automationtool = driver.findElement(By.xpath("//*[text()='Which is your favorite UI Automation tool?']/following-sibling::div/div/select"));
		Select AT = new Select(Automationtool);
		AT.selectByVisibleText("Puppeteer");
		
		//TC-2
		driver.findElement(By.xpath("//label[text()='Select Country']/following-sibling::div")).click();
		WebElement Scountry = driver.findElement(By.xpath("//ul[contains(@id,'country_items')]/li[4]"));
		Scountry.click();
		String country = Scountry.getText();
	    Thread.sleep(3000);
		
	    //TC-3
		    driver.findElement(By.xpath("//label[contains(@id,'city_label')]")).click();
			java.util.List<WebElement> cities = driver.findElements(By.xpath("//ul[contains(@id,'city_items')]/li"));
			for (WebElement CT : cities) 
			 {
		           System.out.println(CT.getText());
		           if(CT.getText().equals("Chennai"))
					 {
			            CT.click();
			            System.out.println("The selected city is - " +CT.getText());
					 }
	
			 }
			
		//TC-4
			
			WebElement Course = driver.findElement(By.xpath("//*[contains(text(),'Choose the Course')]/following-sibling::div/button"));
			Course.click();
			Thread.sleep(3000);
			//Course.sendKeys("J");
			java.util.List<WebElement> courseslist = driver.findElements(By.xpath("//span[contains(@id,'auto-complete_panel')]/ul/li"));
			for (WebElement courses : courseslist) 
			 {
		           if(courses.getText().equals("JMeter"))
					 {
			            courses.click();
					 }
	
			 }
			
		//TC-5
			WebElement L = driver.findElement(By.xpath("//label[contains(@id,'lang_label')]"));
			L.click();
			 java.util.List<WebElement> languagelist = driver.findElements(By.xpath("//ul[contains(@id,'lang_items')]/li"));
			 for (WebElement Language : languagelist) 
			 {
		           if(Language.getText().equals("Tamil"))
					 {
			            Language.click();
					 }
			 }
			 System.out.println("The selected language is - "+L.getText());
			 
		//TC-6
			 if(L.getText().equals("Tamil"))
					 {
				 driver.findElement(By.xpath("//label[contains(@id,'value_label')]/following-sibling::div")).click();
				 java.util.List<WebElement> lan = driver.findElements(By.xpath("//ul[contains(@id,'value_items')]/li"));
				 for (WebElement Finallanguage : lan) 
				 {
			           if(Finallanguage.getText().equals("இரண்டு"))
						 {
				            Finallanguage.click();
						 }
				 }
					 }
			 else
			 {
				 System.out.println("The selected language is - "+L.getText()+ "But for only tamil language is available");
			 }
	}
}




