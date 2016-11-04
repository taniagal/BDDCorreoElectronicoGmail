package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class SolicitarRequisitoPaPage extends PageUtil{

    public SolicitarRequisitoPaPage (WebDriver driver) {
        super(driver);
    }

    public void validarOpcionHabilitada() {
        WebElementFacade botonSolicitarRequisitos = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:Requirement-btnInnerEl']");
        MatcherAssert.assertThat(botonSolicitarRequisitos.getAttribute("unselectable"), Matchers.equalTo("on"));
    }
}
