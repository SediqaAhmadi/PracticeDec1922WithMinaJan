package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeNewLocators {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://tek-school.com/retail/");
		WebElement text = driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
		System.out.println(text.getText());
		Assert.assertEquals(text.getText(), "TEST ENVIRONMENT");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.partialLinkText("Register")).click(); // our acctula locator is register
		// Account since we use parrtail linktext we use account is partally.
		WebElement registerForm = driver.findElement(By.partialLinkText("Account"));
		registerForm.click();
		hardWait();

		Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Register Account']")).getText(),
				"Register Account");
		System.out.println(registerForm.getText());

		driver.findElement(By.id("input-firstname")).sendKeys("Mahmood");
		hardWait();
		driver.findElement(By.id("input-lastname")).sendKeys("Ahmad");
		hardWait();

		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Ahmad766@gmail.com");
		hardWait();

		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("5558889999");
		hardWait();

		driver.findElement(By.id("input-password")).sendKeys("1234567");
		driver.findElement(By.id("input-confirm")).sendKeys("1234567");
		hardWait();

		WebElement newsLetter = driver.findElement(By.xpath("(//input[@name='newsletter'])[2]"));
		System.out.println(newsLetter.isSelected());
		Assert.assertEquals(newsLetter.isSelected(), true);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		hardWait();

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement congarts = driver.findElement(
				By.xpath("//P[text()='Congratulations! Your new account has been successfully created!']"));
		Assert.assertEquals(congarts.getText(), "Congratulations! Your new account has been successfully created!");
		hardWait();

		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		hardWait();

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