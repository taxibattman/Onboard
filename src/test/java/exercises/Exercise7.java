package exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Exercise7 {
	@Test
	public void testExercise7() {
		//Create new web driver
		WebDriver driver = new ChromeDriver();
		//navigate to URL
		driver.get("http://www.w3schools.com/html/html_forms.asp");
		//find radio button by xPath and click
		driver.findElement(By.xpath("//*[@id=\"main\"]/input[4]")).click();
		//quit driver
		driver.quit();
	}
}
