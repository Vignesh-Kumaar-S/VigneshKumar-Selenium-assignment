package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver = new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    
    System.out.println("New account creation starts");
    
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vignesh");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar S");
    driver.findElement(By.xpath("//div[@class='placeholder']/following-sibling::input[@name='reg_email__']")).sendKeys("986477774");
    driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("1234@Abc");
    
    WebElement birthday = driver.findElement(By.id("day"));
    Select DOD = new Select(birthday);
    DOD.selectByIndex(1);
    
    WebElement birthmonth = driver.findElement(By.id("month"));
    Select DOM = new Select(birthmonth);
    DOM.selectByVisibleText("Aug");
    
    WebElement birthyear = driver.findElement(By.id("year"));
    Select DOY = new Select(birthyear);
    DOY.selectByVisibleText("1995");
    
    driver.findElement(By.xpath("//label[text() = 'Female']/following-sibling::input")).click();
    
	}

}
