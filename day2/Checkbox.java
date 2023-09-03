package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		//TC-1
		driver.findElement(By.xpath("//div[contains(@class,'chkbox-box')]")).click();
		
		//TC-2
		driver.findElement(By.xpath("//*[text()='Notification']/following-sibling::div/div/div")).click();
		WebElement element = driver.findElement(By.xpath("//*[@role=\"alert\"]"));
		if(element.isDisplayed())
		{
			System.out.println("The notification popup "+element.getText()+ " is visible");
		}
		Thread.sleep(3000);
		
		//TC-3
		java.util.List<WebElement> languagelist = driver.findElements(By.xpath("//*[contains(@class,'selectmanycheckbox')]/tbody/tr/td"));
		for (WebElement language : languagelist) 
		 {
	           if(language.getText().equals("Python")||language.getText().equals("Java"))
				 {
		            language.click();
				 }

		 }
		Thread.sleep(3000);
		
		//TC-4
		WebElement tristate = driver.findElement(By.xpath("//*[contains(@id,'TriState')]/div/input"));
		String statevalue = tristate.getAttribute("value");
		System.out.println("The current state value is "+ statevalue);
		driver.findElement(By.xpath("//*[contains(@id,'TriState')]/div[2]")).click();
		
		//TC-5
		WebElement togleswitch = driver.findElement(By.xpath("//div[contains(@class,'toggleswitch')]/div/input"));
		System.out.println("The current togle state is " + togleswitch.getAttribute("aria-checked"));
		driver.findElement(By.xpath("//div[contains(@class,'toggleswitch')]/div[2]")).click();
		System.out.println("After turning it on, the current value is " + togleswitch.getAttribute("aria-checked"));
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'selectbooleancheckbox')][3]")).isEnabled());
	}

}
