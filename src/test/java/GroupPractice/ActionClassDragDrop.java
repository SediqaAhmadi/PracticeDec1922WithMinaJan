package GroupPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassDragDrop {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement drag = driver.findElement(By.id("draggable"));
		hardWait();
		WebElement drop = driver.findElement(By.id("droppable"));
		hardWait();

		
	Actions actions = new Actions(driver);
//		actions.dragAndDrop(drag,drop).perform();
//		

		//2nd way of doing it
		
		actions.clickAndHold(drag).moveToElement(drop).build().perform();
	
	}
	

public static void hardWait() {

	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {

		e.printStackTrace();
	}
}
}

