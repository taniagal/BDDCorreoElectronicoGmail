package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class  DetallesContactoPage extends Guidewire {

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
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl']")
    private WebElementFacade labelTipoTelefono;
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
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    private WebElementFacade labelVentasAnuales;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    private WebElementFacade labelTelefonoOficinaEmpresa;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-labelEl']")
    private WebElementFacade getcampoTxtCorreoElectronicoPrimarioEmpresa;
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
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Update']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesCardTab']")
    private WebElementFacade botonDirecciones;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressesLV_tb:Add']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-labelEl']")
    private WebElementFacade labelPais;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-labelEl']")
    private WebElementFacade labelDepartamento;
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-labelEl']")
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
    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade comboBoxDepartamento2;


    private  String [] dtlContact = new String[15];
    private String [] dtlCntJ = new String[8];
    private static final String MSJVALIDARVALORES = "No estan correctos los valores:";
    private static final String MSJVALIDARELEMENTOS = "No estan presentes los elementos:";

    public DetallesContactoPage(WebDriver driver) {
        super(driver);
    }

    public void irABuscarContacto() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(campoTxtIrA).shouldBePresent();
        campoTxtIrA.sendKeys("Search");
        campoTxtIrA.sendKeys(Keys.ENTER);
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(menuItemContactos).shouldBePresent();
        menuItemContactos.click();
    }
    public void editarContacto(){
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(botonEditarContacto).shouldBePresent();
        botonEditarContacto.waitUntilVisible();
        MatcherAssert.assertThat("El boton de editar no está presente en el DOM",botonEditarContacto.isPresent());
        botonEditarContacto.click();
        waitUntil(1000);
    }

    public void actualizaContacto(){
        botonActualizar.click();
        waitUntil(1500);
    }

    public void irADirecciones(){
        waitUntil(1000);
        botonDirecciones.click();
        botonAgregar.waitUntilPresent();
        botonAgregar.click();
    }

    public void setDireccion(){
        botonAgregar.click();
        waitUntil(2000);
    }

    public void setNombre(String segundoNombre){
        campoTxtSegundoNombre.waitUntilPresent();
        campoTxtSegundoNombre.clear();
        campoTxtSegundoNombre.sendKeys(segundoNombre);
        dtlContact[2]= segundoNombre;
    }

    public void setApellido(String segundoApellido){
        campoTxtSegundoApellido.clear();
        waitUntil(1500);
        campoTxtSegundoApellido.sendKeys(segundoApellido);
        dtlContact[3]= segundoApellido;
    }

    public void setDatosComboBoxes(String profesion, String estadoCivil, String tipoFamilia){
        selectItem(comboBoxProfesion, profesion);
        selectItem(comboBoxEstadoCivil,estadoCivil);
        selectItem(comboBoxTipoFamilia, tipoFamilia);
        dtlContact[6]= profesion;
        dtlContact[7]= estadoCivil;
        dtlContact[8]= tipoFamilia;
    }

    public void setTelefonosResidencial(String telefonoResidencial){
        campoTxtTelefonoResidencial.clear();
        waitUntil(500);
        campoTxtTelefonoResidencial.type(telefonoResidencial);
        dtlContact[11]= telefonoResidencial;
    }

    public void setTelefonoTrabajo(String telefonoTrabajo){
        campoTxtTelefonoTrabajo.clear();
        waitUntil(300);
        campoTxtTelefonoTrabajo.sendKeys(telefonoTrabajo);
        dtlContact[12]= telefonoTrabajo;
    }

    public void setTelefonoCelular(String telefonoCelular){
        campoTxtTelefonoCelular.clear();
        waitUntil(500);
        campoTxtTelefonoCelular.sendKeys(telefonoCelular);
        dtlContact[10]= "+1 "+telefonoCelular;
    }

    public void setCorreo(String correoElectronicoPrimario, String correoElectronicoSecundario){
        campoTxtCorreoElectronicoPrimario.clear();
        waitUntil(1000);
        campoTxtCorreoElectronicoPrimario.sendKeys(correoElectronicoPrimario);
        do {
            campoTxtCorreoElectronicoSecundario.clear();
            waitFor(campoTxtCorreoElectronicoSecundario).shouldContainText("");
            campoTxtCorreoElectronicoSecundario.sendKeys(correoElectronicoSecundario);
        }while (!campoTxtCorreoElectronicoSecundario.getValue().equals(correoElectronicoSecundario));
        dtlContact[13]= correoElectronicoPrimario;
        dtlContact[14]= correoElectronicoSecundario;
    }


    /**
     * DETALLE CONTACTO EDICION PERSONA JURIDICA
     */
    public void setRazonSocial(String nombreComercial, String actividadComercial) {
        campoTxtNombreComercial.waitUntilPresent().clear();
        campoTxtNombreComercial.sendKeys(nombreComercial);
        selectItem(comboBoxActividadComercial, actividadComercial);
        dtlCntJ[0]= nombreComercial;
        dtlCntJ[1]= actividadComercial;
    }


    public void setEmpleados(String numeroEmpleados, String ventasAnuales, String valorActivos) {
        waitUntil(500);
        campoTxtNumeroEmpleados.clear();
        campoTxtNumeroEmpleados.sendKeys(numeroEmpleados);
        campoTxtValorActivos.clear();
        campoTxtValorActivos.sendKeys(valorActivos);
        campoTxtVentasAnuales.clear();
        campoTxtVentasAnuales.sendKeys(ventasAnuales);
        dtlCntJ[2]= numeroEmpleados;
        dtlCntJ[3]= valorActivos;
        dtlCntJ[4]= ventasAnuales;
    }

    public void setCorreosJ(String telefonoOficina, String correoElectronicoPrimario, String correoElectronicoSecundario){
        campoTxtCorreoElectronicoPrimarioEmpresa.clear();
        waitUntil(300);
        campoTxtCorreoElectronicoPrimarioEmpresa.sendKeys(correoElectronicoPrimario);
        campoTxtTelefonoOficina.clear();
        campoTxtTelefonoOficina.sendKeys(telefonoOficina);
        do {
            campoTxtCorreoElectronicoSecundarioEmpresa.clear();
            waitFor(campoTxtCorreoElectronicoSecundarioEmpresa).shouldContainText("");
            campoTxtCorreoElectronicoSecundarioEmpresa.sendKeys(correoElectronicoSecundario);
        }while (!campoTxtCorreoElectronicoSecundarioEmpresa.getValue().equals(correoElectronicoSecundario));
        dtlCntJ[5]= telefonoOficina;
        dtlCntJ[6]= correoElectronicoPrimario;
        dtlCntJ[7]= correoElectronicoSecundario;
    }


    /**
     * DETALLE CONTACTO EDICION
     * Valida si los datos ingresados es igual al que se muestran en el detalle
     */
    public void verificarActualizacion(){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(campoTxtSegundoNombre).shouldBePresent();
        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        if(!dtlContact[2].equals(campoTxtSegundoNombre.getText()))
            right.append("segundo nombre,");
        if(!dtlContact[3].equals(campoTxtSegundoApellido.getText()))
            right.append("segundo apellido,");
        if(!dtlContact[6].equals(comboBoxProfesion.getText()))
            right.append("profesion,");
        if(!dtlContact[7].equals(comboBoxEstadoCivil.getText()))
            right.append("estado civil,");
        if(!dtlContact[8].equals(comboBoxTipoFamilia.getText()))
            right.append("tipo de familia,");
        if(!dtlContact[10].equals(campoTxtTelefonoCelular2.getText()))
            right.append("telefono celular,");
        if(!dtlContact[11].equals(campoTxtTelefonoResidencial2.getText()))
            right.append("telefono residencial,");
        if(!dtlContact[12].equals(campoTxtTelefonoTrabajo2.getText()))
            right.append("telefono tarbajo,");
        if(!dtlContact[13].equals(campoTxtCorreoElectronicoPrimario.getText()))
            right.append("correo primario,");
        if(!dtlContact[14].equals(campoTxtCorreoElectronicoSecundario.getText()))
            right.append("correo secundario,");
        String res = right.toString();
        if(MSJVALIDARVALORES.equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        MatcherAssert.assertThat(res,"No estan correctos los valores".equals(res));
    }

    public void verificarActualizacionJuridico(){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(comboBoxActividadComercial).shouldBePresent();
        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        if(!dtlCntJ[1].equals(comboBoxActividadComercial.getText()))
            right.append("activida comercial,");
        if(!dtlCntJ[2].equals(campoTxtNumeroEmpleados.getText()))
            right.append("numero de empleados,");
        if(!dtlCntJ[3].equals(campoTxtValorActivos.getText()))
            right.append("valor activos,");
        if(!dtlCntJ[4].equals(campoTxtVentasAnuales.getText()))
            right.append("ventas anuales,");
        if(!dtlCntJ[5].equals(campoTxtTelefonoTrabajo2.getText()))
            right.append("telefono oficina,");
        if(!dtlCntJ[6].equals(campoTxtCorreoElectronicoPrimarioEmpresa.getText()))
            right.append("correo primario,");
        if(!dtlCntJ[7].equals(campoTxtCorreoElectronicoSecundarioEmpresa.getText()))
            right.append("correo secundario,");
        String res = right.toString();
        if(MSJVALIDARVALORES.equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        MatcherAssert.assertThat(res,"No estan correctos los valores".equals(res));
    }

    /**
     * Verifica que el documento y el tipo de documento no sean editables por un error de codigo en policy.
     */
    public void verificarEstadoDeDocumento(){
        MatcherAssert.assertThat("El tipo de documento o el documento no pueden ser editables, verifique los cambios realizados en su codigo",
                !campoTxtTipoDocumento.getAttribute("class").contains("x-form-text") || !campoTxtDocumento.getAttribute("class").contains("x-form-text"));
    }

    /**
     * DETALLE CONTACTO
     * Valida si estos elementos están presentes
    */
    public  void verificarCamposPersonaNatural(){
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        labelPrimerNombre.waitUntilPresent();
        if(!labelPrimerNombre.isPresent())
            notPresent.append(" primer_nombre,");
        if(!labelSegundoNombre.isPresent())
            notPresent.append(" segundo_nombre,");
        if(!labelPrimerApellido.isPresent())
            notPresent.append(" primer_apellido,");
        if(!labelSegundoApellido.isPresent())
            notPresent.append(" segundo_apellido,");
        if(!labelTipoDocumento.isPresent())
            notPresent.append(" tipo_documento,");
        if(!labelNumeroDocumento.isPresent())
            notPresent.append(" numero_documento,");
        if(!labelSexo.isPresent())
            notPresent.append(" sexo,");
        if(!labelFechaNacimiento.isPresent())
            notPresent.append(" fecha_nacimiento,");
        if(!labelProfesion.isPresent())
            notPresent.append(" profesion,");
        if(!labelEstadoCivil.isPresent())
            notPresent.append(" estado_civil,");
        if(!labelTipoFamilia.isPresent())
            notPresent.append(" tipo_familia,");
        if(!labelTipoTelefono.isPresent())
            notPresent.append(" tipo_telefono,");
        if(!labelTelefonoCelular.isPresent())
            notPresent.append(" telefono_celular,");
        if(!labelCorreoElectronicoPrimario.isPresent())
            notPresent.append(" correo_electronico_primario,");
        String res = notPresent.toString();
        if(MSJVALIDARELEMENTOS.equals(res)){
            res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        }
        MatcherAssert.assertThat(res,"No estan presentes los elementos".equals(res));
    }

    public void verificarCamposPersonaJuridica() {
        labelRazonSocial.waitUntilPresent();
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if(!labelRazonSocial.isPresent())
            notPresent.append(" razon_social,");
        if(!labelNombreComercial.isPresent())
            notPresent.append(" nombre_comercial,");
        if(!labelTipoDocumento.isPresent())
            notPresent.append(" tipo_documento,");
        if(!labelNumeroDocumento.isPresent())
            notPresent.append(" numero_documento,");
        if(!labelActividadComercial.isPresent())
            notPresent.append(" actividad_comercial,");
        if(!labelNumeroEmpleados.isPresent())
            notPresent.append(" numero_empleados,");
        if(!labelValorActivos.isPresent())
            notPresent.append(" valor_activos,");
        if(!labelVentasAnuales.isPresent())
            notPresent.append(" ventas_anuales,");
        if(!labelTelefonoOficinaEmpresa.isPresent())
            notPresent.append(" telefono_oficina,");
        if(!getcampoTxtCorreoElectronicoPrimarioEmpresa.isPresent())
            notPresent.append(" correo_electronico_primario,");
        String res = notPresent.toString();
        if(MSJVALIDARELEMENTOS.equals(res)){
            res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        }
        MatcherAssert.assertThat(res,"No estan presentes los elementos".equals(res));
    }

    /**
     * AGREGAR DIRECCION A CONTACTO
     */
    public void validarDatosPantalla() {
        waitUntil(1000);
        StringBuilder notPresent = new StringBuilder(MSJVALIDARELEMENTOS);
        if(!labelPais.isPresent())
            notPresent.append(" pais,");
        if(!labelDepartamento.isPresent())
            notPresent.append(" deprtamento,");
        if(!labelCiudad.isPresent())
            notPresent.append(" ciudad,");
        if(!labelDireccion.isPresent())
            notPresent.append(" direccion,");
        if(!labelTipoDireccion.isPresent())
            notPresent.append(" tipo dirección,");
        if(!labelDescripcionDireccion.isPresent())
            notPresent.append(" descripción direccion,");
        String res = notPresent.toString();
        if(MSJVALIDARELEMENTOS.equals(res)){
            res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        }
        MatcherAssert.assertThat(res,"No estan presentes los elementos".equals(res));
    }

    public void validarCampos() {
        comboBoxPais.waitUntilPresent();
        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        if(!"Colombia".equals(comboBoxPais.getValue().toString()))
            right.append(" pais,");
        if(!"<ninguno>".equals(comboBoxDepartamento.getValue().toString()))
            right.append(" departamento,");
        if(!"Esta Direccion podria estandarizarse automáticamente".equals(campoTxtDireccion.getAttribute("data-qtip")))
            right.append("drireccion data-tip,");
        if(!"200".equals(campoTxtDireccion.getAttribute("maxlength")))
            right.append("direccion maxlength,");
        String res = right.toString();
        if(MSJVALIDARVALORES.equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        MatcherAssert.assertThat(res,"No estan correctos los valores".equals(res));
    }

    public void validarDireccion(){
        List<WebElementFacade> contactos = getLista(".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressesLV-body']/div/table/tbody/tr");
        MatcherAssert.assertThat("Error en la direccion agregada",contactos.get(1).getText().contains("CL 60 B # 10 - 157") || contactos.get(1).getText().contains("CALLE 60B #10-157"));
    }

    public void validarMensaje(String mensaje) {
        verificarMensaje(divMensaje,mensaje);
    }
}
