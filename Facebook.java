package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//creating object  for chrome driver
		ChromeDriver driver=new ChromeDriver();
		//launch the browser with the URL
		driver.get("https://www.facebook.com/");
		//maximus the browser...
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

	    driver.findElement(By.name("firstname")).sendKeys("yuvanesgh");

	    driver.findElement(By.name("lastname")).sendKeys("yuvi");
	    driver.findElement(By.name("reg_email__")).sendKeys("yuvanesghamudha@gamail.com", Keys.ENTER);
	    driver.findElement(By.name("reg_email_confirmation__")).sendKeys(" yuvanesghamudha@gamail.com ");
	    driver.findElement(By.id("password_step_input")).sendKeys(" Yuvaneshyuvai123");
	   //day
	    WebElement dropdrownD = driver.findElement(By.xpath("//select[@id='day']"));
	    Select day=new Select(dropdrownD);
	    day.selectByIndex(26);
	    //month
	    WebElement DropdownM = driver.findElement(By.xpath( "//select[@id='month']"));
	    Select month=new Select(DropdownM);
	    month.selectByVisibleText( "Nov");
	    //year
	    WebElement DropdownY = driver.findElement(By.xpath( "//select[@id='year']"));
	    Select year=new Select(DropdownY);
	  year.selectByVisibleText( "2000");
        driver.findElement(By.xpath( "//label[text()='Male']")).click();
	    driver.quit();
	    
	}
	   

}
