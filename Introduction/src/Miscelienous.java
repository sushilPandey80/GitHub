import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscelienous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");
		//*[@id="tablist1-tab1"]/following-sibling::li[3]
		//*[@id="tablist1-tab1"]
		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.qaclickacademy.com/interview.php");
		

	}

}
