package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("yuvanesh");
		driver.findElement(By.id("lastNameField")).sendKeys("yuvi");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("yuvnas");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("yuvi");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ComputerApplication");

		driver.findElement(By.name("description")).sendKeys("Emerging Software Analyst");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("yuvaneshamudha@gmail.com");
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("createContactForm_generalStateProvinceGeoId")).sendKeys("washington");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
