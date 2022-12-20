package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile2 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/FileDownload.html");

//		// No 1 text file
//		driver.findElement(By.id("textbox")).sendKeys("Test");
//		hardWait();
//		WebElement txt = driver.findElement(By.id("createTxt"));
//		JavascriptExecutor jsE = (JavascriptExecutor) driver;
//		jsE.executeScript("arguments[0].click;", txt);
//
//		hardWait();
//		driver.findElement(By.id("link-to-download")).click();

		// No 2 PDF file
		driver.findElement(By.id("pdfbox")).sendKeys("Test1");
		hardWait();
		driver.findElement(By.id("createPdf")).click();
		hardWait();
		driver.findElement(By.id("pdf-link-to-download")).click();

	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}