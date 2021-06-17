package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Driver {
	
	WebDriver driver;
	
	public WebDriver setup(){
        System.setProperty("webdriver.chrome.driver", "/Users/brunaprado/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        return driver;
    }
	
}
