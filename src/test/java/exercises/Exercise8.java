package exercises;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Exercise8 {
	@Test
	public void testExercise8() {
		
		//Create new web driver
		WebDriver driver = new ChromeDriver();
		//navigate to URL
		driver.get("https://the-internet.herokuapp.com/");
		//select link by linkText
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		//print first element of first row of table1
		System.out.println(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]")).getText());
		//print first row of table1
		System.out.println(driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]")).getText());
		//save table as web element
		WebElement table1 = driver.findElement(By.id("table1"));
		//store rows in a list
		List<WebElement> rowList = table1.findElements(By.tagName("tr"));
		//iterate through rowList and print rowNum when it contains "jdoe@hotmail.com"
		int rowNum=1;
		for(WebElement row:rowList) {
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(WebElement cell:cells) {
				if(cell.getText().equals("jdoe@hotmail.com")) {
					System.out.println(rowNum);
					//click the delete button on current row
					row.findElement(By.linkText("delete")).click();
					//verify that delete button was clicked
					Assert.assertTrue(driver.getCurrentUrl().contains("delete"));
				}
			}
			//increment rowNum
			rowNum++;
		}
		//quit driver
		driver.quit();
	}

}
