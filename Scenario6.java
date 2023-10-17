package OrangeHRM;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.Select;
public class Scenario6 {

	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.name("username"));
	}
		
		
	public static WebElement password(WebDriver driver) {
			return driver.findElement(By.name("password"));
	}
	
			
	public static WebElement login(WebDriver driver) {
			return driver.findElement(By.xpath("(//*[@type='submit'])"));					
	}
	
	public static WebElement Recruitment1(WebDriver driver) {
		return driver.findElement(By.xpath("//a[@href='/web/index.php/recruitment/viewRecruitmentModule']"));					
}
	public static WebElement VacancyMenu(WebDriver driver) {
		return driver.findElement(By.xpath("(//a[text()='Vacancies'])"));		
}
	public static WebElement Addvacancy(WebDriver driver) {
		return driver.findElement(By.xpath("(//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button)"));					
}
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.xpath("(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[1]/div/div[2]/input)"));					
}
	public static WebElement Jobtitle(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[2]"));
	}
	public static void Jobtitleselect(WebDriver driver) {
		List<WebElement> jobtitle= driver.findElements(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div/div[2]/div/div/div[2]/div[2]/div"));
		for (int i = 0; i<jobtitle.size(); i++) {
			if (jobtitle.get(i).equals("Chief Executive Officer")) {
				jobtitle.get(i).click();
			}
		}
	
	}
	public static WebElement Description(WebDriver driver) {
		return driver.findElement(By.xpath("(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div[2]/textarea)"));		
}
	public static WebElement Hiringmanager(WebDriver driver) {
		return driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])"));		
}
	public static WebElement positions(WebDriver driver) {
		return driver.findElement(By.xpath("(/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div[2]/div/div/div/div[2]/input)"));		
}
	public static WebElement Save1(WebDriver driver) {
		return driver.findElement(By.xpath("(//button[@type='submit'])"));		
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
