package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class NuevaPolizaPage extends PageUtil {


    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacion;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:ChannelType-inputEl']")
    private WebElementFacade listaCanal;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:PAPolicyType-inputEl']")
    private WebElementFacade listaTipoPoliza;
    @FindBy(xpath = ".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PolicyType_ExtInputSet:SalesOrganizationType-triggerWrap']/tbody/tr/td/input")
    private WebElementFacade listaOrganizacionW;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade botonBuscar;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_AccountSearch']")
    private WebElementFacade botonCuentas;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    WebElementFacade txtNumeroCuenta;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']")
    WebElementFacade grdNumeroCuenta;

    Actions acciones = new Actions(getDriver());

    public NuevaPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void desplegarElementoDeLaLista(WebElementFacade elementoDeLaLista) {
        waitUntil(WAIT_TIME_3000);
        acciones.click(elementoDeLaLista).build().perform();
    }

    public void validarListaDeOrganizaciones(ExamplesTable listaOrganizaciones) {
        WebElementFacade elemetoDeLaLista;
        Map<String, String> organizaciones;
        for (int i = 0; i < listaOrganizaciones.getRowCount(); i++) {
            organizaciones = listaOrganizaciones.getRows().get(i);
            elemetoDeLaLista = withTimeoutOf(WAIT_TIME_10, TimeUnit.SECONDS).find("//li[contains(.,'" + organizaciones.get("organizacion") + "')]");
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(organizaciones.get("organizacion"))));
        }
    }

    public void validaListaCanalDeAcuerdoALaOrganizacion(String datosListaCanal) {
        String[] arregloListaCanal = datosListaCanal.split("[,]");
        WebElementFacade elemetoDeLaLista;
        for (int i = 0; i < arregloListaCanal.length; i++) {
            elemetoDeLaLista = withTimeoutOf(WAIT_TIME_15, TimeUnit.SECONDS).find("//li[contains(.,'" + arregloListaCanal[i] + "')]");
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(arregloListaCanal[i])));
        }
    }

    public void seleccionarOrganizacion(ExamplesTable datosAutos) {
        Map<String, String> dato = datosAutos.getRow(0);
        waitForTextToAppear("Información de póliza");
        listaOrganizacion.waitUntilPresent();
        selectItem(listaOrganizacion, dato.get("organizacion"));
        waitForComboValue(listaOrganizacionW, dato.get("organizacion"));
        waitUntil(WAIT_TIME_1000);
        selectItem(listaCanal, dato.get("canal"));
        waitForComboValue(listaCanal, dato.get("canal"));
        selectItem(listaTipoPoliza, dato.get("tipoPoliza"));
        waitForComboValue(listaTipoPoliza, dato.get("tipoPoliza"));
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

    public void validarBotonesHabilitadosPorProducto() {
        this.validarBotonesDeLaTablaProductos(true);
    }

    public void validarBotonesDeLaTablaProductos(boolean habilitados) {
        List<WebElementFacade> botonesProductos = findAll("//a[contains(.,'Elegir')]");
        if (habilitados) {
            for (int i = 0; i < botonesProductos.size(); i++) {
                botonesProductos.get(i).shouldBeEnabled();
            }
        } else {
            for (int i = 0; i < botonesProductos.size(); i++) {
                botonesProductos.get(i).shouldNotBeEnabled();
            }
        }
    }

    public void buscarCuenta(String numeroCuenta) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(botonBuscar).waitUntilPresent();
        waitUntil(WAIT_TIME_3000);
        botonBuscar.click();
        withTimeoutOf(WAIT_TIME_10,TimeUnit.SECONDS).waitFor(botonCuentas).click();
        txtNumeroCuenta.waitUntilPresent().sendKeys(numeroCuenta);
        WebElementFacade botonBuscarCuenta = esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
        botonBuscarCuenta.click();
        grdNumeroCuenta.waitUntilPresent().click();
    }
}
