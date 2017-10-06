package page;

import core.sura.resources.MetodosComunes;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PrecondicionesPage extends MetodosComunes {
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElement campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='InternalToolsTabBar:UnsupportedToolsTab-btnInnerEl']")
    private WebElement menuHerramientasInternas;
    @FindBy(xpath = ".//*[@id='UnsupportedTools:MenuLinks:UnsupportedTools_PCSampleData']/div")
    private WebElement menuItemDatosDeMuestraDePc;
    @FindBy(xpath = ".//*[@id='PCSampleData:PCSampleDataScreen:SampleDataSetsLV:0:LoadSampleData']")
    private WebElement botonCarga;
    @FindBy(xpath = ".//*[@id='PCSampleData:PCSampleDataScreen:0']")
    private WebElement labelCargaCorrecta;
    @FindBy(xpath = ".//*[@id=':TabLinkMenuButton-btnIconEl']")
    private WebElement botonPreferencias;
    @FindBy(xpath = ".//*[@id='TabBar:LanguageTabBarLink']")
    private WebElement menuItemInternacional;
    @FindBy(xpath = ".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher']")
    private WebElement menuItemIdioma;
    @FindBy(xpath = ".//*[@id='TabBar:LanguageTabBarLink:languageSwitcher:1:langs-textEl']")
    private WebElement menuItemColombia;
    @FindBy(xpath = ".//*[@id='MessagingDestinationControlList:MessagingDestinationControlListScreen:MessagingDestinationControlList_SuspendButton-btnInnerEl']")
    private WebElement botonSuspender;
    @FindBy(xpath = ".//*[@id='MessagingDestinationControlList:MessagingDestinationControlListScreen:MessagingDestinationsControlLV-body']")
    private WebElement tablaColasDeMensajes;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_Monitoring']/div")
    private WebElement menuItemSupervision;
    @FindBy(xpath = ".//*[@id='Admin:MenuLinks:Admin_Monitoring:Monitoring_MessagingDestinationControlList']/div")
    private WebElement submenuColasDeMensajes;

    private static final int TIEMPO_1000 = 1000;
    private static final int TIEMPO_2000 = 2000;
    private static final int TIEMPO_10000 = 10000;
    private static final int CONSTANTE_1 = 1;
    private static final String XPATH = ".//*[@id='MessagingDestinationControlList:MessagingDestinationControlListScreen:MessagingDestinationsControlLV-body']/*/table/tbody/tr[";

    private boolean esperaAlerta(WebDriver driver){
        boolean rta = false;
        try{
            rta = driver.switchTo().alert().getText().contains("HTTP request");
        }catch (NoAlertPresentException ex){
            LOGGER.info("No se encuentra alerta: ",ex);
        }
        return rta;
    }

    public void cargarDatos(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_1000);
        boolean cargaSampleData = false;
        campoTxtBuscar.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        waitUntilVisible(menuHerramientasInternas, driver);
        menuHerramientasInternas.click();
        menuItemDatosDeMuestraDePc.click();
        botonCarga.click();
        while (!cargaSampleData) {
            if (esperaAlerta(driver)){
                driver.switchTo().alert().accept();
                botonCarga.click();
            } else if (labelCargaCorrecta.isDisplayed()) {
                cargaSampleData = true;
            }
        }
        MatcherAssert.assertThat(labelCargaCorrecta.getText(), CoreMatchers.anyOf(Is.is("Conjunto cargado \"Sura\" correctamente."),
                Is.is("Loaded set \"Sura\" successfully.")));
    }

    public void elegirLenguaje(WebDriver driver) {
        Actions actions = new Actions(driver);
        botonPreferencias.click();
        waitUntilVisible(menuItemInternacional, driver);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitUntilVisible(menuItemIdioma, driver);
        actions.sendKeys(Keys.ARROW_RIGHT).build().perform();
        waitUntilVisible(menuItemColombia, driver);
        menuItemColombia.click();
        MetodosComunes.waitUntil(TIEMPO_2000);
    }

    public void irAColasDeMensajes(WebDriver driver) {
        waitUntilVisible(campoTxtBuscar, driver);
        campoTxtBuscar.sendKeys("Admin");
        campoTxtBuscar.sendKeys(Keys.ENTER);
        waitUntilVisible(menuItemSupervision, driver);
        menuItemSupervision.click();
        waitUntilVisible(submenuColasDeMensajes, driver);
        MetodosComunes.waitUntil(TIEMPO_1000);
        submenuColasDeMensajes.click();
        waitUntilVisible(tablaColasDeMensajes, driver);
    }

    public Integer encontrarColasDeMensajes(String idcola, int col, WebDriver driver) {
        waitUntilVisible(tablaColasDeMensajes, driver);
        Integer filaCola = 1;
        boolean encontrado = false;
        List<WebElement> filas = tablaColasDeMensajes.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (idcola.equals(columna.get(col).getText())) {
                encontrado = true;
                break;
            }
            filaCola++;
        }
        if (!encontrado) {
            filaCola = -1;
        }
        return filaCola;
    }

    public void suspenderColasDeMensajes(WebDriver driver) {
        irAColasDeMensajes(driver);
        Integer suraGMC = encontrarColasDeMensajes("Sura.GMC.GMCInspire.Ticket", CONSTANTE_1, driver);
        Integer gmcInspire = encontrarColasDeMensajes("GMC Inspire", CONSTANTE_1, driver);
        boolean encontrados = false;
        if (suraGMC != -1 && gmcInspire != -1) {
            encontrados = true;
            WebElement suraGMCElemento = driver.findElement(By.xpath(XPATH + suraGMC.toString() + "]/td[1]/div/img"));
            WebElement gmcInspireElemento = driver.findElement(By.xpath(XPATH + gmcInspire.toString() + "]/td[1]/div/img"));
            suraGMCElemento.click();
            MetodosComunes.waitUntil(TIEMPO_1000);
            gmcInspireElemento.click();
            MetodosComunes.waitUntil(TIEMPO_1000);
            botonSuspender.click();
            MetodosComunes.waitUntil(TIEMPO_5000);
            WebElement estadoSuraGMCElemento = driver.findElement(By.xpath(XPATH + suraGMC.toString() + "]/td[4]/div"));
            WebElement estadoGmcInspireElemento = driver.findElement(By.xpath(XPATH + gmcInspire.toString() + "]/td[4]/div"));
            Assert.assertEquals("Suspended", estadoSuraGMCElemento.getText());
            Assert.assertEquals("Suspended", estadoGmcInspireElemento.getText());
        }
        Assert.assertTrue(encontrados);
    }
}
