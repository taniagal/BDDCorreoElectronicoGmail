package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;

public class DetalleRegistrosSuscripcionPage extends Guidewire{

    @FindBy(xpath=".//*[@id='AccountFile:MenuLinks:AccountFile_UnderwritingFiles']/div/span")
    WebElementFacade mnuRegistrosSuscripcion;
    @FindBy(xpath=".//*[@id='UnderwritingFiles:RenewalManagerScreen:RenewalManagerLV:0:GroupName']")
    WebElementFacade lblTransaccionDetalle;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:NumJobs-inputEl']")
    WebElementFacade lblNroCotizaciones;
    @FindBy(xpath=".//*[@id='SubmissionGroupDetail:SubmissionGroupDetailScreen:TotalCost-inputEl']")
    WebElementFacade lblCostoTotal;
    @FindBy(xpath="//div[2]/div/table/tbody/tr/td/div/div[2]/div/table/tbody/tr/td/div")
    WebElementFacade lblProducto;
    @FindBy(xpath="//div/table/tbody/tr/td[2]/div")
    WebElementFacade lblNroEnvio;
    @FindBy(xpath="//td[3]/div")
    WebElementFacade lblEstadoDetalle;
    @FindBy(xpath="//td[4]/div")
    WebElementFacade lblNroPoliza;
    @FindBy(xpath="//td[5]/div")
    WebElementFacade lblCrearFecha;
    @FindBy(xpath="//td[6]/div")
    WebElementFacade lblFechaCierre;
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

    public void validarCamposDetalle(String producto, String nroEnvio, String estado, String nroPoliza){
        assertThat(lblProducto.getText(), is(equalTo(producto)));
        assertThat(lblNroEnvio.getText(), is(equalTo(nroEnvio)));
        assertThat(lblEstadoDetalle.getText(), is(equalTo(estado)));
        assertThat(lblNroPoliza.getText(), is(equalTo(nroPoliza)));
        assertThat(lblCrearFecha.getText(), is(notNullValue()));
        lblFechaCierre.shouldBeVisible();
    }

    public void validarCamposRegistros(String nombre, String tipoDeTransaccion, String nroDeTransacciones) {
        lblTransaccionDetalle.withTimeoutOf(8, TimeUnit.SECONDS).waitUntilPresent();
        assertThat(lblNombre.getText(), is(equalTo(nombre)));
        assertThat(lblPrimeraFechaVigencia.getText(), is(notNullValue()));
        assertThat(lblUltimaFechaVigencia.getText(), is(notNullValue()));
        assertThat(lblTipoTransaccion.getText(), is(equalTo(tipoDeTransaccion)));
        assertThat(lblNroTransaccion.getText(), is(equalTo(nroDeTransacciones)));
    }

    public void buscarRegistrosSuscripcion() {
        mnuRegistrosSuscripcion.withTimeoutOf(8, TimeUnit.SECONDS).waitUntilPresent();
        mnuRegistrosSuscripcion.click();
    }

    public void validarNombresFiltros(String estado, String transaccion) {
        waitForTextToAppear(estado, 7);
        waitForTextToAppear(transaccion, 7);
        assertThat(lblEstado.getText(), is(equalTo(estado)));
        assertThat(lblTransaccion.getText(), is(equalTo(transaccion)));
    }

    public void buscarDetalleRegistrosDeSuscripcion() {
        buscarRegistrosSuscripcion();
        lblTransaccionDetalle.withTimeoutOf(7, TimeUnit.SECONDS).waitUntilPresent();
        lblTransaccionDetalle.click();
    }

    public void validarTotal(String total) {
        assertThat(lblCostoTotal.getText(), is(equalTo(total)));
    }

    public void validarSumaGrupo(String suma) {
        assertThat(lblNroCotizaciones.getText(), is(equalTo(suma)));
    }

    public void validarVisibilidadMenuAnalisisDeRiesgo() {
        mnuAnalisis.shouldNotBeVisible();
    }

    public  void validarVisibilidadMenuActividades() {
        mnuActividades.shouldNotBeVisible();
    }

    public void validarTituloSumatoriaDeCotizaciones(String titulo){
        assertThat(lblTituloNroCotizaciones.getText(), is(equalTo(titulo)));
    }

}
