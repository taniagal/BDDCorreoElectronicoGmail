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
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;
import page.SmokeTestPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SmokeTests extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private WebDriverWait wait;
    private SmokeTestPage smokeTestPage;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        Properties prop = loadProperty();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url") + "/pc/PolicyCenter.do");
        wait = new WebDriverWait(driver, 1000);
    }

    private void initPages() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        smokeTestPage = PageFactory.initElements(driver, SmokeTestPage.class);
    }

    @Test
    public void buscarPoliza() {
        initPages();
        loginPage.login("pedrvevi", "pedrvevi", driver);
        smokeTestPage.buscarPoliza("900000000001");
        MatcherAssert.assertThat("Error, no se encontró la poliza pero el aplicativo si está desplegado",
                smokeTestPage.verificarResumenDePoliza("900000000001"));
    }

    @Test
    public void buscarCuenta() {
        initPages();
        loginPage.login("pedrvevi", "pedrvevi", driver);
        smokeTestPage.buscarCuenta("C1060447895");
        MatcherAssert.assertThat("Error, no se encontró la cuenta pero el aplicativo si está desplegado",
                smokeTestPage.verificarResumenDeCuenta("C1060447895"));
    }

    @After
    public void after() {
        driver.quit();
    }
}
