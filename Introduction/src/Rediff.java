import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.cssSelector("input[id='login1']")).sendKeys("username");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("passwod");
		
		driver.findElement(By.cssSelector("input[title='Sign in']")).click();
		
		driver.findElement(By.id("username")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("pass");
		driver.findElement(By.id("Login")).click();
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		

		
	}

}
