package com.sura.policycenter.selenium.pages.menu.opciones.poliza;

import com.sura.commons.selenium.Commons;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.openqa.selenium.WebDriver;



public class ExpedicionDePolizaMrcBloqueoAlertaPage extends Commons {

    @FindBy(xpath=".//*[@id='PolicyChangeWizard:Next-btnInnerEl']")
    private WebElementFacade botonSiguiente;

    @FindBy(xpath=".//*[@id='PolicyChangeWizard:LOBWizardStepGroup:LineWizardStepSet:CPBuildingsScreen:CPBuildingsAndLocationsLV:0:0:BuildingDescription']")
    private WebElementFacade linkIngresaEdificio;

    @FindBy(xpath=".//*[@id='CPBuildingSuraPopup:Update-btnInnerEl']")
    private WebElementFacade btnAceptar;

    @FindBy(xpath = ".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div")
    WebElementFacade mensajeRiesgos;

    @FindBy(xpath = ".//img[@class='warning_icon']")
    WebElementFacade iconoAdvertencia;

    @FindBy(xpath = ".//*[@id='CPBuildingSuraPopup:Cancel-btnInnerEl']")
    WebElementFacade btnCancelar;

    @FindBy(xpath =".//a[contains(.,'Expedir póliza')] ")
    WebElementFacade btnExpedir;



    public ExpedicionDePolizaMrcBloqueoAlertaPage(WebDriver driver) {
        super(driver);
    }

    public void ingresoEdificioUbicaciones(){
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(botonSiguiente).waitUntilPresent().click();
    }

    public void ingresarAseguradoOBeneficiario() {
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(linkIngresaEdificio).waitUntilPresent().click();
        withTimeoutOf(28, TimeUnit.SECONDS).waitFor(btnAceptar).waitUntilPresent().click();
    }

    public void validarMensaje( String mensaje) {
        String[] mensajes = mensaje.split("\\^");
        Integer contadorMensajesOk = 0;
        Integer numeroMensajes = mensajes.length;
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(mensajeRiesgos).waitUntilPresent();
        List<WebElementFacade> mensajesRiesgos = findAll(".//*[@id='WebMessageWorksheet:WebMessageWorksheetScreen:grpMsgs']/div");
        for(int i = 0; i < numeroMensajes; i++) {
            for (WebElementFacade lista : mensajesRiesgos) {
                if(lista.getText().contains(mensajes[i])){
                    contadorMensajesOk++;
                    break;
                }
            }
        }
        MatcherAssert.assertThat(contadorMensajesOk.toString(), Is.is(Matchers.equalTo(numeroMensajes.toString())));
        MatcherAssert.assertThat(iconoAdvertencia.isVisible(), Is.is(Matchers.equalTo(true)));
    }

    public void cancelar() {
        withTimeoutOf(30, TimeUnit.SECONDS).waitFor(btnCancelar).waitUntilEnabled();
    }

    public void clickAceptarDespuesDeModificada() {
        btnExpedir.click();
    }
}
