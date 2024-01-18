package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Testsetup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver() ;
			driver.get("https:www.google.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			driver.quit(); 
		
	
	}
}
