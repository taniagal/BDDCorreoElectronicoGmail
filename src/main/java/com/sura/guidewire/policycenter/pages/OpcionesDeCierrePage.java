package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

public class OpcionesDeCierrePage extends PageUtil{
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl']")
    private WebElementFacade botonOpcionesDeCierre;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:JobWizardToolbarButtonSet:CloseOptions:Decline']")
    private WebElementFacade botonDeclinarPoliza;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PreQualificationScreen:JobWizardToolbarButtonSet:CloseOptions:Decline']")
    private WebElementFacade txtRazon;
    public OpcionesDeCierrePage (WebDriver driver){
        super(driver);
    }

    public void irAOpcionesDeCierre() {
       esperarYClickearBoton(botonOpcionesDeCierre);
        esperarYClickearBoton(botonDeclinarPoliza);
        esperarYClickearBoton(txtRazon);
    }

    public void validarRazonesDeclinar(String razones) {

    }
}
