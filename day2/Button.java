package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		
		WebElement confirmtitle = driver.findElement(By.xpath("//*[text()='Click and Confirm title.']/following-sibling::button/span"));
		confirmtitle.click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		if(title.equals("Dashboard"))
		{
			System.out.println("Title matches");
		}
		else
		{
		System.out.println("Title dont match");
	    }
		
		driver.navigate().back();
		
		WebElement buttondisable = driver.findElement(By.xpath("//*[text()='Confirm if the button is disabled.']/following-sibling::button"));
		if(buttondisable.isEnabled())
		{
			System.out.println("The button is enabled");
		}
		else
		{
			System.out.println("The button is disabled");
		}
		
		WebElement buttonposition = driver.findElement(By.xpath("//*[text()='Find the position of the Submit button']/following-sibling::button"));
		Point Position = buttonposition.getLocation();
		System.out.println(Position);

}
}
