package com.sura.guidewire.policycenter.pages.poliza;


import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CoaseguroPage extends PageUtil {
    @FindBy(xpath = ".//*//a[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade linkAgregarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:ReferencePolicyNumber-inputEl']")
    private WebElementFacade campoTxtPolizaDeReferencia;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:administrativeExpenses-inputEl']")
    private WebElementFacade campoTxtDastosAdministrativos;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:DocumentNumberReference-inputEl']")
    private WebElementFacade campoTxtNumeroDeDocumento;
    @FindBy(xpath = ".//*//a[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:editConinsuranceLink']")
    private WebElementFacade linkEditarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV_tb:Add-btnInnerEl']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:CoinsuranceInputSet:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioBotonAceptado;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[1]/td[4]")
    private WebElementFacade radioBotonLider;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tfoot/tr/td[3]")
    private WebElementFacade pieDeTabla;
    @FindBy(id = "Coinsurance_ExtPopup:_msgs")
    private WebElementFacade divMensaje;

    private static final String MSJVALIDARVALORES = "No estan correctos los elementos:";

    public CoaseguroPage(WebDriver diver) {
        super(diver);
    }

    public void validarCampos() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(linkAgregarCoaseguro).shouldBePresent();
        linkAgregarCoaseguro.click();
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(radioBotonAceptado).waitUntilPresent().click();
        esperarHasta(TIEMPO_1000);
        waitFor(campoTxtDastosAdministrativos).shouldBePresent();
        radioBotonLider.shouldBePresent();
        esperarHasta(TIEMPO_1000);
        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        if (!botonAgregar.isPresent()) {
            right.append("boton_agregar, ");
        }
        if (!campoTxtDastosAdministrativos.containsText("2%") || campoTxtDastosAdministrativos.getAttribute("class").contains("x-form-text")) {
            right.append("Gastos_Administrativos, ");
        }
        String res = right.toString();
        if (MSJVALIDARVALORES.equals(res)) {
            res = right.toString().substring(0, right.toString().length() - 1);
        }
        MatcherAssert.assertThat(res + "verifique su codigo", "No estan correctos los elementos".equals(res));
    }


    public void agregarCoaseguro(ExamplesTable datos) {
        campoTxtPolizaDeReferencia.waitUntilPresent().sendKeys("poliza123");
        campoTxtNumeroDeDocumento.sendKeys("1234567891");
        Actions act = new Actions(getDriver());
        int i = 1;
        for (Map<String, String> dato : datos.getRows()) {
            WebElementFacade campoAseguradora = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[2]");
            campoAseguradora.click();
            if (i == 1) {
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(dato.get("participacion")).build().perform();
                MatcherAssert.assertThat("Sura debe estar por defecto en las aseguradoras", campoAseguradora.containsText("Sura"));
            } else {
                act.click().build().perform();
                esperarHasta(TIEMPO_500);
                act.sendKeys(dato.get("aseguradora")).build().perform();
                esperarHasta(TIEMPO_500);
                act.sendKeys(Keys.TAB).build().perform();
                esperarHasta(TIEMPO_500);
                act.sendKeys(dato.get("participacion")).build().perform();
            }
            i++;
        }
        act.sendKeys(Keys.TAB).build().perform();
    }


    public void verificarPorcentajeParticipacion() {
        esperarHasta(TIEMPO_2000);
        MatcherAssert.assertThat("El total asegurado no es del 100%", pieDeTabla.getText().contains("100"));
    }


    public void guardarCosaeguro() {
        clickearElemento(botonAceptar);
    }


    public void verificarCoaseguro() {
        withTimeoutOf(TIEMPO_20, TimeUnit.SECONDS).waitFor(linkEditarCoaseguro).shouldBePresent();
        MatcherAssert.assertThat("Error al agregar el coaseguro", linkEditarCoaseguro.isPresent());
    }


    public void verificarMensaje(String mensaje) {
        verificarMensaje(divMensaje, mensaje);
    }

}
