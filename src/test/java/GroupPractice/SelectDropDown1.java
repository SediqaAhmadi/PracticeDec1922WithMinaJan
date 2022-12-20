package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();

		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));

//		Select selMonth = new Select (month);
//		selMonth.selectByValue("3");
//		hardWait();
//		Select selDay = new Select (day);
//		selDay.selectByVisibleText("5");
//		hardWait();
//		Select selYear = new Select (year);
//		selYear.selectByIndex(28);
//		hardWait();
//		
		// reuseable codes
		selectByVisibleText(day, "5");
		hardWait();
		selectByVisibleText(month, "Jan");
		selectByVisibleText(year, "1990");

		driver.close();
		driver.quit();
	}

	/// we use these for 100s of drop down to call with the following code 
	public static void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);

	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
