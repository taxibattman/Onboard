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
		//navigate to URL
		driver.get("https://the-internet.herokuapp.com/");
		//click Dropdown link
		driver.findElement(By.linkText("Dropdown")).click();
		//access drop down menu
		Select dropdown = new Select(driver.findElement(By.id("dropdown")));
		//select values by different criteria
		//by index
		dropdown.selectByIndex(1);
		//by value
		dropdown.selectByValue("2");
		//by visible text
		dropdown.selectByVisibleText("Option 1");
		//quit driver
		driver.quit();
	}

}
