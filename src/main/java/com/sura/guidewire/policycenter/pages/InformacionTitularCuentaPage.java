package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.Map;


public class InformacionTitularCuentaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='ContactFile:MenuLinks:ContactFile_ContactFile_AccountHolder']/div/span")
    WebElementFacade mnuInformacionTitularCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:ttlBar']")
    WebElementFacade tituloInformacionTitularCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsTitleBar']")
    WebElementFacade tituloMetricas;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:0']")
    WebElementFacade tituloTransacciones;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:1']")
    WebElementFacade tituloSiniestros;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountHolderName-inputEl']")
    WebElementFacade txtTitularCuenta;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountHoldeDocumentType-inputEl']")
    WebElementFacade txtTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountHolderDocumentNumber-inputEl']")
    WebElementFacade txtNumeroDocumento;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:InForcePremium-inputEl']")
    WebElementFacade txtPrimaVigencia;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:Segmentation-inputEl']")
    WebElementFacade txtSegmentacion;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:Behavior-inputEl']")
    WebElementFacade txtComportamiento;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalUnbilled-inputEl']")
    WebElementFacade txtTotalNoFacturado;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalCurrentlyBilled-inputEl']")
    WebElementFacade txtTotalFacturado;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalPastDueBilled-inputEl']")
    WebElementFacade txtTotalVencido;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalOutstandingBilled-inputEl']")
    WebElementFacade txtTotalPendiente;
    @FindBy(xpath = ".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    WebElementFacade itmTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:FirstPolicyEffectiveYearInput-labelEl']")
    WebElementFacade lblAnioVigencia;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:ActivePoliciesInput-inputEl']")
    WebElementFacade txtPolizasActivas;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:CanceledByCustomerInput-inputEl']")
    WebElementFacade txtCanceladoPorCliente;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:CanceledByCarrierInput-inputEl']")
    WebElementFacade txtCanceladoPorCompania;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:OtherCancellationsInput-inputEl']")
    WebElementFacade txtOtrasCancelaciones;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:LifetimePremiumInput-labelEl']")
    WebElementFacade lblPrimaVitalicia;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:OpenClaimsCount-inputEl']")
    WebElementFacade txtTotalSiniestrosAbiertos;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:NetTotalIncurred-labelEl']")
    WebElementFacade lblTotalNetoIncurrido;
    @FindBy(xpath = "//span[contains(.,'Fecha de creación')]")
    WebElementFacade colCrearFecha;
    @FindBy(xpath = "//DIV/DIV/DIV[2]/DIV/span")
    WebElementFacade colNroPoliza;
    @FindBy(xpath = "//DIV[3]/DIV/span")
    WebElementFacade colProducto;
    @FindBy(xpath = "//DIV/DIV/DIV[4]/DIV/span")
    WebElementFacade colNroTransaccion;
    @FindBy(xpath = "//DIV[5]/DIV/span")
    WebElementFacade colTipo;
    @FindBy(xpath = "//DIV[6]/DIV/span")
    WebElementFacade colEstado;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV/DIV/span")
    WebElementFacade colNumeroPoliza;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/span")
    WebElementFacade colProductoSiniestros;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[3]/DIV/span")
    WebElementFacade colAsegurado;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/span")
    WebElementFacade colFechaPerdida;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[5]/DIV/span")
    WebElementFacade colNumeroSiniestros;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[6]/DIV/span")
    WebElementFacade colEstadoSiniestro;
    @FindBy(xpath = "//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[7]/DIV/span")
    WebElementFacade colTotalIncurrido;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountsActividadEconomica-labelEl']")
    WebElementFacade lblActividadEconomica;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonDateOfDeath-labelEl']")
    WebElementFacade lblFechaFallecimiento;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonDateOfDeath-inputEl']")
    WebElementFacade txtFechaFallecimiento;
    @FindBy(xpath = ".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonCauseOfDeath-inputEl']")
    WebElementFacade txtCausaFallecimiento;

    private static final String DIV = "div";

    public InformacionTitularCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void clickTipoDocumento() {
        waitFor(itmTipoDocumento);
        itmTipoDocumento.click();
    }

    public void seleccionarInformacionTitularCuenta() {
        waitFor(mnuInformacionTitularCuenta);
        mnuInformacionTitularCuenta.click();
    }

    public void validarEncabezadosInformacionTitularCuenta(String informacionBasica,
                                                           String metricas,
                                                           String transacciones,
                                                           String siniestros) {
        MatcherAssert.assertThat(tituloInformacionTitularCuenta.getText(), Matchers.is(Matchers.equalTo(informacionBasica)));
        MatcherAssert.assertThat(tituloMetricas.getText(), Matchers.is(Matchers.equalTo(metricas)));
        MatcherAssert.assertThat(tituloTransacciones.getText(), Matchers.is(Matchers.equalTo(transacciones)));
        MatcherAssert.assertThat(tituloSiniestros.getText(), Matchers.is(Matchers.equalTo(siniestros)));
    }

    public void validarInformacionBasica(ExamplesTable infoBasica) {
        Map<String, String> informacion = infoBasica.getRows().get(0);
        MatcherAssert.assertThat(txtTitularCuenta.getText(), Matchers.is(Matchers.equalTo(informacion.get("informacion"))));
        MatcherAssert.assertThat(txtTipoDocumento.getText(), Matchers.is(Matchers.equalTo(informacion.get("tipoDocumento"))));
        MatcherAssert.assertThat(txtNumeroDocumento.getText(), Matchers.is(Matchers.equalTo(informacion.get("nroDocumento"))));
        MatcherAssert.assertThat(txtPrimaVigencia.getText(), Matchers.is(Matchers.equalTo(informacion.get("primaVigencia"))));
        MatcherAssert.assertThat(txtSegmentacion.getText(), Matchers.is(Matchers.equalTo(informacion.get("segmentacion"))));
        MatcherAssert.assertThat(txtComportamiento.getText(), Matchers.is(Matchers.equalTo(informacion.get("comportamniento"))));
        MatcherAssert.assertThat(txtTotalNoFacturado.getText(), Matchers.is(Matchers.equalTo(informacion.get("totalNoFacturado"))));
        MatcherAssert.assertThat(txtTotalFacturado.getText(), Matchers.is(Matchers.equalTo(informacion.get("totalFacturado"))));
        MatcherAssert.assertThat(txtTotalVencido.getText(), Matchers.is(Matchers.equalTo(informacion.get("totalVencido"))));
        MatcherAssert.assertThat(txtTotalPendiente.getText(), Matchers.is(Matchers.equalTo(informacion.get("totalPendiente"))));
    }

    public void validarInformacionMetricas(String anioVigencia, String canceladoPorCliente,
                                           String canceladoPorCompania, String otrasCancelaciones, String primaVitalicia,
                                           String totalSiniestrosAbiertos, String totalNetoIncurrido) {
        MatcherAssert.assertThat(lblAnioVigencia.getText(), Matchers.is(Matchers.equalTo(anioVigencia)));
        MatcherAssert.assertThat(txtCanceladoPorCliente.getText(), Matchers.is(Matchers.equalTo(canceladoPorCliente)));
        MatcherAssert.assertThat(txtCanceladoPorCompania.getText(), Matchers.is(Matchers.equalTo(canceladoPorCompania)));
        MatcherAssert.assertThat(txtOtrasCancelaciones.getText(), Matchers.is(Matchers.equalTo(otrasCancelaciones)));
        MatcherAssert.assertThat(lblPrimaVitalicia.getText(), Matchers.is(Matchers.equalTo(primaVitalicia)));
        MatcherAssert.assertThat(txtTotalSiniestrosAbiertos.getText(), Matchers.is(Matchers.equalTo(totalSiniestrosAbiertos)));
        MatcherAssert.assertThat(lblTotalNetoIncurrido.getText(), Matchers.is(Matchers.equalTo(totalNetoIncurrido)));

    }

    public void validarNombreCompletoPersonaNatural(String nombreCompleto) {
        MatcherAssert.assertThat(txtTitularCuenta.getText(), Matchers.is(Matchers.equalTo(nombreCompleto)));
    }

    public void validarInformacionTransacciones(String fechaCreacion, String nroPoliza, String producto,
                                                String nroTransaccion, String tipo, String estado) {
        MatcherAssert.assertThat(colCrearFecha.getText(), Matchers.is(Matchers.equalTo(fechaCreacion)));
        MatcherAssert.assertThat(colNroPoliza.getText(), Matchers.is(Matchers.equalTo(nroPoliza)));
        MatcherAssert.assertThat(colProducto.getText(), Matchers.is(Matchers.equalTo(producto)));
        MatcherAssert.assertThat(colNroTransaccion.getText(), Matchers.is(Matchers.equalTo(nroTransaccion)));
        MatcherAssert.assertThat(colTipo.getText(), Matchers.is(Matchers.equalTo(tipo)));
        MatcherAssert.assertThat(colEstado.getText(), Matchers.is(Matchers.equalTo(estado)));
    }

    public void validarInformacionSiniestros(String nroPoliza, String producto, String asegurado, String fechaPerdida,
                                             String numeroSiniestros, String estado, String totalIncurrido) {
        MatcherAssert.assertThat(colNumeroPoliza.getText(), Matchers.is(Matchers.equalTo(nroPoliza)));
        MatcherAssert.assertThat(colProductoSiniestros.getText(), Matchers.is(Matchers.equalTo(producto)));
        MatcherAssert.assertThat(colAsegurado.getText(), Matchers.is(Matchers.equalTo(asegurado)));
        MatcherAssert.assertThat(colFechaPerdida.getText(), Matchers.is(Matchers.equalTo(fechaPerdida)));
        MatcherAssert.assertThat(colNumeroSiniestros.getText(), Matchers.is(Matchers.equalTo(numeroSiniestros)));
        MatcherAssert.assertThat(colEstadoSiniestro.getText(), Matchers.is(Matchers.equalTo(estado)));
        MatcherAssert.assertThat(colTotalIncurrido.getText(), Matchers.is(Matchers.equalTo(totalIncurrido)));
    }

    public void validarCamposComoNoEditables() {
        MatcherAssert.assertThat(txtTitularCuenta.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtTipoDocumento.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtNumeroDocumento.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtPrimaVigencia.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtSegmentacion.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtComportamiento.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalNoFacturado.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalFacturado.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalVencido.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalPendiente.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtPolizasActivas.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtCanceladoPorCliente.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtCanceladoPorCompania.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtOtrasCancelaciones.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalSiniestrosAbiertos.getTagName(), Matchers.is(Matchers.equalTo(DIV)));
    }

    public void validarCampoActividadEconomica(String actividadEconomica) {
        MatcherAssert.assertThat(lblActividadEconomica.getText(), Matchers.is(Matchers.equalTo(actividadEconomica)));
    }
}
