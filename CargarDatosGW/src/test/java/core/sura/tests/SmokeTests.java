package core.sura.tests;

import core.sura.resources.MetodosComunes;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.SmokeTestPage;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmokeTests extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private SmokeTestPage smokeTestPage;
    private static final int WAIT_30 = 30;
    private String contrasenia = "gw";
    private String usuario = "su";
    private String codigoAgente = "7800";
    Properties prop;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        prop = loadProperty();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WAIT_30, TimeUnit.SECONDS);
        if (prop.getProperty("url").contains("https://coreseguros.suramericana.com")) {
            driver.get(prop.getProperty("url") + "/pc");
        } else {
            driver.get(prop.getProperty("url") + "/pc/PolicyCenter.do");
        }
    }

    private void initPages() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        smokeTestPage = PageFactory.initElements(driver, SmokeTestPage.class);
    }

    @Test
    public void buscarUsuario() {
        initPages();
        if (prop.getProperty("url").contains("labcoreseguros")) {
            usuario = "luissadi";
            contrasenia = "sura2017";
            loginPage.login(usuario, contrasenia, driver);
            smokeTestPage.buscarAgenteUAT(codigoAgente, driver);
            MatcherAssert.assertThat("Error, no se encontró el agente pero el aplicativo si está desplegado",
                    smokeTestPage.verificarBusquedaDeAgenteUAT(codigoAgente, driver));
        } else {
            loginPage.login(usuario, contrasenia, driver);
            smokeTestPage.buscarUsuario(usuario, driver);
            MatcherAssert.assertThat("Error, no se encontró el usuario pero el aplicativo si está desplegado",
                    smokeTestPage.verificarBusquedaDeUsuario(usuario, driver));
        }
    }

    @Test
    public void buscarUsuarioProduccion() {
        initPages();
        if (prop.getProperty("url").contains("coreseguros")) {
            usuario = "smtestgw";
            contrasenia = "sura2017";
            loginPage.login(usuario, contrasenia, driver);
            smokeTestPage.buscarAgenteUAT(codigoAgente, driver);
            MatcherAssert.assertThat("Error, no se encontró el agente pero el aplicativo si está desplegado",
                    smokeTestPage.verificarBusquedaDeAgenteUAT(codigoAgente, driver));
        } else {
            loginPage.login(usuario, contrasenia, driver);
            smokeTestPage.buscarUsuario(usuario, driver);
            MatcherAssert.assertThat("Error, no se encontró el usuario pero el aplicativo si está desplegado",
                    smokeTestPage.verificarBusquedaDeUsuario(usuario, driver));
        }
    }

    @After
    public void after() {
        driver.quit();
    }
}
