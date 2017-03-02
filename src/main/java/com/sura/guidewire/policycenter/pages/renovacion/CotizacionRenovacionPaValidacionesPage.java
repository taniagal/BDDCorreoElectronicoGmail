package com.sura.guidewire.policycenter.pages.renovacion;

import com.sura.guidewire.policycenter.pages.modificaciones.ModificacionInformacionPolizaPAPage;
import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class CotizacionRenovacionPaValidacionesPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']")
    private WebElementFacade grupoMensajesRC;
    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:WebMessageWorksheet_ClearButton-btnInnerEl']")
    private WebElementFacade borraMensajeEspacioTrabajo;
    @FindBy(xpath = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:_msgs']")
    private WebElementFacade lblMensaje;


    public CotizacionRenovacionPaValidacionesPage (WebDriver driver){
        super(driver);
    }


    public void irAPantallairARevisionDePolizaSinValidacionFecha() {
        String xpathItemRevisionPoliza = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyReview']/div";
        WebElementFacade itemRevisionPoliza = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).find(By.xpath(xpathItemRevisionPoliza));
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(itemRevisionPoliza).click();
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(lblMensaje).waitUntilVisible();
        itemRevisionPoliza.click();
    }

    public void irARevisionDePoliza() {
        String xpathItemRevisionPoliza = ".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyReview']/div";
        WebElementFacade itemRevisionPoliza = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).find(By.xpath(xpathItemRevisionPoliza));
        itemRevisionPoliza.click();
    }

    public void cotizarRenovacion() {
        String xpathBotonCotizar = ".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_DifferencesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']";
        WebElementFacade botonCotizarRenovacion = withTimeoutOf(TIEMPO_1, TimeUnit.SECONDS).find(By.xpath(xpathBotonCotizar));
        botonCotizarRenovacion.click();
    }

    public void validarBloqueoYMensajeRC(ExamplesTable mensajeRC) {
        withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(grupoMensajesRC).waitUntilPresent();
        boolean validacion = false;
        validacion = validarMensajeRC(mensajeRC);
        MatcherAssert.assertThat(validacion, Matchers.is(Matchers.equalTo(true)));
    }

    public boolean validarMensajeRC(ExamplesTable listaMensajesRC) {
        Map<String, String> mensajesRC;
        boolean validacionMensajes = false;
        for (int i = 0; i < listaMensajesRC.getRowCount(); i++) {
            mensajesRC = listaMensajesRC.getRows().get(i);
            if(grupoMensajesRC.getText().contains(mensajesRC.get("mensaje"))){
                validacionMensajes = true;
            }else {
                validacionMensajes = false;
            }
        }
        return validacionMensajes;
    }

    public void limpiarMensajes (){
        withTimeoutOf(TIEMPO_28,TimeUnit.SECONDS).waitFor(borraMensajeEspacioTrabajo).click();
    }

    public void irAInformacionPolizaRenovacion() {
        WebElementFacade itemInformacionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:PolicyInfo']/div");
        clickearElemento(itemInformacionPoliza);
        WebElementFacade labelInformacionPoliza = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:ttlBar']");
        clickearElemento(labelInformacionPoliza);
        WebElementFacade botonEditarTransaccion = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:EditPolicy-btnInnerEl']");
        setImplicitTimeout(TIEMPO_5,TimeUnit.SECONDS);
        if(botonEditarTransaccion.isPresent()){
            botonEditarTransaccion.click();
            actions.sendKeys(Keys.ENTER);
        }
        resetImplicitTimeout();
    }

    public void adicionarSegundoTomadorEnRenovacion(ExamplesTable datosTomador) {
        WebElementFacade labelTomadorSecundario = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton-labelEl']");
        waitFor(labelTomadorSecundario).shouldBePresent();
        WebElementFacade botonTomadorSecundario = findBy(".//a[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:ChangeSecondaryNamedInsuredButtonMenuIcon']/img");
        clickearElemento(botonTomadorSecundario);
        WebElementFacade itemPersonaDirectorio = findBy(".//a[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:RenewalWizard_PolicyInfoDV:SecondaryNamedInsuredInputSet:ChangeSecondaryNamedInsuredButton:SecondaryNamedInsuredABContactAdder-itemEl']/span");
        clickearElemento(itemPersonaDirectorio);
        Map<String, String> informacionTomador = datosTomador.getRows().get(0);
        ModificacionInformacionPolizaPAPage modificacionInformacionPolizaPaPage = new ModificacionInformacionPolizaPAPage(getDriver());
        modificacionInformacionPolizaPaPage.adicionarContacto(informacionTomador.get("tipoDocumento"), informacionTomador.get("numeroDocumento"));
    }

    public void realizarCotizacionDeRenovacion() {
        WebElementFacade botonCotizarInfoPolicy = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:RenewalWizard_PolicyInfoScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']");
        WebElementFacade botonCotizarVehiculos = findBy(".//*[@id='RenewalWizard:LOBWizardStepGroup:LineWizardStepSet:PAVehiclesScreen:JobWizardToolbarButtonSet:RenewalQuote-btnInnerEl']");
        setImplicitTimeout(TIEMPO_5,TimeUnit.SECONDS);
        if(botonCotizarInfoPolicy.isPresent()){
            withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonCotizarInfoPolicy);
            clickearElemento(botonCotizarInfoPolicy);
        }else if(botonCotizarVehiculos.isPresent()){
            withTimeoutOf(TIEMPO_28, TimeUnit.SECONDS).waitFor(botonCotizarVehiculos);
            clickearElemento(botonCotizarVehiculos);
        }
        resetImplicitTimeout();
    }
}