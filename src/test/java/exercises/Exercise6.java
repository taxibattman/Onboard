package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Exercise6 {
	@Test
	public void testExercise6() {
		//Create a new WebDriver
		WebDriver driver = new ChromeDriver();
		//
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dropdown")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		
		dropdown.selectByIndex(1);
		
		dropdown.selectByValue("2");
		
		dropdown.selectByVisibleText("Option 1");
		
		driver.quit();
	}

}
