package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDownSelfPractice {

	private static final String TimeUnite = null;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();
		WebElement listOfmonth = driver.findElement(By.id("month"));
		WebElement listOfday = driver.findElement(By.id("day"));
		WebElement listOfyear = driver.findElement(By.id("year"));

		// made the object

//		Select month = new Select(listOfmonth);
//		month.selectByVisibleText("Jul");
//		hardWait();
//
//		Select day = new Select(listOfday);
//		day.selectByVisibleText("15");
//		hardWait();
//
//		Select year = new Select(listOfyear);
//		year.selectByVisibleText("1995");
//		hardWait();

		selectByVisibleText(listOfmonth, "Jul");
		selectByVisibleText(listOfday, "15");
		selectByVisibleText(listOfyear, "1995");

		driver.close();
	}

	public static void selectByVisibleText(WebElement element, String Vlaue) {
		Select select = new Select(element);
		select.selectByVisibleText(Vlaue);

	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
