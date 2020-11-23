import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Rahulshetty {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[contains(@value,'radio1')]")).click();
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("India");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys(Keys.ENTER);
		Select s =new Select(driver.findElement(By.cssSelector("select#dropdown-class-example")));
		s.selectByValue("option1");
		driver.findElement(By.cssSelector("input#name")).sendKeys("vivek");
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.cssSelector("input#displayed-text")).isDisplayed());
		driver.findElement(By.cssSelector("input#hide-textbox")).click();
		System.out.println(driver.findElement(By.cssSelector("input#displayed-text")).isDisplayed());
		Actions a = new Actions(driver);
		WebElement target = driver.findElement(By.cssSelector("button#mousehover"));
		a.moveToElement(target).build().perform();
		driver.findElement(By.xpath("//a[@href='#top']")).click();
		driver.findElement(By.cssSelector("a#opentab")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println("navigated to new tab");
		driver.switchTo().window(parentid);
		System.out.println("navigated to parent");
		driver.switchTo().frame("courses-iframe");
		driver.findElement(By.xpath("//a[contains(@class,'btn-theme')]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("button#openwindow")).click();
		System.out.println("Execution done");
	}

}
