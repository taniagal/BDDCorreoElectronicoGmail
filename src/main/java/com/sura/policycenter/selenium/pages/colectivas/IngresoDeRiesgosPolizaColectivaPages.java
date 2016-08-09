package com.sura.policycenter.selenium.pages.colectivas;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class IngresoDeRiesgosPolizaColectivaPages extends PageObject {

    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:RisksButton-btnInnerEl']")
    WebElementFacade botonAgregarRiesgoInfoPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:add-btnInnerEl']")
    WebElementFacade botonAgregarRiesgo;
    @FindBy(xpath = "//td/div/div[2]/div/table/tbody/tr/td/div")
    WebElementFacade columnaPlaca;
    @FindBy(xpath = "//div/table/tbody/tr/td[2]/div")
    WebElementFacade columnaClaseVehiculo;
    @FindBy(xpath = "//td[3]/div")
    WebElementFacade columnaModelo;
    @FindBy(xpath = "//td[4]/div")
    WebElementFacade columnaMarca;
    @FindBy(xpath = "//td[5]/div")
    WebElementFacade columnaLinea;

    public IngresoDeRiesgosPolizaColectivaPages(WebDriver driver) {
        super(driver);
    }

    public void clicEnAgregarRiesgoInfoPoliza() {
        waitFor(botonAgregarRiesgoInfoPoliza);
        botonAgregarRiesgoInfoPoliza.click();
        waitForTextToAppear("Riesgos");
    }

    public void clicEnAgregarRiesgo() {
        waitFor(botonAgregarRiesgo);
        botonAgregarRiesgo.click();
    }

    public void validarRiesgoIngresado(ExamplesTable riesgosColectiva) {
        Map<String, String> informacionRiesgo = riesgosColectiva.getRows().get(0);
        waitFor(columnaPlaca);
        MatcherAssert.assertThat(columnaPlaca.getText(), Matchers.containsString(informacionRiesgo.get("placa")));
        MatcherAssert.assertThat(columnaClaseVehiculo.getText(), Matchers.containsString(informacionRiesgo.get("claseVehiculo")));
        MatcherAssert.assertThat(columnaModelo.getText(), Matchers.containsString(informacionRiesgo.get("modelo")));
        MatcherAssert.assertThat(columnaMarca.getText(), Matchers.containsString(informacionRiesgo.get("marca")));
        MatcherAssert.assertThat(columnaLinea.getText(), Matchers.containsString(informacionRiesgo.get("linea")));
    }
}
