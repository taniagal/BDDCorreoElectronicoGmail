package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.model.Aseguradora;
import java.util.ArrayList;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static org.hamcrest.MatcherAssert.assertThat;

public class CoaseguroPage extends Guidewire{
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade linkAgregarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:ReferencePolicyNumber-inputEl']")
    private WebElementFacade campoTxtPolizaDeReferencia;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[2]/td[2]")
    private WebElementFacade tdAseguradora2;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[2]/td[3]")
    private WebElementFacade tdParticipacion2;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioBotonAceptado;

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
        linkAgregarCoaseguro.click();
        assertThat("El tipo de coaseguro por defecto debe ser cedido", !radioBotonAceptado.isSelected());
        radioBotonAceptado.click();
        campoTxtPolizaDeReferencia.waitUntilPresent().sendKeys("poliza123");
        Actions act = new Actions(getDriver());
        for(Aseguradora aseguradora: aseguradoras){
            int i = 1;
            if (i == 1) {
                WebElementFacade tdParticipacio = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[2]/div");
                tdParticipacio.click();
                act.sendKeys(Keys.TAB).build().perform();
                //JOptionPane.showMessageDialog(null, "Tap");
                //WebElementFacade tdParticipacion = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[3]/div");
                //tdParticipacion.click();
                //JOptionPane.showMessageDialog(null, "Click");
                act.sendKeys("40");
                //JOptionPane.showMessageDialog(null, aseguradora.getParticipacion());
            }else{
                WebElementFacade tdAseguradora = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[2]");
                WebElementFacade tdParticipacion2 = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[3]");
            }
            i++;
        }
        waitABit(10000);
    }

}
