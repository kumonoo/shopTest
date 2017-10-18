package pl.b2b.shopTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilAutomationStatic {

	public static void klikniecieLogowanie(WebDriver driver) {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a"));
		element.click();
	}

	public static void logowanie(WebDriver driver) {
		klikniecieLogowanie(driver);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		email.sendKeys("b2bnetworkwarszawa@gmail.com");

		WebElement haslo = driver.findElement(By.xpath("//*[@id=\"passwd\"]"));
		haslo.sendKeys("n3tw0rk2017");
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span/i"));
		submit.click();
	}

	public static void przekierowanieNaWomen(WebDriver driver) {
		WebElement women = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		women.click();
	}
	
	public static void przekierowanieNaTshirts(WebDriver driver) {
		WebElement tshirts = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a"));
		tshirts.click();
	}
	
	public static void przekierowanieNaDresses(WebDriver driver) {
		WebElement dresses = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		dresses.click();
	}


	public static List<WebElement> pobranieElementowKategorii(WebDriver driver) {
		WebElement kategorie = driver.findElement(By.xpath("//*[@id=\"ul_layered_category_0\"]"));
		List<WebElement> wybor = kategorie.findElements(By.tagName("li"));
		return wybor;
	}
	
	public static List<WebElement> pobranieElementowKoloru(WebDriver driver) {
		WebElement kolory = driver.findElement(By.xpath("//*[@id=\"layered_form\"]/div/div[2]"));
		List<WebElement> wybor = kolory.findElements(By.tagName("li"));
		return wybor;
	}
	
	public static List<WebElement> pobranieElementowKoloruDresses(WebDriver driver) {
		WebElement kolory = driver.findElement(By.xpath("//*[@id=\"layered_form\"]/div/div[2]"));
		List<WebElement> wybor = kolory.findElements(By.tagName("li"));
		return wybor;
	}

	public static List<WebElement> pobranieElementowWlasciwosci(WebDriver driver) {
		WebElement Wlasciwosci = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_feature_7\"]"));
		List<WebElement> wybor = Wlasciwosci.findElements(By.tagName("li"));
		return wybor;
	}

	public static List<WebElement> pobranieElementowRozmiaru(WebDriver driver){
		WebElement Size = driver.findElement(By.xpath("//*[@id=\"ul_layered_id_attribute_group_1\"]"));
		List<WebElement> wybor = Size.findElements(By.tagName("li"));
		return wybor;
	}
	public static boolean czyWsrodElementowJestElementRozmiaruOWlasciwosciL(List<WebElement> wybor) {
		boolean czyJestL = false;
		for(WebElement element :wybor) {
			if(element.getText().contains("L")) {
				czyJestL = true;
				
			}
		}return czyJestL;
	}
}
