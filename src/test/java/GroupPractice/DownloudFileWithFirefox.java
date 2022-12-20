package GroupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloudFileWithFirefox {

	public static void main(String[] args) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain,application/pdf");
		profile.setPreference("browser.download.manager.ShowWhenStarting", false);
		profile.setPreference("pdfjs.disabled", true);  //this line is only for pdf
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		
	
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		
		
		
		// textfile

				driver.findElement(By.id("textbox")).sendKeys("Tests");
				hardWait();

				driver.findElement(By.id("createTxt")).click();
				hardWait();
				driver.findElement(By.id("link-to-download")).click();

				// PDF files

				driver.findElement(By.id("pdfbox")).sendKeys("pdfbox");
				hardWait();
				driver.findElement(By.id("createPdf")).click();
				hardWait();
				
				driver.findElement(By.id("pdf-link-to-download")).sendKeys("Test1");
		
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
