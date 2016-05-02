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

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:FirstName-labelEl']")
    WebElementFacade txtPrimerNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:MiddleName-labelEl']")
    WebElementFacade txtSegundoNombre;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:LastName-labelEl']")
    WebElementFacade txtPrimerApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalPersonNameInputSet:Particle-labelEl']")
    WebElementFacade txtSegundoApellido;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:DocumentType-labelEl']")
    WebElementFacade txtTipoDocumento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:OfficialIDInputSet:OfficialIDDV_Input-labelEl']")
    WebElementFacade txtNumeroDocumento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Sexo-labelEl']")
    WebElementFacade txtSexo;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:DateOfBirth-labelEl']")
    WebElementFacade txtFechaNacimiento;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:Profession-labelEl']")
    WebElementFacade txtProfesion;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:MaritalStatus-labelEl']")
    WebElementFacade txtEstadoCivil;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:FamilyType-labelEl']")
    WebElementFacade txtTipoFamilia;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:PrimaryPhone-labelEl']")
    WebElementFacade txtTipoTelefono;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:CellPhone:GlobalPhoneInputSet:PhoneDisplay-labelEl']")
    WebElementFacade txtTelefonoCelular;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:PersonDataContact:CreateNewContactInputSet:EmailAddress1-labelEl']")
    WebElementFacade txtCorreoElectronicoPrimario;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Name-labelEl']")
    WebElementFacade txtRazonSocial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:CommercialName-labelEl']")
    WebElementFacade txtNombreComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Activity-labelEl']")
    WebElementFacade txtActividadComercial;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:EmployeesNumber-labelEl']")
    WebElementFacade txtNumeroEmpleados;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:Assets-labelEl']")
    WebElementFacade txtValorActivos;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    WebElementFacade txtVentasAnuales;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:GlobalContactNameInputSet:AnualSells-labelEl']")
    WebElementFacade txtTelefonoOficinaEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV:AccountContactDV:ContactNameInputSet:EmailAddress1-labelEl']")
    WebElementFacade getTxtCorreoElectronicoPrimarioEmpresa;

    @FindBy(xpath = ".//*[@id='ContactFile_Details:ContactFile_DetailsInternalScreen:InternalDetailsCardPanelCV_tb:Edit-btnInnerEl']")
    WebElementFacade btnEditarContacto;

    public DetallesContactoPage(WebDriver driver) {
        super(driver);
    }

    public void editarContacto(){
        btnEditarContacto.click();
    }


    public  void verificarCamposPersonaNatural(){

        String notPresent = "No estan presentes los elemtos:";

        if(!txtPrimerNombre.isPresent()){
            notPresent += " primer_nombre,";
        }
        if(!txtSegundoNombre.isPresent()){
            notPresent += " segundo_nombre,";
        }
        if(!txtPrimerApellido.isPresent()){
            notPresent += " primer_apellido,";
        }
        if(!txtSegundoApellido.isPresent()){
            notPresent += " segundo_apellido,";
        }
        if(!txtTipoDocumento.isPresent()){
            notPresent += " tipo_documento,";
        }
        if(!txtNumeroDocumento.isPresent()){
            notPresent += " numero_documento,";
        }
        if(!txtSexo.isPresent()){
            notPresent += " sexo,";
        }
        if(!txtFechaNacimiento.isPresent()){
            notPresent += " fecha_nacimiento,";
        }
        if(!txtProfesion.isPresent()){
            notPresent += " profesion,";
        }
        if(!txtEstadoCivil.isPresent()){
            notPresent += " estado_civil,";
        }
        if(!txtTipoFamilia.isPresent()){
            notPresent += " tipo_familia,";
        }
        if(!txtTipoTelefono.isPresent()){
            notPresent += " tipo_telefono,";
        }
        if(!txtTelefonoCelular.isPresent()){
            notPresent += " telefono_celular,";
        }
        if(!txtCorreoElectronicoPrimario.isPresent()){
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

        if(!txtRazonSocial.isPresent()){
            notPresent += " razon_social,";
        }
        if(!txtNombreComercial.isPresent()){
            notPresent += " nombre_comercial,";
        }
        if(!txtTipoDocumento.isPresent()){
            notPresent += " tipo_documento,";
        }
        if(!txtNumeroDocumento.isPresent()){
            notPresent += " numero_documento,";
        }
        if(!txtActividadComercial.isPresent()){
            notPresent += " actividad_comercial,";
        }
        if(!txtNumeroEmpleados.isPresent()){
            notPresent += " numero_empleados,";
        }
        if(!txtValorActivos.isPresent()){
            notPresent += " valor_activos,";
        }
        if(!txtVentasAnuales.isPresent()){
            notPresent += " ventas_anuales,";
        }
        if(!txtTelefonoOficinaEmpresa.isPresent()){
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
