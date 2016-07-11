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

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:reaseguroAceptado_true-inputEl']")
    WebElementFacade radioBotReaseguro;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-labelEl']")
    WebElementFacade lblTipoDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    WebElementFacade lblNumeroDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblNumeroTelefono;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:ChangePolicyAddressButton-labelEl']")
    WebElementFacade lblDireccion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:EffectiveDate-labelEl']")
    WebElementFacade lblFechaVigencia;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ExpirationDate-labelEl']")
    WebElementFacade lblFechaExpiracion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:WrittenDate-labelEl']")
    WebElementFacade lblFechaescrita;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressType-labelEl']")
    WebElementFacade lblTipoDireccion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:AddressDescription-labelEl']")
    WebElementFacade lblDescripcionDir;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade inputTipoDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade inputNumeroDocumento;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:Phone:GlobalPhoneInputSet:PhoneDisplay-bodyEl']")
    WebElementFacade inputNumeroTelefono;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:PolicyAddressDisplayInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    WebElementFacade inputDireccion;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:reaseguroAceptado_false-inputEl']")
    WebElementFacade inputReaseguroAceptado;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:reaseguroEspecial_false-inputEl']")
    WebElementFacade inputReaseguroEspecial;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:CompanyNamedInsuredLabel-labelEl']")
    WebElementFacade lblTomador;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:SubmissionWizard_PolicyInfoDV:AccountInfoInputSet:InsuredInputSet:reaseguroEspecial-inputEl']")
    WebElementFacade inputValidaReaseguroEspecial;

    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPPolicyInfoScreen:AdditionalNamedInsuredsDV']")
    WebElementFacade tblTomadoresAdicionales;

    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";

    public OpcionesInformacionPolizaMrcPage(WebDriver driver) {
        super(driver);
    }

    Actions actions = new Actions(getDriver());

    public void ingresaAgente() {
        waitInfoPoliza(lblNuevaCotizacion);
        txtNomAgente.clear();
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        waitInfoPoliza(lblTabla);
    }

    public void ingresarFechaVigencia(String fechaInicioVigencia) {
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
        waitInfoPoliza(lblInformaPoliza);
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

    public void seleccionaRiesgoAceptado() {
        waitInfoPoliza(lblInformaPoliza);
        radioBotReaseguro.click();
    }


    public void seleccionarProducto(String nomProducto) {
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
        List<WebElementFacade> DescripcionProductos = withTimeoutOf(10, TimeUnit.SECONDS).findAll(".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']/div/table/tbody/tr/td[2]");
        return DescripcionProductos;
    }

    public void validaNombreTomador(String nombreCompleto) {
        waitInfoPoliza(lblInformaPoliza);
        assertThat("el al mostrar nombre completo", nombreCompleto.equals(lblNombreCompleto.getText()));
    }

    public void validaCamposPoliza() {
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!lblTipoDocumento.isPresent())
            notPresent.append("Label errado: Tipo documento|");
        if (!lblNumeroDocumento.isPresent())
            notPresent.append("Label errado: Numero documento|");
        if (!lblNumeroTelefono.isPresent())
            notPresent.append("label errado: Teléfono|");
        if (!lblDireccion.isPresent())
            notPresent.append("label errado: Dirección de la poliza|");
        if ("".equals(inputTipoDocumento.getText()))
            notPresent.append("salida errada: Tipo cedula|");
        if ("".equals(inputNumeroDocumento.getText()))
            notPresent.append("salida errada: Numero cedula|");
        if ("".equals(inputNumeroTelefono.getText()))
            notPresent.append("salida errada: Telefono|");
        if ("".equals(inputDireccion.getText()))
            notPresent.append("salida errada: Direccion|");
        if (!"".equals(inputReaseguroAceptado.getText()))
            notPresent.append("radio boton nulo: Reaseguro aceptado|");
        if (!"".equals(inputReaseguroEspecial.getText()))
            notPresent.append("radio boton nulo: Reaseguro especial|");
        if (!"Fecha inicio de vigencia".equals(lblFechaVigencia.getText()))
            notPresent.append("salida errada: Fecha inicio de vigencia|");
        if (!"Fecha fin de vigencia".equals(lblFechaExpiracion.getText()))
            notPresent.append("salida errada: Fecha fin de vigencia|");
        if (!"Fecha de expedición".equals(lblFechaescrita.getText()))
            notPresent.append("salida errada: Fecha de expedición|");
        if (!"Descripción de la dirección".equals(lblDescripcionDir.getText()))
            notPresent.append("salida errada: Descripcion direccion|");
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        assertThat(res, "No estan presentes los elementos".equals(res));
    }

    public void validaMensajeEnPantalla(String mensaje) {
        assertThat("Falto Mensaje validacion en pantalla", mensajePantalla.containsText(mensaje));
    }

    public void validaReaseguro() {
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if (!lblTomador.getText().equals("Compañía cedente"))
            notPresent.append("salida errada: Compañía cedente|");
        if (tblTomadoresAdicionales.isPresent())
            notPresent.append("los tomadores adicionales no pueden estar presentes|");
        if (inputValidaReaseguroEspecial.getText().equals("Si,"))
            notPresent.append("salida errada: debio cambia a reaseguro especial SI|");
        if (inputValidaReaseguroEspecial.getAttribute("class").contains("x-form-text"))
            notPresent.append("la etiqueta no puede ser modificada|");
        String res = notPresent.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = notPresent.toString().substring(0, notPresent.toString().length() - 1);
        }
        assertThat(res, "No estan presentes los elementos".equals(res));

    }

    // TODO: 30/06/2016 Metodo wait para implementar generico
    public void waitInfoPoliza(WebElementFacade webElementFacade) {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(webElementFacade).shouldBePresent();
    }

}
