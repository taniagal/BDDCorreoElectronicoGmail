package com.sura.policycenter.selenium.pages;


import com.sura.guidewire.selenium.Guidewire;
import com.sura.serinitybdd.util.GuidewireUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isIn;

public class DisponibilidadDetalleProductoPage extends Guidewire {

    @FindBy(xpath=".//input[@id='SubmissionWizard:LOBWizardStepGroup:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalesDeVenta;


    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        listaTipoCanalesDeVenta.click();
        List<WebElementFacade> elementosTipoCanalVentas = withTimeoutOf(1, TimeUnit.SECONDS).findAll(".//*[@class='x-boundlist x-boundlist-floating x-layer x-boundlist-default x-border-box x-boundlist-above']");
        List<String> elementosRequeridos = GuidewireUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (WebElementFacade elemento : elementosTipoCanalVentas) {
            assertThat(elemento.getText(), isIn(elementosRequeridos));
        }
    }
}
