package com.sura.policycenter.selenium.pages;

import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class InformacionTitularCuentaPage extends Commons {

    @FindBy(xpath="//tr[2]/td/DIV/span")
    WebElementFacade mnuInformacionTitularCuenta;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:ttlBar']")
    WebElementFacade tituloInformacionTitularCuenta;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsTitleBar']")
    WebElementFacade tituloMetricas;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:0']")
    WebElementFacade tituloTransacciones;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:1']")
    WebElementFacade tituloSiniestros;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountHolderName-inputEl']")
    WebElementFacade txtTitularCuenta;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountHoldeDocumentType-inputEl']")
    WebElementFacade txtTipoDocumento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountHolderDocumentNumber-inputEl']")
    WebElementFacade txtNumeroDocumento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:InForcePremium-inputEl']")
    WebElementFacade txtPrimaVigencia;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:Segmentation-inputEl']")
    WebElementFacade txtSegmentacion;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:Behavior-inputEl']")
    WebElementFacade txtComportamiento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalUnbilled-inputEl']")
    WebElementFacade txtTotalNoFacturado;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalCurrentlyBilled-inputEl']")
    WebElementFacade txtTotalFacturado;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalPastDueBilled-inputEl']")
    WebElementFacade txtTotalVencido;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalOutstandingBilled-inputEl']")
    WebElementFacade txtTotalPendiente;
    @FindBy(xpath=".//*[@id='ContactSearch:ContactSearchScreen:ContactSearchResultsLV:0:DocumentType']")
    WebElementFacade itmTipoDocumento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:FirstPolicyEffectiveYearInput-labelEl']")
    WebElementFacade lblAnioVigencia;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:ActivePoliciesInput-inputEl']")
    WebElementFacade txtPolizasActivas;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:CanceledByCustomerInput-inputEl']")
    WebElementFacade txtCanceladoPorCliente;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:CanceledByCarrierInput-inputEl']")
    WebElementFacade txtCanceladoPorCompania;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:OtherCancellationsInput-inputEl']")
    WebElementFacade txtOtrasCancelaciones;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:LifetimePremiumInput-labelEl']")
    WebElementFacade lblPrimaVitalicia;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:OpenClaimsCount-inputEl']")
    WebElementFacade txtTotalSiniestrosAbiertos;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsDV:NetTotalIncurred-labelEl']")
    WebElementFacade lblTotalNetoIncurrido;
    @FindBy(xpath="//DIV[2]/DIV/DIV/DIV/DIV/span")
    WebElementFacade colCrearFecha;
    @FindBy(xpath="//DIV/DIV/DIV[2]/DIV/span")
    WebElementFacade colNroPoliza;
    @FindBy(xpath="//DIV[3]/DIV/span")
    WebElementFacade colProducto;
    @FindBy(xpath="//DIV/DIV/DIV[4]/DIV/span")
    WebElementFacade colNroTransaccion;
    @FindBy(xpath="//DIV[5]/DIV/span")
    WebElementFacade colTipo;
    @FindBy(xpath="//DIV[6]/DIV/span")
    WebElementFacade colEstado;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV/DIV/span")
    WebElementFacade colNumeroPoliza;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[2]/DIV/span")
    WebElementFacade colProductoSiniestros;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[3]/DIV/span")
    WebElementFacade colAsegurado;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[4]/DIV/span")
    WebElementFacade colFechaPerdida;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[5]/DIV/span")
    WebElementFacade colNumeroSiniestros;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[6]/DIV/span")
    WebElementFacade colEstadoSiniestro;
    @FindBy(xpath="//tr[6]/td/DIV/DIV[2]/DIV/DIV/DIV[7]/DIV/span")
    WebElementFacade colTotalIncurrido;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountsActividadEconomica-labelEl']")
    WebElementFacade lblActividadEconomica;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonDateOfDeath-labelEl']")
    WebElementFacade lblFechaFallecimiento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonDateOfDeath-inputEl']")
    WebElementFacade txtFechaFallecimiento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonCauseOfDeath-inputEl']")
    WebElementFacade txtCausaFallecimiento;

    private static final String DIV = "div";

    public InformacionTitularCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void clickTipoDocumento() {
        itmTipoDocumento.waitUntilEnabled();
        itmTipoDocumento.click();
        waitABit(3000);
    }

    public void seleccionarInformacionTitularCuenta() {
        mnuInformacionTitularCuenta.waitUntilEnabled();
        mnuInformacionTitularCuenta.click();
        waitABit(3000);
    }

    public void validarEncabezadosInformacionTitularCuenta(String informacionBasica,
                                               String metricas,
                                               String transacciones,
                                               String siniestros){
        MatcherAssert.assertThat(tituloInformacionTitularCuenta.getText().toString(), is(equalTo(informacionBasica)));
        MatcherAssert.assertThat(tituloMetricas.getText().toString(), is(equalTo(metricas)));
        MatcherAssert.assertThat(tituloTransacciones.getText().toString(), is(equalTo(transacciones)));
        MatcherAssert.assertThat(tituloSiniestros.getText().toString(), is(equalTo(siniestros)));
    }

    public void validarInformacionBasica(String titularCuenta, String tipoDocumento, String nroDocumento, String primaVigencia,
                                         String segmentacion, String comportamniento,
                                         String totalNoFacturado, String totalFacturado, String totalVencido, String totalPendiente){
        MatcherAssert.assertThat(txtTitularCuenta.getText().toString(), is(equalTo(titularCuenta)));
        MatcherAssert.assertThat(txtTipoDocumento.getText().toString(), is(equalTo(tipoDocumento)));
        MatcherAssert.assertThat(txtNumeroDocumento.getText().toString(), is(equalTo(nroDocumento)));
        MatcherAssert.assertThat(txtPrimaVigencia.getText().toString(), is(equalTo(primaVigencia)));
        MatcherAssert.assertThat(txtSegmentacion.getText().toString(), is(equalTo(segmentacion)));
        MatcherAssert.assertThat(txtComportamiento.getText().toString(), is(equalTo(comportamniento)));
        MatcherAssert.assertThat(txtTotalNoFacturado.getText().toString(), is(equalTo(totalNoFacturado)));
        MatcherAssert.assertThat(txtTotalFacturado.getText().toString(), is(equalTo(totalFacturado)));
        MatcherAssert.assertThat(txtTotalVencido.getText().toString(), is(equalTo(totalVencido)));
        MatcherAssert.assertThat(txtTotalPendiente.getText().toString(), is(equalTo(totalPendiente)));
    }

    public void validarInformacionMetricas(String anioVigencia, String polizasActivas, String canceladoPorCliente,
                                                String canceladoPorCompania, String otrasCancelaciones, String primaVitalicia,
                                                String totalSiniestrosAbiertos, String totalNetoIncurrido){
        MatcherAssert.assertThat(lblAnioVigencia.getText().toString(), is(equalTo(anioVigencia)));
        MatcherAssert.assertThat(txtPolizasActivas.getText().toString(), is(equalTo(polizasActivas)));
        MatcherAssert.assertThat(txtCanceladoPorCliente.getText().toString(), is(equalTo(canceladoPorCliente)));
        MatcherAssert.assertThat(txtCanceladoPorCompania.getText().toString(), is(equalTo(canceladoPorCompania)));
        MatcherAssert.assertThat(txtOtrasCancelaciones.getText().toString(), is(equalTo(otrasCancelaciones)));
        MatcherAssert.assertThat(lblPrimaVitalicia.getText().toString(), is(equalTo(primaVitalicia)));
        MatcherAssert.assertThat(txtTotalSiniestrosAbiertos.getText().toString(), is(equalTo(totalSiniestrosAbiertos)));
        MatcherAssert.assertThat(lblTotalNetoIncurrido.getText().toString(), is(equalTo(totalNetoIncurrido)));

    }

    public void validarNombreCompletoPersonaNatural(String nombreCompleto){
        MatcherAssert.assertThat(txtTitularCuenta.getText().toString(), is(equalTo(nombreCompleto)));
    }

    public void validarInformacionTransacciones(String fechaCreacion, String nroPoliza, String producto,
                                                String nroTransaccion, String tipo, String estado){
        MatcherAssert.assertThat(colCrearFecha.getText().toString(), is(equalTo(fechaCreacion)));
        MatcherAssert.assertThat(colNroPoliza.getText().toString(), is(equalTo(nroPoliza)));
        MatcherAssert.assertThat(colProducto.getText().toString(), is(equalTo(producto)));
        MatcherAssert.assertThat(colNroTransaccion.getText().toString(), is(equalTo(nroTransaccion)));
        MatcherAssert.assertThat(colTipo.getText().toString(), is(equalTo(tipo)));
        MatcherAssert.assertThat(colEstado.getText().toString(), is(equalTo(estado)));
    }

    public void validarInformacionSiniestros(String nroPoliza, String producto, String asegurado, String fechaPerdida,
                                                String numeroSiniestros, String estado, String totalIncurrido){
        MatcherAssert.assertThat(colNumeroPoliza.getText().toString(), is(equalTo(nroPoliza)));
        MatcherAssert.assertThat(colProductoSiniestros.getText().toString(), is(equalTo(producto)));
        MatcherAssert.assertThat(colAsegurado.getText().toString(), is(equalTo(asegurado)));
        MatcherAssert.assertThat(colFechaPerdida.getText().toString(), is(equalTo(fechaPerdida)));
        MatcherAssert.assertThat(colNumeroSiniestros.getText().toString(), is(equalTo(numeroSiniestros)));
        MatcherAssert.assertThat(colEstadoSiniestro.getText().toString(), is(equalTo(estado)));
        MatcherAssert.assertThat(colTotalIncurrido.getText().toString(), is(equalTo(totalIncurrido)));
    }

    public void validarCamposComoNoEditables(){
        MatcherAssert.assertThat(txtTitularCuenta.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtTipoDocumento.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtNumeroDocumento.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtPrimaVigencia.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtSegmentacion.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtComportamiento.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalNoFacturado.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalFacturado.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalVencido.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalPendiente.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtPolizasActivas.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtCanceladoPorCliente.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtCanceladoPorCompania.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtOtrasCancelaciones.getTagName(), is(equalTo(DIV)));
        MatcherAssert.assertThat(txtTotalSiniestrosAbiertos.getTagName(), is(equalTo(DIV)));
    }

    public void validarInformacionFallecimiento(String fechaFallecimiento, String causaFallecimiento){
        MatcherAssert.assertThat(lblFechaFallecimiento.getText().toString(), is(equalTo(fechaFallecimiento)));
        MatcherAssert.assertThat(txtCausaFallecimiento.getText().toString(), is(equalTo(causaFallecimiento)));
    }

    public void validarCampoActividadEconomica(String actividadEconomica){
        MatcherAssert.assertThat(lblActividadEconomica.getText().toString(), is(equalTo(actividadEconomica)));
    }
}
