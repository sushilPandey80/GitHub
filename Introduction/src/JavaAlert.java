import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


				//WebDriver driver= new FirefoxDriver();

				WebDriver driver= new ChromeDriver();
				//WebDriver driver= new InternetExplorerDriver();
				driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
				Thread.sleep(6000L);
				
				
				driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
				System.out.println(	driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();
				
				
	}

}
