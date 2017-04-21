package core.sura.tests;


import core.sura.resources.MetodosComunes;
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

import java.util.Properties;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmokeTests extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private SmokeTestPage smokeTestPage;
    private static final int WAIT_30 = 30;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        Properties prop = loadProperty();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WAIT_30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url") + "/pc/PolicyCenter.do");
    }

    private void initPages() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        smokeTestPage = PageFactory.initElements(driver, SmokeTestPage.class);
    }

    @Test
    public void buscarUsuario() {
        initPages();
        loginPage.login("su", "sura2017", driver);
        smokeTestPage.buscarUsuario("su", driver);
        MatcherAssert.assertThat("Error, no se encontró el usuario pero el aplicativo si está desplegado",
                smokeTestPage.verificarBusquedaDeUsuario(driver));
    }

    @After
    public void after() {
        driver.quit();
    }
}
