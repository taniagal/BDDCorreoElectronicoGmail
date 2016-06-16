package core.sura;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class Guidewire {
	
	private WebDriver driver;
	private String baseUrl;
    private Actions act;
    WebDriverWait wait;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
        act = new Actions(driver);
        wait = new WebDriverWait(driver, 120);
		baseUrl = "http://dllocoreseguros.suramericana.com:7003";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

    @Test
    public void CambiarLenguaje() throws Exception {
        login("pedrvevi","pedrvevi");
        elegirLenguaje();
        assertEquals("Mis actividades", driver.findElement(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")).getText());
    }

    @Test
    public void cargaDeDatos() throws Exception {
        login("pedrvevi","pedrvevi");
        cargarDatos();
    }

    public void cargarDatos() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']"))).isDisplayed();
        driver.findElement(By.xpath(".//input[@id='QuickJump-inputEl']")).sendKeys(Keys.ALT,Keys.SHIFT, "t");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']"))).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']")).click();
        driver.findElement(By.xpath(".//*[@id='UnsupportedTools:MenuLinks:UnsupportedTools_PCSampleData']/div")).click();
        driver.findElement(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:SampleDataSetsLV:0:LoadSampleData']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:0']"))).isDisplayed();
        assertEquals("Conjunto cargado \"Sura\" correctamente." || "Loaded set \"Sura\" successfully.", driver.findElement(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:0']")).getText());
        driver.findElement(By.xpath(".//*[@id=':TabLinkMenuButton-btnIconEl']")).click();
        driver.findElement(By.xpath(".//*[@id='InternalToolsTabBar:LogoutTabBarLink']")).click();
    }

    public void login(String usuario ,String contrasenia) {
        driver.get(baseUrl + "/pc/PolicyCenter.do");
        driver.findElement(By.xpath(".//*[@id='country']")).sendKeys("Colombia");
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("username")).sendKeys(usuario);
        driver.findElement(By.xpath(".//*[@id='password']")).clear();
        driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(contrasenia);
        driver.findElement(By.xpath(".//*[@id='lower']/input")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']"))).isDisplayed();
    }

    public void elegirLenguaje() throws Exception {
            driver.findElement(By.xpath(".//*[@id=':TabLinkMenuButton-btnIconEl']")).click();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:LanguageTabBarLink']"))).isDisplayed();
            act.sendKeys(Keys.ARROW_DOWN).build().perform();
            act.sendKeys(Keys.ARROW_RIGHT).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher']"))).isDisplayed();
            act.sendKeys(Keys.ARROW_RIGHT).build().perform();
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs']"))).isDisplayed();
            driver.findElement(By.xpath(".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs']")).click();
            Thread.sleep(2200);
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
