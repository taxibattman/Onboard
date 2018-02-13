package exercises;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.Test;

public class Exercise8 {
	@Test
	public void testExercise8() {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		List<WebElement> tableList = driver.findElements(By.tagName("table"));
		System.out.println(tableList);
		
		driver.quit();
	}

}
