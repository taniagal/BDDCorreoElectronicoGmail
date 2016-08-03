package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.CoreMatchers;
import org.hamcrest.MatcherAssert;
import org.hamcrest.core.IsNull;
import org.openqa.selenium.WebDriver;


import static org.hamcrest.core.Is.is;

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
        MatcherAssert.assertThat(lblProducto.getText(), is(CoreMatchers.equalTo(producto)));
        MatcherAssert.assertThat(lblNroEnvio.getText(), is(CoreMatchers.equalTo(nroEnvio)));
        MatcherAssert.assertThat(lblEstadoDetalle.getText(), is(CoreMatchers.equalTo(estado)));
        MatcherAssert.assertThat(lblNroPoliza.getText(), is(CoreMatchers.equalTo(nroPoliza)));
        MatcherAssert.assertThat(lblCrearFecha.getText(), is(IsNull.notNullValue()));
        lblFechaCierre.shouldBeVisible();
    }

    public void validarCamposRegistros(String nombre, String tipoDeTransaccion, String nroDeTransacciones) {
        lblTransaccionDetalle.withTimeoutOf(8, TimeUnit.SECONDS).waitUntilPresent();
        MatcherAssert.assertThat(lblNombre.getText(), is(CoreMatchers.equalTo(nombre)));
        MatcherAssert.assertThat(lblPrimeraFechaVigencia.getText(), is(IsNull.notNullValue()));
        MatcherAssert.assertThat(lblUltimaFechaVigencia.getText(), is(IsNull.notNullValue()));
        MatcherAssert.assertThat(lblTipoTransaccion.getText(), is(CoreMatchers.equalTo(tipoDeTransaccion)));
        MatcherAssert.assertThat(lblNroTransaccion.getText(), is(CoreMatchers.equalTo(nroDeTransacciones)));
    }

    public void buscarRegistrosSuscripcion() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(mnuRegistrosSuscripcion).waitUntilPresent();
        mnuRegistrosSuscripcion.click();
    }

    public void validarNombresFiltros(String estado, String transaccion) {
        waitForTextToAppear(estado, 20);
        waitForTextToAppear(transaccion, 20);
        MatcherAssert.assertThat(lblEstado.getText(), is(CoreMatchers.equalTo(estado)));
        MatcherAssert.assertThat(lblTransaccion.getText(), is(CoreMatchers.equalTo(transaccion)));
    }

    public void buscarDetalleRegistrosDeSuscripcion() {
        buscarRegistrosSuscripcion();
        lblTransaccionDetalle.withTimeoutOf(7, TimeUnit.SECONDS).waitUntilPresent();
        lblTransaccionDetalle.click();
    }

    public void validarTotal(String total) {
        MatcherAssert.assertThat(lblCostoTotal.getText(), is(CoreMatchers.equalTo(total)));
    }

    public void validarSumaGrupo(String suma) {
        MatcherAssert.assertThat(lblNroCotizaciones.getText(), is(CoreMatchers.equalTo(suma)));
    }

    public void validarVisibilidadMenuAnalisisDeRiesgo() {
        mnuAnalisis.shouldNotBeVisible();
    }

    public  void validarVisibilidadMenuActividades() {
        mnuActividades.shouldNotBeVisible();
    }

    public void validarTituloSumatoriaDeCotizaciones(String titulo){
        MatcherAssert.assertThat(lblTituloNroCotizaciones.getText(), is(CoreMatchers.equalTo(titulo)));
    }

}
