package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class InformacionTitularCuentaPage extends Guidewire {
    public InformacionTitularCuentaPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//tr[2]/td/div/span")
    WebElementFacade mnuInformacionTitularCuenta;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:ttlBar']")
    WebElementFacade tituloInformacionTitularCuenta;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:CustomerValueMetricsTitleBar']")
    WebElementFacade tituloMetricas;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:0']")
    WebElementFacade tituloTransacciones;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:1']")
    WebElementFacade tituloReclamaciones;

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

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:AccountsActividadEconomica-bodyEl']")
    WebElementFacade txtActividadEconomica;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalUnbilled-inputEl']")
    WebElementFacade txtTotalNoFacturado;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalCurrentlyBilled-inputEl']")
    WebElementFacade txtTotalFacturado;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalPastDueBilled-inputEl']")
    WebElementFacade txtTotalVencido;

    @FindBy(xpath=".//*[@id='ContactFile_AccountHolder:AccountHolderScreen:AccountHolderDV:TotalOutstandingBilled-inputEl']")
    WebElementFacade txtTotalPendiente;


    public void seleccionarInformacionTitularCuenta() {
        mnuInformacionTitularCuenta.waitUntilEnabled();
        mnuInformacionTitularCuenta.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    public void validarEncabezadosInformacionTitularCuenta(String informacionBasica,
                                               String metricas,
                                               String transacciones,
                                               String reclamaciones){
        try {
            assertThat(tituloInformacionTitularCuenta.getText().toString(), is(equalTo(informacionBasica)));
            assertThat(tituloMetricas.getText().toString(), is(equalTo(metricas)));
            assertThat(tituloTransacciones.getText().toString(), is(equalTo(transacciones)));
            assertThat(tituloReclamaciones.getText().toString(), is(equalTo(reclamaciones)));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void validarInformacionBasica(String titularCuenta, String tipoDocumento, String nroDocumento, String primaVigencia,
                                         String segmentacion, String comportamniento, String actividadEconomica,
                                         String totalNoFacturado, String totalFacturado, String totalVencido, String totalPendiente){
        try {
            assertThat(txtTitularCuenta.getText().toString(), is(equalTo(titularCuenta)));
            assertThat(txtTipoDocumento.getText().toString(), is(equalTo(tipoDocumento)));
            assertThat(txtNumeroDocumento.getText().toString(), is(equalTo(nroDocumento)));
            assertThat(txtPrimaVigencia.getText().toString(), is(equalTo(primaVigencia)));
            assertThat(txtSegmentacion.getText().toString(), is(equalTo(segmentacion)));
            assertThat(txtComportamiento.getText().toString(), is(equalTo(comportamniento)));
            assertThat(txtActividadEconomica.getText().toString(), is(equalTo(actividadEconomica)));
            assertThat(txtTotalNoFacturado.getText().toString(), is(equalTo(totalNoFacturado)));
            assertThat(txtTotalFacturado.getText().toString(), is(equalTo(totalFacturado)));
            assertThat(txtTotalVencido.getText().toString(), is(equalTo(totalVencido)));
            assertThat(txtTotalPendiente.getText().toString(), is(equalTo(totalPendiente)));
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
