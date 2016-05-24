package com.sura.policycenter.selenium.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IngresoDeAseguradoACotizacionPage extends PageObject{

    private WebElement botonElegirAutoPersonal;

    private WebElement botonConductores;

    private WebElement botonAgregar;

    public IngresoDeAseguradoACotizacionPage(WebDriver driver){
        super(driver);
        botonElegirAutoPersonal = find(By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PolicyInfo']/div"));
        botonConductores = find(By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:PADrivers']/div"));
        botonAgregar = find(By.xpath(".//*[@id='SubmissionWizard:LOBWizardStepGroup:LineWizardStepSet:PADriversScreen:PADriversPanelSet:DriversListDetailPanel:DriversLV_tb:AddDriver']"));
    }

    public void irAIngresarAsegurado() {
        element(botonElegirAutoPersonal).waitUntilClickable();
        botonElegirAutoPersonal.click();
        element(botonConductores).waitUntilClickable();
        botonConductores.click();
    }


    public void agregarAsegurado() {
        botonAgregar.click();
    }


    public void validarOpcionesDeAgregar(ExamplesTable listaAgregar) {
        
    }
}
