import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		Actions Act=new Actions(driver);
		WebElement move=driver.findElement(By.cssSelector("#nav-link-accountList"));
		Act.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList"))).build().perform();
		Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		Act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		Act.moveToElement(move).contextClick().build().perform();
	}

}
