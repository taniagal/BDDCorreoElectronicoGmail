package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class SolicitarRequisitoPaPage extends PageUtil{

    public SolicitarRequisitoPaPage (WebDriver driver) {
        super(driver);
    }

    public void validarOpcionHabilitada() {
        WebElementFacade botonSolicitarRequisitos = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:Requirement-btnInnerEl']");
        MatcherAssert.assertThat(botonSolicitarRequisitos.getAttribute("unselectable"), Matchers.equalTo("on"));
    }

    public void validarAdvertenciaRequisitos(ExamplesTable mensaje){
        Map<String, String> advertencia = mensaje.getRows().get(0);
        WebElementFacade mensajeAdvertencia = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:_msgs']/div");
        MatcherAssert.assertThat(mensajeAdvertencia.getText(), Matchers.is(Matchers.equalTo(advertencia.get("mensaje"))));
    }
}
