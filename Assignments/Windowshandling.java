package week4.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("https://leafground.com/window.xhtml");//launch the URL
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		System.out.println("Test cases1 - Click and Confirm new Window Opens started");
		driver.findElement(By.xpath("//*[text()='Click and Confirm new Window Opens']/following::button")).click();
		Set<String> titles =driver.getWindowHandles();
		List<String> titles2 = new ArrayList<>(titles);
		for (String url : titles2) {
			System.out.println(url);
			
		}
		System.out.println(driver.getTitle());
		driver.switchTo().window(titles2.get(1));
		String t = driver.getTitle();
		if(t.contains("Dashboard")) {
			System.out.println("Windows got switched successfully");
			System.out.println(t);
		}
		else {
			System.out.println("Windows not switched");
		}
		driver.close();
		driver.switchTo().window(titles2.get(0));
	/*---------------------------------------------------------------------------------------------------------------------------------*/
		Thread.sleep(3000);
		System.out.println("testcase 2 - Find the number of opened tabs started");
		driver.findElement(By.xpath("//*[text()='Find the number of opened tabs']/following::button")).click();
		Set<String> t2title = driver.getWindowHandles();
		System.out.println("The number of windows opened is " +t2title.size());
		List<String> closetabs1 = new ArrayList<>(t2title);
		for(int i = 1;i<=closetabs1.size()-1;i++)
			{
				driver.switchTo().window(closetabs1.get(i));
				driver.getTitle();
				driver.close();
		}
		driver.switchTo().window(closetabs1.get(0));
		
		
		
		/*---------------------------------------------------------------------------------------------------------------------------------*/
		Thread.sleep(2000);
		System.out.println("testcase 3 - close all tabs except primary");
		driver.findElement(By.xpath("//*[text()='Close all windows except Primary']/following::button")).click();
		Set<String> t3title = driver.getWindowHandles();
		List<String> closetabs = new ArrayList<>(t3title);
		for(int i = 1;i<=closetabs.size()-1;i++)
			{
				driver.switchTo().window(closetabs.get(i));
				driver.getTitle();
				driver.close();
		}
		driver.switchTo().window(closetabs.get(0));
		String pname = driver.getTitle();
		Set<String> remainingwindow = driver.getWindowHandles();
		System.out.println("The remaining window is " +remainingwindow.size() + "The title of the window is " + pname );
		if(pname.equals("Window")) {
			System.out.println("The primary window is open");
		}
		else
		{
			System.out.println("Non primary window is open kindly check it");
		}
		driver.switchTo().window(closetabs.get(0));
		
		/*---------------------------------------------------------------------------------------------------------------------------------*/
		Thread.sleep(2000);
		System.out.println("The testcase 4 - Wait for 2 new tabs to open started");
		driver.findElement(By.xpath("//*[text()='Wait for 2 new tabs to open']/following::button")).click();
		Thread.sleep(3000);
		Set<String> totalwindow = driver.getWindowHandles();
		List<String> Twindow = new ArrayList<>(totalwindow);
		for (String window : Twindow) {
			System.out.println("The opened windows are "+window);
		}
		if(totalwindow.size()==3)
		{
			System.out.println("All windows are opened");
		}
		else
		{
			System.out.println("Only " +totalwindow.size()+ " Is opened, kindly check it");
		}
		

		
		
	}

}
