package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.commons.selenium.Commons;

import java.util.Map;

import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

public class OpcionesResumenCuentaPage extends Commons {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesResumenCuentaPage.class);
    Actions act = new Actions(getDriver());
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:ttlBar']")
    private WebElementFacade lblResumenCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade lblTipoDoc;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade lblNumDoc;
    @FindBy(xpath = ".//span[contains(.,'Código de agente')]")
    private WebElementFacade lblCodAgente;
    @FindBy(xpath = ".//span[contains(.,'Descripción')]")
    private WebElementFacade lblDescAgente;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-labelEl']")
    private WebElementFacade lblNumCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountStatus-labelEl']")
    private WebElementFacade lblEstadoCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:0']")
    private WebElementFacade lblTipoPersona;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    private WebElementFacade lblRazonSocial;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    private WebElementFacade lblNombreComercial;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-labelEl']")
    private WebElementFacade lblActComercial;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-labelEl']")
    private WebElementFacade lblNumEmpleados;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade lblTelOficina;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:EmailAddress1-labelEl']")
    private WebElementFacade lblEmailEmpresa;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl']")
    private WebElementFacade lblEmailPersona;
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Segmentation-labelEl')]")
    private WebElementFacade lblSegmentacionPer;
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:Segmentation-labelEl')]")
    private WebElementFacade lblSegmentacionJur;
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:Behavior-labelEl')]")
    private WebElementFacade lblComportamientoJur;
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Behavior-labelEl')]")
    private WebElementFacade lblComportamientoPer;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    private WebElementFacade lblDireccion;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    private WebElementFacade lblPrimerNombre;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    private WebElementFacade lblSegundoNombre;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    private WebElementFacade lblPrimerApellido;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    private WebElementFacade lblSegundoApellido;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-labelEl']")
    private WebElementFacade lblFechaNac;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-labelEl']")
    private WebElementFacade lblEstadoCivil;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-labelEl']")
    private WebElementFacade lblProfesion;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    private WebElementFacade lblSexo;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DeathCause-labelEl']")
    private WebElementFacade lblCausaMuerte;
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfDeath-labelEl')]")
    private WebElementFacade lblFechaFallecimiento;
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl')]")
    private WebElementFacade lblTipoTel;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
    private WebElementFacade txtTipoTel;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelResidencial;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelTrabajo;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelCelular;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade lblTelResidencial;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade lblTelTrabajo;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade lblTelCelular;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:0']")
    private WebElementFacade lblActividades;
    @FindBy(xpath = ".//span[contains(.,'Fecha de vencimiento')]")
    private WebElementFacade lblFechaVencAct;
    @FindBy(xpath = ".//span[contains(.,'Prioridad')]")
    private WebElementFacade lblPrioridadAct;
    @FindBy(xpath = ".//span[contains(.,'Tema')]")
    private WebElementFacade lblTemaAct;
    @FindBy(xpath = ".//span[contains(.,'Asignado a')]")
    private WebElementFacade lblAsignadoAct;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:1']")
    private WebElementFacade lblTerminosPol;
    @FindBy(xpath = ".//tr[6]/td/div/div[2]/div/div/div/div")
    private WebElementFacade lblNumPoliza;
    @FindBy(xpath = ".//tr[6]/td/div/div[2]/div/div/div[2]/div")
    private WebElementFacade lblProducto;
    @FindBy(xpath = ".//tr[6]/td/div/div[2]/div/div/div[3]/div")
    private WebElementFacade lblEstadoPol;
    @FindBy(xpath = ".//tr[6]/td/div/div[2]/div/div/div[4]/div")
    private WebElementFacade lblFechaVigPol;
    @FindBy(xpath = ".//div[5]/div")
    private WebElementFacade lblFechaExpPol;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:2']")
    private WebElementFacade lblTransPolPendientes;
    @FindBy(xpath = ".//div[3]/div/div/div[2]/div")
    private WebElementFacade lblNumTrans;
    @FindBy(xpath = ".//div[3]/div/div/div[3]/div")
    private WebElementFacade lblEstadoTrans;
    @FindBy(xpath = ".//div[3]/div/div/div[4]/div")
    private WebElementFacade lblNumPolTrans;
    @FindBy(xpath = ".//div[3]/div/div/div[5]/div")
    private WebElementFacade lblProductoTrans;

    @FindBy(xpath = ".//div[6]/div")
    private WebElementFacade lblTipoTrans;

    @FindBy(xpath = ".//div[7]/div")
    private WebElementFacade lblAseguradorTrans;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnInnerEl']")
    private WebElementFacade btnEditarCuenta;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    private WebElementFacade txtPrimerNombre;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade txtSegundoNombre;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    private WebElementFacade txtPrimerApellido;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    private WebElementFacade txtSegundoApellido;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-inputEl']")
    private WebElementFacade txtEstadoCivil;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-inputEl']")
    private WebElementFacade txtProfesion;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-inputEl']")
    private WebElementFacade txtTipoFamilia;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-inputEl']")
    private WebElementFacade txtEmailPrimario;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress2-inputEl']")
    private WebElementFacade txtEmailSecundario;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    private WebElementFacade txtRazonSocial;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    private WebElementFacade txtNombreComercial;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Activity-inputEl']")
    private WebElementFacade txtActEconomica;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-inputEl']")
    private WebElementFacade txtNumEmpleados;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Assets-inputEl']")
    private WebElementFacade txtValorActivos;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-inputEl']")
    private WebElementFacade txtVentasAnuales;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelOficina;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:EmailAddress1-inputEl']")
    private WebElementFacade txtEmailPrimarioCompania;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:EmailAddress2-inputEl']")
    private WebElementFacade txtEmailSecundarioCompania;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade txtPais;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamento;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudad;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccion;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressDescription-inputEl']")
    private WebElementFacade txtDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
    private WebElementFacade labelTipoTelefono;
    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;

    private static final String VALIDAREDITABLES = "input";

    public OpcionesResumenCuentaPage(WebDriver driver) {
        super(driver);
    }

    public void verInfoResumenCuenta(Map<String, String> infoResumenCuenta) {
        waitForTextToAppear("Resumen de la cuenta", 2000);
        MatcherAssert.assertThat(lblResumenCuenta.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("lblResumenCuenta"))));
        MatcherAssert.assertThat(lblTipoDoc.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("tipoDocumento"))));
        MatcherAssert.assertThat(lblNumDoc.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("numDocumento"))));
        MatcherAssert.assertThat(lblCodAgente.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("codigoAgente"))));
        MatcherAssert.assertThat(lblDescAgente.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("descAgente"))));
        MatcherAssert.assertThat(lblNumCuenta.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("numCuenta"))));
        MatcherAssert.assertThat(lblEstadoCuenta.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("estadoCuenta"))));

        if (lblTipoPersona.getText().compareTo(infoResumenCuenta.get("lblPersonaJuridica")) == 0) {
            MatcherAssert.assertThat(lblTipoPersona.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("lblPersonaJuridica"))));
            MatcherAssert.assertThat(lblRazonSocial.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("razonSocial"))));
            MatcherAssert.assertThat(lblNombreComercial.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("nombreComercial"))));
            MatcherAssert.assertThat(lblEmailEmpresa.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("emailEmpresa"))));
            MatcherAssert.assertThat(lblActComercial.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("actComercial"))));
            MatcherAssert.assertThat(lblNumEmpleados.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("numEmpleados"))));
            MatcherAssert.assertThat(lblTelOficina.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("telOficina"))));
            MatcherAssert.assertThat(lblSegmentacionJur.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("segmentacion"))));
            MatcherAssert.assertThat(lblComportamientoJur.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("comportamiento"))));
        } else if (lblTipoPersona.getText().compareTo(infoResumenCuenta.get("lblPersonaNatural")) == 0) {
            MatcherAssert.assertThat(lblTipoPersona.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("lblPersonaNatural"))));
            MatcherAssert.assertThat(lblPrimerNombre.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("primerNombre"))));
            MatcherAssert.assertThat(lblSegundoNombre.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("segundoNombre"))));
            MatcherAssert.assertThat(lblPrimerApellido.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("primerApellido"))));
            MatcherAssert.assertThat(lblSegundoApellido.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("segundoApellido"))));
            MatcherAssert.assertThat(lblFechaNac.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("fechaNac"))));
            MatcherAssert.assertThat(lblEstadoCivil.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("estadoCivil"))));
            MatcherAssert.assertThat(lblProfesion.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("profesion"))));
            MatcherAssert.assertThat(lblSexo.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("sexo"))));
            MatcherAssert.assertThat(lblEmailPersona.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("emailPersona"))));
            MatcherAssert.assertThat(lblCausaMuerte.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("causaMuerte"))));
            MatcherAssert.assertThat(lblFechaFallecimiento.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("fechaFallecimiento"))));
            MatcherAssert.assertThat(lblSegmentacionPer.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("segmentacion"))));
            MatcherAssert.assertThat(lblComportamientoPer.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("comportamiento"))));
            MatcherAssert.assertThat(lblTipoTel.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("tipoTel"))));

            if (labelTipoTelefono.getText().compareTo("Vivienda") == 0) {
                MatcherAssert.assertThat(lblTelResidencial.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("telResidencial"))));
                MatcherAssert.assertThat(lblTelCelular.isCurrentlyVisible(), Is.is(Matchers.equalTo(false)));
                MatcherAssert.assertThat(lblTelTrabajo.isCurrentlyVisible(), Is.is(Matchers.equalTo(false)));
            } else if (labelTipoTelefono.getText().compareTo("Trabajo") == 0) {
                MatcherAssert.assertThat(lblTelTrabajo.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("telTrabajo"))));
            } else if (labelTipoTelefono.getText().compareTo("Movil") == 0) {
                MatcherAssert.assertThat(lblTelCelular.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("telCelular"))));
            }
        }
        MatcherAssert.assertThat(lblDireccion.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("direccion"))));
        MatcherAssert.assertThat(lblActividades.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("lblActividades"))));
        MatcherAssert.assertThat(lblFechaVencAct.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("fechaVencimiento"))));
        MatcherAssert.assertThat(lblPrioridadAct.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("prioridadAct"))));
        MatcherAssert.assertThat(lblTemaAct.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("temaAct"))));
        MatcherAssert.assertThat(lblAsignadoAct.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("asignadoAct"))));
        MatcherAssert.assertThat(lblTerminosPol.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("lblTerminosPol"))));
        MatcherAssert.assertThat(lblNumPoliza.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("numPoliza"))));
        MatcherAssert.assertThat(lblProducto.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("producto"))));
        MatcherAssert.assertThat(lblEstadoPol.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("estadoPol"))));
        MatcherAssert.assertThat(lblFechaVigPol.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("fechaVigPol"))));
        MatcherAssert.assertThat(lblFechaExpPol.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("fechaExpPol"))));
        MatcherAssert.assertThat(lblTransPolPendientes.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("lblTransPolPendientes"))));
        MatcherAssert.assertThat(lblNumTrans.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("numTrans"))));
        MatcherAssert.assertThat(lblEstadoTrans.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("estadoTrans"))));
        MatcherAssert.assertThat(lblNumPolTrans.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("numPolTrans"))));
        MatcherAssert.assertThat(lblProductoTrans.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("productoTrans"))));
        MatcherAssert.assertThat(lblTipoTrans.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("tipoTrans"))));
        MatcherAssert.assertThat(lblAseguradorTrans.getText(), Is.is(Matchers.equalTo(infoResumenCuenta.get("aseguradorTrans"))));
    }

    public void editarResumenCuenta() {
        waitABit(1500);
        waitFor(btnEditarCuenta).shouldBeVisible();
        btnEditarCuenta.click();
    }

    public void validarCamposEditablesPersona() {
        waitForTextToAppear("Editar cuenta", 1000);
        MatcherAssert.assertThat(txtPrimerNombre.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtSegundoNombre.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtPrimerApellido.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtSegundoApellido.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtProfesion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtEstadoCivil.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTipoFamilia.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtEmailPrimario.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtEmailSecundario.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTipoTel.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTelResidencial.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTelTrabajo.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTelCelular.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtPais.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtDepartamento.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtCiudad.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtDireccion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTipoDireccion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtDescripcionDireccion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
    }

    public void validarCamposEditablesCompania() {
        waitForTextToAppear("Editar cuenta", 1000);
        MatcherAssert.assertThat(txtRazonSocial.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtNombreComercial.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtActEconomica.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtNumEmpleados.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtValorActivos.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtVentasAnuales.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTelOficina.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtEmailPrimarioCompania.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtEmailSecundarioCompania.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtPais.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtDepartamento.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtCiudad.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtDireccion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtTipoDireccion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
        MatcherAssert.assertThat(txtDescripcionDireccion.getTagName(), Is.is(Matchers.equalTo(VALIDAREDITABLES)));
    }

    public void actualizarCuenta() {
        btnActualizar.click();
    }

    public void editarPais(String pais) {
        waitForTextToAppear("Editar cuenta", 2000);
        waitFor(txtPais).shouldBeVisible();
        txtPais.click();
        WebElementFacade itmPais = findBy(".//li[contains(.,'" + pais + "')]");
        itmPais.click();
        waitABit(3000);
    }

    public void validarDepartamento(String departamento) {
        waitABit(4000);
        waitFor(txtDepartamento).shouldBeVisible();
        MatcherAssert.assertThat(txtDepartamento.getText(), Is.is(Matchers.equalTo(departamento)));
    }

    public void editarDepto(String departamento) {
        waitFor(txtDepartamento).shouldBeVisible();
        txtDepartamento.click();
        WebElementFacade itmDepto = findBy(".//li[contains(.,'" + departamento + "')]");
        itmDepto.click();
        waitABit(3000);
    }

    public void validarCiudad(String ciudad) {
        waitABit(4000);
        waitFor(txtCiudad).shouldBeVisible();
        MatcherAssert.assertThat(txtCiudad.getText(), Is.is(Matchers.equalTo(ciudad)));
    }
}
