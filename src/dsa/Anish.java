package dsa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Anish {

	@FindBy(xpath="//span[text()='GEARS'][1]")
	private WebElement gears;
	@FindBy(xpath="//a[text()=' SkillRary Demo APP'][1]")
	private WebElement demoapp;
	
	public Anish(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	public void hyt() {
		gears.click();
	}
	public void sbd() {
		demoapp.click();
	}
	


	}


