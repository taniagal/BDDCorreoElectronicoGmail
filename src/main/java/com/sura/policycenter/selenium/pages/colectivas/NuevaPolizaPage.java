package com.sura.policycenter.selenium.pages.colectivas;

import com.sura.guidewire.selenium.Guidewire;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NuevaPolizaPage extends PageObject {


    Guidewire guidewire = new Guidewire(getDriver());

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:ChannelType-inputEl']")
    private WebElementFacade listaCanal;

    public NuevaPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void desplegarElementoDeLaLista(WebElementFacade elementoDeLaLista){
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(elementoDeLaLista).waitUntilPresent();
        guidewire.waitUntil(2000);
        elementoDeLaLista.click();
    }

    public void desplegarListaDeOrganizaciones() {
        this.desplegarElementoDeLaLista(listaOrganizacion);
    }

    public void seleccionarCanal() {
        this.desplegarElementoDeLaLista(listaCanal);
    }

    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        WebElementFacade elemetoDeLaLista;
        Map<String, String> organizaciones;
        for (int i = 0; i < listaOrganizaciones.getRowCount(); i++) {
            organizaciones = listaOrganizaciones.getRows().get(i);
            elemetoDeLaLista = withTimeoutOf(10, TimeUnit.SECONDS).find("//li[contains(.,'" + organizaciones.get("organizacion") + "')]");
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(organizaciones.get("organizacion"))));
        }
    }

    public void validaListaCanalDeAcuerdoALaOrganizacion(String datosListaCanal) {
        String[] listaCanal = datosListaCanal.split("[,]");
        WebElementFacade elemetoDeLaLista;
        System.out.println("longitud" + listaCanal.length);
        for(int i = 0; i <listaCanal.length; i++){
            elemetoDeLaLista = withTimeoutOf(10, TimeUnit.SECONDS).find("//li[contains(.,'" + listaCanal[i] + "')]");
            System.out.println("lista en posicion " + i + " " + listaCanal[i]);
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(listaCanal[i])));
        }

    }

    public void seleccionarOrganizacion(String organizacion) {
        this.seleccionarElementoDeLaLista(organizacion, listaOrganizacion);
    }

    public void seleccionarElementoDeLaLista(String elementoLista, WebElementFacade elementoPantalla) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(elementoPantalla).waitUntilPresent();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(elementoPantalla).waitUntilClickable();
        elementoPantalla.click();
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(".//li[@role='option']"));
        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                if (agenteElemento.containsText(elementoLista)) {
                    agenteElemento.click();
                    break;
                }
            }
        }
    }
}
