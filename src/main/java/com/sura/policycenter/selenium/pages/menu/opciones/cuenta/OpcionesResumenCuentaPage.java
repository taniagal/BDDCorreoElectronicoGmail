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

/**
 * Created by diegcaac on 18/05/2016.
 */
public class OpcionesResumenCuentaPage extends Guidewire {

    public OpcionesResumenCuentaPage(WebDriver driver) {
        super(driver);
    }

    Actions act = new Actions(getDriver());

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:ttlBar']")
    WebElementFacade lblResumenCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:0']")
    WebElementFacade lblIdOficiales;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:DocumentType-labelEl']")
    WebElementFacade lblTipoDoc;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    WebElementFacade lblNumDoc;

    @FindBy(xpath = ".//span[contains(.,'Código de agente')]")
    WebElementFacade lblCodAgente;

    @FindBy(xpath = "//span[contains(.,'Descripción')]")
    WebElementFacade lblDescAgente;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-labelEl']")
    WebElementFacade lblNumCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountStatus-labelEl']")
    WebElementFacade lblEstadoCuenta;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:0']")
    WebElementFacade lblTipoPersona;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    WebElementFacade lblRazonSocial;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    WebElementFacade lblNombreComercial;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-labelEl']")
    WebElementFacade lblActComercial;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-labelEl']")
    WebElementFacade lblNumEmpleados;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblTelOficina;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:EmailAddress1-labelEl']")
    WebElementFacade lblEmailEmpresa;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl']")
    WebElementFacade lblEmailPersona;

    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Segmentation-labelEl')]")
    WebElementFacade lblSegmentacionPer;

    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:Segmentation-labelEl')]")
    WebElementFacade lblSegmentacionJur;

    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:Behavior-labelEl')]")
    WebElementFacade lblComportamientoJur;

    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Behavior-labelEl')]")
    WebElementFacade lblComportamientoPer;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:globalAddressContainer:GlobalAddressInputSet:AddressSummary-labelEl']")
    WebElementFacade lblDireccion;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:AddressType-labelEl']")
    WebElementFacade lblTipoDireccion;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AddressShortInputSet:AddressDescription-labelEl']")
    WebElementFacade lblDescDireccion;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    WebElementFacade lblSegundoNombre;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    WebElementFacade lblPrimerApellido;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    WebElementFacade lblSegundoApellido;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-labelEl']")
    WebElementFacade lblFechaNac;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-labelEl']")
    WebElementFacade lblEstadoCivil;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-labelEl']")
    WebElementFacade lblProfesion;

    @FindBy(xpath = "//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    WebElementFacade lblSexo;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DeathCause-labelEl']")
    WebElementFacade lblCausaMuerte;

    //@FindBy(xpath = "[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfDeath-labelEl']")
    @FindBy(xpath = "//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfDeath-labelEl')]")
    WebElementFacade lblFechaFallecimiento;

    //@FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl']")
    @FindBy(xpath = ".//label[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl')]")
    WebElementFacade lblTipoTel;

    //@FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
    @FindBy(xpath = "//div[contains(@id,'BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl')]")
    WebElementFacade txtTipoTel;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblTelResidencial;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblTelTrabajo;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblTelCelular;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:0']")
    WebElementFacade lblActividades;

    @FindBy(xpath = "//span[contains(.,'Fecha de vencimiento')]")
    WebElementFacade lblFechaVencAct;

    @FindBy(xpath = "//span[contains(.,'Prioridad')]")
    WebElementFacade lblPrioridadAct;

    @FindBy(xpath = "//span[contains(.,'Tema')]")
    WebElementFacade lblTemaAct;

    @FindBy(xpath = "//span[contains(.,'Asignado a')]")
    WebElementFacade lblAsignadoAct;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:1']")
    WebElementFacade lblTerminosPol;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div/div")
    WebElementFacade lblNumPoliza;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div[2]/div")
    WebElementFacade lblProducto;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div[3]/div")
    WebElementFacade lblEstadoPol;

    @FindBy(xpath = "//tr[6]/td/div/div[2]/div/div/div[4]/div")
    WebElementFacade lblFechaVigPol;

    @FindBy(xpath = "//div[5]/div")
    WebElementFacade lblFechaExpPol;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:2']")
    WebElementFacade lblTransPolPendientes;

    @FindBy(xpath = "//div[3]/div/div/div[2]/div")
    WebElementFacade lblNumTrans;

    @FindBy(xpath = "//div[3]/div/div/div[3]/div")
    WebElementFacade lblEstadoTrans;

    @FindBy(xpath = "//div[3]/div/div/div[4]/div")
    WebElementFacade lblNumPolTrans;

    @FindBy(xpath = "//div[3]/div/div/div[5]/div")
    WebElementFacade lblProductoTrans;

    @FindBy(xpath = "//div[6]/div")
    WebElementFacade lblTipoTrans;

    @FindBy(xpath = "//div[7]/div")
    WebElementFacade lblAseguradorTrans;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:EditAccount-btnInnerEl']")
    WebElementFacade btnEditarCuenta;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    WebElementFacade txtSegundoNombre;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    WebElementFacade txtSegundoApellido;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-inputEl']")
    WebElementFacade txtEstadoCivil;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-inputEl']")
    WebElementFacade txtProfesion;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-inputEl']")
    WebElementFacade txtEmail;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtRazonSocial;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    WebElementFacade txtNombreComercial;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Activity-inputEl']")
    WebElementFacade txtActEconomica;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-inputEl']")
    WebElementFacade txtNumEmpleados;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:Assets-inputEl']")
    WebElementFacade txtValorActivos;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-inputEl']")
    WebElementFacade txtVentasAnuales;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    WebElementFacade txtTelOficina;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:ContactNameInputSet:EmailAddress1-inputEl']")
    WebElementFacade txtEmailCompania;

    @FindBy(xpath = "//tr[15]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    WebElementFacade btnPais;

    @FindBy(xpath = "//tr[21]/td/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div")
    WebElementFacade btnDepto;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    WebElementFacade txtDepartamento;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    WebElementFacade txtCiudad;

    @FindBy(xpath = ".//*[@id='EditAccountPopup:EditAccountScreen:Update-btnInnerEl']")
    WebElementFacade btnActualizar;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesResumenCuentaPage.class);

    public void verInfoResumenCuenta(Map<String, String> infoResumenCuenta) {

        String validacion = null;

        try {
            assertThat(lblResumenCuenta.getText(), is(equalTo(infoResumenCuenta.get("lblResumenCuenta"))));
            assertThat(lblIdOficiales.getText(), is(equalTo(infoResumenCuenta.get("lblIdOficiales"))));
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
            assertThat(lblTipoDireccion.getText(), is(equalTo(infoResumenCuenta.get("tipoDireccion"))));
            assertThat(lblDescDireccion.getText(), is(equalTo(infoResumenCuenta.get("descDireccion"))));
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

    public void validarTipoCuenta(String tipoCuenta) {
        assertThat(lblTipoPersona.getText(), is(equalTo(tipoCuenta)));
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
            assertThat(txtEmail.getTagName(), is(equalTo("input")));
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
            assertThat(txtEmailCompania.getTagName(), is(equalTo("input")));
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
        btnPais.click();
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
        btnDepto.click();
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
