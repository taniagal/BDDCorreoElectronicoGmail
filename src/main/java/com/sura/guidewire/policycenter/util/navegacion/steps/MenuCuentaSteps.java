package com.sura.guidewire.policycenter.util.navegacion.steps;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MenuCuentaSteps extends ScenarioSteps {

    @Step
    public void nueva_cuenta() {
        String xpathBtnNuevaCuenta = "//a[contains(.,'Nueva cuenta')]";
        getDriver().findElement(By.xpath(xpathBtnNuevaCuenta)).click();
    }

    @Step
    public void consultar_numero_de_cuenta(String numeroDeCuenta) {
        String xpathTxtNumeroDeCuenta = "//input[contains(@id,'AccountNumberSearchItem-inputEl')]";
        getDriver().findElement(By.xpath(xpathTxtNumeroDeCuenta)).click();
    }

}
