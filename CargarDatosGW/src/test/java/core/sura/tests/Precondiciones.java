package core.sura.tests;

import core.sura.resources.MetodosComunes;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Precondiciones extends MetodosComunes{

    private WebDriver driver;
    private String baseUrl;
    private Actions act;
    WebDriverWait wait;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        act = new Actions(driver);
        wait = new WebDriverWait(driver, 1000);
        Properties prop = loadProperty();
        baseUrl = prop.getProperty("url");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void cargaDeDatos() throws Exception {
        login("pedrvevi","pedrvevi");
        cargarDatos();
    }

    @Test
    public void seleccionarLenguaje() throws Exception {
        login("pedrvevi","pedrvevi");
        elegirLenguaje();
        assertEquals("Mis actividades", driver.findElement(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")).getText());
    }

    public void cargarDatos() throws Exception {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']"))).isDisplayed();
        driver.findElement(By.xpath(".//input[@id='QuickJump-inputEl']")).sendKeys(Keys.ALT,Keys.SHIFT, "t");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']"))).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']")).click();
        driver.findElement(By.xpath(".//*[@id='UnsupportedTools:MenuLinks:UnsupportedTools_PCSampleData']/div")).click();
        driver.findElement(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:SampleDataSetsLV:0:LoadSampleData']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:0']"))).isDisplayed();
        assertThat(driver.findElement(By.xpath(".//*[@id='PCSampleData:PCSampleDataScreen:0']")).getText(), anyOf(is
                ("Conjunto cargado \"Sura\" correctamente."), is("Loaded set \"Sura\" successfully.")));
        driver.findElement(By.xpath(".//*[@id=':TabLinkMenuButton-btnIconEl']")).click();
        driver.findElement(By.xpath(".//*[@id='InternalToolsTabBar:LogoutTabBarLink']")).click();
    }

    public void login(String usuario ,String contrasenia) {
        driver.get(baseUrl + "/pc/PolicyCenter.do");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        if (driver.findElements(By.xpath(".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")).size() > 0) {
            driver.findElement(By.xpath(".//*[@id='Login:LoginScreen:LoginDV:username-inputEl']")).sendKeys("su");
            driver.findElement(By.xpath(".//*[@id='Login:LoginScreen:LoginDV:password-inputEl']")).sendKeys("gw");
            driver.findElement(By.xpath(".//*[@id='Login:LoginScreen:LoginDV:submit-btnInnerEl']")).click();
        } else {
            driver.findElement(By.xpath(".//*[@id='country']")).sendKeys("Colombia");
            driver.findElement(By.id("username")).clear();
            driver.findElement(By.id("username")).sendKeys(usuario);
            driver.findElement(By.xpath(".//*[@id='password']")).clear();
            driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(contrasenia);
            driver.findElement(By.xpath(".//*[@id='lower']/input")).click();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']"))).isDisplayed();
    }

    public void elegirLenguaje() throws Exception {
        driver.findElement(By.xpath(".//*[@id=':TabLinkMenuButton-btnIconEl']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:LanguageTabBarLink']"))).isDisplayed();
        act.sendKeys(Keys.ARROW_DOWN).build().perform();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher']"))).isDisplayed();
        act.sendKeys(Keys.ARROW_RIGHT).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:3:langs-textEl']"))).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs-textEl']")).click();
        Thread.sleep(2200);
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
