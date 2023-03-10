package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClickAndRightClickAlert {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
	
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']" ));
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		Thread.sleep(2000);
		actions.doubleClick(doubleClick).perform();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert(); 
		Thread.sleep(2000);
		alert.accept();
		//alert.dismiss();

		
		driver.close();
		driver.quit();
	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

	}
	}}


