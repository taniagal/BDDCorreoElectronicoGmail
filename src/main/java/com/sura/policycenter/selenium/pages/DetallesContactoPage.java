package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static org.hamcrest.MatcherAssert.assertThat;


public class DetallesContactoPage extends Guidewire {
    Guidewire gw = new Guidewire(getDriver());

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    private WebElementFacade lblPrimerNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    private WebElementFacade lblSegundoNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    private WebElementFacade lblPrimerApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    private WebElementFacade lblSegundoApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:DocumentType-labelEl']")
    private WebElementFacade lblTipoDocumento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    private WebElementFacade lblNumeroDocumento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    private WebElementFacade lblSexo;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-labelEl']")
    private WebElementFacade lblFechaNacimiento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-labelEl']")
    private WebElementFacade lblProfesion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-labelEl']")
    private WebElementFacade lblEstadoCivil;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-labelEl']")
    private WebElementFacade lblTipoFamilia;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl']")
    private WebElementFacade lblTipoTelefono;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    private WebElementFacade lblTelefonoCelular;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl']")
    private WebElementFacade lblCorreoElectronicoPrimario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    private WebElementFacade lblRazonSocial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    private WebElementFacade lblNombreComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-labelEl']")
    private WebElementFacade lblActividadComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-labelEl']")
    private WebElementFacade lblNumeroEmpleados;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-labelEl']")
    private WebElementFacade lblValorActivos;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    private WebElementFacade lblVentasAnuales;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    private WebElementFacade lblTelefonoOficinaEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-labelEl']")
    private WebElementFacade getTxtCorreoElectronicoPrimarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit-btnInnerEl']")
    private WebElementFacade btnEditarContacto;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    private WebElementFacade txtSegundoNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    private WebElementFacade txtSegundoApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-inputEl']")
    private WebElementFacade cboProfesion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-inputEl']")
    private WebElementFacade cboEstadoCivil;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-inputEl']")
    private WebElementFacade cboTipoFamilia;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelefonoCelular;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade txtTelefonoCelular2;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelefonoResidencial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade txtTelefonoResidencial2;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelefonoTrabajo;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    private WebElementFacade txtTelefonoTrabajo2;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-inputEl']")
    private WebElementFacade txtCorreoElectronicoPrimario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress2-inputEl']")
    private WebElementFacade txtCorreoElectronicoSecundario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    private WebElementFacade txtNombreComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-inputEl']")
    private WebElementFacade cboActividadComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-inputEl']")
    private WebElementFacade txtNumeroEmpleados;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-inputEl']")
    private WebElementFacade txtValorActivos;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-inputEl']")
    private WebElementFacade txtVentasAnuales;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    private WebElementFacade txtTelefonoOficina;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-inputEl']")
    private WebElementFacade txtCorreoElectronicoPrimarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress2-inputEl']")
    private WebElementFacade txtCorreoElectronicoSecundarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Update-btnInnerEl']")
    private WebElementFacade btnActualizar;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesCardTab-btnInnerEl']")
    private WebElementFacade btnDirecciones;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressesLV_tb:Add-btnInnerEl']")
    private WebElementFacade btnAgregar;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-labelEl']")
    private WebElementFacade lblPais;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-labelEl']")
    private WebElementFacade lblDepartamento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-labelEl']")
    private WebElementFacade lblCiudad;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-labelEl']")
    private WebElementFacade lblDireccion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-labelEl']")
    private WebElementFacade lblCodigoPostal;

    @FindBy(xpath = " .//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressType-labelEl']")
    private WebElementFacade lblTipoDireccion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:Description-labelEl']")
    private WebElementFacade lblDescripcionDireccion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:Description-labelEl']")
    private WebElementFacade lblVálidoHasta;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:Country-inputEl']")
    private WebElementFacade cboPais;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:State-inputEl']")
    private WebElementFacade cboDepartamento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:City_Ext-inputEl']")
    private WebElementFacade cboCiudad;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:AddressLine1-inputEl']")
    private WebElementFacade txtDireccion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressInputSet:globalAddressContainer:GlobalAddressInputSet:PostalCode-inputEl']")
    private WebElementFacade txtCodigoPostal;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:AddressType-inputEl']")
    private WebElementFacade txtTipoNegocio;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AddressesPanelSet:AddressDetailDV:Description-inputEl']")
    private WebElementFacade txtDescripcionDireccion;


