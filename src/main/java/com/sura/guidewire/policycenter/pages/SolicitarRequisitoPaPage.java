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

public class SolicitarRequisitoPaPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    WebElementFacade botonBorrar;

    public SolicitarRequisitoPaPage(WebDriver driver) {
        super(driver);
    }

    public void validarAdvertenciaRequisitos(ExamplesTable mensaje) {
        WebElementFacade botonRequisitos = findBy("//div[contains(.,'Requisitos')]");
        withTimeoutOf(TIEMPO_5, TimeUnit.SECONDS).waitFor(botonRequisitos).waitUntilPresent();
        Map<String, String> advertencia = mensaje.getRows().get(0);
        WebElementFacade mensajeAdvertencia = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        MatcherAssert.assertThat(mensajeAdvertencia.getText(), Matchers.containsString(advertencia.get("mensaje")));
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonBorrar).click();
    }

    public void validarRequisitos() {
        waitForTextToAppear("¿Está seguro de que desea expedir este cambio de póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void validarMensajeBloqueante(ExamplesTable mensajeB) {
        Map<String, String> bloqueo = mensajeB.getRows().get(0);
        WebElementFacade mensajeAdvertencia = findBy(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']");
        MatcherAssert.assertThat(mensajeAdvertencia.getText(), Matchers.containsString(bloqueo.get("mensajeB")));
        MatcherAssert.assertThat("El mensaje no es de bloqueo ", findBy(".//img[@class='error_icon']").isVisible(), Is.is(Matchers.equalTo(true)));
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonBorrar).click();
    }
}
