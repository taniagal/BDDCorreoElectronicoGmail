package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DisponibilidadDetalleProductoPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.jbehave.core.model.ExamplesTable;

public class DisponibilidadDetalleProductoSteps extends ScenarioSteps {

    DisponibilidadDetalleProductoPage disponibilidadDetalleProductoPage = new DisponibilidadDetalleProductoPage(getDriver());

    public DisponibilidadDetalleProductoSteps(Pages pages){
        super(pages);
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        disponibilidadDetalleProductoPage.validarTipoCanalVentas(tipoCanal);
    }
}
