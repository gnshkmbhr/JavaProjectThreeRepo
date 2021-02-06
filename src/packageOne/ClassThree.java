package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassThree {
	
	@Test
	  public void methodThreeA(){
		
		System.out.println("Inside the methodThreeA of ClassThree");
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.amazon.com");
		 
		 driver.close();	  
		  
	  }

}
