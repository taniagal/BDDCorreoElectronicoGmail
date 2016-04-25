package com.sura.policycenter.selenium.steps;

import com.sura.policycenter.selenium.pages.EscritorioPage;
import com.sura.policycenter.selenium.pages.HistorialCuentaPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by jhonvebz on 25/04/2016.
 */
public class HistorialCuentaSteps  extends ScenarioSteps {

    HistorialCuentaPage historialCuentaPage = new HistorialCuentaPage(getDriver());

    public HistorialCuentaSteps(Pages pages) {super(pages);}

    @Step
    public void seleccionarCuenta(String numCuenta) {

        historialCuentaPage.buscarCuenta(numCuenta);
    }

    @Step
    public void seleccionarHistorial() {

        historialCuentaPage.seleccionarHistorial();
    }


}
