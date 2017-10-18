package pl.b2b.shopTest;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.WinDef.BOOLByReference;

public class shopTest {
	private WebDriver driver;

	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?");
	}

	// @Test
	// public void
	// sprawdzCzyPoKliknieciuLogowaniaNastapiloPrawidlowePrzekierowanie() {
	// Util
	// assertEquals("http://automationpractice.com/index.php?controller=authentication&back=my-account",
	// driver.getCurrentUrl());
	// }

	// @Test
	// public void sprawdzCzyMoznaSieZalogowac() {
	//
	// UtilAutomationStatic.klikniecieLogowanie(driver);

	// }

	// @Test
	// public void sprawdzCzyPoKliknieciuKontaktNastapiloPrawidlowePrzekierowanie()
	// {
	//
	// WebElement element =
	// driver.findElement(By.xpath("//*[@id=\"contact-link\"]/a"));
	// element.click();
	//
	// assertEquals("http://automationpractice.com/index.php?controller=contact",
	// driver.getCurrentUrl());
	//
	//

	// @Test
	// public void sprawdzCzyNastąpiPrawidlowePrzekierowaniePoKliknieciuWomen() {
	//
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.przekierowanieNaWomen(driver);
	//
	// assertEquals("http://automationpractice.com/index.php?id_category=3&controller=category",
	// driver.getCurrentUrl());
	// }
	// @Test
	// public void czyIloscKategoriiPoZalogowaniuSieIPoWybraniuSekcjiWomenWynosi2()
	// {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.przekierowanieNaWomen(driver);
	// List<WebElement> wybor =
	// UtilAutomationStatic.pobranieElementowKategorii(driver);
	//
	// assertEquals(true,wybor.size()==2);

	// }
	// @Test
	// public void czyIloscWlasciwosciPoZalogowaniuSieIWybraniuSekcjiWomanWynosi5()
	// {
	// UtilAutomationStatic.logowanie(driver);
	// UtilAutomationStatic.przekierowanieNaWomen(driver);
	//
	// List<WebElement> wybor =
	// UtilAutomationStatic.pobranieElementowWlasciwosci(driver);
	//
	// assertEquals(true, wybor.size() == 5);
	//
	// }

//	@Test
//	public void czyWsrodRozmiarowJestOpcjaL() {
//		UtilAutomationStatic.logowanie(driver);
//		UtilAutomationStatic.przekierowanieNaWomen(driver);
//		List<WebElement> wybor = UtilAutomationStatic.pobranieElementowRozmiaru(driver);
//		boolean czyJestL = UtilAutomationStatic.czyWsrodElementowJestElementRozmiaruOWlasciwosciL(wybor);
//
//		assertEquals(true, czyJestL);
//	}
//	 @Test
//		 public void czyIloscKolorowPoZalogowaniuSieIPoWybraniuSekcjiTshirtsWynosi2()
//		 {
//		 UtilAutomationStatic.logowanie(driver);
//		 UtilAutomationStatic.przekierowanieNaTshirts(driver);
//		 List<WebElement> wybor =UtilAutomationStatic.pobranieElementowKoloru(driver);
//		
//		 assertEquals(true,wybor.size()==2);
//		 }
	 
	 @Test
	 public void czyIloscKolorowPoZalogowaniuSieIPoWybraniuSekcjiTshirtsWynosiWiecejNizLiczbaKolorowWSekcjiDresses()
	 {
	 UtilAutomationStatic.logowanie(driver);
	 UtilAutomationStatic.przekierowanieNaTshirts(driver);
	 List<WebElement> kolorTshirts =UtilAutomationStatic.pobranieElementowKoloru(driver);
	 UtilAutomationStatic.przekierowanieNaDresses(driver);
	 List<WebElement> kolorDresses =UtilAutomationStatic.pobranieElementowKoloru(driver);
	
	 assertEquals(true, kolorDresses.size()>kolorTshirts.size());
	 }
	

	@After
	public void close() {
		driver.quit();
	}
}
