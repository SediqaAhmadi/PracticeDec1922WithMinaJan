package GroupPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelectMultpleItems {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/selectable/");

		driver.switchTo().frame(0);

		WebElement item1 = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
		WebElement item2 = driver.findElement(By.xpath("//li[contains(text(),'Item 2')]"));
		WebElement item3 = driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
		WebElement item4 = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));

//		 Actions actions = new Actions(driver);
//		actions.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).keyUp(Keys.CONTROL).build()
//				.perform();

		// if we have muliteple actions to perform we use build if not we will only use
		// perform of for single only performe.
		//driver.close();
		
		Actions actions1 = new Actions(driver);
		Action builder= actions1.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).click(item4).keyUp(Keys.CONTROL)
		.build();
		builder.perform();
				

	}

	public static void hardWait() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();

		}
	}
}
