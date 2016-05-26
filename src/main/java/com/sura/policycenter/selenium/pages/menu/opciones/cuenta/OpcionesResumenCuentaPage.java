package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

public class OpcionesResumenCuentaPage extends Guidewire {

    public OpcionesResumenCuentaPage(WebDriver driver) {
        super(driver);
    }

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:ttlBar']")
    private WebElementFacade lblResumenCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade lblTipoDoc;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade lblNumDoc;

    @FindBy(xpath = ".//span[contains(.,'Código de agente')]")
    private WebElementFacade lblCodAgente;

    @FindBy(xpath = "//span[contains(.,'Descripción')]")
    private WebElementFacade lblDescAgente;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-labelEl']")
    private WebElementFacade lblNumCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountStatus-labelEl']")
    private WebElementFacade lblEstadoCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:0']")
    //@FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:0']")
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

    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Segmentation-labelEl')]")
    private WebElementFacade lblSegmentacionPer;

    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:Segmentation-labelEl')]")
    private WebElementFacade lblSegmentacionJur;

    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:Behavior-labelEl')]")
    private WebElementFacade lblComportamientoJur;

    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Behavior-labelEl')]")
    private WebElementFacade lblComportamientoPer;

    //@FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    private WebElementFacade lblDireccion;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:AddressType-labelEl']")
    private WebElementFacade lblTipoDireccion;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:AddressDescription-labelEl']")
    private WebElementFacade lblDescDireccion;

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

    @FindBy(xpath = "//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    private WebElementFacade lblSexo;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DeathCause-labelEl']")
    private WebElementFacade lblCausaMuerte;

    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfDeath-labelEl')]")
    private WebElementFacade lblFechaFallecimiento;

    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl')]")
    private WebElementFacade lblTipoTel;

    @FindBy(xpath = "//div[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl')]")
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

    @FindBy(xpath = "//span[contains(.,'Fecha de vencimiento')]")
    private WebElementFacade lblFechaVencAct;

    @FindBy(xpath = "//span[contains(.,'Prioridad')]")
    private WebElementFacade lblPrioridadAct;

    @FindBy(xpath = "//span[contains(.,'Tema')]")
    private WebElementFacade lblTemaAct;

    @FindBy(xpath = "//span[contains(.,'Asignado a')]")
    private WebElementFacade lblAsignadoAct;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:1']")
    private WebElementFacade lblTerminosPol;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div/div")
    private WebElementFacade lblNumPoliza;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div[2]/div")
    private WebElementFacade lblProducto;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div[3]/div")
    private WebElementFacade lblEstadoPol;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div[4]/div")
    private WebElementFacade lblFechaVigPol;

    @FindBy(xpath = "//div[5]/div")
    private WebElementFacade lblFechaExpPol;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:2']")
    private WebElementFacade lblTransPolPendientes;

    @FindBy(xpath = "//div[3]/div/div/div[2]/div")
    private WebElementFacade lblNumTrans;

    @FindBy(xpath = "//div[3]/div/div/div[3]/div")
    private WebElementFacade lblEstadoTrans;

    @FindBy(xpath = "//div[3]/div/div/div[4]/div")
    private WebElementFacade lblNumPolTrans;

    @FindBy(xpath = "//div[3]/div/div/div[5]/div")
    private WebElementFacade lblProductoTrans;

    @FindBy(xpath = "//div[6]/div")
    private WebElementFacade lblTipoTrans;

    @FindBy(xpath = "//div[7]/div")
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

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfDeath-inputEl']")
    private WebElementFacade txtFechaFallecimiento;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DeathCause-inputEl']")
    private WebElementFacade txtCausaFallecimiento;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-inputEl']")
    private WebElementFacade txtTipoFamilia;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EconomyDependents-inputEl']")
    private WebElementFacade txtDependientesEconomicos;

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

