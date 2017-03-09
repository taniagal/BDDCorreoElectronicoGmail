package com.sura.guidewire.policycenter.pages.cuenta;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DetalleRegistrosSuscripcionPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:SubmissionGroupJobsLV-body']")
    WebElementFacade tablaEnvios;
    @FindBy(xpath = ".//*[@id='AccountFile:MenuLinks:AccountFile_UnderwritingFiles']/div/span")
    WebElementFacade mnuRegistrosSuscripcion;
    @FindBy(xpath = ".//a[contains(@id, 'UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:') and contains(text(), 'SG222222')]")
    WebElementFacade lblTransaccionDetalle;
    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-inputEl']")
    WebElementFacade lblNroCotizaciones;
    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:TotalCost-inputEl']")
    WebElementFacade lblCostoTotal;
    @FindBy(xpath = "//span[contains(text(),'Producto')]")
    WebElementFacade columnaProducto;
    @FindBy(xpath = "//span[contains(text(),'Estado')]")
    WebElementFacade columnaEstadoDetalle;
    @FindBy(xpath = "//span[contains(text(),'Crear fecha')]")
    WebElementFacade columnaCrearFecha;
    @FindBy(xpath = "//span[contains(text(),'Fecha de cierre')]")
    WebElementFacade columnaFechaCierre;
    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:RiskAnalysisCardTab']")
    WebElementFacade mnuAnalisis;
    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:ActivitiesCardTab']")
    WebElementFacade mnuActividades;
    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-labelEl']")
    WebElementFacade lblTituloNroCotizaciones;
    @FindBy(xpath = "//div/label")
    WebElementFacade lblEstado;
    @FindBy(xpath = "//label[2]")
    WebElementFacade lblTransaccion;
    @FindBy(xpath = ".//*[@id='UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV-body']")
    WebElementFacade tablaRegistros;
    @FindBy(xpath = ".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-inputEl']")
    WebElementFacade campoPaginas;
    @FindBy(xpath = "//span[contains(@class,'x-btn-icon-el x-tbar-page-next')]")
    WebElementFacade botonSiguienteTabla;

    private static final String MENOS_UNO = "-1";
    private static final int QUINCE = 15;

    public DetalleRegistrosSuscripcionPage(WebDriver driver) {
        super(driver);
    }

    public Integer encontrarPoliza(String numeroPoliza) {
        withTimeoutOf(TIEMPO_15, TimeUnit.SECONDS).waitFor(tablaEnvios).waitUntilVisible();
        Integer filaPoliza = 0;
        boolean encontrado = false;
        List<WebElement> filas = tablaEnvios.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (numeroPoliza.equals(columna.get(1).getText())) {
                encontrado = true;
                break;
            }
            filaPoliza++;
        }
        if (!encontrado) {
            filaPoliza = -1;
        }
        return filaPoliza;
    }

    public void validarCamposDetalle(String producto, String nroEnvio, String estado, String nroPoliza) {
        String fila = "";
        int paginas = this.iteraciones(Integer.parseInt(campoPaginas.waitUntilPresent().getText()));
        for (int i = 1; i <= paginas; i++) {
            fila = this.encontrarPoliza(nroEnvio).toString();
            if (fila.equals(MENOS_UNO)) {
                botonSiguienteTabla.click();
                esperarHasta(TIEMPO_3);
            }
        }
        WebElementFacade filaNroEnvio = findBy(".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:SubmissionGroupJobsLV:" + fila + ":Submission']");
        WebElementFacade filaPoliza = findBy(".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:SubmissionGroupJobsLV:" + fila + ":PolicyNumber']");
        MatcherAssert.assertThat(filaNroEnvio.getText(), Is.is(Matchers.equalTo(nroEnvio)));
        MatcherAssert.assertThat(filaPoliza.getText(), Is.is(Matchers.equalTo(nroPoliza)));
        columnaFechaCierre.shouldBeVisible();
        columnaProducto.shouldBeVisible();
        columnaEstadoDetalle.shouldBeVisible();
        columnaCrearFecha.shouldBeVisible();
    }

    public int iteraciones(Integer paginas) {
        int modulo = paginas % QUINCE;
        int divido = paginas / QUINCE;
        if (modulo != 0) {
            divido++;
        }
        return divido;
    }

    public void validarCamposRegistros(String nombre, String tipoDeTransaccion, String nroDeTransacciones) {
        waitFor(lblTransaccionDetalle);
        String xpathTabla = "/tr[" + this.encontrarRegistro(nombre).toString() + "]";
        MatcherAssert.assertThat(findBy("//div[3]/div/table/tbody" + xpathTabla + "/td[1]/div").getText(), Is.is(Matchers.equalTo(nombre)));
        MatcherAssert.assertThat(findBy("//div/table/tbody" + xpathTabla + "/td[3]/div").getText(), Is.is(IsNull.notNullValue()));
        MatcherAssert.assertThat(findBy("/" + xpathTabla + "/td[3]/div").getText(), Is.is(IsNull.notNullValue()));
        MatcherAssert.assertThat(findBy("/" + xpathTabla + "/td[4]/div").getText(), Is.is(Matchers.equalTo(tipoDeTransaccion)));
        MatcherAssert.assertThat(findBy("/" + xpathTabla + "/td[5]/div").getText(), Is.is(IsNull.notNullValue()));
    }

    public Integer encontrarRegistro(String nombre) {
        waitFor(tablaRegistros).waitUntilPresent();
        Integer filaRegistro = 1;
        List<WebElement> filas = tablaRegistros.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (nombre.equals(columna.get(0).getText())) {
                return filaRegistro;
            }
            filaRegistro++;
        }
        return filaRegistro;
    }

    public void buscarRegistrosSuscripcion() {
        waitFor(mnuRegistrosSuscripcion).waitUntilPresent().waitUntilClickable();
        mnuRegistrosSuscripcion.click();
    }

    public void validarNombresFiltros(String estado, String transaccion) {
        waitForTextToAppear(estado);
        waitForTextToAppear(transaccion);
        MatcherAssert.assertThat(lblEstado.getText(), Is.is(Matchers.equalTo(estado)));
        MatcherAssert.assertThat(lblTransaccion.getText(), Is.is(Matchers.equalTo(transaccion)));
    }

    public void buscarDetalleRegistrosDeSuscripcion() {
        buscarRegistrosSuscripcion();
        waitFor(lblTransaccionDetalle).waitUntilPresent().waitUntilClickable();
        lblTransaccionDetalle.click();
    }

    public void validarTotal(String total) {
        MatcherAssert.assertThat(lblCostoTotal.getText(), Is.is(IsNull.notNullValue()));
    }

    public void validarSumaGrupo(String suma) {
        MatcherAssert.assertThat(lblNroCotizaciones.getText(), Is.is(IsNull.notNullValue()));
    }

    public void validarVisibilidadMenuAnalisisDeRiesgo() {
        mnuAnalisis.shouldNotBeVisible();
    }

    public void validarVisibilidadMenuActividades() {
        mnuActividades.shouldNotBeVisible();
    }

    public void validarTituloSumatoriaDeCotizaciones(String titulo) {
        MatcherAssert.assertThat(lblTituloNroCotizaciones.getText(), Is.is(Matchers.equalTo(titulo)));
    }

}
