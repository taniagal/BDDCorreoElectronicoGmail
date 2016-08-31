package com.sura.policycenter.selenium.pages.colectivas;

import com.sura.commons.selenium.Commons;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
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
import org.openqa.selenium.WebElement;



public class NuevaPolizaPage extends PageObject {


    Commons commons = new Commons(getDriver());

    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacion;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:ChannelType-inputEl']")
    private WebElementFacade listaCanal;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateIndividualPolicy_true-inputEl']")
    private WebElementFacade radioBotonIndividual;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductSettingsDV:CreateIndividualPolicy_false-inputEl']")
    private WebElementFacade radioBotonColectiva;
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
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:ProductSelectionLV-body']")
    WebElementFacade tablaProductosIndividual;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:CollectiveProductSelectionLV:CollectiveProductSelection_ExtLV-body']")
    WebElementFacade tablaProductosColectiva;
    @FindBy(xpath = "//li")
    WebElementFacade listaDesplegable;

    private List<WebElement> filas;

    public NuevaPolizaPage(WebDriver driver) {
        super(driver);
    }

    public void desplegarElementoDeLaLista(WebElementFacade elementoDeLaLista) {
        commons.waitUntil(3000);
        elementoDeLaLista.click();
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
            elemetoDeLaLista = withTimeoutOf(10, TimeUnit.SECONDS).find("//li[contains(.,'" + organizaciones.get("organizacion") + "')]");
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(organizaciones.get("organizacion"))));
        }
    }

    public void validaListaCanalDeAcuerdoALaOrganizacion(String datosListaCanal) {
        String[] arregloListaCanal = datosListaCanal.split("[,]");
        WebElementFacade elemetoDeLaLista;
        for (int i = 0; i < arregloListaCanal.length; i++) {
            elemetoDeLaLista = withTimeoutOf(15, TimeUnit.SECONDS).find("//li[contains(.,'" + arregloListaCanal[i] + "')]");
            MatcherAssert.assertThat(elemetoDeLaLista.getText(), Is.is(Matchers.equalTo(arregloListaCanal[i])));
        }
    }

    public void seleccionarOrganizacion(String organizacion) {
        waitFor(listaOrganizacion);
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

    public void validarCamposDeLaVentanaNuevaCotizacion() {
        listaOrganizacion.shouldBeVisible();
        listaCanal.shouldBeVisible();
        radioBotonIndividual.shouldBeVisible();
        radioBotonColectiva.shouldBeVisible();

        if (!"0% 0%".equals(radioBotonIndividual.getCssValue("background-position"))) {
            MatcherAssert.assertThat("Individual está seleccionado", Is.is(Matchers.equalTo("Individual está seleccionado")));
        } else {
            MatcherAssert.assertThat("Individual no está seleccionado", Is.is(Matchers.equalTo("Individual está seleccionado")));
        }
    }

    public void validarBotonesDeshabilitadosPorProducto() {
        this.validarBotonesDeLaTablaProductos(false);
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
        commons.waitUntil(1000);
        if ("Individual".equals(tipoPoliza)) {
            if ("0% 0%".equals($(radioBotonIndividual).getCssValue("background-position"))) {
                commons.waitUntil(1500);
                radioBotonIndividual.click();
            }
        } else {
            if (!"0% 0%".equals($(radioBotonIndividual).getCssValue("background-position"))) {
                commons.waitUntil(1500);
                radioBotonColectiva.click();
            }
        }
    }

    public List<WebElement> obtenerTablaDeProductos(String tipoPoliza){
        if ("Individual".equals(tipoPoliza)) {
            withTimeoutOf(10, TimeUnit.SECONDS).waitFor(tablaProductosIndividual).waitUntilPresent();
            filas = tablaProductosIndividual.findElements(By.tagName("tr"));
        } else {
            withTimeoutOf(10, TimeUnit.SECONDS).waitFor(tablaProductosColectiva).waitUntilPresent();
            filas = tablaProductosColectiva.findElements(By.tagName("tr"));
        }
        return filas;
    }

    public void validarProductos(String productos, String tipoPoliza) {
        String[] listaProductos = productos.split("[,]");
        Integer productosEnLista = 0;
        Integer productosEsperados = listaProductos.length;
        waitForTextToAppear(listaProductos[0]);
        filas = this.obtenerTablaDeProductos(tipoPoliza);
        if (!filas.isEmpty()) {
            for (WebElement row : filas) {
                List<WebElement> columna = row.findElements(By.tagName("td"));
                for (int i = 0; i < listaProductos.length; i++) {
                    if (listaProductos[i].equals(columna.get(1).getText())) {
                        productosEnLista++;
                        break;
                    }
                }
            }
        }
        MatcherAssert.assertThat(productosEnLista.toString(), Is.is(Matchers.equalTo(productosEsperados.toString())));
    }

    public void validarBotonesHabilitados() {
        this.validarBotonesDeLaTablaProductos(true);
    }


    public void validarNoSeListanProductos(){
        MatcherAssert.assertThat(waitFor(tablaProductosColectiva).getText(), Is.is(Matchers.equalTo("")));
    }

    public void buscarCuenta(String numeroCuenta) {
        withTimeoutOf(10, TimeUnit.SECONDS).waitFor(btnBuscar).waitUntilPresent();
        commons.waitUntil(2000);
        btnBuscar.click();
        btnCuentas = commons.esperarElemento(".//*[@id='Search:MenuLinks:Search_AccountSearch']");
        btnCuentas.click();
        txtNumeroCuenta = commons.esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:AccountNumber-inputEl']");
        txtNumeroCuenta.sendKeys(numeroCuenta);
        btnBuscarCuenta = commons.esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']");
        btnBuscarCuenta.click();
        grdNumeroCuenta = commons.esperarElemento(".//*[@id='AccountSearch:AccountSearchScreen:AccountSearchResultsLV:0:AccountNumber']");
        grdNumeroCuenta.click();
    }
}
