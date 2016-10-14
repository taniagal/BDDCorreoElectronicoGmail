package com.sura.guidewire.policycenter.pages;


import com.sura.guidewire.policycenter.util.Commons;
import com.sura.guidewire.policycenter.util.model.Aseguradora;

import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.steps.StepInterceptor;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.slf4j.LoggerFactory;

public class CoaseguroPage extends Commons {
    @FindBy(xpath = ".//*//a[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:addConinsuranceLink']")
    private WebElementFacade linkAgregarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:ReferencePolicyNumber-inputEl']")
    private WebElementFacade campoTxtPolizaDeReferencia;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:administrativeExpenses-inputEl']")
    private WebElementFacade campoTxtDastosAdministrativos;
    @FindBy(xpath = ".//*//a[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:editConinsuranceLink']")
    private WebElementFacade linkEditarCoaseguro;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:Update-btnInnerEl']")
    private WebElementFacade botonAceptar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV_tb:Add-btnInnerEl']")
    private WebElementFacade botonAgregar;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:coinsuranceTypeQuestion_true-inputEl']")
    private WebElementFacade radioBotonAceptado;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[1]/td[4]")
    private WebElementFacade radioBotonLider;
    @FindBy(xpath = ".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tfoot/tr/td[3]")
    private WebElementFacade pieDeTabla;
    @FindBy(id = "Coinsurance_ExtPopup:_msgs")
    private WebElementFacade divMensaje;

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(StepInterceptor.class);
    private static final String MSJVALIDARVALORES = "No estan correctos los elementos:";

    public CoaseguroPage(WebDriver diver) {
        super(diver);
    }

    public void validarCampos() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(linkAgregarCoaseguro).shouldBePresent();
        linkAgregarCoaseguro.click();
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(radioBotonAceptado).waitUntilPresent().click();
        campoTxtDastosAdministrativos.waitUntilPresent();
        waitUntil(1000);
        radioBotonLider.waitUntilPresent();
        StringBuilder right = new StringBuilder(MSJVALIDARVALORES);
        try{
            if(radioBotonAceptado.isSelected()) {
                right.append("radio_boton_cedido, ");
            }
        }catch (StaleElementReferenceException e){
            LOGGER.info("Stale element in line 56 "+e);
        }
        if(!botonAgregar.isPresent()) {
            right.append("boton_agregar, ");
        }
        if(!campoTxtDastosAdministrativos.containsText("2%") || campoTxtDastosAdministrativos.getAttribute("class").contains("x-form-text")) {
            right.append("Gastos_Administrativos, ");
        }
        String res = right.toString();
        if(MSJVALIDARVALORES.equals(res)){
            res = right.toString().substring(0,right.toString().length()-1);
        }
        MatcherAssert.assertThat(res+"verifique su codigo","No estan correctos los elementos".equals(res));
    }

    public void agregarCoaseguro(List<Aseguradora> aseguradoras) {
        campoTxtPolizaDeReferencia.waitUntilPresent().sendKeys("poliza123");
        Actions act = new Actions(getDriver());
        int i = 1;
        for (Aseguradora aseguradora : aseguradoras) {
            WebElementFacade campoAseguradora = findBy(".//*[@id='Coinsurance_ExtPopup:insuranceLV-body']/*/table/tbody/tr[" + i + "]/td[2]");
            campoAseguradora.click();
            if (i == 1) {
                act.sendKeys(Keys.TAB).build().perform();
                act.sendKeys(Keys.ENTER).build().perform();
                act.sendKeys(aseguradora.getParticipacion()).build().perform();
                MatcherAssert.assertThat("Sura debe estar por defecto en las aseguradoras", campoAseguradora.containsText("Sura"));
            } else {
                act.click().build().perform();
                act.sendKeys(aseguradora.getNombre()).build().perform();
                act.sendKeys(Keys.TAB).build().perform();
                waitUntil(500);
                act.sendKeys(aseguradora.getParticipacion()).build().perform();
            }
            i++;
        }
        act.sendKeys(Keys.TAB).build().perform();
    }
    public void verificarPorcentajeParticipacion(){
        waitFor(ExpectedConditions.textToBePresentInElement(pieDeTabla,"100"));
        MatcherAssert.assertThat("El total no es del 100%", pieDeTabla.getText().contains("100"));
    }

    public void guardarcosaeguro(){
        botonAceptar.click();
    }

    public void verificarCoaseguro() {
        withTimeoutOf(20, TimeUnit.SECONDS).waitFor(linkEditarCoaseguro).shouldBePresent();
        MatcherAssert.assertThat("Error al agregar el coaseguro", linkEditarCoaseguro.isPresent());
    }

    public void verificarMensaje(String mensaje) {
        verificarMensaje(divMensaje,mensaje);
    }

}
