package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by hectsaga on 2016/04/29.
 */
public class DetallesContactoPage extends Guidewire {
    Guidewire gw = new Guidewire(getDriver());

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade lblPrimerNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    WebElementFacade lblSegundoNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    WebElementFacade lblPrimerApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    WebElementFacade lblSegundoApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:DocumentType-labelEl']")
    WebElementFacade lblTipoDocumento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    WebElementFacade lblNumeroDocumento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    WebElementFacade lblSexo;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-labelEl']")
    WebElementFacade lblFechaNacimiento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-labelEl']")
    WebElementFacade lblProfesion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-labelEl']")
    WebElementFacade lblEstadoCivil;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-labelEl']")
    WebElementFacade lblTipoFamilia;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl']")
    WebElementFacade lblTipoTelefono;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade lblTelefonoCelular;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl']")
    WebElementFacade lblCorreoElectronicoPrimario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    WebElementFacade lblRazonSocial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    WebElementFacade lblNombreComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-labelEl']")
    WebElementFacade lblActividadComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-labelEl']")
    WebElementFacade lblNumeroEmpleados;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-labelEl']")
    WebElementFacade lblValorActivos;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    WebElementFacade lblVentasAnuales;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    WebElementFacade lblTelefonoOficinaEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-labelEl']")
    WebElementFacade getTxtCorreoElectronicoPrimarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit-btnInnerEl']")
    WebElementFacade btnEditarContacto;




    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-inputEl']")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-inputEl']")
    WebElementFacade txtSegundoNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-inputEl']")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-inputEl']")
    WebElementFacade txtSegundoApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-inputEl']")
    WebElementFacade cboProfesion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-inputEl']")
    WebElementFacade cboEstadoCivil;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-inputEl']")
    WebElementFacade cboTipoFamilia;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-inputEl']")
    WebElementFacade cboTipoTelefono;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    WebElementFacade txtTelefonoCelular;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade txtTelefonoCelular2;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    WebElementFacade txtTelefonoResidencial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:HomePhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade txtTelefonoResidencial2;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    WebElementFacade txtTelefonoTrabajo;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:PhoneDisplay-inputEl']")
    WebElementFacade txtTelefonoTrabajo2;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-inputEl']")
    WebElementFacade txtCorreoElectronicoPrimario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress2-inputEl']")
    WebElementFacade txtCorreoElectronicoSecundario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-inputEl']")
    WebElementFacade txtRazonSocial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-inputEl']")
    WebElementFacade txtNombreComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-inputEl']")
    WebElementFacade cboActividadComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-inputEl']")
    WebElementFacade txtNumeroEmpleados;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-inputEl']")
    WebElementFacade txtValorActivos;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-inputEl']")
    WebElementFacade txtVentasAnuales;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:WorkPhone:GlobalPhoneInputSet:NationalSubscriberNumber-inputEl']")
    WebElementFacade txtTelefonoOficina;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-inputEl']")
    WebElementFacade txtCorreoElectronicoPrimarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress2-inputEl']")
    WebElementFacade txtCorreoElectronicoSecundarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Update-btnInnerEl']")
    WebElementFacade btnActualizar;


    private  String [] dtlContact = new String[15];
    private String [] dtlCntJ = new String[8];

    public DetallesContactoPage(WebDriver driver) {
        super(driver);
    }

    public void editarContacto(){
        btnEditarContacto.click();
        waitABit(300);
    }


    public void editarContactoPersona(String primerNombre, String primerApellido, String segundoNombre,String segundoApellido,
                                      String fechaFallecimiento, String causaFallecimiento, String profesion, String estadoCivil,
                                      String tipoFamilia,String telefonoCelular, String telefonoResidencial,
                                      String telefonoTrabajo,String correoElectronicoPrimario, String correoElectronicoSecundario){
        txtTelefonoCelular.clear();
        txtTelefonoCelular.sendKeys(telefonoCelular);
        txtSegundoNombre.clear();
        waitABit(200);
        txtSegundoNombre.sendKeys(segundoNombre);
        txtSegundoApellido.clear();
        txtSegundoApellido.sendKeys(segundoApellido);
        selectItem(cboEstadoCivil,estadoCivil);
        selectItem(cboProfesion, profesion);
        selectItem(cboTipoFamilia, tipoFamilia);
        waitABit(500);
        txtTelefonoTrabajo.clear();
        txtTelefonoTrabajo.sendKeys(telefonoTrabajo);
        txtCorreoElectronicoPrimario.clear();
        waitABit(500);
        txtCorreoElectronicoPrimario.sendKeys(correoElectronicoPrimario);
        txtCorreoElectronicoSecundario.clear();
        txtCorreoElectronicoSecundario.sendKeys(correoElectronicoSecundario);
        txtTelefonoResidencial.clear();
        txtTelefonoResidencial.sendKeys(telefonoResidencial);

        dtlContact[2]= segundoNombre;
        dtlContact[3]= segundoApellido;
        dtlContact[4]= fechaFallecimiento;
        dtlContact[5]= causaFallecimiento;
        dtlContact[6]= profesion;
        dtlContact[7]= estadoCivil;
        dtlContact[8]= tipoFamilia;
        dtlContact[10]= telefonoCelular;
        dtlContact[11]= telefonoResidencial;
        dtlContact[12]= telefonoTrabajo;
        dtlContact[13]= correoElectronicoPrimario;
        dtlContact[14]= correoElectronicoSecundario;

    }

    public void editarContactoJuridico(String razonSocial, String nombreComercial, String actividadComercial,
                                       String numeroEmpleados,String valorActivos, String ventasAnuales, String telefonoOficina,
                                       String correoElectronicoPrimario, String correoElectronicoSecundario){

        txtCorreoElectronicoPrimarioEmpresa.clear();
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
        waitABit(500);
        txtCorreoElectronicoSecundarioEmpresa.clear();
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
        threadWait(2000);
    }

    public void verificarActualizacion(){
        espera(txtSegundoNombre,5);
        assertThat("el segundo nombre esta erroneo",dtlContact[2].equals(txtSegundoNombre.getText()));
        assertThat("el segundo apellido esta erroneo",dtlContact[3].equals(txtSegundoApellido.getText()));
        assertThat("la profesion esta erroneo",dtlContact[6].equals(cboProfesion.getText()));
        assertThat("el estado civil esta erroneo",dtlContact[7].equals(cboEstadoCivil.getText()));
        assertThat("el tipo de familia esta erroneo",dtlContact[8].equals(cboTipoFamilia.getText()));
        assertThat("el celular esta erroneo",dtlContact[10].equals(txtTelefonoCelular2.getText()));
        assertThat("el tel residencial esta erroneo",dtlContact[11].equals(txtTelefonoResidencial2.getText()));
        assertThat("el tel trabajo esta erroneo",dtlContact[12].equals(txtTelefonoTrabajo2.getText()));
        assertThat("el correo primario esta erroneo",dtlContact[13].equals(txtCorreoElectronicoPrimario.getText()));
        assertThat("el correo secundario esta erroneo",dtlContact[14].equals(txtCorreoElectronicoSecundario.getText()));
    }


    public void verificarActualizacionJuridico(){
        espera(txtNombreComercial,5);
        assertThat("el nombre comercial esta erroneo",dtlCntJ[0].equals(txtNombreComercial.getText()));
        assertThat("la actividad comercial esta erronea",dtlCntJ[1].equals(cboActividadComercial.getText()));
        assertThat("el numero de empleados",dtlCntJ[2].equals(txtNumeroEmpleados.getText()));
        assertThat("el valor activos estoa erroneo",dtlCntJ[3].equals(txtValorActivos.getText()));
        assertThat("las ventas anuales esta erroneo",dtlCntJ[4].equals(txtVentasAnuales.getText()));
        assertThat("el telefono  oficina esta erroneo",dtlCntJ[5].equals(txtTelefonoTrabajo2.getText()));
        assertThat("el correo primario esta erroneo",dtlCntJ[6].equals(txtCorreoElectronicoPrimarioEmpresa.getText()));
        assertThat("el correo secundario esta erroneo",dtlCntJ[7].equals(txtCorreoElectronicoSecundarioEmpresa.getText()));
    }


    public  void verificarCamposPersonaNatural(){

        String notPresent = "No estan presentes los elemtos:";

        if(!lblPrimerNombre.isPresent()){
            notPresent += " primer_nombre,";
        }
        if(!lblSegundoNombre.isPresent()){
            notPresent += " segundo_nombre,";
        }
        if(!lblPrimerApellido.isPresent()){
            notPresent += " primer_apellido,";
        }
        if(!lblSegundoApellido.isPresent()){
            notPresent += " segundo_apellido,";
        }
        if(!lblTipoDocumento.isPresent()){
            notPresent += " tipo_documento,";
        }
        if(!lblNumeroDocumento.isPresent()){
            notPresent += " numero_documento,";
        }
        if(!lblSexo.isPresent()){
            notPresent += " sexo,";
        }
        if(!lblFechaNacimiento.isPresent()){
            notPresent += " fecha_nacimiento,";
        }
        if(!lblProfesion.isPresent()){
            notPresent += " profesion,";
        }
        if(!lblEstadoCivil.isPresent()){
            notPresent += " estado_civil,";
        }
        if(!lblTipoFamilia.isPresent()){
            notPresent += " tipo_familia,";
        }
        if(!lblTipoTelefono.isPresent()){
            notPresent += " tipo_telefono,";
        }
        if(!lblTelefonoCelular.isPresent()){
            notPresent += " telefono_celular,";
        }
        if(!lblCorreoElectronicoPrimario.isPresent()){
            notPresent += " correo_electronico_primario,";
        }

        if("No estan presentes los elemtos:".equals(notPresent)){
            notPresent = notPresent.substring(0,notPresent.length()-1);
            notPresent += ".";
        }

        assertThat(notPresent,"No estan presentes los elemtos.".equals(notPresent));

    }

    public void verificarCamposPersonaJuridica() {
        String notPresent = "No estan presentes los elemtos:";

        if(!lblRazonSocial.isPresent()){
            notPresent += " razon_social,";
        }
        if(!lblNombreComercial.isPresent()){
            notPresent += " nombre_comercial,";
        }
        if(!lblTipoDocumento.isPresent()){
            notPresent += " tipo_documento,";
        }
        if(!lblNumeroDocumento.isPresent()){
            notPresent += " numero_documento,";
        }
        if(!lblActividadComercial.isPresent()){
            notPresent += " actividad_comercial,";
        }
        if(!lblNumeroEmpleados.isPresent()){
            notPresent += " numero_empleados,";
        }
        if(!lblValorActivos.isPresent()){
            notPresent += " valor_activos,";
        }
        if(!lblVentasAnuales.isPresent()){
            notPresent += " ventas_anuales,";
        }
        if(!lblTelefonoOficinaEmpresa.isPresent()){
            notPresent += " telefono_oficina,";
        }
        if(!getTxtCorreoElectronicoPrimarioEmpresa.isPresent()){
            notPresent += " correo_electronico_primario,";
        }


        if("No estan presentes los elemtos:".equals(notPresent)){
            notPresent = notPresent.substring(0,notPresent.length()-1);
            notPresent += ".";
        }

        assertThat(notPresent,"No estan presentes los elemtos.".equals(notPresent));
    }


}
