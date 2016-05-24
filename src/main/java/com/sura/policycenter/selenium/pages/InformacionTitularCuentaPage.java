package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class InformacionTitularCuentaPage extends Guidewire {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Guidewire.class);
    @FindBy(xpath="//tr[2]/td/div/span")
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
    @FindBy(xpath="//div[2]/div/div/div/div/span")
    WebElementFacade colCrearFecha;
    @FindBy(xpath="//div/div/div[2]/div/span")
    WebElementFacade colNroPoliza;
    @FindBy(xpath="//div[3]/div/span")
    WebElementFacade colProducto;
    @FindBy(xpath="//div/div/div[4]/div/span")
    WebElementFacade colNroTransaccion;
    @FindBy(xpath="//div[5]/div/span")
    WebElementFacade colTipo;
    @FindBy(xpath="//div[6]/div/span")
    WebElementFacade colEstado;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div/div/span")
    WebElementFacade colNumeroPoliza;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div[2]/div/span")
    WebElementFacade colProductoSiniestros;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div[3]/div/span")
    WebElementFacade colAsegurado;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div[4]/div/span")
    WebElementFacade colFechaPerdida;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div[5]/div/span")
    WebElementFacade colNumeroSiniestros;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div[6]/div/span")
    WebElementFacade colEstadoSiniestro;
    @FindBy(xpath="//tr[6]/td/div/div[2]/div/div/div[7]/div/span")
    WebElementFacade colTotalIncurrido;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountsActividadEconomica-labelEl']")
    WebElementFacade lblActividadEconomica;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonDateOfDeath-labelEl']")
    WebElementFacade lblFechaFallecimiento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonDateOfDeath-inputEl']")
    WebElementFacade txtFechaFallecimiento;
    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:PersonCauseOfDeath-inputEl']")
    WebElementFacade txtCausaFallecimiento;

    private static final String div = "div";

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
        assertThat(tituloInformacionTitularCuenta.getText().toString(), is(equalTo(informacionBasica)));
        assertThat(tituloMetricas.getText().toString(), is(equalTo(metricas)));
        assertThat(tituloTransacciones.getText().toString(), is(equalTo(transacciones)));
        assertThat(tituloSiniestros.getText().toString(), is(equalTo(siniestros)));
    }

    public void validarInformacionBasica(String titularCuenta, String tipoDocumento, String nroDocumento, String primaVigencia,
                                         String segmentacion, String comportamniento,
                                         String totalNoFacturado, String totalFacturado, String totalVencido, String totalPendiente){
        assertThat(txtTitularCuenta.getText().toString(), is(equalTo(titularCuenta)));
        assertThat(txtTipoDocumento.getText().toString(), is(equalTo(tipoDocumento)));
        assertThat(txtNumeroDocumento.getText().toString(), is(equalTo(nroDocumento)));
        assertThat(txtPrimaVigencia.getText().toString(), is(equalTo(primaVigencia)));
        assertThat(txtSegmentacion.getText().toString(), is(equalTo(segmentacion)));
        assertThat(txtComportamiento.getText().toString(), is(equalTo(comportamniento)));
        assertThat(txtTotalNoFacturado.getText().toString(), is(equalTo(totalNoFacturado)));
        assertThat(txtTotalFacturado.getText().toString(), is(equalTo(totalFacturado)));
        assertThat(txtTotalVencido.getText().toString(), is(equalTo(totalVencido)));
        assertThat(txtTotalPendiente.getText().toString(), is(equalTo(totalPendiente)));
    }

    public void validarInformacionMetricas(String anioVigencia, String polizasActivas, String canceladoPorCliente,
                                                String canceladoPorCompania, String otrasCancelaciones, String primaVitalicia,
                                                String totalSiniestrosAbiertos, String totalNetoIncurrido){
        try {
            assertThat(lblAnioVigencia.getText().toString(), is(equalTo(anioVigencia)));
            assertThat(txtPolizasActivas.getText().toString(), is(equalTo(polizasActivas)));
            assertThat(txtCanceladoPorCliente.getText().toString(), is(equalTo(canceladoPorCliente)));
            assertThat(txtCanceladoPorCompania.getText().toString(), is(equalTo(canceladoPorCompania)));
            assertThat(txtOtrasCancelaciones.getText().toString(), is(equalTo(otrasCancelaciones)));
            assertThat(lblPrimaVitalicia.getText().toString(), is(equalTo(primaVitalicia)));
            assertThat(txtTotalSiniestrosAbiertos.getText().toString(), is(equalTo(totalSiniestrosAbiertos)));
            assertThat(lblTotalNetoIncurrido.getText().toString(), is(equalTo(totalNetoIncurrido)));

        }catch (Exception e) {
            LOGGER.error("This is error : " + e);
        }
    }

    public void validarNombreCompletoPersonaNatural(String nombreCompleto){
        assertThat(txtTitularCuenta.getText().toString(), is(equalTo(nombreCompleto)));
    }

    public void validarInformacionTransacciones(String fechaCreacion, String nroPoliza, String producto,
                                                String nroTransaccion, String tipo, String estado){
        assertThat(colCrearFecha.getText().toString(), is(equalTo(fechaCreacion)));
        assertThat(colNroPoliza.getText().toString(), is(equalTo(nroPoliza)));
        assertThat(colProducto.getText().toString(), is(equalTo(producto)));
        assertThat(colNroTransaccion.getText().toString(), is(equalTo(nroTransaccion)));
        assertThat(colTipo.getText().toString(), is(equalTo(tipo)));
        assertThat(colEstado.getText().toString(), is(equalTo(estado)));

    }

    public void validarInformacionSiniestros(String nroPoliza, String producto, String asegurado, String fechaPerdida,
                                                String numeroSiniestros, String estado, String totalIncurrido){
        assertThat(colNumeroPoliza.getText().toString(), is(equalTo(nroPoliza)));
        assertThat(colProductoSiniestros.getText().toString(), is(equalTo(producto)));
        assertThat(colAsegurado.getText().toString(), is(equalTo(asegurado)));
        assertThat(colFechaPerdida.getText().toString(), is(equalTo(fechaPerdida)));
        assertThat(colNumeroSiniestros.getText().toString(), is(equalTo(numeroSiniestros)));
        assertThat(colEstadoSiniestro.getText().toString(), is(equalTo(estado)));
        assertThat(colTotalIncurrido.getText().toString(), is(equalTo(totalIncurrido)));
    }

    public void validarCamposComoNoEditables(){
        assertThat(txtTitularCuenta.getTagName(), is(equalTo(div)));
        assertThat(txtTipoDocumento.getTagName(), is(equalTo(div)));
        assertThat(txtNumeroDocumento.getTagName(), is(equalTo(div)));
        assertThat(txtPrimaVigencia.getTagName(), is(equalTo(div)));
        assertThat(txtSegmentacion.getTagName(), is(equalTo(div)));
        assertThat(txtComportamiento.getTagName(), is(equalTo(div)));
        assertThat(txtTotalNoFacturado.getTagName(), is(equalTo(div)));
        assertThat(txtTotalFacturado.getTagName(), is(equalTo(div)));
        assertThat(txtTotalVencido.getTagName(), is(equalTo(div)));
        assertThat(txtTotalPendiente.getTagName(), is(equalTo(div)));
        assertThat(txtPolizasActivas.getTagName(), is(equalTo(div)));
        assertThat(txtCanceladoPorCliente.getTagName(), is(equalTo(div)));
        assertThat(txtCanceladoPorCompania.getTagName(), is(equalTo(div)));
        assertThat(txtOtrasCancelaciones.getTagName(), is(equalTo(div)));
        assertThat(txtTotalSiniestrosAbiertos.getTagName(), is(equalTo(div)));

    }

    public void validarInformacionFallecimiento(String fechaFallecimiento, String causaFallecimiento){
        assertThat(lblFechaFallecimiento.getText().toString(), is(equalTo(fechaFallecimiento)));
        assertThat(txtCausaFallecimiento.getText().toString(), is(equalTo(causaFallecimiento)));
    }

    public void validarCampoActividadEconomica(String actividadEconomica){
        assertThat(lblActividadEconomica.getText().toString(), is(equalTo(actividadEconomica)));
    }
}
