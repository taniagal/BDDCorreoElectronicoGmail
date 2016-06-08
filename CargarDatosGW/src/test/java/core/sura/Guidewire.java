package main.java.core.sura;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guidewire {
	
	private WebDriver driver;
	private String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "http://dllocoreseguros.suramericana.com:7003";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	  @Test
	  public void cargarDatos() throws Exception {
		  driver.get(baseUrl + "/pc/PolicyCenter.do");
		  driver.findElement(By.xpath(".//*[@id='country']")).sendKeys("Colombia");
		  driver.findElement(By.id("username")).clear();
		  driver.findElement(By.id("username")).sendKeys("pedrvevi");
		  driver.findElement(By.xpath(".//*[@id='password']")).clear();
		  driver.findElement(By.xpath(".//*[@id='password']")).sendKeys("pedrvevi");
		  driver.findElement(By.xpath(".//*[@id='lower']/input")).click();
		  assertEquals("Mis actividades", driver.findElement(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")).getText());
		  driver.findElement(By.xpath(".//input[@id='QuickJump-inputEl']")).sendKeys(Keys.ALT,Keys.SHIFT, "t");
		  driver.findElement(By.xpath(".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']")).click();
		  driver.findElement(By.xpath(".//*[@id='UnsupportedTools:MenuLinks:UnsupportedTools_PCSampleData']/div")).click();
		  driver.findElement(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:SampleDataSetsLV:0:LoadSampleData']")).click();
		  Thread.sleep(5000);
		  assertEquals("Conjunto cargado \"Sura\" correctamente.", driver.findElement(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:0']")).getText());
		  driver.findElement(By.xpath(".//*[@id=':TabLinkMenuButton-btnIconEl']")).click();
		  driver.findElement(By.xpath(".//*[@id='InternalToolsTabBar:ReturnTabBarLink']")).click();

	  }

	  @After
	  public void tearDown() throws Exception {
		  driver.quit();
	  }

}