    private  String [] dtlContact = new String[15];
    private String [] dtlCntJ = new String[8];

    public DetallesContactoPage(WebDriver driver) {
        super(driver);
    }

    public void editarContacto(){
        btnEditarContacto.click();
        waitABit(800);
    }


    public void editarContactoJuridico(String razonSocial, String nombreComercial, String actividadComercial,
                                       String numeroEmpleados,String valorActivos, String ventasAnuales, String telefonoOficina,
                                       String correoElectronicoPrimario, String correoElectronicoSecundario) {

        txtCorreoElectronicoPrimarioEmpresa.clear();
        waitABit(100);
        txtCorreoElectronicoPrimarioEmpresa.sendKeys(correoElectronicoPrimario);
        txtNombreComercial.clear();
        txtNombreComercial.sendKeys(nombreComercial);
        selectItem(cboActividadComercial, actividadComercial);
        waitABit(500);
        txtNumeroEmpleados.clear();
        txtNumeroEmpleados.sendKeys(numeroEmpleados);
        txtValorActivos.clear();
        txtValorActivos.sendKeys(valorActivos);
        txtVentasAnuales.clear();
        txtVentasAnuales.sendKeys(ventasAnuales);
        txtTelefonoOficina.clear();
        txtTelefonoOficina.sendKeys(telefonoOficina);
        txtCorreoElectronicoSecundarioEmpresa.clear();
        waitABit(300);
        txtCorreoElectronicoSecundarioEmpresa.sendKeys(correoElectronicoSecundario);

        dtlCntJ[0]= nombreComercial;
        dtlCntJ[1]= actividadComercial;
        dtlCntJ[2]= numeroEmpleados;
        dtlCntJ[3]= valorActivos;
        dtlCntJ[4]= ventasAnuales;
        dtlCntJ[5]= telefonoOficina;
        dtlCntJ[6]= correoElectronicoPrimario;
        dtlCntJ[7]= correoElectronicoSecundario;
    }

    public void actualizaContacto(){
        btnActualizar.click();
        waitABit(2000);
    }

    public void irADirecciones(){
        btnDirecciones.click();
    }

    public void agregarNombre(String segundoNombre){
        txtSegundoNombre.clear();
        txtSegundoNombre.sendKeys(segundoNombre);
        dtlContact[2]= segundoNombre;
    }

    public void agregarApellido(String segundoApellido){
        txtSegundoApellido.clear();
        waitABit(1500);
        txtSegundoApellido.sendKeys(segundoApellido);
        dtlContact[3]= segundoApellido;
    }

    public void agregarLists(String profesion,String estadoCivil,String tipoFamilia){
        selectItem(cboProfesion, profesion);
        selectItem(cboEstadoCivil,estadoCivil);
        selectItem(cboTipoFamilia, tipoFamilia);
        dtlContact[6]= profesion;
        dtlContact[7]= estadoCivil;
        dtlContact[8]= tipoFamilia;
    }

    public void agregarTelefonosResidencial(String telefonoResidencial){
        txtTelefonoResidencial.type(telefonoResidencial);
        dtlContact[11]= telefonoResidencial;
    }

    public void agregarTelefonoTrabajo(String telefonoTrabajo){
        txtTelefonoTrabajo.sendKeys(telefonoTrabajo);
        dtlContact[12]= telefonoTrabajo;
    }

    public void agregarTelefonoCelular(String telefonoCelular){
        txtTelefonoCelular.sendKeys(telefonoCelular);
        dtlContact[10]= telefonoCelular;
    }

