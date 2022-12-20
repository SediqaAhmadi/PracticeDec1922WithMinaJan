package GroupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();

		List<WebElement> listOfMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(listOfMonth.size());
		
		for (int i = 0; i < listOfMonth.size(); i++) {
			if (listOfMonth.get(i).getText().equals("Mar")) {
				listOfMonth.get(i).click();
				System.out.println(listOfMonth.get(i).getText());
				break;

			}
			
		}
		driver.close();
	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}