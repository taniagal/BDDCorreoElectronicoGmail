package com.sura.guidewire.policycenter.pages.poliza;

import com.sura.guidewire.policycenter.resources.PageUtil;
import com.sura.guidewire.policycenter.utils.menu.opciones.cuenta.OpcionesInformacionPolizaMrcPage;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fluentlenium.core.annotation.Page;
import org.jbehave.core.model.ExamplesTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ExclusionesYCondicionessPage extends PageUtil {

    @Page
    OpcionesInformacionPolizaMrcPage opcionesInformacionPolizaMrcPage;

    @FindBy(xpath = ".//span[contains(.,'Agregar exclusión o condición')]")
    WebElementFacade botonExclusionesYCondiciones;

    @FindBy(xpath = ".//*[@id='CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchResultsLV-body']")
    WebElementFacade tablaBusqueda;

    @FindBy(xpath = "//a[@id='CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchDV:SearchAndResetInputSet:SearchLinksInputSet:Search']")
    WebElementFacade botonBuscar;

    @FindBy(xpath = "//input[@id='CoveragePatternSearchPopup:CoveragePatternSearchScreen:CoveragePatternSearchDV:Keyword-inputEl']")
    WebElementFacade txtPalabraClave;

    private static final String pathListaExclusionesYCondiciones = ".//*[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String pathFinal = "')]";
    private static final String pathMenuLateral = ".//td[contains(@id,'SubmissionWizard') and contains(.,'";
    private static final String nombreLabel = "Exclusiones y Condiciones";


    public ExclusionesYCondicionessPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarALaOpcion() {
        String xpathMenu;
        WebElementFacade elementoMenu;
        xpathMenu = pathMenuLateral + nombreLabel + pathFinal;
        elementoMenu = findBy(xpathMenu);
        elementoMenu.waitUntilPresent().click();
    }

    public void validarOpciones(ExamplesTable listaopciones, String estadouno, String estadodos) {
        opcionesInformacionPolizaMrcPage.validarCampos(estadouno, estadodos, listaopciones, pathListaExclusionesYCondiciones, pathFinal);
    }

    public void validarOpcionesMenuLateral(ExamplesTable listaopciones, String estado) {
        opcionesInformacionPolizaMrcPage.validarCampos(estado, listaopciones, pathMenuLateral, pathFinal);
    }

    public void ingresarExclusionOCondicion() {
        botonExclusionesYCondiciones.waitUntilVisible().click();
    }

    public void ingresarExclusionOCondicionABuscar(String palabraABuscar) {
        ingresarDato(txtPalabraClave, palabraABuscar);
    }

    public void opcionBuscar() {
        botonBuscar.waitUntilVisible().click();
    }

    public void validarBusquedaExclusionesYClausulas(ExamplesTable listaBusqueda) {
        validarBusqueda(tablaBusqueda, listaBusqueda);
    }
}
