package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloudPractic3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://demo.automationtesting.in/FileDownload.html");

		// textfile

		driver.findElement(By.id("textbox")).sendKeys("ZuhalJan");

		driver.findElement(By.id("createTxt")).click();

		driver.findElement(By.id("link-to-download")).click();

		// PDF files

		driver.findElement(By.id("pdfbox")).sendKeys("pdfbox");

		driver.findElement(By.id("createPdf")).click();

		driver.findElement(By.id("createPdf")).click();
		
		driver.findElement(By.id("textbox")).sendKeys("ZuhalJan");

		driver.findElement(By.id("createTxt")).click();

		driver.findElement(By.id("link-to-download")).click();

		// PDF files

		driver.findElement(By.id("pdfbox")).sendKeys("pdfbox");

		driver.findElement(By.id("createPdf")).click();

		driver.findElement(By.id("createPdf")).click();
	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
