package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.hamcrest.core.Is;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateIndividualPolicy_true-inputEl']")
    private WebElementFacade radioBotonIndividual;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateIndividualPolicy_false-inputEl']")
    private WebElementFacade radioBotonColectiva;
    @FindBy(xpath = ".//*[@id='TabBar:SearchTab-btnInnerEl']")
    private WebElementFacade btnBuscar;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    private WebElementFacade tablaProductosIndividual;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:CollectiveProductSelectionLV:CollectiveProductSelection_ExtLV-body']")
    private WebElementFacade tablaProductosColectiva;
    @FindBy(xpath = ".//*[@id='Search:MenuLinks:Search_AccountSearch']")
    private WebElementFacade btnCuentas;
    @FindBy(xpath = ".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']")
    WebElementFacade txtNumeroCuenta;



    private List<WebElement> filas;

    Actions acciones = new Actions(getDriver());

    public NuevaPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void desplegarElementoDeLaLista(WebElementFacade elementoDeLaLista) {
        waitUntil(WAIT_TIME_3000);
        acciones.click(elementoDeLaLista).build().perform();
    }

    public void desplegarListaDeOrganizaciones() {
        this.desplegarElementoDeLaLista(listaOrganizacion);
    }

    public void desplegarListaCanal() {
        this.desplegarElementoDeLaLista(listaCanal);
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

    public void seleccionarOrganizacion(String organizacion) {
        listaOrganizacion.waitUntilPresent();
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

    public void seleccionarCanal(String canal) {
        waitFor(listaCanal);
        this.desplegarElementoDeLaLista(listaCanal);
        this.seleccionarElementoDeLaLista(canal);
        waitForAbsenceOf("//li");
    }

    public void seleccionarElTipoDePoliza(String tipoPoliza) {
        waitFor(listaTipoPoliza);
        this.desplegarElementoDeLaLista(listaTipoPoliza);
        this.seleccionarElementoDeLaLista(tipoPoliza);
        waitForAbsenceOf("//li");
    }

    public void validarBotonesHabilitados() {
        this.validarBotonesDeLaTablaProductos(true);
    }


    public void validarNoSeListanProductos(){
        MatcherAssert.assertThat(waitFor(tablaProductosColectiva).getText(), Is.is(Matchers.equalTo("")));
    }

    public void buscarCuenta(String numeroCuenta) {
        withTimeoutOf(WAIT_TIME_28, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        waitUntil(WAIT_TIME_3000);
        btnBuscar.click();
        withTimeoutOf(WAIT_TIME_10,TimeUnit.SECONDS).waitFor(btnCuentas).click();
        txtNumeroCuenta.waitUntilPresent().sendKeys(numeroCuenta);
        WebElementFacade btnBuscarCuenta = esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
        btnBuscarCuenta.click();
        WebElementFacade grdNumeroCuenta = esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']");
        grdNumeroCuenta.click();
    }
}
