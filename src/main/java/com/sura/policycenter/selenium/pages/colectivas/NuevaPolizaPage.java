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
import org.openqa.selenium.Keys;
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
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_AccountSearch']")
    private WebElementFacade btnCuentas;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    private WebElementFacade txtNumeroCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    private WebElementFacade btnBuscarCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    private WebElementFacade grdNumeroCuenta;

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
        for(int i = 0; i <listaCanal.length; i++){
            elemetoDeLaLista = withTimeoutOf(10, TimeUnit.SECONDS).find("//li[contains(.,'" + listaCanal[i] + "')]");
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(listaCanal[i])));
        }
    }

    public void seleccionarOrganizacion(String organizacion) {
        listaOrganizacion.sendKeys(Keys.ESCAPE);
        this.desplegarElementoDeLaLista(listaOrganizacion);
        this.seleccionarElementoDeLaLista(organizacion);
    }

    public void seleccionarElementoDeLaLista(String elementoLista) {
        List<WebElementFacade> listaElementosCotizacion = findAll(By.xpath(".//li[@role='option']"));
        if (!listaElementosCotizacion.isEmpty()) {
            for (WebElementFacade listaElemento : listaElementosCotizacion) {
                if (listaElemento.containsText(elementoLista)) {
                    listaElemento.click();
                    break;
                }
            }
        }
    }

    public void buscarCuenta(String numeroCuenta) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        guidewire.waitUntil(2000);
        btnBuscar.click();
        btnCuentas = guidewire.esperarElemento(".//*[@id='Search:MenuLinks:Search_AccountSearch']");
        btnCuentas.click();
        txtNumeroCuenta = guidewire.esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']");
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscarCuenta = guidewire.esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
        btnBuscarCuenta.click();
        grdNumeroCuenta = guidewire.esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']");
        grdNumeroCuenta.click();
    }

}
