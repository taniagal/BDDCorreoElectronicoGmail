package com.sura.guidewire.policycenter.pages.contacto;

import com.sura.guidewire.policycenter.util.PageUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


public class DetallesContactoPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    private WebElementFacade labelPrimerNombre;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    private WebElementFacade labelSegundoNombre;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    private WebElementFacade labelPrimerApellido;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    private WebElementFacade labelSegundoApellido;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade labelTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade labelNumeroDocumento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    private WebElementFacade labelSexo;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-labelEl']")
    private WebElementFacade labelFechaNacimiento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-labelEl']")
    private WebElementFacade labelProfesion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-labelEl']")
    private WebElementFacade labelEstadoCivil;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-labelEl']")
    private WebElementFacade labelTipoFamilia;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade labelTelefonoCelular;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl']")
    private WebElementFacade labelCorreoElectronicoPrimario;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    private WebElementFacade labelRazonSocial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    private WebElementFacade labelNombreComercial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-labelEl']")
    private WebElementFacade labelActividadComercial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-labelEl']")
    private WebElementFacade labelNumeroEmpleados;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-labelEl']")
    private WebElementFacade labelValorActivos;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit']")
    private WebElementFacade botonEditarContacto;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade campoTxtSegundoNombre;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    private WebElementFacade campoTxtSegundoApellido;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-inputEl']")
    private WebElementFacade comboBoxProfesion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-inputEl']")
    private WebElementFacade comboBoxEstadoCivil;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-inputEl']")
    private WebElementFacade comboBoxTipoFamilia;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade campoTxtTelefonoCelular;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade campoTxtTelefonoCelular2;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade campoTxtTelefonoResidencial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade campoTxtTelefonoResidencial2;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade campoTxtTelefonoTrabajo;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade campoTxtTelefonoTrabajo2;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-inputEl']")
    private WebElementFacade campoTxtCorreoElectronicoPrimario;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress2-inputEl']")
    private WebElementFacade campoTxtCorreoElectronicoSecundario;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    private WebElementFacade campoTxtNombreComercial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-inputEl']")
    private WebElementFacade comboBoxActividadComercial;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-inputEl']")
    private WebElementFacade campoTxtNumeroEmpleados;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-inputEl']")
    private WebElementFacade campoTxtValorActivos;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-inputEl']")
    private WebElementFacade campoTxtVentasAnuales;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade campoTxtTelefonoOficina;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-inputEl']")
    private WebElementFacade campoTxtCorreoElectronicoPrimarioEmpresa;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress2-inputEl']")
    private WebElementFacade campoTxtCorreoElectronicoSecundarioEmpresa;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressesLV_tb:Add']")
    public WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-labelEl']")
    private WebElementFacade labelPais;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-labelEl']")
    private WebElementFacade labelDepartamento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Sura_City-labelEl']")
    private WebElementFacade labelCiudad;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-labelEl']")
    private WebElementFacade labelDireccion;
    @FindBy(xpath = " .//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressType-labelEl']")
    private WebElementFacade labelTipoDireccion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:Description-labelEl']")
    private WebElementFacade labelDescripcionDireccion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade comboBoxPais;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade campoTxtDireccion;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:DocumentType-inputEl']")
    private WebElementFacade campoTxtTipoDocumento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-inputEl']")
    private WebElementFacade campoTxtDocumento;
    @FindBy(id = "WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs")
    private WebElementFacade divMensaje;
    @FindBy(xpath = ".//*[@id='QuickJump-inputEl']")
    private WebElementFacade campoTxtIrA;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_ContactSearch']/div")
    private WebElementFacade menuItemContactos;


    private String[] dtlContact = new String[CONSTANTE_15];
    private String[] dtlCntJ = new String[CONSTANTE_8];
    public static final String MSJVALIDARVALORES = "No estan correctos los valores:";
    public static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";
    public static final int CONSTANTE_15 = 15;
    public static final int CONSTANTE_14 = 14;
    public static final int CONSTANTE_13 = 13;
    public static final int CONSTANTE_12 = 12;
    public static final int CONSTANTE_11 = 11;
    public static final int CONSTANTE_10 = 10;
    public static final int CONSTANTE_9 = 9;
    public static final int CONSTANTE_8 = 8;
    public static final int CONSTANTE_7 = 7;
    public static final int CONSTANTE_6 = 6;
    public static final int CONSTANTE_5 = 5;
    public static final int CONSTANTE_4 = 4;
    public static final int CONSTANTE_3 = 3;
    public static final int CONSTANTE_2 = 2;
    public static final int CONSTANTE_1 = 1;

    public DetallesContactoPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarContacto() {
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(campoTxtIrA).shouldBePresent();
        campoTxtIrA.sendKeys("Search");
        campoTxtIrA.sendKeys(Keys.ENTER);
        withTimeoutOf(WAIT_TIME_20, TimeUnit.SECONDS).waitFor(menuItemContactos).shouldBePresent();
        menuItemContactos.click();
    }


    public void editarContacto() {
        withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).waitFor(botonEditarContacto).shouldBePresent();
        botonEditarContacto.waitUntilVisible();
        MatcherAssert.assertThat("El boton de editar no está presente en el DOM", botonEditarContacto.isPresent());
        botonEditarContacto.click();
        waitUntil(WAIT_TIME_1000);
    }


    public void actualizaContacto() {
        botonActualizar.click();
        waitUntil(WAIT_TIME_1500);
    }


    public void setDireccion() {
        botonAgregar.click();
        waitUntil(WAIT_TIME_2000);
    }


    public void setNombre(String segundoNombre) {
        campoTxtSegundoNombre.waitUntilPresent();
        campoTxtSegundoNombre.clear();
        campoTxtSegundoNombre.sendKeys(segundoNombre);
        dtlContact[CONSTANTE_2] = segundoNombre;
    }


    public void setApellido(String segundoApellido) {
        campoTxtSegundoApellido.clear();
        waitUntil(WAIT_TIME_1500);
        campoTxtSegundoApellido.sendKeys(segundoApellido);
        dtlContact[CONSTANTE_3] = segundoApellido;
    }


    public void setDatosComboBoxes(String profesion, String estadoCivil, String tipoFamilia) {
        selectItem(comboBoxProfesion, profesion);
        selectItem(comboBoxEstadoCivil, estadoCivil);
        selectItem(comboBoxTipoFamilia, tipoFamilia);
        dtlContact[CONSTANTE_6] = profesion;
        dtlContact[CONSTANTE_7] = estadoCivil;
        dtlContact[CONSTANTE_8] = tipoFamilia;
    }


    public void setTelefonosResidencial(String telefonoResidencial) {
        campoTxtTelefonoResidencial.clear();
        waitUntil(WAIT_TIME_500);
        campoTxtTelefonoResidencial.type(telefonoResidencial);
        dtlContact[CONSTANTE_11] = telefonoResidencial;
    }


    public void setTelefonoTrabajo(String telefonoTrabajo) {
        ingresarDato(campoTxtTelefonoTrabajo, telefonoTrabajo);
        dtlContact[CONSTANTE_12] = telefonoTrabajo;
    }


    public void setTelefonoCelular(String telefonoCelular) {
        ingresarDato(campoTxtTelefonoCelular, telefonoCelular);
        dtlContact[CONSTANTE_10] = telefonoCelular;
    }


    public void setCorreo(String correoElectronicoPrimario, String correoElectronicoSecundario) {
        ingresarDato(campoTxtCorreoElectronicoPrimario, correoElectronicoPrimario);
        ingresarDato(campoTxtCorreoElectronicoSecundario, correoElectronicoSecundario);
        dtlContact[CONSTANTE_13] = correoElectronicoPrimario;
        dtlContact[CONSTANTE_14] = correoElectronicoSecundario;
    }


    /**
     * DETALLE CONTACTO EDICION PERSONA JURIDICA
     */
    public void setRazonSocial(String nombreComercial, String actividadComercial) {
        campoTxtNombreComercial.waitUntilPresent();
        campoTxtNombreComercial.clear();
        campoTxtNombreComercial.sendKeys(nombreComercial);
        selectItem(comboBoxActividadComercial, actividadComercial);
        dtlCntJ[0] = nombreComercial;
        dtlCntJ[CONSTANTE_1] = actividadComercial;
    }


    public void setEmpleados(String numeroEmpleados, String ventasAnuales, String valorActivos) {
        waitUntil(WAIT_TIME_500);
        campoTxtNumeroEmpleados.clear();
        campoTxtNumeroEmpleados.sendKeys(numeroEmpleados);
        campoTxtValorActivos.clear();
        campoTxtValorActivos.sendKeys(valorActivos);
        campoTxtVentasAnuales.clear();
        campoTxtVentasAnuales.sendKeys(ventasAnuales);
        dtlCntJ[CONSTANTE_2] = numeroEmpleados;
        dtlCntJ[CONSTANTE_3] = valorActivos;
        dtlCntJ[CONSTANTE_4] = ventasAnuales;
    }


    public void setCorreosJ(String telefonoOficina, String correoElectronicoPrimario, String correoElectronicoSecundario) {
        ingresarDato(campoTxtCorreoElectronicoPrimarioEmpresa, correoElectronicoPrimario);
        campoTxtTelefonoOficina.clear();
        campoTxtTelefonoOficina.sendKeys(telefonoOficina);
        ingresarDato(campoTxtCorreoElectronicoSecundarioEmpresa, correoElectronicoSecundario);
        dtlCntJ[CONSTANTE_5] = telefonoOficina;
        dtlCntJ[CONSTANTE_6] = correoElectronicoPrimario;
        dtlCntJ[CONSTANTE_7] = correoElectronicoSecundario;
    }


    /**
     * Verifica que el documento y el tipo de documento no sean editables por un error de codigo en policy.
     */
    public void verificarEstadoDeDocumento() {
        MatcherAssert.assertThat("El tipo de documento o el documento no pueden ser editables, verifique los cambios realizados en su codigo",
                !campoTxtTipoDocumento.getAttribute("class").contains("x-form-text") || !campoTxtDocumento.getAttribute("class").contains("x-form-text"));
    }


    /**
     * DETALLE CONTACTO EDICION
     * Valida si los datos ingresados es igual al que se muestran en el detalle
     */
    public void verificarActualizacion() {
        waitForAbsenceOf("//input[contains(@class,'x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus')]");
        waitFor(campoTxtSegundoNombre).shouldBePresent();
        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_2], campoTxtSegundoNombre.getText(), "segundo nombre,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_3], campoTxtSegundoApellido.getText(), "segundo apellido,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_6], comboBoxProfesion.getText(), "profesion,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_7], comboBoxEstadoCivil.getText(), "estado civil,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_8], comboBoxTipoFamilia.getText(), "tipo de familia,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_11], campoTxtTelefonoResidencial2.getText(), "telefono residencial,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_12], campoTxtTelefonoTrabajo2.getText(), "telefono tarbajo,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_13], campoTxtCorreoElectronicoPrimario.getText(), "correo primario,", right);
        right = concatenarElementoDiferente(dtlContact[CONSTANTE_14], campoTxtCorreoElectronicoSecundario.getText(), "correo secundario,", right);
        if (!campoTxtTelefonoCelular2.getText().contains(dtlContact[CONSTANTE_10])) {
            right.append("telefono celular,");
        }
        String res = right.toString();
        if (MSJVALIDARVALORES.equals(res)) {
            res = right.toString().substring(0, right.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan correctos los valores".equals(res));
    }


    public void verificarActualizacionJuridico() {
        waitForAbsenceOf("//input[contains(@class,'x-form-field x-form-text x-form-focus x-field-form-focus x-field-default-form-focus')]");
        waitFor(comboBoxActividadComercial).shouldBePresent();
        StringBuilder valor = new StringBuilder(MSJVALIDARVALORES);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_1], comboBoxActividadComercial.getText(), "activida comercial,", valor);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_2], campoTxtNumeroEmpleados.getText(), "numero de empleados,", valor);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_3], campoTxtValorActivos.getText(), "valor activos,", valor);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_4], campoTxtVentasAnuales.getText(), "ventas anuales,", valor);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_5], campoTxtTelefonoTrabajo2.getText(), "telefono oficina,", valor);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_6], campoTxtCorreoElectronicoPrimarioEmpresa.getText(), "correo primario,", valor);
        valor = concatenarElementoDiferente(dtlCntJ[CONSTANTE_7], campoTxtCorreoElectronicoSecundarioEmpresa.getText(), "correo secundario,", valor);
        String res = valor.toString();
        if (MSJVALIDARVALORES.equals(res)) {
            res = valor.toString().substring(0, valor.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan correctos los valores".equals(res));
    }

    /**
     * DETALLE CONTACTO
     * Valida si estos elementos están presentes
     */
    public void verificarCamposPersonaNatural() {
        StringBuilder noPresente = new StringBuilder(MSJVALIDARELEMENTOS);
        labelPrimerNombre.waitUntilPresent();
        noPresente = concatenarElementoNoPresente(labelPrimerNombre, " primer_nombre,", noPresente);
        noPresente = concatenarElementoNoPresente(labelSegundoNombre, " segundo_nombre,", noPresente);
        noPresente = concatenarElementoNoPresente(labelPrimerApellido, " primer_apellido,", noPresente);
        noPresente = concatenarElementoNoPresente(labelSegundoApellido, " segundo_apellido,", noPresente);
        noPresente = concatenarElementoNoPresente(labelTipoDocumento, " tipo_documento,", noPresente);
        noPresente = concatenarElementoNoPresente(labelNumeroDocumento, " numero_documento,", noPresente);
        noPresente = concatenarElementoNoPresente(labelSexo, " sexo,", noPresente);
        noPresente = concatenarElementoNoPresente(labelFechaNacimiento, " fecha_nacimiento,", noPresente);
        noPresente = concatenarElementoNoPresente(labelProfesion, " profesion,", noPresente);
        noPresente = concatenarElementoNoPresente(labelEstadoCivil, " estado_civil,", noPresente);
        noPresente = concatenarElementoNoPresente(labelTipoFamilia, " tipo_familia,", noPresente);
        noPresente = concatenarElementoNoPresente(labelTelefonoCelular, " telefono_celular,", noPresente);
        noPresente = concatenarElementoNoPresente(labelCorreoElectronicoPrimario, " correo_electronico_primario,", noPresente);
        String res = noPresente.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = noPresente.toString().substring(0, noPresente.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }


    public void verificarCamposPersonaJuridica() {
        labelRazonSocial.waitUntilPresent();
        StringBuilder noPresente = new StringBuilder(MSJVALIDARELEMENTOS);
        noPresente = concatenarElementoNoPresente(labelRazonSocial, " razon_social,", noPresente);
        noPresente = concatenarElementoNoPresente(labelNombreComercial, " nombre_comercial,", noPresente);
        noPresente = concatenarElementoNoPresente(labelTipoDocumento, " tipo_documento,", noPresente);
        noPresente = concatenarElementoNoPresente(labelNumeroDocumento, " numero_documento,", noPresente);
        noPresente = concatenarElementoNoPresente(labelActividadComercial, " actividad_comercial,", noPresente);
        noPresente = concatenarElementoNoPresente(labelNumeroEmpleados, " numero_empleados,", noPresente);
        noPresente = concatenarElementoNoPresente(labelValorActivos, " valor_activos,", noPresente);
        String res = noPresente.toString();
        if (MSJVALIDARELEMENTOS.equals(res)) {
            res = noPresente.toString().substring(0, noPresente.toString().length() - 1);
        }
        MatcherAssert.assertThat(res, "No estan presentes los elementos".equals(res));
    }


    public void validarDireccion() {
        List<WebElementFacade> contactos = getLista(".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressesLV-body']/div/table/tbody/tr");
        MatcherAssert.assertThat("Error en la direccion agregada", contactos.get(1).getText().contains("CL 60 B # 10 - 157") || contactos.get(1).getText().contains("CALLE 60B #10-157"));
    }


    public void validarMensaje(String mensaje) {
        verificarMensaje(divMensaje, mensaje);
    }
}