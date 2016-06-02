package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.policycenter.model.Aseguradora;
import java.util.ArrayList;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.components.HtmlTable;
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
    @FindBy(xpath = ".//*[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:editConinsuranceLink']")
    private WebElementFacade linkEditarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV_tb:Add-btnInnerEl']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioBotonAceptado;

    private static final String MSJVALIDARELEMENTOS = "No estan correctos los elementos:";

    public CoaseguroPage(WebDriver diver){
        super(diver);
    }

    public void validarCampos(){
        linkAgregarCoaseguro.waitUntilPresent().click();
        assertThat("El tipo de coaseguro por defecto debe ser cedido", !radioBotonAceptado.isSelected());
        assertThat("Se deben poder agregar mas aseguradoras",botonAgregar.isPresent());
    }

    public void agregarCoaseguro(ArrayList<Aseguradora> aseguradoras){
        radioBotonAceptado.waitUntilPresent().click();
        campoTxtPolizaDeReferencia.waitUntilPresent().sendKeys("poliza123");
        Actions act = new Actions(getDriver());
        int i = 1;
        for(Aseguradora aseguradora: aseguradoras){
            WebElementFacade campoAseguradora = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[2]");
            campoAseguradora.click();
            if (i == 1) {
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(aseguradora.getParticipacion()).build().perform();
                assertThat("Sura debe estar por defecto en las aseguradoras", campoAseguradora.containsText("Sura"));
            }else{
                act.click().build().perform();
                act.sendKeys(aseguradora.getAseguradora()).build().perform();
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(aseguradora.getParticipacion()).build().perform();
            }
            i++;
        }
        act.sendKeys(Keys.TAB).build().perform();

        HtmlTable htmlTable = new HtmlTable(findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table"));
        assertThat("El total no es del 100%",htmlTable.getHeadings().toString().contains("100"));
        botonAceptar.click();
    }

    public void verificarCoaseguro(){
        assertThat("Error al agregar el coaseguro",linkEditarCoaseguro.isPresent());
    }

}
