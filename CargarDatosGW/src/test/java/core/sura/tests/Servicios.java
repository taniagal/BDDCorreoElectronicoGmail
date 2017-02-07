package core.sura.tests;

import core.sura.resources.MetodosComunes;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import page.LoginPage;
import page.ServiciosPage;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Servicios extends MetodosComunes {
    private WebDriver driver;
    private LoginPage loginPage;
    private ServiciosPage serviciosPage;
    private static final String campoLocalizatinType = ".//*[@id='AdminWservices:WServiceDetailLV-body']/*/table/tbody/tr[1]/td[3]";
    private static final int WAIT_30 = 30;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        Properties prop = loadProperty();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(WAIT_30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url") + "/pc/PolicyCenter.do");
        initPages();
    }

    private void initPages() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        serviciosPage = PageFactory.initElements(driver, ServiciosPage.class);
    }

    @Test
    public void activarMocks() {
        loginPage.login("pedrvevi", "pedrvevi", driver);
        serviciosPage.activarMocks(driver);
        MatcherAssert.assertThat("Error en la activacion de los mocks", driver.findElement(
                By.xpath(campoLocalizatinType)).getText().contains("EndPoint"));
    }

    @Test
    public void activarServicios() {
        loginPage.login("pedrvevi", "pedrvevi", driver);
        serviciosPage.desactivarMocks(driver);
        MatcherAssert.assertThat("Error en la activacion de los servicios", driver.findElement(
                By.xpath(campoLocalizatinType)).getText().contains("Registry"));
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
