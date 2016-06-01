package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.Model.Aseguradora;
import java.util.ArrayList;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.MatcherAssert.assertThat;

public class CoaseguroPage extends Guidewire{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:coinsuranceLinkPopup']")
    private WebElementFacade linkAgregarCosaeguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:administrativeExpenses-inputEl']")
    private WebElementFacade campoTxtGastosAdministrativos;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsurancePanelSet:insuranceLV-body']/div/table/tbody")
    private WebElementFacade tablaParticipantes;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:coinsuranceTypeQuestion_false-inputEl']")
    private WebElementFacade radioBotonAceptado;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsurancePanelSet:insuranceLV_tb:Add-btnInnerEl']")
    private WebElementFacade botonAgregar;




    private static final String MSJVALIDARELEMENTOS = "No estan correctos los elementos:";

    public CoaseguroPage(WebDriver diver){
        super(diver);
    }

    public void validarCampos(){
        /**StringBuilder notRight = new StringBuilder(MSJVALIDARELEMENTOS);
        if(!campoTxtParticipante1.containsText("Sura"))
            notRight.append(" dato_articipante_1,");
        if(campoTxtParticipante1.getAttribute("class").contains("x-form-text"))
            notRight.append(" editable_participante_1,");
        String res = notRight.toString();
        if(MSJVALIDARELEMENTOS.equals(res)){
            res = notRight.toString().substring(0,notRight.toString().length()-1);
        }
        assertThat(res,MSJVALIDARELEMENTOS.equals(res));*/
    }

    public void agregarCoaseguro(ArrayList<Aseguradora> aseguradoras){
        linkAgregarCosaeguro.click();
        assertThat("El tipo de coaseguro por defecto debe ser Aceptado", radioBotonAceptado.isSelected());
        campoTxtGastosAdministrativos.sendKeys();
        for(Aseguradora aseguradora: aseguradoras){
            botonAgregar.click();
            //Esperando mapeo de elementos de la tabla
        }
    }
}
