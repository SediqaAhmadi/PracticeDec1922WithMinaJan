package GroupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutibleYerasINDropDownIntPractice {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.linkText("Create new account")).click();
		
		List<WebElement>year=driver.findElements(By.xpath("select[@name='birthday_year']//option")); 
		
		//System.out.println(year.size());
//		for (int i = 0; i < year.size(); i++) {
//			if (year.get(i).getText().equals(year)) {
		
		int[]number = {2010,2011,2013,2015};
		for (int i = 0; i < number.length; i++) {
			if(i==2012||i==2013) {
				System.out.println("these are the year you want");
			}else { 
				System.out.println("those are not the year you want");
				
			
		}
				
			}
		}
			
	
		
		{
			

	}

}
