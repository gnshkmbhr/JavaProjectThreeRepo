package packageOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassOne {
	
  
  @Test
  public void methodOneA(){
	  
	  	System.out.println("Inside the methodOneA of ClassOne");
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		  
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("http://www.google.com");
		 
		 driver.close();	  
		  
	  
  }
  
  
}
