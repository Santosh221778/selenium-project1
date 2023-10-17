package OrangeHRM;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario5 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));
							
	}
	public static WebElement Recruitment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span"));					
}
	public static WebElement add(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
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
	public static WebElement Vacancydropdown(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]"));	
	}
	public static void Vacancylist(WebDriver driver) {
		List<WebElement> Vacancy = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i < Vacancy.size(); i++) {
			if(Vacancy.get(i).equals("Associate IT Manager")) {
				Vacancy.get(i).click();
			}
		}
	}
	public static WebElement Email(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/input"));	
	}
	public static WebElement phoneno(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/input"));	
	}
	public static WebElement uploadfile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div/div/div/div[2]/div/div[1]"));	
	}
	public static void selectuploadfile(WebDriver driver) throws Throwable { 
		Robot rb = new Robot();
		rb.delay(3000);
		StringSelection resume = new StringSelection("C:\\Users\\swarn\\NewEclipseWS\\MavenDemo\\images\\Resume1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resume, null);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);	
	}
	public static WebElement DOA(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/div/div[2]/div/div[2]/div/div/input"));	
	}
	public static WebElement Notes(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[6]/div/div/div/div[2]/textarea"));	
	}
	public static WebElement consentlink(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[7]/div/div/div/div[2]/div/label/span/i"));	
	}
	public static WebElement Save2(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type='submit']"));	
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
