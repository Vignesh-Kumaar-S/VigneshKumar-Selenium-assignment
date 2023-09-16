package week4.Assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver(); //initiate the driver
		driver.get("https://www.amazon.in/");//launch the URL
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		WebElement search = driver.findElement(By.xpath("//input[contains(@placeholder,'Search Amazon.in')]"));
	    search.click();
	    search.sendKeys("oneplus 9 pro");
	    driver.findElement(By.id("nav-search-submit-button")).click();
	    
	    Thread.sleep(3000);
	    WebElement price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	    System.out.println("The price is - " +price.getText());
	    
	    Thread.sleep(3000);
	    WebElement ratings = driver.findElement(By.xpath("(//span[@class='a-icon-alt'])[1]"));
	    System.out.println("The ratings is "+ ratings.getAttribute("textContent"));
	    
	    
	    
	    driver.findElement(By.xpath("(//img[@class = 's-image'])[1]")).click();
	    Set<String> tabs = driver.getWindowHandles();
	    List<String> tab = new ArrayList<>(tabs);
	    driver.switchTo().window(tab.get(1));
	    driver.findElement(By.xpath("//*[contains(@id,'add-to-cart')]")).click();
	    
	    Thread.sleep(3000);
	    WebElement subtotal = driver.findElement(By.xpath("//span[contains(@id,'cart-subtotal')]"));
	    String a = subtotal.getAttribute("textContent");
	    System.out.println("The subtotal is " + a);
	   if(price.equals(a)) {
	    	System.out.println("The price of the product is same");
	    }
	    else {
	    	System.out.println("The price is different, Kindly check it");
	    }
	    
	   driver.quit();
	    
	   
	}

}
