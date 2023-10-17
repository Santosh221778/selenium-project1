package OrangeHRM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario2 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));
									
	}
	
	public static WebElement PIM(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));
	}
	public static WebElement PIMadd(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']"));
	}
	public static void addimage(WebDriver driver) throws Throwable {
		 WebElement  pic= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/div/button"));
		 pic.click();
		Robot rb = new Robot();
		StringSelection ss = new StringSelection("C:\\Users\\swarn\\NewEclipseWS\\MavenDemo\\images\\flower.webp") ;
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}
	
	
	public static WebElement Firstname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='firstName']"));
								
	}
	public static WebElement middlename(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='middleName']"));
		
	}
	public static WebElement Lastname(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='lastName']"));
		
	}
	
	
	public static WebElement Empid(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
	}
	
	public static WebElement logincredential(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"));
	}
	

	public static WebElement username1(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"));
								
	}
	public static WebElement password1(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
	}
	public static WebElement confirmpw(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
	}
	public static WebElement Save(WebDriver driver) {
		return driver.findElement(By.xpath(" //button[@type='submit']"));
	}
	public static WebElement logoutdropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		
}
	public static WebElement logout(WebDriver driver) {
		return driver.findElement(By.xpath("//a[text()='Logout']"));
				
}
	
	public static void quit(WebDriver driver) {
		 driver.quit();
	}
		
		
}
