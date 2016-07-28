package com.sura.policycenter.selenium.pages;

import com.sura.guidewire.selenium.Guidewire;

import com.sura.serenitybdd.util.GwNavegacionUtil;
import java.util.List;
import java.util.concurrent.TimeUnit;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.WebElementFacade;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DisponibilidadDetalleProductoPage extends Guidewire {

    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:ChannelType-inputEl']")
    private WebElementFacade listaTipoCanalDeVenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions']")
    private WebElementFacade btnAccionesCuenta;
    @FindBy(xpath = ".//*[@id='AccountFile:AccountFileMenuActions:AccountFileMenuActions_Create:AccountFileMenuActions_NewSubmission']")
    private WebElementFacade opcionNuevoEnvio;
    @FindBy(xpath=".//*[@id='SubmissionWizard:PolicyInfo']")
    private WebElementFacade opcionVerInformacionPoliza;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:SalesOrganizationType-inputEl']")
    private WebElementFacade listaOrganizacionDeVentas;
    @FindBy(xpath=".//*[@id='SubmissionWizard:SubmissionWizard_PolicyInfoScreen:SubmissionWizard_PolicyInfoDV:PolicyInfoInputSet:PAPolicyType-inputEl']")
    private WebElementFacade listaPATipoPoliza;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV-body']")
    WebElementFacade tablaProductos;
    @FindBy(xpath = ".//*[@id='NewSubmission:NewSubmissionScreen:SelectAccountAndProducerDV:ProducerSelectionInputSet:ProducerName-inputEl']")
    WebElementFacade campoNombreAgente;

    private static String BTN_ELEGIR_PRODUCTO_ = ".//*[@id='NewSubmission:NewSubmissionScreen:ProductOffersDV:ProductSelectionLV:";

    public DisponibilidadDetalleProductoPage(WebDriver driver) {
        super(driver);
    }

    public void accionarNuevoEnvio() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(btnAccionesCuenta).waitUntilPresent().click();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(opcionNuevoEnvio).waitUntilPresent().click();
    }

    public void verInformacionDePoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(opcionVerInformacionPoliza).waitUntilPresent().click();
    }

    public void seleccionarOrganizacionDeVentas(String organizacion) {
        int intentos = 0;
        while (intentos < 2) {
            withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaOrganizacionDeVentas).waitUntilPresent();
            listaOrganizacionDeVentas.clear();
            listaOrganizacionDeVentas.sendKeys(organizacion);
            listaOrganizacionDeVentas.sendKeys(Keys.ENTER);
            if ("<ninguno>".equals(listaOrganizacionDeVentas.getValue())) {
                intentos++;
                waitUntil(2000);
            } else {
                break;
            }
        }
    }

    public void validarTipoCanalVentas(ExamplesTable tipoCanal) throws Exception {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaTipoCanalDeVenta).waitUntilPresent();
        listaTipoCanalDeVenta.sendKeys(Keys.ARROW_DOWN);
        this.validarDatosDeLaLista(tipoCanal);
    }

    private void validarDatosDeLaLista(ExamplesTable tipoCanal) throws Exception {
        List<WebElementFacade> elementosTipoCanalVentas;
        List<String> elementosRequeridos = GwNavegacionUtil.obtenerTablaDeEjemplosDeUnaColumna(tipoCanal);
        for (String tipo : elementosRequeridos) {
            elementosTipoCanalVentas = withTimeoutOf(10, TimeUnit.SECONDS).findAll("//li[contains(.,'" + tipo + "')]");
            for (WebElementFacade lista : elementosTipoCanalVentas) {
                MatcherAssert.assertThat(tipo, Matchers.containsString(lista.getText()));
            }
        }
    }


    public void seleccionarTipoCanalDeVentas(String tipoCanal) {
        int intentos = 0;
        while (intentos < 2) {
            withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaTipoCanalDeVenta).waitUntilPresent();
            listaTipoCanalDeVenta.clear();
            listaTipoCanalDeVenta.sendKeys(tipoCanal);
            listaTipoCanalDeVenta.sendKeys(Keys.ENTER);
            if ("<ninguno>".equals(listaTipoCanalDeVenta.getValue())) {
                intentos++;
                waitUntil(2000);
            } else {
                break;
            }
        }
    }

    public void validarPATipoPoliza(ExamplesTable paTipoPoliza) throws Exception {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaPATipoPoliza).waitUntilPresent();
        listaPATipoPoliza.sendKeys(Keys.ARROW_DOWN);
        this.validarDatosDeLaLista(paTipoPoliza);
    }

    public void seleccionarPATipoPoliza(String tipoPoliza) {
        int intentos = 0;
        while (intentos < 2) {
            withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaPATipoPoliza).waitUntilPresent();
            listaPATipoPoliza.clear();
            listaPATipoPoliza.sendKeys(tipoPoliza);
            listaPATipoPoliza.sendKeys(Keys.ENTER);
            if ("<ninguno>".equals(listaPATipoPoliza.getValue())) {
                intentos++;
                waitUntil(2000);
            } else {
                break;
            }
        }
    }

    public void validarActualizacionDeListaTipoCanal() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaTipoCanalDeVenta).waitUntilPresent();
        MatcherAssert.assertThat(listaTipoCanalDeVenta.getText(), containsText(""));
    }

    public void validarActualizacionDeListaPATipoPoliza() {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(listaPATipoPoliza).waitUntilPresent();
        MatcherAssert.assertThat(listaPATipoPoliza.getText(), containsText(""));
    }

    public void seleccionarAgente(String agente) {
        this.seleccionarAgentePorNombre(agente);
        waitForTextToAppear("Productos ofrecidos", 30000);
    }

    public void seleccionarProducto(String producto) {
        String xpathBotonElegirProducto = BTN_ELEGIR_PRODUCTO_ + this.encontrarProducto(producto).toString() + ":addSubmission']";
        WebElementFacade botonElegirProducto = esperarElemento(xpathBotonElegirProducto);
        botonElegirProducto.click();
    }

    public void seleccionarAgentePorNombre(String nombreAgente) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoNombreAgente).waitUntilPresent();
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(campoNombreAgente).waitUntilClickable();
        campoNombreAgente.click();
        List<WebElementFacade> listaNombresAgentesElement = findAll(By.xpath(".//li[@role='option']"));
        if (!listaNombresAgentesElement.isEmpty()) {
            for (WebElementFacade agenteElemento : listaNombresAgentesElement) {
                if (agenteElemento.containsText(nombreAgente)) {
                    agenteElemento.click();
                    break;
                }
            }
        }
    }

    public Integer encontrarProducto(String producto) {
        withTimeoutOf(15, TimeUnit.SECONDS).waitFor(tablaProductos).waitUntilVisible();
        Integer filaBoton = 0;
        List<WebElement> filas = tablaProductos.findElements(By.tagName("tr"));
        for (WebElement row : filas) {
            List<WebElement> columna = row.findElements(By.tagName("td"));
            if (producto.equals(columna.get(1).getText())) {
                return filaBoton;
            }
            filaBoton++;
        }
        return filaBoton;
    }
}
