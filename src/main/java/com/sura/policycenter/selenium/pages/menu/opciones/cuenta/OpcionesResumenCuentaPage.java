package com.sura.policycenter.selenium.pages.menu.opciones.cuenta;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

/**
 * Created by diegcaac on 18/05/2016.
 */
public class OpcionesResumenCuentaPage extends Guidewire{

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
    WebElementFacade lbldescAgente;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:AccountNumber-labelEl']")
    WebElementFacade lblnumCuenta;

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

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-labelEl']")
    WebElementFacade lblValorActivos;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    WebElementFacade lblVentasAnuales;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblTelOficina;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:EmailAddress1-labelEl']")
    WebElementFacade lblEmailPrimario;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:Segmentation-labelEl']")
    WebElementFacade lblSegmentacion;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:Behavior-labelEl']")
    WebElementFacade lblComportamiento;

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

    @FindBy(xpath = "[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfDeath-labelEl']")
    WebElementFacade lblFechaFallecimiento;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl']")
    WebElementFacade lblTipoTel;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:AccountFile_Summary_BasicInfoDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
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

    //@FindBy(xpath = "//div[contains(.,'N° de póliza')]")
    @FindBy(xpath = "//span[@class='x-column-header-text firepath-matching-node']")
    WebElementFacade lblNumPoliza;

    @FindBy(xpath = "//div[contains(.,'Producto')]")
    WebElementFacade lblProducto;

    @FindBy(xpath = "//div[contains(.,'Estado')]")
    WebElementFacade lblEstadoPol;

    @FindBy(xpath = "//span[contains(.,'Fecha de vigencia')]")
    WebElementFacade lblFechaVigPol;

    @FindBy(xpath = "//span[contains(.,'Fecha de expiración')]")
    WebElementFacade lblFechaExpPol;

    @FindBy(xpath = ".//*[@id='AccountFile_Summary:AccountFile_SummaryScreen:2']")
    WebElementFacade lblTransPolPendientes;

    @FindBy(xpath = "//span[contains(.,'N.º de transacción')]")
    WebElementFacade lblNumTrans;

    @FindBy(xpath = "//span[contains(.,'Estado')]")
    WebElementFacade lblEstadoTrans;

    @FindBy(xpath = "//span[contains(.,'N° de póliza')]")
    WebElementFacade lblNumPolTrans;

    @FindBy(xpath = "//span[contains(.,'Producto')]")
    WebElementFacade lblProductoTrans;

    @FindBy(xpath = "//span[contains(.,'Tipo')]")
    WebElementFacade lblTipoTrans;

    @FindBy(xpath = "//span[contains(.,'Asegurador')]")
    WebElementFacade lblAseguradorTrans;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(OpcionesResumenCuentaPage.class);

