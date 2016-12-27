package com.sura.guidewire.policycenter.pages;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
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
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonBorrar).click();
    }

    public void validarAdvertenciaRequisitos(ExamplesTable mensaje){
        Map<String, String> advertencia = mensaje.getRows().get(0);
        WebElementFacade mensajeAdvertencia = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        MatcherAssert.assertThat(mensajeAdvertencia.getText(), Matchers.containsString(advertencia.get("mensaje")));
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonBorrar).click();
    }

    public void validarRequisitos() {
        waitForTextToAppear("¿Está seguro de que desea expedir este cambio de póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void clicEnElBotonRequisitos(){
        findBy("//*[@id='SubmissionWizard:SubmissionWizard_QuoteScreen:JobWizardToolbarButtonSet:RequestRequirement-btnInnerEl']").click();
        for(String winHandle : getDriver().getWindowHandles()){
            System.out.println("paginas " + getDriver().switchTo().window(winHandle));
        }
    }

    public void validarElRequisito(ExamplesTable requisito) {
        Map<String, String> listaRequisitos = requisito.getRows().get(0);
        MatcherAssert.assertThat("El requisito pendiente no es " + listaRequisitos.get("requisito") ,findBy("//*[@id='reqCliente']/tbody/tr/td[3]").getText(), Is.is(Matchers.equalTo(listaRequisitos.get("requisito"))));
        MatcherAssert.assertThat("El estado del requisito no es " + listaRequisitos.get("estado"), findBy("//*[@id='reqCliente']/tbody/tr/td[7]").getText(), Is.is(Matchers.equalTo(listaRequisitos.get("estado"))));
    }
}
