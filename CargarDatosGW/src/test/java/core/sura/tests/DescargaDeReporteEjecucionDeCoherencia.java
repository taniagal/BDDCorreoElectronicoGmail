package core.sura.tests;

import core.sura.resources.MetodosComunes;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import page.PrecondicionesPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Precondiciones extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private DescargaDeReporteEjecucionDeCoherencia descargaDeReporteEjecucionDeCoherencia;

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
        descargaDeReporteEjecucionDeCoherencia = PageFactory.initElements(driver, descargaDeReporteEjecucionDeCoherencia.class);
    }

    @Test
    public void descargarReporte() {
        initPages();
        loginPage.login("pedrvevi", "pedrvevi", driver);
        descargaDeReporteEjecucionDeCoherencia.descargaDeReporte(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
