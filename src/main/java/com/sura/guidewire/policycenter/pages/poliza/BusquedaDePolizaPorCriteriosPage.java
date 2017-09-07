package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;

import java.util.Map;
import java.util.Set;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;

public class BusquedaDePolizaPorCriteriosPage extends PageUtil {

    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:Plate-inputEl']")
    private WebElementFacade campoPlaca;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:ProductName-inputEl']")
    private WebElementFacade comboProducto;
    @FindBy(xpath = ".//div[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body']/div/table")
    private WebElementFacade tablaResultados;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:DocumentType-inputEl']")
    private WebElementFacade comboTipoDocumento;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:identificationNumber-inputEl']")
    private WebElementFacade campoIdentificacion;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:CPSearchCriteria-inputEl']")
    private WebElementFacade comboCriteriosBusqueda;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearchDV:CPSearch-inputEl']")
    private WebElementFacade campoCriterioDeBusqueda;
    @FindBy(xpath = ".//*[@id='PolicySearch:PolicySearchScreen:DatabasePolicySearchPanelSet:PolicySearch_ResultsLV-body']")
    private WebElementFacade filaResultados;

    public BusquedaDePolizaPorCriteriosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarPlacaAuto(String placa) {
        waitFor(campoPlaca);
        campoPlaca.sendKeys(placa);
    }

    public void seleccionarProducto(String criterio) {
        if (criterio != null && !criterio.isEmpty()) {
            seleccionarItem(comboProducto, criterio);
        }
    }

    public void buscarPorResultados(ExamplesTable aVerificar) {
        Map<String, String> datosVerificar = aVerificar.getRow(0);
        tablaResultados.waitUntilPresent();
        clickearElemento(tablaResultados);
        Set<String> llaves = datosVerificar.keySet();
        String contenidoTabla = tablaResultados.getText();
        for (String evaluando : llaves) {
            MatcherAssert.assertThat("No contiene los elementos a verificar", contenidoTabla.contains(datosVerificar.get(evaluando)));
        }
    }

    public void seleccionarTipoDocumento(String tipoDocumento) {
        if (tipoDocumento != null && !tipoDocumento.isEmpty()) {
            waitFor(comboTipoDocumento);
            seleccionarItem(comboTipoDocumento, tipoDocumento);
        }
    }

    public void ingresarIdentificacion(String identificacion) {
        if (identificacion != null && !identificacion.isEmpty()) {
            campoIdentificacion.sendKeys(identificacion);
        }
    }

    public void seleccionarCriteriosBusqueda(String criterioBusqueda) {
        if (criterioBusqueda != null && !criterioBusqueda.isEmpty()) {
            waitFor(comboCriteriosBusqueda);
            seleccionarItem(comboCriteriosBusqueda, criterioBusqueda);
        }
    }

    public void diligenciarCampoCriterioBusqueda(String contenido) {
        if (contenido != null && !contenido.isEmpty()) {
            campoCriterioDeBusqueda.sendKeys(contenido);
        }
    }
}