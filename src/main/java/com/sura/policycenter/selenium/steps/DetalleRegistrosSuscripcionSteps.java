package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.DetalleRegistrosSuscripcionPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class DetalleRegistrosSuscripcionSteps extends ScenarioSteps{

    DetalleRegistrosSuscripcionPage detalleRegistrosSuscripcionPage = new DetalleRegistrosSuscripcionPage(getDriver());

    public DetalleRegistrosSuscripcionSteps(Pages pages){
        super(pages);
    }

    @Step
    public void buscarRegistrosDeSucripcion() {
        detalleRegistrosSuscripcionPage.buscarRegistrosDeSucripcion();
    }
}
