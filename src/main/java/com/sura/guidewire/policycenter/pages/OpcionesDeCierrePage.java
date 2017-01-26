package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class OpcionesDeCierrePage extends PageUtil{
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:CloseOptions-btnInnerEl\"]\n")
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

    public void validarRazonesDeclinar(ExamplesTable opcionesDeclinacion) {
        Map<String, String> advertencia = opcionesDeclinacion.getRows().get(0);
        WebElementFacade opcionesDeclinar = findBy(".html/body/div[6]");
        MatcherAssert.assertThat(opcionesDeclinar.getText(), Matchers.containsString(advertencia.get("opcionesDeclinacion")));
    }
}
