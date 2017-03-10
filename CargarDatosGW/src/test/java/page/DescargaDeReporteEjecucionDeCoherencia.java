package page;


import core.sura.resources.MetodosComunes;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DescargaDeReporteEjecucionDeCoherencia extends MetodosComunes {
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

    private static final int TIEMPO_1000 = 1000;
    private static final int TIEMPO_200000 = 200000;
    private static final String NUMERO_DE_SUBPROCESOS = "1000000";

    public void descargarReporte(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, TIEMPO_1000);
        campoTxtBuscar.sendKeys(Keys.ALT, Keys.SHIFT, "t");
        waitUntilVisible(menuItemPaginasDeInformacion, driver);
        menuItemPaginasDeInformacion.click();
        waitUntilVisible(submenuItemVerificacionesDeCoherencia, driver);
        submenuItemVerificacionesDeCoherencia.click();
        waitUntilVisible(campoNumeroDeSubprocesos, driver);
        campoNumeroDeSubprocesos.sendKeys(NUMERO_DE_SUBPROCESOS);
        botonEjecutarVerificacionesDeCoherencia.click();
        wait.until(ExpectedConditions.visibilityOf(iconoDescargar));
        iconoDescargar.click();
        MetodosComunes.waitUntil(TIEMPO_200000)
    }
}
