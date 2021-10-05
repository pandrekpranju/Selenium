package SeleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBoxSubmit {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranjali.pandrekar\\eclipse-workspace\\SeleniumFramework\\Drivers\\ChromeDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,40);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]//*[name()='svg']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();

		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Pranjali");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("pandasasu@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Karwar");
		
		WebElement element1 = driver.findElement(By.id("submit"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
		
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
	}

}
