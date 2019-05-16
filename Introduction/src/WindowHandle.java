import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell User\\Desktop\\Udmey\\lib\\chromedriver\\chromedriver.exe");


		//WebDriver driver= new FirefoxDriver();

		WebDriver driver= new ChromeDriver();
		//WebDriver driver= new InternetExplorerDriver();
		driver.get("http://www.naukri.com/");
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent winodw name"+parentWindow);
		Set<String>s1=driver.getWindowHandles();
		// Now we will iterate using Iterator
		Iterator<String> I1= s1.iterator();
		 
		while(I1.hasNext())
		{
		 
		   String child_window=I1.next();
		 
		// Here we will compare if parent window is not equal to child window then we            will close
		 
		if(!parentWindow.equals(child_window))
		{
		driver.switchTo().window(child_window);
		 
		System.out.println(driver.switchTo().window(child_window).getTitle());
		 
		driver.close();
		}
		 
		}
		// once all pop up closed now switch to parent window
		driver.switchTo().window(parentWindow);
		 
		}
}