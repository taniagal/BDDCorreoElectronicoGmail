package com.sura.policycenter.selenium.pages.colectivas;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class IngresoDeRiesgosPolizaColectivaPages extends PageObject {

    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:AddRisksButton-btnInnerEl']")
    WebElementFacade botonRiesgosInfoPoliza;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:AddButton-btnInnerEl']")
    WebElementFacade botonAgregarRiesgo;
    @FindBy(xpath = "//div[3]/div/table/tbody/tr/td/div")
    WebElementFacade columnaPlaca;
    @FindBy(xpath = "//div/table/tbody/tr/td[2]/div")
    WebElementFacade columnaClaseVehiculo;
    @FindBy(xpath = "//td[3]/div")
    WebElementFacade columnaModelo;
    @FindBy(xpath = "//td[4]/div")
    WebElementFacade columnaMarca;
    @FindBy(xpath = "//td[5]/div")
    WebElementFacade columnaLinea;
    @FindBy(xpath = ".//*[@id='CollectivePolicyPARisksPopup:RisksLV-body']")
    WebElementFacade tablaRiesgos;
    @FindBy(xpath = ".//*[@id='CollectivePolicyInfo_Ext:Update-btnInnerEl']")
    WebElementFacade botonActualizar;

    public IngresoDeRiesgosPolizaColectivaPages(WebDriver driver) {
        super(driver);
    }

    public void clicEnAgregarRiesgoInfoPoliza() {
        waitFor(botonRiesgosInfoPoliza);
        botonRiesgosInfoPoliza.click();
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

    public void seleccionarRiesgoAConsultar(String riesgo) {
        WebElementFacade linkRiesgo = findBy(" .//*[@id='CollectivePolicyPARisksPopup:RisksLV:" + this.encontrarRiesgo(riesgo).toString() + ":Plate']");
        linkRiesgo.click();
    }

    public Integer encontrarRiesgo(String riesgo) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(tablaRiesgos).waitUntilVisible();
        Integer filaRiesgo = 0;
        List<WebElement> filas = tablaRiesgos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (riesgo.equals(columna.get(0).getText())) {
                return filaRiesgo;
            }
            filaRiesgo++;
        }
        return filaRiesgo;
    }

    public void clicEnActualizarInformacionDePolizaColectiva() {
        if(botonActualizar.isVisible()) {
            botonActualizar.click();
            waitForAbsenceOf(".//*[@id='CollectivePolicyInfo_Ext:Update-btnInnerEl']");
        }
    }
}
