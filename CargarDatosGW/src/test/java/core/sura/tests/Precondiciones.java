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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

import page.LoginPage;
import page.PrecondicionesPage;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Precondiciones extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private PrecondicionesPage precondicionesPage;
    private static final String USUARIO = "su";
    private static final String CONTRASENA = "gw";

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        Properties prop = loadProperty();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url") + "/pc/PolicyCenter.do");
    }

    private void initPages() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        precondicionesPage = PageFactory.initElements(driver, PrecondicionesPage.class);
    }

    @Test
    public void cargaDeDatos() {
        initPages();
        loginPage.login(USUARIO, CONTRASENA, driver);
        precondicionesPage.cargarDatos(driver);
    }

    @Test
    public void seleccionarLenguaje() {
        initPages();
        loginPage.login(USUARIO, CONTRASENA, driver);
        precondicionesPage.elegirLenguaje(driver);
        assertEquals("Mis actividades", driver.findElement(By.xpath(".//*[@id='DesktopActivities:DesktopActivitiesScreen:0']")).getText());
    }

    @Test
    public void desactivarColasDeMensajes() {
        initPages();
        loginPage.login(USUARIO, CONTRASENA, driver);
        precondicionesPage.suspenderColasDeMensajes(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
