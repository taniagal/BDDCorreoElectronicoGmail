package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaPage;

import java.util.Map;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;


public class ConsultaDetalleDeAseguradosPage extends PageObject {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesInformacionPolizaPage.class);
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:DocumentType-inputEl']")
    WebElementFacade campoTipoDocumento;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    WebElementFacade campoNumeroDocumento;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade campoPrimerNombre;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    WebElementFacade campoSegundoNombre;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade campoPrimerApellido;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    WebElementFacade campoSegundoApellido;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:DateOfBirth-inputEl']")
    WebElementFacade campoFechaDeNacimiento;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:MaritalStatus-inputEl']")
    WebElementFacade campoEstadoCivil;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:PrimaryPhone-inputEl']")
    WebElementFacade campoTelefonoResidencia;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade campoCelular;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress1-inputEl']")
    WebElementFacade campoCorreoPrimario;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:PolicyContactRoleNameInputSet:EmailAddress2-inputEl']")
    WebElementFacade campoCorreoSecundario;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-inputEl']")
    WebElementFacade campoDireccion;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressType-inputEl']")
    WebElementFacade campoTipoDireccion;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:AddressDescription-inputEl']")
    WebElementFacade campoDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='PolicyFile_PersonalAuto_Drivers:PolicyFile_PersonalAuto_DriversScreen:PADriversPanelSet:DriversListDetailPanel:DriverDetailsCV:PolicyContactDetailsDV:ContactCurrency:ContactCurrencyInputSet:PreferredSettlementCurrency-inputEl']")
    WebElementFacade campoMonedaPreferida;

    public ConsultaDetalleDeAseguradosPage(WebDriver driver) {
        super(driver);
    }

    public void validarDetalleDeRiesgo(ExamplesTable datosAsegurado) {
        Map<String, String> asegurados = datosAsegurado.getRows().get(0);
        waitFor(campoTipoDocumento);
        try {
            MatcherAssert.assertThat(campoTipoDocumento.getText(), Is.is(Matchers.equalTo(asegurados.get("tipoIdentificacion"))));
            MatcherAssert.assertThat(campoNumeroDocumento.getText(), Is.is(Matchers.equalTo(asegurados.get("numeroIdentificacion"))));
            MatcherAssert.assertThat(campoPrimerNombre.getText(), Is.is(Matchers.equalTo(asegurados.get("primerNombre"))));
            MatcherAssert.assertThat(campoSegundoNombre.getText(), Is.is(Matchers.equalTo(asegurados.get("segundoNombre"))));
            MatcherAssert.assertThat(campoPrimerApellido.getText(), Is.is(Matchers.equalTo(asegurados.get("primerApellido"))));
            MatcherAssert.assertThat(campoSegundoApellido.getText(), Is.is(Matchers.equalTo(asegurados.get("segundoApellido"))));
            MatcherAssert.assertThat(campoFechaDeNacimiento.getText(), Is.is(Matchers.equalTo(asegurados.get("fechaNacimiento"))));
            MatcherAssert.assertThat(campoEstadoCivil.getText(), Is.is(Matchers.equalTo(asegurados.get("estadoCivil"))));
            MatcherAssert.assertThat(campoTelefonoResidencia.getText(), Is.is(Matchers.equalTo(asegurados.get("telefonoResidencia"))));
            MatcherAssert.assertThat(campoCelular.getText(), Is.is(Matchers.equalTo(asegurados.get("celular"))));
            MatcherAssert.assertThat(campoCorreoPrimario.getText(), Is.is(Matchers.equalTo(asegurados.get("correoPrimario"))));
            MatcherAssert.assertThat(campoCorreoSecundario.getText(), Is.is(Matchers.equalTo(asegurados.get("correoSecundario"))));
            MatcherAssert.assertThat(campoDireccion.getText(), Is.is(Matchers.equalTo(asegurados.get("direccion"))));
            MatcherAssert.assertThat(campoTipoDireccion.getText(), Is.is(Matchers.equalTo(asegurados.get("tipoDireccion"))));
            MatcherAssert.assertThat(campoDescripcionDireccion.getText(), Is.is(Matchers.equalTo(asegurados.get("descripcionDireccion"))));
            MatcherAssert.assertThat(campoMonedaPreferida.getText(), Is.is(Matchers.equalTo(asegurados.get("moneda"))));
        } catch (AssertionError assertionError) {
            LOGGER.error("Algún elemento de la pantalla no es válido", assertionError);
        }
    }
}
