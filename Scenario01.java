package OrangeHRM;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	public class Scenario01 {

		
		public static WebElement username(WebDriver driver) {
			return driver.findElement(By.name("username"));
		}
			
			
		public static WebElement password(WebDriver driver) {
				return driver.findElement(By.name("password"));
		}
		
				
		public static WebElement login(WebDriver driver) {
				return driver.findElement(By.xpath("(//*[@type='submit'])"));
							
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


