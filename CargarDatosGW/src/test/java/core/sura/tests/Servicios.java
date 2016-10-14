package core.sura.tests;

import core.sura.resources.MetodosComunes;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.hamcrest.MatcherAssert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Servicios extends MetodosComunes{

    private WebDriver driver;
    private String baseUrl;
    private Actions actions;
    WebDriverWait wait;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 1000);
        Properties prop = loadProperty();
        baseUrl = prop.getProperty("url");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void activarMocks() throws Exception {
        login("pedrvevi", "pedrvevi");
        activacionDeMocks();
        MatcherAssert.assertThat("Error en la activacion de los mocks",driver.findElement(
                By.xpath(".//*[@id='AdminWservices:WServiceDetailLV-body']/*/table/tbody/tr[1]/td[3]")).getText().contains("EndPoint"));
    }

    @Test
    public void activarServicios() throws Exception {
        login("pedrvevi", "pedrvevi");
        activacionDeServicios();
        MatcherAssert.assertThat("Error en la activacion de los mocks",driver.findElement(
                By.xpath(".//*[@id='AdminWservices:WServiceDetailLV-body']/*/table/tbody/tr[1]/td[3]")).getText().contains("Registry"));
    }

    private void activacionDeMocks() {
        irAServicios();
        driver.findElement(By.xpath(".//*[@id='AdminWservices:mocksButton']")).click();
        waitUntil(1500);
    }

    private void activacionDeServicios(){
        irAServicios();
        driver.findElement(By.xpath(".//*[@id='AdminWservices:mocksButtonD']")).click();
        waitUntil(1500);
    }

    public void irAServicios() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='TabBar:AdminTab']"))).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='TabBar:AdminTab']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='Admin:MenuLinks:Admin_Utilities']/div"))).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='Admin:MenuLinks:Admin_Utilities']/div")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='ImportWizard:Cancel-btnInnerEl']"))).isDisplayed();
        driver.findElement(By.xpath(".//*[@id='Admin:MenuLinks:Admin_Utilities:Utilities_AdminWservices']/div")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='AdminWservices:Edit']"))).isDisplayed();
    }

    public void login(String usuario ,String contrasenia) {
        System.out.println(baseUrl + "/pc/PolicyCenter.do");
        driver.get(baseUrl + "/pc/PolicyCenter.do");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
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

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}
