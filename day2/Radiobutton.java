package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		//TC-1 - Your most favorite browser
		java.util.List<WebElement> favbrow = driver.findElements(By.xpath("//*[text()='Your most favorite browser']/following-sibling::div/div/table/tbody/tr/td"));
		for (WebElement browser : favbrow) 
		 {
	           if(browser.getText().equals("Firefox"))
				 {
		            browser.click();
				 }

		 }
		
		//TC-2 - Check whether the browser is unselectable.
		
		java.util.List<WebElement> selectbrowser = driver.findElements(By.xpath("//*[text()='UnSelectable']/following-sibling::div/div/div/div/div"));
		for (WebElement unselected : selectbrowser) 
		 {
			String City = unselected.getText();
	           if(City.equals("Chennai"))
				 {
	        	  WebElement Button = driver.findElement(By.xpath("//*[contains(@id,'city2')]/div/div/div"));
	        	  Button.click();
	        	  Thread.sleep(3000);
	        	  System.out.println("Trying to unselect the City" + City);
	        	  Button.click();
	        	  Thread.sleep(3000);
	        	  System.out.println(Button.isSelected());        		  
	        	  }
	        	  
				 }
	           
	           
		//TC-3
		WebElement Chrome = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td/div/div/input"));
		if(Chrome.isSelected())
		{
			System.out.println("The Chrome browser is selected by default");
		}
		WebElement Firefox = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td[2]/div/div/input"));
		if(Firefox.isSelected())
		{
			System.out.println("The Chrome browser is selected by default");
		}
		WebElement Safari = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td[3]/div/div/input"));
		if(Safari.isSelected())
		{
			System.out.println("The Safari browser is selected by default");
		}
		WebElement Edge = driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody/tr/td[4]/div/div/input"));
		if(Edge.isSelected())
		{
			System.out.println("The Edge browser is selected by default");
		}
		
		//TC-4
		WebElement age1 = driver.findElement(By.xpath("//div[contains(@id,'age')]/div/div/div/div/input"));
		WebElement age2 = driver.findElement(By.xpath("//div[contains(@id,'age')]/div/div[2]/div/div/input"));
		WebElement age3 = driver.findElement(By.xpath("//div[contains(@id,'age')]/div/div[3]/div/div/input"));
		if(age1.isSelected())
		{
			System.out.println("The " +age1.getAttribute("value")+ "is selected by default, so no need to select age group again.");
		}
		else if(age2.isSelected())
		{
			System.out.println("The " +age2.getAttribute("value")+ " is selected by default, so no need to select age group again.");
		}
		else if(age3.isSelected())
		{
			System.out.println("The " +age3.getAttribute("value")+ "is selected by default, so no need to select age group again.");	
		}
		else
		{
			age3.click();
			System.out.println("No age is selected, so selecting an age group");
			System.out.println("The " +age3.getAttribute("value")+ "is selected");
		}
	 }
}


