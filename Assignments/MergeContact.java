package week4.Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("http://leaftaps.com/opentaps/control/login");//launch the URL
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager"); //Pass the values in username by finding the element
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Selecting the from and to contact
		WebElement fromcontact = driver.findElement(By.id("ComboBox_partyIdFrom"));
		fromcontact.click();
		fromcontact.sendKeys("a");
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.xpath("//div[contains(text(),'Aarav Danny (10858)')]"));
		System.out.println(firstname.getText());
		if(firstname.isDisplayed())
		{
			firstname.click();
			System.out.println("First Name " + firstname.getText() + " is found");
		}
		else
		{
			System.out.println("No first name " +firstname.getText()+ " is found");
		}
		WebElement TOcontact = driver.findElement(By.id("ComboBox_partyIdTo"));
		TOcontact.click();
		TOcontact.sendKeys("a");
		Thread.sleep(3000);
		WebElement secondname = driver.findElement(By.xpath("//div[contains(text(),'Aarav Danny (10895)')]"));
		if(secondname.isDisplayed())
		{
			secondname.click();
			System.out.println("The second name " +  secondname.getText() +" is found");
		}
		else
		{
			System.out.println("no second name " +firstname.getText()+ " is found");
		}
		Thread.sleep(2000);
		driver.findElement(By.linkText("Merge")).click();
		
		//managing the alert
		Alert confirm = driver.switchTo().alert();
		System.out.println("The alert is - " +confirm.getText());
		confirm.accept();
		
		//confirming the title page
		Thread.sleep(3000);
		String currentpage = driver.getTitle();
		if(currentpage.contains("View Contact | opentaps CRM"))
		{
			System.out.println("The user landed in correct page");
		}
		else {
			System.out.println("The user landed in wrong page");
		}
		
		
	}

}
