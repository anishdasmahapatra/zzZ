package dsa;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class tre extends Web_Drivers {
	Web_Drivers d=new Web_Drivers();
	WebDriver driver;
	@Test
	public void tc1() throws InterruptedException{
	
	driver=new ChromeDriver();
	driver.get("https://www.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Anish g=new Anish(driver);
		g.hyt();
		g.sbd();
		

}
}
