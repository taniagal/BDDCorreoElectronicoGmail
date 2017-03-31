package page;


import core.sura.resources.MetodosComunes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DescargaDeReporteEjecucionDeCoherenciaPage extends MetodosComunes {
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElement campoTxtBuscar;
    @FindBy(xpath = ".//*[@id='ServerTools:MenuLinks:ServerTools_InfoPages']/div/span")
    private WebElement menuItemPaginasDeInformacion;
    @FindBy(xpath = ".//*[@id='ServerTools:MenuLinks:ServerTools_InfoPages:InfoPages_ConsistencyChecks']/div/span")
    private WebElement submenuItemVerificacionesDeCoherencia;
    @FindBy(xpath = ".//*[@id='ConsistencyChecks:ConsistencyChecksScreen:NumThreads-inputEl']")
    private WebElement campoNumeroDeSubprocesos;
    @FindBy(xpath = ".//*[@id='ConsistencyChecks:ConsistencyChecksScreen:SubmitBatchJobButton-btnInnerEl']")
    private WebElement botonEjecutarVerificacionesDeCoherencia;
    @FindBy(xpath = ".//*[@id='ConsistencyChecks:ConsistencyChecksScreen:ConsistencyChecksRunsLV:0:LVDownload']")
    private WebElement iconoDescargar;
    @FindBy(xpath = ".//*[@id='ConsistencyChecks:ConsistencyChecksScreen:batchProgress']")
    private WebElement barraDeProgreso;

    private static final int TIEMPO_1000 = 1000;
    private static final int TIEMPO_1500 = 1500;
    private static final int TIEMPO_DESCARGA = 300000;
    private static final String NUMERO_DE_SUBPROCESOS = "100000000";

    public void descargarReporte(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_1000);
        campoTxtBuscar.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        waitUntilVisible(menuItemPaginasDeInformacion, driver);
        menuItemPaginasDeInformacion.click();
        waitUntilVisible(submenuItemVerificacionesDeCoherencia, driver);
        waitUntil(TIEMPO_1500);
        submenuItemVerificacionesDeCoherencia.click();
        waitUntilVisible(campoNumeroDeSubprocesos, driver);
        campoNumeroDeSubprocesos.clear();
        campoNumeroDeSubprocesos.sendKeys(NUMERO_DE_SUBPROCESOS);
        botonEjecutarVerificacionesDeCoherencia.click();
        wait.until(ExpectedConditions.visibilityOf(barraDeProgreso));
        wait.until(ExpectedConditions.visibilityOf(botonEjecutarVerificacionesDeCoherencia));
        waitUntil(TIEMPO_1500);
        wait.until(ExpectedConditions.visibilityOf(iconoDescargar));
        waitUntil(TIEMPO_1500);
        iconoDescargar.click();
        MetodosComunes.waitUntil(TIEMPO_DESCARGA);
    }
}
