package SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjali.pandrekar\\eclipse-workspace\\ToolsQAWebseite\\Drivers\\ChromeDriver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		WebDriverWait wait= new WebDriverWait(driver, 60);
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		js.executeScript("arguments[0].scrollIntoView();", element);

		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//div[contains(@class,'element-list collapse show')]//li[@id='item-1']")).click();
		driver.findElement(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']")).click();
	}

}
