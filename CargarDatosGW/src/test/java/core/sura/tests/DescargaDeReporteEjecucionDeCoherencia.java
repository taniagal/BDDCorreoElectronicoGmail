package core.sura.tests;

import core.sura.resources.MetodosComunes;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import page.DescargaDeReporteEjecucionDeCoherenciaPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DescargaDeReporteEjecucionDeCoherencia extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private DescargaDeReporteEjecucionDeCoherenciaPage descargaReportePage;

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
        descargaReportePage = PageFactory.initElements(driver, DescargaDeReporteEjecucionDeCoherenciaPage.class);
    }

    @Test
    public void descargarReporte() {
        initPages();
        loginPage.login("pedrvevi", "pedrvevi", driver);
        descargaReportePage.descargarReporte(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
