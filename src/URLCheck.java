import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class URLCheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vicky\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String givenURL = "https://www.rahulshettyacademy.com/AutomationPractice/";
		
		driver.get(givenURL);
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//String Navigated = driver.getCurrentUrl();    gets URL here ..i have made it
		Assert.assertEquals("Hello",driver.getTitle());
		
		
		
		

	}

}
