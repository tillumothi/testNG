package org.apache.maven.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class xyz {
	WebDriver driver;

	@BeforeTest
	public void init() {
		driver = new FirefoxDriver();
	}

	@Test
	public void f1() {
		// driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.uk/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='lst-ib']")).sendKeys("vodafone");
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='_fZl']")));

		System.out.println("testing git jjjj");
	}

	@Test
	public void function() {
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();

		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("ALGERIA");
	}

	@AfterTest
	public void f2() {

		driver.close();
		System.out.println("closing browser");
	}

}
