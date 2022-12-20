package GroupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();

		List<WebElement> listOfDay = driver.findElements(By.cssSelector("select#day>option"));
		System.out.println(listOfDay.size());
		for (int j = 0; j < listOfDay.size(); j++) {
			if (listOfDay.get(j).getText().equals("15")) {
				listOfDay.get(j).click();
				System.out.println(listOfDay.get(j).getText());

				break;

			}

		}
	}
}
