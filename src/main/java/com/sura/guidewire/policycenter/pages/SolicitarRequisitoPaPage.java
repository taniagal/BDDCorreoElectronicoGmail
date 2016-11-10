package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.util.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SolicitarRequisitoPaPage extends PageUtil{

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    WebElementFacade botonBorrar;

    public SolicitarRequisitoPaPage (WebDriver driver) {
        super(driver);
    }

    public void validarOpcionHabilitada() {
        WebElementFacade botonRequisitos = findBy(".//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:RequestRequirement-btnInnerEl']");
        MatcherAssert.assertThat(botonRequisitos.getAttribute("unselectable"), Matchers.equalTo("on"));
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(botonBorrar).click();
    }

    public void validarAdvertenciaRequisitos(ExamplesTable mensaje){
        Map<String, String> advertencia = mensaje.getRows().get(0);
        WebElementFacade mensajeAdvertencia = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        MatcherAssert.assertThat(mensajeAdvertencia.getText(), Matchers.containsString(advertencia.get("mensaje")));
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(botonBorrar).click();
    }

    public void validarRequisitos() {
        waitForTextToAppear("¿Está seguro de que desea expedir este cambio de póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