    @FindBy(xpath = "//tr[15]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade btnPais;

    @FindBy(xpath = "//tr[21]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    private WebElementFacade btnDepto;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade txtPais;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade txtDepartamento;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade txtCiudad;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
    private WebElementFacade txtCodigoPostal;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressType-inputEl']")
    private WebElementFacade txtTipoDireccion;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressDescription-inputEl']")
    private WebElementFacade txtDescripcionDireccion;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesResumenCuentaPage.class);

    public void verInfoResumenCuenta(Map<String, String> infoResumenCuenta) {

        String validacion = null;

        try {
            assertThat(lblResumenCuenta.getText(), is(equalTo(infoResumenCuenta.get("lblResumenCuenta"))));
            assertThat(lblTipoDoc.getText(), is(equalTo(infoResumenCuenta.get("tipoDocumento"))));
            assertThat(lblNumDoc.getText(), is(equalTo(infoResumenCuenta.get("numDocumento"))));
            assertThat(lblCodAgente.getText(), is(equalTo(infoResumenCuenta.get("codigoAgente"))));
            assertThat(lblDescAgente.getText(), is(equalTo(infoResumenCuenta.get("descAgente"))));
            assertThat(lblNumCuenta.getText(), is(equalTo(infoResumenCuenta.get("numCuenta"))));
            assertThat(lblEstadoCuenta.getText(), is(equalTo(infoResumenCuenta.get("estadoCuenta"))));

            if (lblTipoPersona.getText().compareTo(infoResumenCuenta.get("lblPersonaJuridica")) == 0) {
                assertThat(lblTipoPersona.getText(), is(equalTo(infoResumenCuenta.get("lblPersonaJuridica"))));
                assertThat(lblRazonSocial.getText(), is(equalTo(infoResumenCuenta.get("razonSocial"))));
                assertThat(lblNombreComercial.getText(), is(equalTo(infoResumenCuenta.get("nombreComercial"))));
                assertThat(lblEmailEmpresa.getText(), is(equalTo(infoResumenCuenta.get("emailEmpresa"))));
                assertThat(lblActComercial.getText(), is(equalTo(infoResumenCuenta.get("actComercial"))));
                assertThat(lblNumEmpleados.getText(), is(equalTo(infoResumenCuenta.get("numEmpleados"))));
                assertThat(lblTelOficina.getText(), is(equalTo(infoResumenCuenta.get("telOficina"))));
                assertThat(lblSegmentacionJur.getText(), is(equalTo(infoResumenCuenta.get("segmentacion"))));
                assertThat(lblComportamientoJur.getText(), is(equalTo(infoResumenCuenta.get("comportamiento"))));
            } else if (lblTipoPersona.getText().compareTo(infoResumenCuenta.get("lblPersonaNatural")) == 0) {
                assertThat(lblTipoPersona.getText(), is(equalTo(infoResumenCuenta.get("lblPersonaNatural"))));
                assertThat(lblPrimerNombre.getText(), is(equalTo(infoResumenCuenta.get("primerNombre"))));
                assertThat(lblSegundoNombre.getText(), is(equalTo(infoResumenCuenta.get("segundoNombre"))));
                assertThat(lblPrimerApellido.getText(), is(equalTo(infoResumenCuenta.get("primerApellido"))));
                assertThat(lblSegundoApellido.getText(), is(equalTo(infoResumenCuenta.get("segundoApellido"))));
                assertThat(lblFechaNac.getText(), is(equalTo(infoResumenCuenta.get("fechaNac"))));
                assertThat(lblEstadoCivil.getText(), is(equalTo(infoResumenCuenta.get("estadoCivil"))));
                assertThat(lblProfesion.getText(), is(equalTo(infoResumenCuenta.get("profesion"))));
                assertThat(lblSexo.getText(), is(equalTo(infoResumenCuenta.get("sexo"))));
                assertThat(lblEmailPersona.getText(), is(equalTo(infoResumenCuenta.get("emailPersona"))));
                assertThat(lblCausaMuerte.getText(), is(equalTo(infoResumenCuenta.get("causaMuerte"))));
                assertThat(lblFechaFallecimiento.getText(), is(equalTo(infoResumenCuenta.get("fechaFallecimiento"))));
                assertThat(lblSegmentacionPer.getText(), is(equalTo(infoResumenCuenta.get("segmentacion"))));
                assertThat(lblComportamientoPer.getText(), is(equalTo(infoResumenCuenta.get("comportamiento"))));
                assertThat(lblTipoTel.getText(), is(equalTo(infoResumenCuenta.get("tipoTel"))));

                if(txtTipoTel.getText().compareTo("Vivienda") == 0){
                    assertThat(lblTelResidencial.getText(), is(equalTo(infoResumenCuenta.get("telResidencial"))));
                    assertThat(lblTelCelular.isCurrentlyVisible(), is(equalTo(false)));
                    assertThat(lblTelTrabajo.isCurrentlyVisible(), is(equalTo(false)));
                }
                else if(txtTipoTel.getText().compareTo("Trabajo") == 0){
                    assertThat(lblTelTrabajo.getText(), is(equalTo(infoResumenCuenta.get("telTrabajo"))));
                }
                else if(txtTipoTel.getText().compareTo("Movil") == 0){
                    assertThat(lblTelCelular.getText(), is(equalTo(infoResumenCuenta.get("telCelular"))));
                }
            }

            assertThat(lblDireccion.getText(), is(equalTo(infoResumenCuenta.get("direccion"))));
            assertThat(lblActividades.getText(), is(equalTo(infoResumenCuenta.get("lblActividades"))));
            assertThat(lblFechaVencAct.getText(), is(equalTo(infoResumenCuenta.get("fechaVencimiento"))));
            assertThat(lblPrioridadAct.getText(), is(equalTo(infoResumenCuenta.get("prioridadAct"))));
            assertThat(lblTemaAct.getText(), is(equalTo(infoResumenCuenta.get("temaAct"))));
            assertThat(lblAsignadoAct.getText(), is(equalTo(infoResumenCuenta.get("asignadoAct"))));
            assertThat(lblTerminosPol.getText(), is(equalTo(infoResumenCuenta.get("lblTerminosPol"))));
            assertThat(lblNumPoliza.getText(), is(equalTo(infoResumenCuenta.get("numPoliza"))));
            assertThat(lblProducto.getText(), is(equalTo(infoResumenCuenta.get("producto"))));
            assertThat(lblEstadoPol.getText(), is(equalTo(infoResumenCuenta.get("estadoPol"))));
            assertThat(lblFechaVigPol.getText(), is(equalTo(infoResumenCuenta.get("fechaVigPol"))));
            assertThat(lblFechaExpPol.getText(), is(equalTo(infoResumenCuenta.get("fechaExpPol"))));
            assertThat(lblTransPolPendientes.getText(), is(equalTo(infoResumenCuenta.get("lblTransPolPendientes"))));
            assertThat(lblNumTrans.getText(), is(equalTo(infoResumenCuenta.get("numTrans"))));
            assertThat(lblEstadoTrans.getText(), is(equalTo(infoResumenCuenta.get("estadoTrans"))));
            assertThat(lblNumPolTrans.getText(), is(equalTo(infoResumenCuenta.get("numPolTrans"))));
            assertThat(lblProductoTrans.getText(), is(equalTo(infoResumenCuenta.get("productoTrans"))));
            assertThat(lblTipoTrans.getText(), is(equalTo(infoResumenCuenta.get("tipoTrans"))));
            assertThat(lblAseguradorTrans.getText(), is(equalTo(infoResumenCuenta.get("aseguradorTrans"))));
        } catch (Exception e) {
            LOGGER.error("This is error", e);
            validacion = e.getMessage();
        }

        assertThat(validacion, is(equalTo(null)));
    }

    public void editarResumenCuenta() {
        try {
            btnEditarCuenta.click();
        } catch (Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void validarCamposEditablesPersona() {
        try {
            assertThat(txtPrimerNombre.getTagName(), is(equalTo("input")));
            assertThat(txtSegundoNombre.getTagName(), is(equalTo("input")));
            assertThat(txtPrimerApellido.getTagName(), is(equalTo("input")));
            assertThat(txtSegundoApellido.getTagName(), is(equalTo("input")));
            assertThat(txtProfesion.getTagName(), is(equalTo("input")));
            assertThat(txtEstadoCivil.getTagName(), is(equalTo("input")));
            assertThat(txtFechaFallecimiento.getTagName(), is(equalTo("input")));
            assertThat(txtCausaFallecimiento.getTagName(), is(equalTo("input")));
            assertThat(txtTipoFamilia.getTagName(), is(equalTo("input")));
            assertThat(txtDependientesEconomicos.getTagName(), is(equalTo("input")));
            assertThat(txtEmailPrimario.getTagName(), is(equalTo("input")));
            assertThat(txtEmailSecundario.getTagName(), is(equalTo("input")));
            assertThat(txtTipoTel.getTagName(), is(equalTo("input")));
            assertThat(txtTelResidencial.getTagName(), is(equalTo("input")));
            assertThat(txtTelTrabajo.getTagName(), is(equalTo("input")));
            assertThat(txtTelCelular.getTagName(), is(equalTo("input")));
            assertThat(txtPais.getTagName(), is(equalTo("input")));
            assertThat(txtDepartamento.getTagName(), is(equalTo("input")));
            assertThat(txtCiudad.getTagName(), is(equalTo("input")));
            assertThat(txtDireccion.getTagName(), is(equalTo("input")));
            assertThat(txtCodigoPostal.getTagName(), is(equalTo("input")));
            assertThat(txtTipoDireccion.getTagName(), is(equalTo("input")));
            assertThat(txtDescripcionDireccion.getTagName(), is(equalTo("input")));
        } catch (Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void validarCamposEditablesCompania() {
        try {
            assertThat(txtRazonSocial.getTagName(), is(equalTo("input")));
            assertThat(txtNombreComercial.getTagName(), is(equalTo("input")));
            assertThat(txtActEconomica.getTagName(), is(equalTo("input")));
            assertThat(txtNumEmpleados.getTagName(), is(equalTo("input")));
            assertThat(txtValorActivos.getTagName(), is(equalTo("input")));
            assertThat(txtVentasAnuales.getTagName(), is(equalTo("input")));
            assertThat(txtTelOficina.getTagName(), is(equalTo("input")));
            assertThat(txtEmailPrimarioCompania.getTagName(), is(equalTo("input")));
            assertThat(txtEmailSecundarioCompania.getTagName(), is(equalTo("input")));
            assertThat(txtPais.getTagName(), is(equalTo("input")));
            assertThat(txtDepartamento.getTagName(), is(equalTo("input")));
            assertThat(txtCiudad.getTagName(), is(equalTo("input")));
            assertThat(txtDireccion.getTagName(), is(equalTo("input")));
            assertThat(txtCodigoPostal.getTagName(), is(equalTo("input")));
            assertThat(txtTipoDireccion.getTagName(), is(equalTo("input")));
            assertThat(txtDescripcionDireccion.getTagName(), is(equalTo("input")));
        } catch (Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void actualizarCuenta() {
        try {
            btnActualizar.click();
        } catch (Exception e) {
            LOGGER.error("This is error", e);
        }
    }

    public void editarPais(String pais) {
        waitABit(2000);
        txtPais.click();
        WebElementFacade itmPais = findBy(".//li[contains(.,'"+pais+"')]");
        itmPais.click();
        waitABit(3000);
    }

    public void validarDepartamento(String departamento) {
        try {
            waitABit(4000);
            assertThat(txtDepartamento.getText(), is(equalTo(departamento)));
        }catch (Exception e){
            LOGGER.error("This is error", e);
        }
    }

    public void editarDepto(String departamento) {
        waitABit(1000);
        txtDepartamento.click();
        WebElementFacade itmDepto = findBy(".//li[contains(.,'"+departamento+"')]");
        itmDepto.click();
        waitABit(3000);
    }

    public void validarCiudad(String ciudad) {
        try {
            waitABit(4000);
            assertThat(txtCiudad.getText(), is(equalTo(ciudad)));
        }catch (Exception e){
            LOGGER.error("This is error", e);
        }
    }
}