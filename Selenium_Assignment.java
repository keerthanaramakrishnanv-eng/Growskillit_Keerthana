package assignmentGrowSillIT;

import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Assignment {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"C:\\Users\\karthik.sudarsan\\OneDrive - Raqmiyat L.L.C\\Desktop\\Groe Skill IT\\Assignment\\Automation_Assignment\\upload_bf111789-5d91-4cb2-b35d-64db2147abf2\\assignment\\selenium-mission-game.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='startMission()']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("level1");
		Thread.sleep(2000);
		alert.accept();
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(3000);

		// Switch to new tab
		Set<String> allWindows = driver.getWindowHandles();
		for (String window : allWindows) {
			if (!window.equals(parentWindow)) {
				driver.switchTo().window(window);
				break;
			}
		}

		Thread.sleep(2000);
		driver.findElement(By.id("levelInput")).sendKeys("level2");
		driver.findElement(By.xpath("//button[@onclick='checkLevel2()']")).click();
		Thread.sleep(6000);

		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

		WebElement dragCircle = driver.findElement(By.id("circle"));
		WebElement dropZone = driver.findElement(By.id("dropZone"));

		Actions act = new Actions(driver);
		act.moveToElement(dragCircle).clickAndHold(dragCircle).moveToElement(dropZone).release().build().perform();

		Thread.sleep(2000); // wait for triangle to appear

		// Triangle
		WebElement dragTriangle = driver.findElement(By.id("triangle"));
		WebElement droptoTriangle = driver.findElement(By.id("square"));
		act.moveToElement(dragTriangle).clickAndHold(dragTriangle).moveToElement(droptoTriangle).release().build()
				.perform();
		Thread.sleep(2000);

		WebElement frameworkout = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frameworkout);
		WebElement Country = driver.findElement(By.id("country"));
		Select Countrylist = new Select(Country);
		Countrylist.selectByIndex(1);
		driver.findElement(By.xpath("//*[@onclick='missionComplete()']")).click();
		Thread.sleep(2000);
		
	}

}