    public void verInfoResumenCuenta(Map<String, String> infoResumenCuenta){
        try {
            assertThat(lblResumenCuenta.getText(), is(equalTo(infoResumenCuenta.get("lblResumenCuenta"))));
            assertThat(lblIdOficiales.getText(), is(equalTo(infoResumenCuenta.get("lblIdOficiales"))));
            assertThat(lblTipoDoc.getText(), is(equalTo(infoResumenCuenta.get("tipoDocumento"))));
            assertThat(lblNumDoc.getText(), is(equalTo(infoResumenCuenta.get("numDocumento"))));
            assertThat(lblCodAgente.getText(), is(equalTo(infoResumenCuenta.get("codigoAgente"))));
            assertThat(lbldescAgente.getText(), is(equalTo(infoResumenCuenta.get("descAgente"))));
            assertThat(lblnumCuenta.getText(), is(equalTo(infoResumenCuenta.get("numCuenta"))));
            assertThat(lblEmailPrimario.getText(), is(equalTo(infoResumenCuenta.get("emailPrimario"))));

            if(lblTipoPersona.getText().compareTo(infoResumenCuenta.get("lblPersonaJuridica"))==0){
                assertThat(lblTipoPersona.getText(), is(equalTo(infoResumenCuenta.get("lblPersonaJuridica"))));
                assertThat(lblRazonSocial.getText(), is(equalTo(infoResumenCuenta.get("razonSocial"))));
                assertThat(lblNombreComercial.getText(), is(equalTo(infoResumenCuenta.get("nombreComercial"))));
                assertThat(lblActComercial.getText(), is(equalTo(infoResumenCuenta.get("actComercial"))));
                assertThat(lblNumEmpleados.getText(), is(equalTo(infoResumenCuenta.get("numEmpleados"))));
                assertThat(lblValorActivos.getText(), is(equalTo(infoResumenCuenta.get("valorActivos"))));
                assertThat(lblVentasAnuales.getText(), is(equalTo(infoResumenCuenta.get("ventasAnuales"))));
                assertThat(lblTelOficina.getText(), is(equalTo(infoResumenCuenta.get("telOficina"))));
            }
            else if(lblTipoPersona.getText().compareTo(infoResumenCuenta.get("lblPersonaNatural"))==0){
                assertThat(lblTipoPersona.getText(), is(equalTo(infoResumenCuenta.get("lblPersonaNatural"))));
                assertThat(lblPrimerNombre.getText(), is(equalTo(infoResumenCuenta.get("primerNombre"))));
                assertThat(lblSegundoNombre.getText(), is(equalTo(infoResumenCuenta.get("segundoNombre"))));
                assertThat(lblPrimerApellido.getText(), is(equalTo(infoResumenCuenta.get("primerApellido"))));
                assertThat(lblSegundoApellido.getText(), is(equalTo(infoResumenCuenta.get("segundoApellido"))));
                assertThat(lblFechaNac.getText(), is(equalTo(infoResumenCuenta.get("fechaNac"))));
                assertThat(lblEstadoCivil.getText(), is(equalTo(infoResumenCuenta.get("estadoCivil"))));
                assertThat(lblProfesion.getText(), is(equalTo(infoResumenCuenta.get("profesion"))));
                assertThat(lblSexo.getText(), is(equalTo(infoResumenCuenta.get("sexo"))));
                assertThat(lblCausaMuerte.getText(), is(equalTo(infoResumenCuenta.get("causaMuerte"))));
                assertThat(lblFechaFallecimiento.getText(), is(equalTo(infoResumenCuenta.get("fechaFallecimiento"))));
                assertThat(lblTipoTel.getText(), is(equalTo(infoResumenCuenta.get("tipoTel"))));

                //if(txtTipoTel.getText() == "Vivienda"){
                    assertThat(lblTelResidencial.getText(), is(equalTo(infoResumenCuenta.get("telResidencial"))));
                //    assertThat(lblTelCelular.getText(), is(equalTo(null)));
                //    assertThat(lblTelTrabajo.getText(), is(equalTo(null)));
                //}
                //else if(txtTipoTel.getText() == "Trabajo"){
                    assertThat(lblTelTrabajo.getText(), is(equalTo(infoResumenCuenta.get("telTrabajo"))));
                //    assertThat(lblTelResidencial.getText(), is(equalTo(null)));
                //    assertThat(lblTelCelular.getText(), is(equalTo(null)));
                //}
                //else if(txtTipoTel.getText() == "Movil"){
                    assertThat(lblTelCelular.getText(), is(equalTo(infoResumenCuenta.get("telCelular"))));
                //    assertThat(lblTelResidencial.getText(), is(equalTo(null)));
                //    assertThat(lblTelTrabajo.getText(), is(equalTo(null)));
                //}
            }

            assertThat(lblSegmentacion.getText().toString(), is(equalTo(infoResumenCuenta.get("segmentacion"))));
            assertThat(lblComportamiento.getText().toString(), is(equalTo(infoResumenCuenta.get("comportamiento"))));
            assertThat(lblDireccion.getText().toString(), is(equalTo(infoResumenCuenta.get("direccion"))));
            assertThat(lblTipoDireccion.getText().toString(), is(equalTo(infoResumenCuenta.get("tipoDireccion"))));
            assertThat(lblDescDireccion.getText().toString(), is(equalTo(infoResumenCuenta.get("descDireccion"))));
            assertThat(lblActividades.getText().toString(), is(equalTo(infoResumenCuenta.get("lblActividades"))));
            assertThat(lblFechaVencAct.getText().toString(), is(equalTo(infoResumenCuenta.get("fechaVencimiento"))));
            assertThat(lblPrioridadAct.getText().toString(), is(equalTo(infoResumenCuenta.get("prioridadAct"))));
            assertThat(lblTemaAct.getText().toString(), is(equalTo(infoResumenCuenta.get("temaAct"))));
            assertThat(lblAsignadoAct.getText().toString(), is(equalTo(infoResumenCuenta.get("asignadoAct"))));
            assertThat(lblTerminosPol.getText().toString(), is(equalTo(infoResumenCuenta.get("lblTerminosPol"))));
            assertThat(lblNumPoliza.getText().toString(), is(equalTo(infoResumenCuenta.get("numPoliza"))));
            assertThat(lblProducto.getText().toString(), is(equalTo(infoResumenCuenta.get("producto"))));
            assertThat(lblEstadoPol.getText().toString(), is(equalTo(infoResumenCuenta.get("estadoPol"))));
            assertThat(lblFechaVigPol.getText().toString(), is(equalTo(infoResumenCuenta.get("fechaVigPol"))));
            assertThat(lblFechaExpPol.getText().toString(), is(equalTo(infoResumenCuenta.get("fechaExpPol"))));
            assertThat(lblTransPolPendientes.getText().toString(), is(equalTo(infoResumenCuenta.get("lblTransPolPendientes"))));
            assertThat(lblNumTrans.getText().toString(), is(equalTo(infoResumenCuenta.get("numTrans"))));
            assertThat(lblEstadoTrans.getText().toString(), is(equalTo(infoResumenCuenta.get("estadoTrans"))));
            assertThat(lblNumPolTrans.getText().toString(), is(equalTo(infoResumenCuenta.get("numPolTrans"))));
            assertThat(lblProductoTrans.getText().toString(), is(equalTo(infoResumenCuenta.get("productoTrans"))));
            assertThat(lblTipoTrans.getText().toString(), is(equalTo(infoResumenCuenta.get("tipoTrans"))));
            assertThat(lblAseguradorTrans.getText().toString(), is(equalTo(infoResumenCuenta.get("aseguradorTrans"))));
        } catch (Exception e) {
            LOGGER.error("This is error", e);
        }
    }
}
