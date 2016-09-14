package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;


import com.sura.commons.selenium.Commons;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class OpcionesInformacionDelVehiculoPage extends Commons {


    @FindBy(xpath = "//td[@id='SubmissionWizard:LOBWizardStepGroup:PersonalVehicles']/div")
    WebElementFacade itemVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel_tb:Add-btnInnerEl']")
    WebElementFacade btnCrearVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:0']")
    WebElementFacade lblDetallesVehiculo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:0']")
    WebElementFacade lblCoberturaPersona;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    WebElementFacade txtPlaca;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:Year_DV-inputEl']")
    WebElementFacade lstModelo;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    WebElementFacade botonSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestCardTab-btnInnerEl']")
    WebElementFacade btnInteresAdicional;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton-btnWrap']")
    WebElementFacade btnAgregar;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:AdditionalInterestDetailsDV:AdditionalInterestLV_tb:AddContactsButton:AddFromSearch-itemEl']")
    WebElementFacade btnItemDirec;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ttlBar']")
    WebElementFacade lblBuscarDirec;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:DocumentType-inputEl']")
    WebElementFacade txtTipoDoc;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:identificationNumber-inputEl']")
    WebElementFacade txtNumDoc;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:StatedValue_DV-inputEl']")
    WebElementFacade txtValorAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosValue_DV-inputEl']")
    WebElementFacade txtValorAccesorios;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:AccesoriosEspValue_DV-inputEl']")
    WebElementFacade txtAcceEspeciales;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:BasicContactInfoInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='ContactSearchPopup:ContactSearchScreen:ContactSearchResultsLV:0:_Select']")
    WebElementFacade btnSeleccion;
    @FindBy(xpath = ".//div[3]/div/table/tbody/tr/td[5]/div")
    WebElementFacade lstTipoBeneficia;
    @FindBy(xpath = ".//div[4]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
    WebElementFacade lstTipoBeneficia2;
    @FindBy(xpath = ".//li[contains(.,'Asegurado')]")
    WebElementFacade itmAsegurado;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:VehicleDetailCardTab-btnInnerEl']")
    WebElementFacade btnDetalleVehiculo;
    @FindBy(id = "SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs")
    WebElementFacade cajaMensaje;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:AdditionalCoveragesTab-btnInnerEl']")
    WebElementFacade btnPaginaSiguiente;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    WebElementFacade txtLimite;
    @FindBy(xpath = "//div[contains(@id,'SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:totalInsured_DV-inputEl')]")
    WebElementFacade lblSumaValor;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:2:RateModifier-inputEl']")
    WebElementFacade txtBonificacionTecnica;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PAVehicleModifiersDV:3:RateModifier-inputEl']")
    WebElementFacade txtBonificacionComercial;
    @FindBy(xpath = ".//*[@id='TabBar:DesktopTab-btnInnerEl']")
    WebElementFacade btnEscritorio;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:_msgs']")
    WebElementFacade grupoMensajes;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:PAPerVehiclePanelSet:VehicleCoverageDetailsCV:PAPADanosATercerosDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:OptionTermInput-inputEl']")
    private WebElementFacade comboBoxLimite;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:PAVehiclesPanelSet:VehiclesListDetailPanel:VehiclesDetailsCV:PersonalAuto_VehicleDV:LicensePlate_DV-inputEl']")
    private WebElementFacade campoTxtPlaca;

    String[] comparaValores = new String[2];
    Actions actions = new Actions(getDriver());
    OpcionesInformacionPolizaMrcPage opcionPolizaMrc = new OpcionesInformacionPolizaMrcPage(getDriver());

    public OpcionesInformacionDelVehiculoPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarOpcionVehiculo() {
        opcionPolizaMrc.waitInfoPoliza(itemVehiculo);
        itemVehiculo.click();
        btnCrearVehiculo.click();
        opcionPolizaMrc.waitInfoPoliza(lblDetallesVehiculo);
    }

    public void ingresaBeneficiario(String tipoDocumento, String numeroDocumento) {
        btnInteresAdicional.click();
        btnAgregar.click();
        btnItemDirec.click();
        opcionPolizaMrc.waitInfoPoliza(lblBuscarDirec);
        txtTipoDoc.clear();
        waitUntil(800);
        txtTipoDoc.type(tipoDocumento);
        txtTipoDoc.sendKeys(Keys.ENTER);
        opcionPolizaMrc.waitInfoPoliza(lblPrimerNombre);
        txtNumDoc.type(numeroDocumento);
        btnBuscar.click();
        opcionPolizaMrc.waitInfoPoliza(btnSeleccion);
        btnSeleccion.click();
        opcionPolizaMrc.waitInfoPoliza(btnDetalleVehiculo);
        waitUntil(1500);
        if(lstTipoBeneficia.isCurrentlyVisible()){
            lstTipoBeneficia.click();
            itmAsegurado.click();
        }else if(lstTipoBeneficia2.isCurrentlyVisible()){
            waitUntil(1000);
            itmAsegurado.click();
        }
        btnDetalleVehiculo.click();
        campoTxtPlaca.waitUntilPresent();
    }

    public void ingresaValoresAccesorios(String valorAccesorio, String valorAccesorioEsp) {
        txtValorAccesorios.clear();
        ingresarDato(txtValorAccesorios,valorAccesorio);
        txtValorAsegurado.click();
        waitUntil(3000);
        ingresarDato(txtAcceEspeciales,valorAccesorioEsp);
        txtValorAsegurado.click();
        waitUntil(3000);
        int valorAsegurado = Integer.parseInt(txtValorAsegurado.getValue().substring(0, 8));
        int valorAccesorioEntero = Integer.parseInt(valorAccesorio);
        int valorAccesorioEspEntero = Integer.parseInt(valorAccesorioEsp);
        int valorTotalizado = valorAccesorioEntero + valorAccesorioEspEntero + valorAsegurado;
        String valorDeLabel = lblSumaValor.getText().substring(0, 11);
        valorDeLabel = valorDeLabel.replaceAll("\\$", "").replaceAll(",", "");
        comparaValores[0] = Integer.toString(valorTotalizado);
        comparaValores[1] = valorDeLabel;
    }

    public void ingresaValoresBonificacion(String valorBoniTecnica, String valorBoniComercial) {

        txtBonificacionTecnica.clear();
        txtBonificacionTecnica.sendKeys(valorBoniTecnica);
        txtBonificacionComercial.click();
        txtBonificacionComercial.clear();
        txtBonificacionComercial.sendKeys(valorBoniComercial);
    }

    public void validarPaginaSiguiente() {
        String bug = "Ljava.lang.String";
        botonSiguiente.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        MatcherAssert.assertThat("Error no controlado en la poliza (Java Lang)", !cajaMensaje.containsText(bug));
        botonSiguiente.click();
        MatcherAssert.assertThat("Error: debio pasar a siguinete pagina", comboBoxLimite.isPresent());
    }

    public void validaMensajePantalla() {
        botonSiguiente.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        MatcherAssert.assertThat("el campo motor o chasis no debe aceptar ccaracteres especiales", cajaMensaje.containsText("Este campo no puede tener caracteres especiales, sólo números y letras"));
        MatcherAssert.assertThat("el campo descuento, recargo y suavizacion deben ser decimales", cajaMensaje.containsText("debe tener máximo dos enteros y máximo dos decimales"));
    }

    public void validaMensajePantalla(String mensaje) {
        botonSiguiente.click();
        opcionPolizaMrc.waitInfoPoliza(cajaMensaje);
        MatcherAssert.assertThat("no se valido el campo bonificacion tecnica y comercial ", cajaMensaje.containsText(mensaje));
    }

    public void comparaValorAseguradoTotal() {
        MatcherAssert.assertThat("Los valor final no corresponde al calculado", comparaValores[0].equals(comparaValores[1]));
    }

    public void validarInteresAdicionalPEP() {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
        waitUntil(1500);
    }

    public void validarMensajePEPInteresAdicional(String mensaje) {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(grupoMensajes).shouldBePresent();
        MatcherAssert.assertThat(grupoMensajes.getText(), Matchers.containsString(mensaje));
        waitUntil(2000);
    }

    public void permitirContinuarCotizacion() {
        waitUntil(2000);
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonSiguiente).click();
        waitUntil(1000);
        WebElementFacade labelCoberturasAuto = findBy(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PersonalAutoScreen:ttlBar']");
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(labelCoberturasAuto).click();
    }
}

