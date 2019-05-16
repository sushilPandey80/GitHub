import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTEST {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");

		// WebDriver driver= new FirefoxDriver();

		WebDriver driver = new ChromeDriver();
		// WebDriver driver= new InternetExplorerDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(5000L);
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions Act = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));

		Act.dragAndDrop(source, des).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[contains(text(),'Visual feedback')]")).click();

	}

}
