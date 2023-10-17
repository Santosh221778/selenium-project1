package OrangeHRM;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));					
	}
	public static WebElement Myinfo(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']"));					
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
	public static WebElement nickname(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));
	}
	public static WebElement Otherid(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
	}
	
	
	public static WebElement Licenceexpdate(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
	}
	
	public static WebElement Naltionallist(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]"));
	}
	public static void Nationalistselect(WebDriver driver) {
		List<WebElement> nationality= driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i < nationality.size(); i++) {
			if (nationality.get(i).equals("Indian")) {
				nationality.get(i).click();
			}
			
		}
	}
	public static WebElement Maritalstatus(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]"));	
	}
	public static void Maritalselect(WebDriver driver) {
		List<WebElement> MaritalStatus = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i<MaritalStatus.size(); i++) {
			if (MaritalStatus.get(i).equals("Single")) {
				MaritalStatus.get(i).click();
			}
		}
		
	}
	public static WebElement Gender(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));	
	}
	public static WebElement militaryservice(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input"));	
	}
	public static WebElement Save3(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"));	
	}
	public static WebElement Bloodtype(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[2]"));	
	}
	public static void bloodtypeselect(WebDriver driver) {
		List<WebElement> BloodType = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div/div[2]/div[2]/divv"));
		for (int i = 0; i<BloodType.size(); i++) {
			if (BloodType.get(i).equals("A+")) {
				BloodType.get(i).click();
			}
		}
	}
	public static WebElement save4(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));	
	}
	public static WebElement attachment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"));	
	}
	public static WebElement Selectattachment(WebDriver driver)  {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));	
	}
	
	public static void  attchmentlist(WebDriver driver) throws Throwable{
	Robot rb = new Robot();
	StringSelection ss = new StringSelection("C:\\Users\\swarn\\NewEclipseWS\\MavenDemo\\images\\Resume1.docx");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);
	}
	public static WebElement comment(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea"));	
	}
	public static WebElement save5(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]"));	
	}
	
	//  CONTACT DETAILS
	public static void  contactdetails(WebDriver driver) {
		WebElement ContactDetails = driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[2]/a"));
		Actions act = new Actions(driver);
		act.scrollToElement(ContactDetails).click().build().perform();
	}
	public static WebElement Street1(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));	
	}
	public static WebElement Street2(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"));	
	}
	public static WebElement city(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input"));	
	}
	public static WebElement state(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input"));	
	}
	public static WebElement zipcode(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[5]/div/div[2]/input"));	
	}
	public static WebElement country(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]"));	
	}
	public static void selectcountry(WebDriver driver) {
		List<WebElement> Country = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i<Country.size(); i++) {
			if (Country.get(i).equals("India")) {
				Country.get(i).click();
			}
		}
	}
	public static WebElement home(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"));	
	}
	public static WebElement Mobile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"));	
	}
	public static WebElement Work(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"));	
	}
	public static WebElement workemail(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[1]/div/div[2]/input"));	
	}
	public static WebElement otheremail(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div/div[2]/div/div[2]/input"));	
	}
	public static WebElement save6(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));	
	}
	public static WebElement attachment2(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div[1]/div/button"));	
	}
	public static WebElement addfile(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));	
	}
	public static void  addfile1(WebDriver driver) throws Throwable{
		Robot rb1 = new Robot();
		rb1.delay(3000);
		StringSelection resume2 = new StringSelection("C:\\\\Users\\\\swarn\\\\NewEclipseWS\\\\MavenDemo\\\\images\\\\Resume1.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(resume2, null);
		rb1.keyPress(KeyEvent.VK_CONTROL);
		rb1.keyPress(KeyEvent.VK_V);
		rb1.keyRelease(KeyEvent.VK_CONTROL);
		rb1.keyRelease(KeyEvent.VK_V);
		rb1.keyPress(KeyEvent.VK_ENTER);
		rb1.keyRelease(KeyEvent.VK_ENTER);	
	}
	public static WebElement comment3(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/div/div/div/div[2]/textarea"));	
	}
	public static WebElement save7(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[3]/button[2]"));	
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
