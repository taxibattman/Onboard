package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise9_1 {
	@Test
	public void testExercise9_1() {
		//create new web driver
		WebDriver driver = new ChromeDriver();
		//navigate to URL
		driver.get("https://the-internet.herokuapp.com/");
		//click 'Form authentication' link
		driver.findElement(By.linkText("Form Authentication")).click();
		//enter valid id and password
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("tomsmith");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("SuperSecretPassword!");
		//click 'login' button
		driver.findElement(By.tagName("button")).click();
		//assert that success message displays
		Assert.assertTrue(driver.getCurrentUrl().contains("secure"));
		Assert.assertTrue(driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
		
		
		//quit driver
		driver.quit();
		
	}
}
