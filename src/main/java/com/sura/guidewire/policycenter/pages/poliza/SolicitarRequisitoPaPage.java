package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SolicitarRequisitoPaPage extends PageUtil {
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    WebElementFacade divMensaje;

    public SolicitarRequisitoPaPage(WebDriver driver) {
        super(driver);
    }

    public void validarAdvertenciaRequisitos(ExamplesTable mensaje) {
        verificarMensajes(divMensaje, mensaje);
    }

    public void validarRequisitos() {
        waitForTextToAppear("¿Está seguro de que desea expedir este cambio de póliza?");
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    public void validarMensajeBloqueante(ExamplesTable mensaje) {
        verificarMensajes(divMensaje, mensaje);
        MatcherAssert.assertThat("El mensaje no es de bloqueo ", findBy(".//img[@class='error_icon']").isVisible(), Is.is(Matchers.equalTo(true)));
    }
}
