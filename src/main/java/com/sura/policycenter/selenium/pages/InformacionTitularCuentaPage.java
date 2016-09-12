package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class InformacionTitularCuentaPage extends Commons {

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
        MatcherAssert.assertThat(tituloInformacionTitularCuenta.getText().toString(), Matchers.is(Matchers.equalTo(informacionBasica)));
        MatcherAssert.assertThat(tituloMetricas.getText().toString(), Matchers.is(Matchers.equalTo(metricas)));
        MatcherAssert.assertThat(tituloTransacciones.getText().toString(), Matchers.is(Matchers.equalTo(transacciones)));
        MatcherAssert.assertThat(tituloSiniestros.getText().toString(), Matchers.is(Matchers.equalTo(siniestros)));
    }

    public void validarInformacionBasica(String titularCuenta, String tipoDocumento, String nroDocumento, String primaVigencia,
                                         String segmentacion, String comportamniento,
                                         String totalNoFacturado, String totalFacturado, String totalVencido, String totalPendiente) {
        MatcherAssert.assertThat(txtTitularCuenta.getText().toString(), Matchers.is(Matchers.equalTo(titularCuenta)));
        MatcherAssert.assertThat(txtTipoDocumento.getText().toString(), Matchers.is(Matchers.equalTo(tipoDocumento)));
        MatcherAssert.assertThat(txtNumeroDocumento.getText().toString(), Matchers.is(Matchers.equalTo(nroDocumento)));
        MatcherAssert.assertThat(txtPrimaVigencia.getText().toString(), Matchers.is(Matchers.equalTo(primaVigencia)));
        MatcherAssert.assertThat(txtSegmentacion.getText().toString(), Matchers.is(Matchers.equalTo(segmentacion)));
        MatcherAssert.assertThat(txtComportamiento.getText().toString(), Matchers.is(Matchers.equalTo(comportamniento)));
        MatcherAssert.assertThat(txtTotalNoFacturado.getText().toString(), Matchers.is(Matchers.equalTo(totalNoFacturado)));
        MatcherAssert.assertThat(txtTotalFacturado.getText().toString(), Matchers.is(Matchers.equalTo(totalFacturado)));
        MatcherAssert.assertThat(txtTotalVencido.getText().toString(), Matchers.is(Matchers.equalTo(totalVencido)));
        MatcherAssert.assertThat(txtTotalPendiente.getText().toString(), Matchers.is(Matchers.equalTo(totalPendiente)));
    }

    public void validarInformacionMetricas(String anioVigencia, String polizasActivas, String canceladoPorCliente,
                                           String canceladoPorCompania, String otrasCancelaciones, String primaVitalicia,
                                           String totalSiniestrosAbiertos, String totalNetoIncurrido) {
        MatcherAssert.assertThat(lblAnioVigencia.getText().toString(), Matchers.is(Matchers.equalTo(anioVigencia)));
        MatcherAssert.assertThat(txtPolizasActivas.getText().toString(), Matchers.is(Matchers.equalTo(polizasActivas)));
        MatcherAssert.assertThat(txtCanceladoPorCliente.getText().toString(), Matchers.is(Matchers.equalTo(canceladoPorCliente)));
        MatcherAssert.assertThat(txtCanceladoPorCompania.getText().toString(), Matchers.is(Matchers.equalTo(canceladoPorCompania)));
        MatcherAssert.assertThat(txtOtrasCancelaciones.getText().toString(), Matchers.is(Matchers.equalTo(otrasCancelaciones)));
        MatcherAssert.assertThat(lblPrimaVitalicia.getText().toString(), Matchers.is(Matchers.equalTo(primaVitalicia)));
        MatcherAssert.assertThat(txtTotalSiniestrosAbiertos.getText().toString(), Matchers.is(Matchers.equalTo(totalSiniestrosAbiertos)));
        MatcherAssert.assertThat(lblTotalNetoIncurrido.getText().toString(), Matchers.is(Matchers.equalTo(totalNetoIncurrido)));

    }

    public void validarNombreCompletoPersonaNatural(String nombreCompleto) {
        MatcherAssert.assertThat(txtTitularCuenta.getText().toString(), Matchers.is(Matchers.equalTo(nombreCompleto)));
    }

    public void validarInformacionTransacciones(String fechaCreacion, String nroPoliza, String producto,
                                                String nroTransaccion, String tipo, String estado) {
        MatcherAssert.assertThat(colCrearFecha.getText().toString(), Matchers.is(Matchers.equalTo(fechaCreacion)));
        MatcherAssert.assertThat(colNroPoliza.getText().toString(), Matchers.is(Matchers.equalTo(nroPoliza)));
        MatcherAssert.assertThat(colProducto.getText().toString(), Matchers.is(Matchers.equalTo(producto)));
        MatcherAssert.assertThat(colNroTransaccion.getText().toString(), Matchers.is(Matchers.equalTo(nroTransaccion)));
        MatcherAssert.assertThat(colTipo.getText().toString(), Matchers.is(Matchers.equalTo(tipo)));
        MatcherAssert.assertThat(colEstado.getText().toString(), Matchers.is(Matchers.equalTo(estado)));
    }

    public void validarInformacionSiniestros(String nroPoliza, String producto, String asegurado, String fechaPerdida,
                                             String numeroSiniestros, String estado, String totalIncurrido) {
        MatcherAssert.assertThat(colNumeroPoliza.getText().toString(), Matchers.is(Matchers.equalTo(nroPoliza)));
        MatcherAssert.assertThat(colProductoSiniestros.getText().toString(), Matchers.is(Matchers.equalTo(producto)));
        MatcherAssert.assertThat(colAsegurado.getText().toString(), Matchers.is(Matchers.equalTo(asegurado)));
        MatcherAssert.assertThat(colFechaPerdida.getText().toString(), Matchers.is(Matchers.equalTo(fechaPerdida)));
        MatcherAssert.assertThat(colNumeroSiniestros.getText().toString(), Matchers.is(Matchers.equalTo(numeroSiniestros)));
        MatcherAssert.assertThat(colEstadoSiniestro.getText().toString(), Matchers.is(Matchers.equalTo(estado)));
        MatcherAssert.assertThat(colTotalIncurrido.getText().toString(), Matchers.is(Matchers.equalTo(totalIncurrido)));
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

    public void validarInformacionFallecimiento(String fechaFallecimiento, String causaFallecimiento) {
        MatcherAssert.assertThat(lblFechaFallecimiento.getText().toString(), Matchers.is(Matchers.equalTo(fechaFallecimiento)));
        MatcherAssert.assertThat(txtCausaFallecimiento.getText().toString(), Matchers.is(Matchers.equalTo(causaFallecimiento)));
    }

    public void validarCampoActividadEconomica(String actividadEconomica) {
        MatcherAssert.assertThat(lblActividadEconomica.getText().toString(), Matchers.is(Matchers.equalTo(actividadEconomica)));
    }
}
