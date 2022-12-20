package GroupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropDown3 {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();
		
		List<WebElement>year=driver.findElements(By.cssSelector("select#year>option")); {
			System.out.println(year.size());
			
			  for(int i =0; i<year.size(); i ++) {

		            if(year.get(i).getText().equals("1990")) {
		                year.get(i).click();
		                System.out.println(year.get(i).getText());
		                break;
		            }
		        }}
	}
	
}


		

	
	