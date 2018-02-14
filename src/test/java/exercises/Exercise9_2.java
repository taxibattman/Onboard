package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise9_2 {
	@Test
	public void testExercise9_2() {
		//create new web driver
		WebDriver driver = new ChromeDriver();
		//navigate to URL
		driver.get("https://the-internet.herokuapp.com/");
		//click 'Form authentication' link
		driver.findElement(By.linkText("Form Authentication")).click();
		//enter invalid id and password
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("cbatts");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecret");
		//click 'login' button
		driver.findElement(By.tagName("button")).click();
		//assert that error message displays
		Assert.assertFalse(driver.getCurrentUrl().contains("secure"));
		Assert.assertTrue(driver.findElement(By.cssSelector(".flash.error")).isDisplayed());
		//quit driver
		driver.quit();
		
	}
}
