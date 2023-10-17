package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v102.css.model.CSSStyleSheetHeader;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMPAGE {
	public static void main(String[] args) throws Throwable { 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	     Scenario01.username(driver).sendKeys("Admin");
		 Scenario01.password(driver).sendKeys("admin123");
		 Scenario01.login(driver).click();
		 Scenario01.logoutdropdown(driver).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario01.logout(driver).click();
		 
		 
		 Scenario2.username(driver).sendKeys("Admin");
		 Scenario2.password(driver).sendKeys("admin123");
		 Scenario2.login(driver).click();
		 Scenario2.PIM(driver).click();
		 Scenario2.PIMadd(driver).click();
		 Scenario2.Firstname(driver).sendKeys("Santosh");
		 Scenario2.middlename(driver).sendKeys(".");
		 Scenario2.Lastname(driver).sendKeys("Sri");
		 Scenario2.Empid(driver).sendKeys("12345");
		 Scenario2.logincredential(driver).click();
		 Scenario2.username1(driver).sendKeys("santosh@1998");
		 Scenario2.password1(driver).sendKeys("santosh@1998");
		 Scenario2.confirmpw(driver).sendKeys("santosh@1997");
		 Scenario2.Save(driver).click();
		 Scenario2.logoutdropdown(driver).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario2.logout(driver).click(); 
		
		
		 Scenario3.username(driver).sendKeys("Admin");
		 Scenario3.password(driver).sendKeys("admin123");
		 Scenario3.login(driver).click();
		 Scenario3.Myinfo(driver).click();
		 Scenario3.Firstname(driver).sendKeys("santosh");
		 Scenario3.middlename(driver).sendKeys(".");
		 Scenario3.Lastname(driver).sendKeys("Sri");
		 Scenario3.nickname(driver).sendKeys("Sri.d");
		 Scenario3.Otherid(driver).sendKeys("santosh@1234");
		 Scenario3.Licenceexpdate(driver).sendKeys("2022-12-25");
		 Scenario3.Maritalstatus(driver).click();
		 Scenario3.Gender(driver).click();
		 Scenario3.militaryservice(driver).sendKeys("no");
		 Scenario3.Save3(driver).click();
		 Scenario3.Bloodtype(driver).click();
		 Scenario3.save4(driver).click();
		 Scenario3.attachment(driver).click();
		 Scenario3.Selectattachment(driver).click();
		 Scenario3.comment(driver).sendKeys("personal info done");
		 Scenario3.save5(driver).click();
		 Scenario3.Street1(driver).sendKeys("yelahanka");
		 Scenario3.Street2(driver).sendKeys("amruthahalli");
		 Scenario3.city(driver).sendKeys("bangalore");
		 Scenario3.state(driver).sendKeys("karnataka");
		 Scenario3.zipcode(driver).sendKeys("560092");
		 Scenario3.country(driver).click();
		 Scenario3.home(driver).sendKeys("9087654321");
		 Scenario3.Mobile(driver).sendKeys("9087654321");
		 Scenario3.Work(driver).sendKeys("santosh@gmail.com");
		 Scenario3.workemail(driver).sendKeys("santosh@gmail.com");
		 Scenario3.otheremail(driver).sendKeys("santosh@gmail.com");
		 Scenario3.save6(driver).click();
		 Scenario3.attachment2(driver).click();
		 Scenario3.addfile(driver).click();
		 Scenario3.otheremail(driver).sendKeys("contact details doen");
		 Scenario3.save7(driver).click();
		 Scenario3.logoutdropdown(driver).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario3.logout(driver).click(); 
		 
		 
		 Scenario4.username(driver).sendKeys("Admin");
		 Scenario4.password(driver).sendKeys("admin123");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario4.forgotpw(driver).click();
		 Scenario4.username2(driver).sendKeys("Admin");
		 Scenario4.submit(driver).click();
		 Scenario4.resetsucceful(driver).isDisplayed();
		 
		 
		 Scenario5.username(driver).sendKeys("Admin");
		 Scenario5.password(driver).sendKeys("admin123");
		 Scenario5.login(driver).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario5.Recruitment(driver).click();
		 Scenario5.add(driver).click();
		 Scenario5.Firstname(driver).sendKeys("santosh");
	     Scenario5.middlename(driver).sendKeys(".");
		 Scenario5.Lastname(driver).sendKeys("Sri");
		 Scenario5.Vacancydropdown(driver).click();
		 Scenario5.Email(driver).sendKeys("santosh@gmail.com");
		 Scenario5.phoneno(driver).sendKeys("9876543210");
		 Scenario5.uploadfile(driver).click();
		 Scenario5.DOA(driver).sendKeys("2022-12-26");
		 Scenario5.Notes(driver).sendKeys("excelr automation course");
		 Scenario5.consentlink(driver).click();
		 Scenario5.Save2(driver).click();
		 Scenario5.logoutdropdown(driver).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario5.logout(driver).click(); 
		 
		 
		 Scenario6.username(driver).sendKeys("Admin");
		 Scenario6.password(driver).sendKeys("admin123");
		 Scenario6.login(driver).click();
		 Scenario6.Recruitment1(driver).click();
		 Scenario6.VacancyMenu(driver).click();
		 Scenario6.Addvacancy(driver).click();
		 Scenario6.name(driver).sendKeys("santosh");
		 Scenario6.Jobtitle(driver).click();
		 Scenario6.Description(driver).sendKeys("completed automation course");
		 Scenario6.Hiringmanager(driver).sendKeys("Nashra  Islam");
		 Scenario6.positions(driver).sendKeys("10");
		 Scenario6.Save1(driver).click();
		 Scenario6.logoutdropdown(driver).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 Scenario6.logout(driver).click(); 
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
}
