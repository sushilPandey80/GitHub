import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\geckodriver\\geckodriver.exe");
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");
System.setProperty("webdriver.ie.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\IEDriver\\MicrosoftWebDriver.exe");


		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		driver.findElement(By.className("inputtext")).sendKeys("hello");
		driver.findElement(By.id("email")).sendKeys("this is 1st code");
		
		//driver.close();
		driver.quit();
		
	}

}
	