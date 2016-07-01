package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;

public class OpcionesInformacionPolizaMrcPage extends Guidewire {

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade txtNomAgente;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-inputEl']")
    WebElementFacade txtFechaVigencia;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:ttlBar']")
    WebElementFacade lblInformaPoliza;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ttlBar']")
    WebElementFacade lblNuevaCotizacion;

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    WebElementFacade lblTabla;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Name-inputEl']")
    WebElementFacade lblNombreCompleto;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ttlBar']")
    WebElementFacade lblBuscarDirectorio;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;

    @FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:_msgs")
    WebElementFacade mensajePantalla;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade btnSiguinete;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton-btnInnerEl']")
    WebElementFacade btnAgregar;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade btnSelecciona;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:AdditionalNamedInsuredsDV:NamedInsuredInputSet:NamedInsuredsLV_tb:AddContactsButton:AddFromSearch-itemEl']")
    WebElementFacade itemDirectorio;

    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    WebElementFacade itemTipoDocumento;

    public OpcionesInformacionPolizaMrcPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(getDriver());

    public void ingresaAgente (){
        waitInfoPoliza(lblNuevaCotizacion);
        txtNomAgente.clear();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        waitInfoPoliza(lblTabla);
    }

    public void ingresarFechaVigencia(String fechaInicioVigencia){
        waitInfoPoliza(lblInformaPoliza);
        txtFechaVigencia.clear();
        txtFechaVigencia.sendKeys(fechaInicioVigencia);
        actions.sendKeys(Keys.ENTER).build().perform();
        waitInfoPoliza(mensajePantalla);
    }

    public void bloqueaSiguiente() {
        btnSiguinete.click();
        assertThat("No puede seguir si la fecha es mnayor a 60 Dias", mensajePantalla.isPresent());
    }

    public void ingresarTomadorAdicional(String cedula) {
        btnAgregar.click();
        itemDirectorio.click();
        waitInfoPoliza(lblBuscarDirectorio);
        itemTipoDocumento.sendKeys("CEDULA DE CIU");
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        waitInfoPoliza(lblPrimerNombre);
        txtNumDocumento.sendKeys(cedula);
        btnBuscar.click();
        waitInfoPoliza(btnSelecciona);
        btnSelecciona.click();
        waitInfoPoliza(lblInformaPoliza);
        btnSiguinete.click();
        waitInfoPoliza(mensajePantalla);
    }

    public void  seleccionarProducto(String nomProducto) {
        int i = 0;
        if (!getListaDescripcion().isEmpty()) {
            for (WebElementFacade descripcion : getListaDescripcion()) {
                if (nomProducto.equals(descripcion.getText())) {
                    getListaBotones().get(i).click();
                }
                i++;
            }
        }
    }

    private List<WebElementFacade> getListaBotones() {
        List<WebElementFacade> botones = withTimeoutOf(10, TimeUnit.SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[1]");
        return botones;
    }

    private List<WebElementFacade> getListaDescripcion() {
        List<WebElementFacade> DescripcionProductos = withTimeoutOf(10,TimeUnit.SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        return DescripcionProductos;
    }

    public void validaNombreTomador(String nombreCompleto) {
        waitInfoPoliza(lblInformaPoliza);
        assertThat("el al mostrar nombre completo", nombreCompleto.equals(lblNombreCompleto.getText()));
    }

    public void validaMensajeEnPantalla(String mensaje){
        assertThat("Falto Mensaje validacion en pantalla", mensajePantalla.containsText(mensaje));
    }

    // TODO: 30/06/2016 Metodo wait para implementar generico
    public void waitInfoPoliza (WebElementFacade webElementFacade){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }


}