    public void agregarCorreo(String correoElectronicoPrimario, String correoElectronicoSecundario){
        txtCorreoElectronicoPrimario.clear();
        waitABit(300);
        txtCorreoElectronicoPrimario.sendKeys(correoElectronicoPrimario);
        waitABit(200);
        txtCorreoElectronicoSecundario.sendKeys(correoElectronicoSecundario);
        dtlContact[13]= correoElectronicoPrimario;
        dtlContact[14]= correoElectronicoSecundario;
    }

    //-------Valida si los datos ingresados es igual al que se muestran en el detalle
    public void verificarActualizacion(){
        espera(txtSegundoNombre,6);
        StringBuilder right = new StringBuilder("No estan correctos los valores:");
        if(!dtlContact[2].equals(txtSegundoNombre.getText())) right.append("segundo nombre,");
        if(!dtlContact[3].equals(txtSegundoApellido.getText()))right.append("segundo apellido,");
        if(!dtlContact[6].equals(cboProfesion.getText()))right.append("profesion,");
        if(!dtlContact[7].equals(cboEstadoCivil.getText()))right.append("estado civil,");
        if(!dtlContact[8].equals(cboTipoFamilia.getText()))right.append("tipo de familia,");
        if(!dtlContact[10].equals(txtTelefonoCelular2.getText()))right.append("telefono celular,");
        if(!dtlContact[11].equals(txtTelefonoResidencial2.getText()))right.append("telefono residencial,");
        if(!dtlContact[12].equals(txtTelefonoTrabajo2.getText()))right.append("telefono tarbajo,");
        if(!dtlContact[13].equals(txtCorreoElectronicoPrimario.getText()))right.append("correo primario,");
        if(!dtlContact[14].equals(txtCorreoElectronicoSecundario.getText()))right.append("correo secundario,");
        String res = right.toString();
        if("No estan correctos los valores:".equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        assertThat(res,"No estan correctos los valores".equals(res));
    }



    public void verificarActualizacionJuridico(){
        espera(txtNombreComercial,6);
        StringBuilder right = new StringBuilder("No estan correctos los valores:");
        if(!dtlCntJ[0].equals(txtNombreComercial.getText()))right.append("nombre comercial,");
        if(!dtlCntJ[1].equals(cboActividadComercial.getText()))right.append("activida comercual,");
        if(!dtlCntJ[2].equals(txtNumeroEmpleados.getText()))right.append("numero de empleados,");
        if(!dtlCntJ[3].equals(txtValorActivos.getText()))right.append("valor activos,");
        if(!dtlCntJ[4].equals(txtVentasAnuales.getText()))right.append("ventas anuales,");
        if(!dtlCntJ[5].equals(txtTelefonoTrabajo2.getText()))right.append("telefono oficina,");
        if(!dtlCntJ[6].equals(txtCorreoElectronicoPrimarioEmpresa.getText()))right.append("correo primario,");
        if(!dtlCntJ[7].equals(txtCorreoElectronicoSecundarioEmpresa.getText()))right.append("correo secundario,");
        String res = right.toString();
        if("No estan correctos los valores:".equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        assertThat(res,"No estan correctos los valores".equals(res));
    }

    //-------Valida si estos elementos están presentes
    public  void verificarCamposPersonaNatural(){
        StringBuilder notPresent = new StringBuilder("No estan presentes los elemtos:");
        if(!lblPrimerNombre.isPresent()) notPresent.append(" primer_nombre,");
        if(!lblSegundoNombre.isPresent()) notPresent.append(" segundo_nombre,");
        if(!lblPrimerApellido.isPresent()) notPresent.append(" primer_apellido,");
        if(!lblSegundoApellido.isPresent()) notPresent.append(" segundo_apellido,");
        if(!lblTipoDocumento.isPresent()) notPresent.append(" tipo_documento,");
        if(!lblNumeroDocumento.isPresent()) notPresent.append(" numero_documento,");
        if(!lblSexo.isPresent()) notPresent.append(" sexo,");
        if(!lblFechaNacimiento.isPresent()) notPresent.append(" fecha_nacimiento,");
        if(!lblProfesion.isPresent()) notPresent.append(" profesion,");
        if(!lblEstadoCivil.isPresent()) notPresent.append(" estado_civil,");
        if(!lblTipoFamilia.isPresent()) notPresent.append(" tipo_familia,");
        if(!lblTipoTelefono.isPresent()) notPresent.append(" tipo_telefono,");
        if(!lblTelefonoCelular.isPresent()) notPresent.append(" telefono_celular,");
        if(!lblCorreoElectronicoPrimario.isPresent()) notPresent.append(" correo_electronico_primario,");
        String res = notPresent.toString();
        if("No estan presentes los elemtos:".equals(res)){
            res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        }
        assertThat(res,"No estan presentes los elemtos".equals(res));
    }

    public void verificarCamposPersonaJuridica() {
        StringBuilder notPresent = new StringBuilder("No estan presentes los elemtos:");
        if(!lblRazonSocial.isPresent()) notPresent.append(" razon_social,");
        if(!lblNombreComercial.isPresent()) notPresent.append(" nombre_comercial,");
        if(!lblTipoDocumento.isPresent()) notPresent.append(" tipo_documento,");
        if(!lblNumeroDocumento.isPresent()) notPresent.append(" numero_documento,");
        if(!lblActividadComercial.isPresent()) notPresent.append(" actividad_comercial,");
        if(!lblNumeroEmpleados.isPresent()) notPresent.append(" numero_empleados,");
        if(!lblValorActivos.isPresent()) notPresent.append(" valor_activos,");
        if(!lblVentasAnuales.isPresent()) notPresent.append(" ventas_anuales,");
        if(!lblTelefonoOficinaEmpresa.isPresent()) notPresent.append(" telefono_oficina,");
        if(!getTxtCorreoElectronicoPrimarioEmpresa.isPresent()) notPresent.append(" correo_electronico_primario,");
        String res = notPresent.toString();
        if("No estan presentes los elemtos:".equals(res)){
            res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        }
        assertThat(res,"No estan presentes los elemtos".equals(res));
    }

    public void validarDatosPantalla() {
        StringBuilder notPresent = new StringBuilder("No estan presentes los elemtos:");
        if(!lblPais.isPresent()) notPresent.append(" pais,");
        if(!lblDepartamento.isPresent()) notPresent.append(" deprtamento,");
        if(!lblCiudad.isPresent()) notPresent.append(" ciudad,");
        if(!lblDireccion.isPresent()) notPresent.append(" direccion,");
        if(!lblCodigoPostal.isPresent()) notPresent.append(" codigo postal,");
        if(!lblTipoDireccion.isPresent()) notPresent.append(" tipo dirección,");
        if(!lblDescripcionDireccion.isPresent()) notPresent.append(" descripción direccion,");
        String res = notPresent.toString();
        if("No estan presentes los elemtos:".equals(res)){
            res = notPresent.toString().substring(0,notPresent.toString().length()-1);
        }
        assertThat(res,"No estan presentes los elemtos".equals(res));
    }

    public void validarCampos() {
        //cboPais.
        //cboDepartamento.click();
        //txtDireccion.click();
        JOptionPane.showMessageDialog(null,cboPais.getText());
        JOptionPane.showMessageDialog(null,cboDepartamento.getText());
        JOptionPane.showMessageDialog(null,txtDireccion.getText());
        StringBuilder right = new StringBuilder("No estan correctos los valores:");
        if(!cboPais.getText().equals("Colombia"))right.append(" pais,");
        if(!cboDepartamento.getText().equals("<ninguno>"))right.append(" departamento,");
        System.out.println(cboDepartamento.getText());
        String res = right.toString();
        if("No estan correctos los valores:".equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        assertThat(res,"No estan correctos los valores".equals(res));
    }
}
