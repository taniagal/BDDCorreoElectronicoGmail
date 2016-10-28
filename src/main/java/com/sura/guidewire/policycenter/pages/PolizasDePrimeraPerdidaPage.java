package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;


public class PolizasDePrimeraPerdidaPage extends PageUtil {
    @FindBy(xpath=".//*[@id='SubmissionWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;
    @FindBy(xpath=".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade botonActualizar;
    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:HasEdificio-inputEl']")
    private WebElementFacade checkBoxEdificios;
    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:_checkbox']")
    private WebElementFacade checkBoxDanosmateriales;
    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl']")
    private WebElementFacade campoTxtValorReconstruccion;
    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:0:CovTermInputSet:DirectTermInput-inputEl']")
    private WebElementFacade campoTxtValorasegurado;
    @FindBy(id = "WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs")
    private WebElementFacade divMensaje;
    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:0:CoverageInputSet:CovPatternInputGroup:10:CovTermInputSet:TypekeyTermInput-inputEl']")
    private WebElementFacade comboBoxTipoPrimeraPerdida;

    public PolizasDePrimeraPerdidaPage(WebDriver driver){
        super(driver);
    }

    public void irAArticulos() {
        withTimeoutOf(25, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent().click();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(botonAgregarArticulos).waitUntilPresent().click();
    }

    public void agregarArticulo(ExamplesTable datos){
        Map<String,String> dato = datos.getRow(0);
        checkBoxEdificios.waitUntilPresent().click();
        campoTxtValorReconstruccion.waitUntilPresent().sendKeys(dato.get("valor"));
        checkBoxDanosmateriales.click();
        campoTxtValorasegurado.waitUntilPresent().sendKeys(dato.get("limite"));
        if("350000".equals(dato.get("valor"))) {
            botonActualizar.click();
        }
    }

    public void seleccionartipoPrimeraPerdida(String tipoPrimeraPerdida){
        waitUntil(200);
        selectItem(comboBoxTipoPrimeraPerdida,tipoPrimeraPerdida);
        botonActualizar.click();
    }

    public void validarMensaje(String mensaje) {
        verificarMensaje(divMensaje,mensaje);
    }
}
