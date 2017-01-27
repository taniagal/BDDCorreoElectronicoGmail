package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class VisualizarCambiosEnPolizaMrcPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:Actions:AddNewBuilding']")
    private WebElementFacade botonAgregarArticulos;
    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:InputCoverageBuilding:ArticleTypeDetailDV:AmountSubjectReconstruction_Input-inputEl']")
    private WebElementFacade txtValorReconstruccion;

    public VisualizarCambiosEnPolizaMrcPage(WebDriver driver) {
        super(driver);
    }

    public void cambiarValorReconstruccion(String valorReconstruccion) {
        esperarYClickearBoton(botonAgregarArticulos);
        ingresarDato(txtValorReconstruccion, valorReconstruccion);
    }
}