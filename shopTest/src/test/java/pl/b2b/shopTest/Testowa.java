package pl.b2b.shopTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testowa {

	@Test
	public void sprawdzCzyPoKliknieciuLogowaniaNastapiloPrawidlowePrzekierowanie() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
		
		
		
		
	
	}

}
