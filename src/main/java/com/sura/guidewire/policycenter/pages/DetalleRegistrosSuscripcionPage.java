package com.sura.guidewire.policycenter.pages;

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
    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_UnderwritingFiles']/div/span")
    WebElementFacade mnuRegistrosSuscripcion;
    @FindBy(xpath=".//*[@id='UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:0:GroupName']")
    WebElementFacade lblTransaccionDetalle;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-inputEl']")
    WebElementFacade lblNroCotizaciones;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:TotalCost-inputEl']")
    WebElementFacade lblCostoTotal;
    @FindBy(xpath="//span[contains(text(),'Producto')]")
    WebElementFacade columnaProducto;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    WebElementFacade lblNroEnvio;
    @FindBy(xpath="//span[contains(text(),'Estado')]")
    WebElementFacade columnaEstadoDetalle;
    @FindBy(xpath="//td[4]/div")
    WebElementFacade lblNroPoliza;
    @FindBy(xpath="//span[contains(text(),'Crear fecha')]")
    WebElementFacade columnaCrearFecha;
    @FindBy(xpath="//span[contains(text(),'Fecha de cierre')]")
    WebElementFacade columnaFechaCierre;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:RiskAnalysisCardTab']")
    WebElementFacade mnuAnalisis;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:ActivitiesCardTab']")
    WebElementFacade mnuActividades;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-labelEl']")
    WebElementFacade lblTituloNroCotizaciones;
    @FindBy(xpath="//div[3]/div/table/tbody/tr/td/div")
    WebElementFacade lblNombre;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    WebElementFacade lblPrimeraFechaVigencia;
    @FindBy(xpath="//td[3]/div")
    WebElementFacade lblUltimaFechaVigencia;
    @FindBy(xpath="//td[4]/div")
    WebElementFacade lblTipoTransaccion;
    @FindBy(xpath="//td[5]/div")
    WebElementFacade lblNroTransaccion;
    @FindBy(xpath="//div/label")
    WebElementFacade lblEstado;
    @FindBy(xpath="//label[2]")
    WebElementFacade lblTransaccion;

    public DetalleRegistrosSuscripcionPage(WebDriver driver) {
        super(driver);
    }

    public Integer encontrarPoliza(String numeroPoliza) {
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(tablaEnvios).waitUntilVisible();
        Integer filaPoliza = 0;
        List<WebElement> filas = tablaEnvios.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (numeroPoliza.equals(columna.get(1).getText())) {
                return filaPoliza;
            }
            filaPoliza++;
        }
        return filaPoliza;
    }

    public void validarCamposDetalle(String producto, String nroEnvio, String estado, String nroPoliza){
        String fila = this.encontrarPoliza(nroEnvio).toString();
        WebElementFacade filaNroEnvio = findBy(".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:SubmissionGroupJobsLV:"+fila+":Submission']");
        WebElementFacade filaPoliza = findBy(".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:SubmissionGroupJobsLV:"+fila+":PolicyNumber']");
        MatcherAssert.assertThat(filaNroEnvio.getText(), Is.is(Matchers.equalTo(nroEnvio)));
        MatcherAssert.assertThat(filaPoliza.getText(), Is.is(Matchers.equalTo(nroPoliza)));
        columnaFechaCierre.shouldBeVisible();
        columnaProducto.shouldBeVisible();
        columnaEstadoDetalle.shouldBeVisible();
        columnaCrearFecha.shouldBeVisible();
    }

    public void validarCamposRegistros(String nombre, String tipoDeTransaccion, String nroDeTransacciones) {
        waitFor(lblTransaccionDetalle);
        MatcherAssert.assertThat(lblNombre.getText(), Is.is(Matchers.equalTo(nombre)));
        MatcherAssert.assertThat(lblPrimeraFechaVigencia.getText(), Is.is(IsNull.notNullValue()));
        MatcherAssert.assertThat(lblUltimaFechaVigencia.getText(), Is.is(IsNull.notNullValue()));
        MatcherAssert.assertThat(lblTipoTransaccion.getText(), Is.is(Matchers.equalTo(tipoDeTransaccion)));
        MatcherAssert.assertThat(lblNroTransaccion.getText(), Is.is(IsNull.notNullValue()));
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

    public  void validarVisibilidadMenuActividades() {
        mnuActividades.shouldNotBeVisible();
    }

    public void validarTituloSumatoriaDeCotizaciones(String titulo){
        MatcherAssert.assertThat(lblTituloNroCotizaciones.getText(), Is.is(Matchers.equalTo(titulo)));
    }

}
